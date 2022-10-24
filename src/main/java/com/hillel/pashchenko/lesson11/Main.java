package com.hillel.pashchenko.lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String verse = """
                Мы живем, точно в сне неразгаданном,
                На одной из удобных планет…
                Много есть, чего вовсе не надо нам,
                А того, что нам хочется, нет…
                               """;
        String way = "src/main/resources/path/file.txt";
        path(way);
        write(way, verse);
        read(way);
        registration();
        login();
    }

    private static String path(String way) throws IOException {
        Path path = Paths.get(way);
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path.getParent());
        }
        return way;
    }

    private static void write(String way, String verse) throws IOException {
        String pathWay = path(way);
        try (FileWriter fileWriter = new FileWriter(pathWay)) {
            fileWriter.write(verse);
        } catch (IOException e) {
            System.out.println("Error with FileWriter");
        }
    }

    private static void read(String way) throws IOException {
        try (final FileReader fileReader = new FileReader(way);
             final Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    private static void registration() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        System.out.println("Ведите пароль еще раз");
        String password2 = scanner.nextLine();
        if (password.equals(password2)) {
            try (FileWriter fileWriter = new FileWriter("src/main/resources/users.txt")) {
                fileWriter.write(login + "\n");
                fileWriter.write(password2 + "\n");
            } catch (IOException e) {
                System.out.println("Error with FileWriter");
            }
        } else {
            System.out.println("Пороли не совпали");
            System.exit(0);
        }
    }


    private static void login() {
        try (final FileReader fileReader = new FileReader("src/main/resources/users.txt");
             final BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            final Scanner scannerIn = new Scanner(System.in);
            System.out.println("Вы входите в учетную запись");
            System.out.println("Введите логин");
            String login = scannerIn.next();
            System.out.println("Введите пароль");
            String password = scannerIn.next();
            accountCheck(login, password, bufferedReader, scannerIn);
        } catch (IOException e) {
            System.out.println("Error with FileReader");
        }
    }

    private static void accountCheck(String login, String password,
                                     BufferedReader bufferedReader, Scanner scannerIn) throws IOException {
        int count = 0;
        String[] fileLines = new String[2];
        for (int i = 0; i < fileLines.length; i++) {
            fileLines[i] = bufferedReader.readLine();
        }
        while (count < 4) {
            if (login.equals(fileLines[0]) && password.equals(fileLines[1])) {
                System.out.println("Приветствую, вы успешно вошли");
                break;
            } else {
                count++;
                if (count == 4) {
                    System.out.println("Неверно введен логин или пароль, попробуйте позже");
                } else {
                    System.out.println("Неверно введен логин или пароль, попробуйте еще раз");
                    login = scannerIn.next();
                    password = scannerIn.next();
                }
            }
        }
    }
}

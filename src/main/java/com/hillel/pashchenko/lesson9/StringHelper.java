package com.hillel.pashchenko.lesson9;


public class StringHelper {
    public String workWithString(String string, char[] chars) {
        if (chars != null) {
            String stringChar = new String(chars);
            if (string.isBlank() || stringChar.isBlank()) {
                System.out.println("String is empty");
            } else {
                string = string.trim().toUpperCase();
                stringChar = stringChar.trim().toLowerCase();
                String concat = string.concat(" " + stringChar);
                char[] arrayString = concat.toCharArray();
                System.out.println("String length: " + concat.length());
                for (int i = 0; i < concat.length(); i++) {
                    if (concat.length() % 2 == 0) {
                        if (i == 4) {
                            arrayString[i] = ' ';
                        } else if (i == 6) {
                            arrayString[i] = ' ';
                        }
                    } else {
                        if (i == 4) {
                            arrayString[i] = ' ';
                        }
                    }
                }
                string = new String(arrayString);
                System.out.println("String: " + string);
            }
        } else {
            System.err.println("Array is null!");
        }
        return string;
    }
}

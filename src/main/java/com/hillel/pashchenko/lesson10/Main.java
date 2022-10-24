package com.hillel.pashchenko.lesson10;

import com.hillel.pashchenko.lesson10.entity.Client;
import com.hillel.pashchenko.lesson10.exception.WrongFieldException;
import com.hillel.pashchenko.lesson10.exception.WrongSumException;
import com.hillel.pashchenko.lesson10.service.Transaction;
import com.hillel.pashchenko.lesson10.util.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String idAccount2;
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        Helper helper = new Helper();
        Transaction transaction = new Transaction();
        System.out.println("Please enter Client Account ID");
        while (true) {
            String idAccount = scanner.next();
            try {
                helper.idAccountChek(idAccount);
                break;
            } catch (WrongFieldException e) {
                System.out.println("You was enter Client Account ID wrong, please try again");
            } finally {
                client.setIdAccountClient(idAccount);
            }
        }
        System.out.println("Please enter the account ID of the client to whom the money will be transferred");
        while (true) {
            idAccount2 = scanner.next();
            try {
                helper.idAccountChek(idAccount2);
                break;
            } catch (WrongFieldException e) {
                System.out.println("You was enter Client Account ID wrong, please try again");
            }
        }
        System.out.println("Enter transfer amount");
        while (true) {
            if (scanner.hasNextInt()) {
                double sum = scanner.nextInt();
                try {
                    helper.sumChek(sum);
                    break;
                } catch (WrongSumException e) {
                    System.out.println("You was enter sum wrong, please try again");
                } finally {
                    client.setSum(sum);
                }
            } else {
                System.out.println("Wrong data");
                scanner.next();
            }
        }
        try {
            transaction.transferOfMoney(client,idAccount2);
        } finally {
            System.out.println("Successful money transfer");
        }
    }
}

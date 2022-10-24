package com.hillel.pashchenko.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SupportClass {
    public void numberPhone(String string){
        Pattern pattern = Pattern.compile("^(\\+?\\d{2}\\(\\d{3}\\))(\\d{7})$");
        Matcher matcher = pattern.matcher(string);
        boolean matches = matcher.matches();
        System.out.println("Phone number: " + matches);
    }
    public void email(String string){
        Pattern pattern = Pattern.compile("^([a-z0-9_.-]+)@([a-z]+)\\.([a-z]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        boolean matches = matcher.matches();
        System.out.println("Email: " + matches);
    }
    public void dateBirthday(String string){
        Pattern pattern = Pattern.compile("^([0-9]{1,2})\\.([0-9]{1,2})\\.([0-9]{2,4})");
        Matcher matcher = pattern.matcher(string);
        boolean matches = matcher.matches();
        System.out.println("Birthday: " + matches);
    }
}

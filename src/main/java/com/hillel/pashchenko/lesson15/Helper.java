package com.hillel.pashchenko.lesson15;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public Optional<String> optional(final String mail) {
        if(mail == null){
            return Optional.empty();
        }
        Pattern pattern = Pattern.compile("^([a-z0-9_.-]+)@([a-z]+)\\.([a-z]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(mail);
        boolean matches = matcher.matches();
        if (!matches) {
            return Optional.empty();
        }
        return Optional.of(mail);
    }
}
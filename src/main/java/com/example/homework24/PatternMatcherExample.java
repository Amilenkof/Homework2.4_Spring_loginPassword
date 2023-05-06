package com.example.homework24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExample {
    private  static final Pattern PATTERN= Pattern.compile("[a-zA-Z0-9_]+");
    public static void main(String[] args) {
        String str="1231adsDAF_";

        Matcher matcher = PATTERN.matcher(str);
        System.out.println(matcher.matches());
    }


}

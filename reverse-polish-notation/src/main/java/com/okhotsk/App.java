package com.okhotsk;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        String title = "リコリス・リコイル";
        var half = Strings.fullToHalf(title);
        System.out.println(half);
    }
}

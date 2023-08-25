package org.example;

public class Palindrome {
    public boolean isPalindrome(String text){
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder revers = plain.reverse();

        return (revers.toString().equals(clean));
    }
}

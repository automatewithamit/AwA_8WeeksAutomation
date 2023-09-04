package com.awa.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = reverseStringOrder(input);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseStringOrder(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i += 2) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }

}

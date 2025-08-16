package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String capitalizedInput = StringUtils.capitalize(input);

        System.out.println(capitalizedInput );

    }
}
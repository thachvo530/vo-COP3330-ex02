/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String strname = name.next();

        int strlength = strname.length();

        System.out.print(""+ strname +" has "+ strlength +" characters.");

    }
}
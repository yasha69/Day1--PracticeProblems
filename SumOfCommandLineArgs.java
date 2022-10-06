package com.bridgelabz.Day1Practice;

public class SumOfCommandLineArgs {
    public static void main(String[] args) {
        System.out.println(args [0]);
        System.out.println(args [1]);

        int X = Integer.parseInt(args [0]);//20
        int Y = Integer.parseInt(args [1]);//40

        int Sum = (X+Y);//20+40
        System.out.println(Sum);//60

    }
}

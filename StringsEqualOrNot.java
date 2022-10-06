package com.bridgelabz.Day1Practice;

public class StringsEqualOrNot {
    static void StringExample(){
        String a="ABC";
        String b="abc";
        System.out.println(a.equals(b));//False
        System.out.println(b.equals(a));//False
    }
    public static void main(String[] args){
        System.out.println("Checking Two Strings Are Equal or Not Equal");
        StringExample();//method calling
    }
}

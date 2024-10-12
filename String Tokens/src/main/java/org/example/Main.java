package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String split[] = s.split("[ !,?.@_'\"]+");
        System.out.println(split.length);
        for(String splits:split){
            System.out.println(splits);
        }
    }
}
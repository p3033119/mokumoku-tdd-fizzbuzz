package org.example;

import java.util.Scanner;
import org.example.FizzBuzz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Application");
        Scanner scanner = new Scanner(System.in);

        // 整数の入力
        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt();
        System.out.println("入力された数値: " + number);

        // FizzBuzzの関数実行
        System.out.println("関数実行結果！");
        System.out.println(/* -- FizzBuzz.sayFizzBuzz() --*/);
    }
}
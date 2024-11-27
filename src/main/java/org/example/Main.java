package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
//問題１
// 入力例:
// 1番目の数字を入力してください: 10
// 演算子を入力してください (+, -, *, /): +
// 2番目の数字を入力してください: 5
// 期待される出力例:
// 計算結果: 10 + 5 = 15

    Scanner scanner = new Scanner(System.in);

//try文の中で宣言できないためブロック外で一旦定義する
    int num1 = 0, num2 = 0;
    String operator = "";

    while (true) {
      try {
        System.out.println("一番目の数字を入力してください");
        num1 = scanner.nextInt();
        scanner.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("無効な入力です。数字を入力してください");
        scanner.nextLine();
      }
    }
    while (true) {
      System.out.println("演算子を入力してください");
      operator = scanner.nextLine();
      if (operator.equals("+") ||
          operator.equals("-") ||
          operator.equals("*") ||
          operator.equals("/")) {
        break;
      } else {
        System.out.println("無効な演算子です。+,-,*,/のいずれかを入力してください");
      }
    }

    while (true) {
      try {
        System.out.println("二番目の数字を入力してください");
        num2 = scanner.nextInt();
        scanner.nextLine();
        break;
      } catch (NumberFormatException e) {
        System.out.println("無効な入力です。数字を入力してください");
      }
    }

    scanner.close();

    switch (operator) {
      case "+":
        System.out.println("計算結果:" + num1 + operator + num2 + "=" + (num1 + num2));
        break;

      case "-":
        System.out.println("計算結果:" + num1 + operator + num2 + "=" + (num1 - num2));
        break;

      case "*":
        System.out.println("計算結果:" + num1 + operator + num2 + "=" + num1 * num2);
        break;

      case "/":
        if (num2 != 0) {
          System.out.println("計算結果:" + num1 + operator + num2 + "=" + num1 / num2);
        } else {
          System.out.println("error: 0で割ることはできません");
          break;

        }
    }
  }
}




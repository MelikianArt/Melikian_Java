package Melikian_Java;

import java.util.Scanner;
public class ASTON_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        String numStr = sc.next();
        numStr = numStr.replace(',', '.');
        try {
            double num = Double.parseDouble(numStr);
            if (num > 7) {
                System.out.println("Привет");
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное число");
        }
    }
}
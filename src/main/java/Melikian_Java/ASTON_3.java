package Melikian_Java;

import java.util.Scanner;
public class ASTON_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        String nStr = sc.next();
        try {
            int n = Integer.parseInt(nStr);
            int[] array = new int[n];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                String elemStr = sc.next();
                elemStr = elemStr.replace(',', '.');
                try {
                    array[i] = Integer.parseInt(elemStr);
                } catch (NumberFormatException e) {
                    System.out.println("Введите корректный элемент массива");
                    break;
                }
            }
            System.out.println("Элементы массива, кратные 3:");
            for (int i = 0; i < n; i++) {
                if (array[i] % 3 == 0 && array[i] != 0) {
                    System.out.println(array[i]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите корректный размер массива");
        }
    }
}
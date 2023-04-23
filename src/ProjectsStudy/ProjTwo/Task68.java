package ProjectsStudy.ProjTwo;

import java.util.Scanner;

/**
 * Функция Аккермана https://site.ada.edu.az/~medv/acm/Docs%20e-olimp/Volume%2012/1111.htm
 * Через рекурсию есть смысл решать по типу Фебоначчи, давать в return n + f(n-1)
 */
public class Task68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Функция Аккерамана. A(0-3, n)");
        System.out.println("Введите первый аргумент функции от 0 до 3:");
        int m = scanner.nextInt();
        if (m < 3 && m < 0) return;
        System.out.println("Введите второй агрмент функции (n):");
        int n = scanner.nextInt();
        int result = 0;
        switch (m){
            case 0:
                result = n + 1;
                break;
            case 1:
                result = n + 2;
                break;
            case 2:
                result = 2*n + 3;
                break;
            case 3:
                result = (int) (Math.pow(2, n + 3) - 3);
                break;
        }
        System.out.println("A("+m+","+n+") = " + result);
    }
}

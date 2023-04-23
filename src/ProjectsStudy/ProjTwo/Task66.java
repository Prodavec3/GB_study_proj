package ProjectsStudy.ProjTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class Task66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение M");
        int m = scanner.nextInt();
        System.out.println("Введите значение N, большее чем M");
        int n = scanner.nextInt();
        if (m >= n){
            return;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        int summ = 0;
        for(int i = m; i <= n; i++){
            summ+=i;
        }

        System.out.print("Сумма натуральных чисел между " + m + " и " + n);
        System.out.print(" = " + summ);
    }
}

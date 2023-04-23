package ProjectsStudy.ProjTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        ArrayList<Integer> naturalNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = scanner.nextInt();
        if(n <= 0){
            System.out.println("Введено неверное значение");
            return;
        }
        while (n > 0){
            naturalNumbers.add(n);
            n--;
        }
        System.out.printf(String.valueOf(naturalNumbers));
    }
}

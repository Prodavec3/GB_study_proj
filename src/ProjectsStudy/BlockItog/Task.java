package ProjectsStudy.BlockItog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int number = 3; // Длина элемента при выборке
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, пробел будет разделителем на элементы массива");
        String userStr = scanner.nextLine();

        ArrayList<String> row = new ArrayList<>(Arrays.asList(userStr.split(" ")));
        Iterator<String> rowIterator = row.iterator();

        while(rowIterator.hasNext()){
            String nextRow = rowIterator.next();
            if (nextRow.length() > number){
                rowIterator.remove();
            }
        }
        System.out.println(row);
    }
}

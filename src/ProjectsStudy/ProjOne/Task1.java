package ProjectsStudy.ProjOne;

public class Task1 {


    public static void main(String[] args) {
        int[] mass = new int[]{2,5,13,7,6,4};
        int summ = 0;
        for (int i = 0; i < mass.length; i++){
            summ += mass[i];
        }
        System.out.printf("AVG: " + (float)summ/mass.length);
    }
}

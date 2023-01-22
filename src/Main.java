import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        //1 массив
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        //2 массив
        double[] b = {1.57, 7.654, 9.986};
        //3 массив
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    }

    public static void task2() {
        System.out.println("Задача 2");
        //1 массив
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //2 массив
        double[] b = {1.57, 7.654, 9.986};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i != b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //3 массив
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i]);
            if (i != months.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        //1 массив
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 2; i > -1; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //2 массив
        double[] b = {1.57, 7.654, 9.986};
        for (int i = 2; i > -1; i--) {
            System.out.print(b[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //3 массив
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 11; i > -1; i--) {
            System.out.print(months[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            if (a[i] % 2 != 0) {
                a[i] = a[i] + 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
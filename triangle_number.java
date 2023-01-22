
// +Написать программу вычисления n-ого треугольного числа. url

import java.util.Scanner;

public class triangle_number {
    public static void main(String[] args) {
        System.out.print("Введите натуральное число: ");
        Scanner num = new Scanner(System.in);
        Integer a = num.nextInt();
        num.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }
// решение через рекурсию
    // public static int Triangle(int num) {
    //     System.out.println(num);
    //     if (num == 1) {
    //         return 1;
    //     }
    //     return Triangle(num - 1) + num;
    // }
// решение человеческое
    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return num*(num+1)/2;
    }
}

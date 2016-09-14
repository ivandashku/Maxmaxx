/**
 * Created by ivan on 13.09.2016.
 */
import java.util.Scanner;
public class Maxmax {
    public static void main(String[] args) {
        int[] a;
        int n;
        int max;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        n = in.nextInt();
        System.out.println("Введите элементы массива");
        a = new int[n];
        max = in.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = in.nextInt();
            if (max<a[i]) max=a[i];
        }
        System.out.print("Максимум=");
        System.out.println(max);

    }
}
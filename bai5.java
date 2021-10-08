import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = sc.nextInt();

        float sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao ");
            float term = sc.nextFloat();
            if (term > 0) {
                sum += term;
            }
        }
        System.out.println("Tong = " + sum);

        sc.close();
    }
}

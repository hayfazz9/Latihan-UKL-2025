import java.util.Scanner;

public class Soal2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan positif: ");
        int n = input.nextInt();

        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
        input.close();
    }
}
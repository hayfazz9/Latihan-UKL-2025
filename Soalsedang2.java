import java.util.Scanner;

public class Soal2_2 {

    static double volumeTabung(double r, double t) {
        return 3.14 * r * r * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();

        double volume = volumeTabung(r, t);
        System.out.println("Volume tabung = " + volume);
        input.close();
    }
}
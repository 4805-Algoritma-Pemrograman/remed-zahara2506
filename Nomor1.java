import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total kilometer yang ditempuh
        System.out.print("Masukkan total kilometer: ");
        int totalKm = scanner.nextInt();

        // Menghitung biaya taksi
        double honorTaksi = calculateFare(totalKm);

        // Menampilkan hasil
        System.out.println("Total km: " + totalKm);
        System.out.println("Honor taksi: " + honorTaksi);
    }

    //  menghitung biaya taksi
    public static double calculateFare(int totalKm) {
        if (totalKm <= 3) {
            return 20000.0; 
        } else {
        
        return 20000.0 + (totalKm - 3) * 10000.0;
         }
}

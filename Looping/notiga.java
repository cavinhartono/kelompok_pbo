import java.util.Scanner;

public class notiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan;
        int jumlahPositif = 0;

        // Loop do-while untuk meminta pengguna memasukkan bilangan positif
        do {
            System.out.print("Masukkan bilangan (negatif untuk berhenti): ");
            bilangan = scanner.nextInt();

            // Jika bilangan positif, tambahkan ke jumlahPositif
            if (bilangan > 0) {
                jumlahPositif += bilangan;
            }
        } while (bilangan >= 0); // Loop berhenti ketika pengguna memasukkan bilangan negatif

        // Cetak jumlah bilangan positif yang dimasukkan
        System.out.println("Jumlah bilangan positif yang dimasukkan: " + jumlahPositif);
    }
}


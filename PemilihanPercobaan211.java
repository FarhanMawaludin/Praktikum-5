import java.util.Scanner;
public class PemilihanPercobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.println("Nilai uas       :");
        float uas = input11.nextFloat();
        System.out.println("Nilai uts       :");
        float uts = input11.nextFloat();
        System.out.println("Nilai kuis      :");
        float kuis = input11.nextFloat();
        System.out.println("Nilai Tugas     :");
        float Tugas = input11.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (Tugas*0.20F);
        String message = total < 65 ? "remidi" : "tidak remidi";
        System.out.println(" nilai akhir     = " + total + " sehingga " + message);
    }
}
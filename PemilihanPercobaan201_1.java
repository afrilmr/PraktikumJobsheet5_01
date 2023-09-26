import java.util.Scanner;

public class PemilihanPercobaan201_1 {
    public static void main(String[] args) {
        String nilaiHuruf;
    
        Scanner input01 = new Scanner(System.in);
        System.out.print("Nilai uas : ");
        float uas = input01.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input01.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input01.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input01.nextFloat();
    
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (total > 80){
            nilaiHuruf = "A";
        }else if (total > 73){
            nilaiHuruf = "B+";
        }else if (total > 65){
            nilaiHuruf = "B";
        }else if (total > 60){
            nilaiHuruf = "C+";
        }else if (total > 50){
            nilaiHuruf = "C";
        }else if (total > 39){
            nilaiHuruf = "D";
        }else {
            nilaiHuruf = "E";
        }
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        System.out.println("Nilai Huruf: "+ nilaiHuruf);
    }
}

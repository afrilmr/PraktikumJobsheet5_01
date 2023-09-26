import java.util.Scanner;

public class PemilihanPercobaan101 {
    public static void main(String[] args) {

    Scanner sc01 = new Scanner(System.in);
    System.out.print("Masukkan angka :");
    int angka = sc01.nextInt(); 
    
    if (angka % 2 == 0)
        System.out.println("Angka "+angka+" bilangan genap");
    else
        System.out.println("Angka "+angka+" bilangan ganjil");
    } 
}

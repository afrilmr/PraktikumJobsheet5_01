import java.util.Scanner;

public class PemilihanPercobaan101_1 {
    public static void main(String[] args) {

    Scanner sc01 = new Scanner(System.in);
    System.out.print("Masukkan angka :");
    int angka = sc01.nextInt();
  
    String message = (angka % 2 == 0) ? " bilangan genap" : " bilangan ganjil";
    System.out.println("Angka " + angka + message);
    } 
}

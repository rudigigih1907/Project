import java.util.Scanner;

public class Penjumlahan {

 public static void main(String[] args) {

  int num1, num2, sum;
  Scanner sc = new Scanner(System.in);
  System.out.println("Masukkan Angka Pertama: ");
  num1 = sc.nextInt();

  System.out.println("Masukkan Angka Kedua: ");
  num2 = sc.nextInt();

  sc.close();
                sum = num1 + num2;
                System.out.println("Hasil penjumlahan: "+sum);
 }
}
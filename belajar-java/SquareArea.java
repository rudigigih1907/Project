import java.util.Scanner;

class SquareArea {

 public static void main (String[] args) {

 System.out.println("Masukkan panjang sisi:");
        //Ambil input pengguna
        Scanner scanner = new Scanner(System.in);
        //Simpan nilai yang diambil dalam suatu variabel
        double sisi = scanner.nextDouble();
        //Luas bujur sangkar = sisi * sisi
        double area = sisi*sisi; 
        System.out.println("Luas bujur sangkar adalah: "+area);
 }
}
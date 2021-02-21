import java.util.Scanner;

class LuasPersegiPanjang {
 
 public static void main (String[] args) {
  
            Scanner scanner = new Scanner(System.in);
     System.out.println("Masukkan panjang persegi panjang:");
     double panjang = scanner.nextDouble();
     System.out.println("Masukkan lebar persegi panjang:");
     double lebar = scanner.nextDouble();
     //Area = panjang*lebar;
     double area = panjang*lebar;
     System.out.println("Luas persegi panjang adalah:"+area);
 }
}
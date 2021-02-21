import java.util.Scanner;

class Circle {

 static Scanner sc = new Scanner(System.in);
 public static void main(String args[]) {

  System.out.print("Masukkan radius: ");
       /* Simpan radius yang dimasukkan ke tipe double
        * karena pengguna dapat memasukkan radius dalam desimal
        */
       double radius = sc.nextDouble();
       //Area = PI*radius*radius
       double area = Math.PI * (radius * radius);
       System.out.println("Luas lingkaran adalah: " + area);
       //Keliling = 2*PI*radius
       double keliling= Math.PI * 2*radius;
       System.out.println( "Keliling lingkaran adalah:"+keliling) ;
 }
}
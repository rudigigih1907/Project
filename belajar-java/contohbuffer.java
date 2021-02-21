import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class contohbuffer {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Berapakah Nilai x, jika x = a + (b x c) - d");

        System.out.print("Masukkan Nilai a : ");
        String a = input.readLine();
        System.out.print("Masukkan Nilai b : ");
        String b = input.readLine();
        System.out.print("Masukkan Nilai c : " );
        String c = input.readLine();
        System.out.print("Masukkan Nilai d : ");
        String d = input.readLine();
        System.out.println();

        //Konversi Data
        int nilaia = Integer.parseInt(a);
        int nilaib = Integer.parseInt(b);
        int nilaic = Integer.parseInt(c);
        int nilaid = Integer.parseInt(d);

        //Nilai x
        int x = nilaia + (nilaib * nilaic) - nilaid;

        System.out.println("x = a + (b x c) - d");
        System.out.println("x = " + nilaia + " + ("+ nilaib +"x" + nilaic + ") - " + nilaid);
        System.out.println("Jadi Nilai x = " + x);
    }

}
public class Segitigasikubintang {
    
    public static void main(String[] args) {
        int x,y;
        for (x = 0; x <=7; x++) {
           //outer loop
            System.out.println();
            //Memberi garis baru atau enter
  
            for (int y = 0; y < x; y++) {
                //inner loop
                System.out.print(" * ");
                //menampilkan bintang pada output  
            }
        }
    }  
}
public class Percabangan5 {

    public static void main(String[] args) {

        String makanan = " ";

        System.out.println("Pilihan Makanan : ");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Rebus");
        System.out.println("3. Mie Goreng");
        System.out.println("4. Soto Ayam");
        System.out.println("5. Nasi Kuning n");

        int pilihan = 1;

        switch (pilihan){
            case 1 : makanan = "Nasi Goreng" ;
                System.out.println("Makanan yang kamu pilih adalah  " + makanan);
                break;
            case 2: makanan = "Mie Rebus";
                System.out.println("Makanan yang kamu pilih adalah  " + makanan);
                break;
            case 3: makanan= "Mie Goreng";
                System.out.println("Makanan yang kamu pilih adalah  " + makanan);
                break;
            case 4: makanan = "Soto Ayam";
                System.out.println("Makanan yang kamu pilih adalah  " + makanan);
                break;
            case 5: makanan = "Nasi Kuning";
                System.out.println("Makanan yang kamu pilih adalah  " + makanan);
                break;
            default:
                System.out.println("Pilihan kamu tidak ada");
        }
    }
}
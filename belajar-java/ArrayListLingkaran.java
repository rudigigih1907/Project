import java.util.ArrayList;

public class ArrayListLingkaran {
    public static void main(String[] args) {

        // membuat objek array list
        ArrayList lingkaran = new ArrayList();

        // Mengisi Lingkaran dengan 5 data
        lingkaran.add("Jari-Jari");
        lingkaran.add(100);
        lingkaran.add("diameter");
        lingkaran.add(3.14);
        lingkaran.add(true);

        // menghapus diameter dari lingkaran
        lingkaran.remove("diameter");

        // Menampilkan isi dari lingkaran
        System.out.println(lingkaran);

        // menampilkan banyak isi data dari lingkaran
        System.out.println("Lingkaran berisi "+ lingkaran.size() +" data");
    }
}
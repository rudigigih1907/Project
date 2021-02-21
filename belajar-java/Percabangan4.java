public class Percabangan4 {

    public static void main(String[] args) {

        int a = 11500, b =21000, c = 20000;

        if ((a>b) && (a>c)) {
            System.out.println("Nilai a adalah yang tertinggi");
        } else if((b>a) && (b>c)){
            System.out.println("Nilai b adalah yang tertinggi");
        }else{
            System.out.println("Nilai c adalah yang tertinggi");
        }
    }
}
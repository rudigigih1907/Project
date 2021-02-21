public class Konversi{
    public static void main (String [] args){
        String a = "33";
        char b = 'D';
        int c = 54;
        double d = 34.1;
        
        //1.konversi double ke String
        String stbaru = Double.toString(d);
        System.out.println(stbaru);
    
        //2.konversi string ke double
        double dbbaru = Double.parseDouble(a);
        System.out.println(dbbaru);
    
        //3.konversi string ke integer
        int intbaru = Integer.parseInt(a);
        System.out.println(intbaru);
    
        //4.casting int ke double
        double e = ((double)c);
        System.out.println(e);
        
        //5.casting char ke integer
        System.out.println((int)b);
    }
}
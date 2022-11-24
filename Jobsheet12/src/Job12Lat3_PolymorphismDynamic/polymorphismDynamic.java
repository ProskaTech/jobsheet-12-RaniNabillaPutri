//created by 21343034_Rani Nabilla Putri
package Job12Lat3_PolymorphismDynamic;

public class polymorphismDynamic {
    public static void main(String[] args){
        //creating variable of Bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: " +B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: " +B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah: " +B.sukuBunga());
    }
}

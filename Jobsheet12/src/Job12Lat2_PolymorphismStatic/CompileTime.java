//created by 21343034_Rani Nabilla Putri
package Job12Lat2_PolymorphismStatic;

class CompileTime {
    //method keliling dengan single argumen
    static int keliling(int a){
        return 4 * a;
    }

    //method keliling dengan dua argumen (method overloading)
    static int keliling(int L, int b){
        return 2 * (L + b);
    }
}
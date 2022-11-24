//created by 21343034_Rani Nabilla Putri
package Job12Lat4_AbstractClass;

class AnakUmur1Tahun extends Orang{
    public void namaAyahKu(){
        System.out.println("Nama Ayahku adalah "+namaAyah);
    }

    @Override
    public void makan(){
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum(){
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}
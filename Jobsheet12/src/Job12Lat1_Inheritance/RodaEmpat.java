//created by 21343034_Rani Nabilla Putri
package Job12Lat1_Inheritance;

class RodaEmpat extends Kendaraan{
    double NaikHargaKe = 8; //1 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga mobil menjadi Rp " + hargaDasar);
    }
}
//created by 21343034_Rani Nabilla Putri
package Job12Lat1_Inheritance;

class RodaDua extends Kendaraan{
    double NaikHargaKe = 0.20; //0.2 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp " + hargaDasar);
    }
}
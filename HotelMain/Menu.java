/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelMain;
//Mengimport semua file pada Package Hotel
import Hotel.*;

//Class Menu inherit dengan class User
public class Menu extends user {
    public Menu(String username, String password) {
        super(username, password);
    }
    //Melakukan overriding pada method Cek Kamar
    @Override
    public void Cekkamar(Kamar[] kamar) {
        System.out.println("Daftar Semua Kamar dan Status : ");
        //For loop untuk menampilkan info kamar pada setiap index array kamar
        for (Kamar kmr : kamar) {
            kmr.tampilkanInfo();
        }
    }
    //Membuat overriding pada method Pesan kamar
    @Override
    public void PesanKamar(Kamar[] kamar, int NomorKamar, String NamaCust, int MalamInap) {
        //For loop untuk mengecek setiap indeks array kamar
        for (Kamar kmr : kamar) {
            //Jika input nomor kamar sama dengan nomor kamar dan kamar tersedia maka kamar akan dipesan
            if (kmr.getNomorKamar() == NomorKamar && kmr.KamarTersedia()) {
                kmr.PesanKamar(NamaCust, MalamInap);
                System.out.println("Kamar " + NomorKamar + " berhasil dipesan atas nama " + NamaCust + " untuk " + MalamInap + " malam");
                return;
            }
        }
        System.out.println("Kamar tidak tersedia atau nomor kamar salah");
    }
    //Membuat method untuk melihat detail pesanan
    public void lihatDetailPesanan(Kamar[] kamar) {
        System.out.println("Detail Kamar yang Sudah Dipesan : ");
        //For loop untuk mengecek setiap indeks array kamar
        for (Kamar kmr : kamar) {
            //Setiap kamar yang tidak tersedia akan mengeluarkan output dibawah
            if (!kmr.KamarTersedia()) {
                System.out.println("Kamar Nomor : " + kmr.getNomorKamar() + " telah dipesan atas nama : " + kmr.getNamaCust() + " untuk " + kmr.getMalamInap() + " malam.");
            }
        }
    }
}

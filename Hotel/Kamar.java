/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel;

public class Kamar {
    //Deklarasi variabel yang dibutuhkan
    private int NomorKamar;
    private String TipeKamar;
    private boolean Tersedia;
    private String NamaCust;
    private int MalamInap;

    // Konstruktor untuk variabel Nomor kamar, Tipe kamar dan tersedia
    public Kamar(int NomorKamar, String TipeKamar) {
        this.NomorKamar = NomorKamar;
        this.TipeKamar = TipeKamar;
        this.Tersedia = true; 
    }
    //Membuat method mengembalikan nilai untuk NomorKamar
    public int getNomorKamar() {
        return NomorKamar;
    }
    //Membuat method mengembalikan nilai untuk Nama Customer
    public String getNamaCust() {
        return NamaCust;
    }
    //Membuat method mengembalikan nilai untuk Malam Menginap
    public int getMalamInap() {
        return MalamInap;
    }
    //Membuat method mengembalikan nilai untuk Kamar yang Tersedia
    public boolean KamarTersedia() {
        return Tersedia;
    }
    //Membuat method untuk Pemesanan kamar 
    public void PesanKamar(String NamaCust, int MalamInap) {
        this.NamaCust = NamaCust;
        this.MalamInap = MalamInap;
        this.Tersedia = false;
    }
    //Membuat method untuk menampilkan info kamar yang tersedia
    public void tampilkanInfo() {
        //Membuat variabel status yang berisi boolean tersedia(1) / tidak tersedia(0)
        String Status = Tersedia ? "Tersedia" : "Tidak Tersedia";
        System.out.println("Nomor Kamar : " + NomorKamar + " , Tipe : " + TipeKamar + " , Status : " + Status);
    }
}

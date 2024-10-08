/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel;

/**
 *
 * @author Asus
 */
public interface HotelInterface {
    //Membuat method abstract kosong untuk Cek Kamar dan Pesan kamar dengan variabel-variabelnya
    public abstract void Cekkamar(Kamar[] kamar);
    public abstract void PesanKamar(Kamar[] kamar, int NomorKamar,String NamaCust, int MalamInap);
}

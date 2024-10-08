/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelMain;
//Mengimport semua file pada package Hotel
import Hotel.*;
import java.util.Scanner;
/**
 *
 * @author Asus
 */

public class HotelBeraksi {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        // Menginisialisasi indeks pada array kamar 
        Kamar[] kamar = { new Kamar(1, "Deluxe"),
                          new Kamar(2, "Standart"),
                          new Kamar(3, "Suite"),
                        };
        // Membuat objek admin dengan memanggil class Menu dan mengisi value username dan password
        Menu admin = new Menu("admin", "123");
        System.out.println("Selamat datang di Menu Reservasi Hotel!");
        System.out.println("Pilih peran Anda : ");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.print("Masukkan pilihan : ");
        int user = Input.nextInt();
        //Pengkondisian untuk login user
        if (user == 1) {
            MenuAdmin(admin, kamar, Input);
        } else if (user == 2) {
            MenuCustomer(admin, kamar,Input);
        } else {
            System.out.println("Pilihan peran tidak valid.");
        }
    }
    //Membuat method untuk Menu pada user Admin
    private static void MenuAdmin(Menu admin, Kamar[] kamar, Scanner Input) {
        System.out.println("Login Admin");
        Input.nextLine();
        System.out.print("Masukkan username : ");
        String username = Input.nextLine();
        System.out.print("Masukkan password : ");
        String password = Input.nextLine();
        //Pengecekkan username dan password
        if (admin.login(username, password)) {
            boolean menu = true;
            //While Loop untuk melakukan perulangan pada Menu
            while (menu) {
                System.out.println("\nMenu Admin:");
                System.out.println("1. Cek Ketersediaan Kamar");
                System.out.println("2. Pesan Kamar");
                System.out.println("3. Lihat Detail Pesanan");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu : ");
                int choice = Input.nextInt();
                //Switch Case untuk Pilihan fitur pada Menu Admin
                switch (choice) {
                    case 1:
                        admin.Cekkamar(kamar);
                        break;
                    case 2:
                        System.out.print("Masukkan nomor kamar yang ingin dipesan : ");
                        int NomorKamar = Input.nextInt();
                        Input.nextLine();
                        System.out.print("Masukkan Nama Anda : ");
                        String NamaCust = Input.nextLine();
                        System.out.print("Berapa malam Anda menginap : ");
                        int MalamInap = Input.nextInt();
                        admin.PesanKamar(kamar, NomorKamar, NamaCust, MalamInap);
                        break;
                    case 3:
                        admin.lihatDetailPesanan(kamar);
                        break;
                    case 4:
                        menu = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                }
            }
        } else {
            System.out.println("Username atau password salah");
        }
    }
    //Method untuk Menu pada user Customer 
    private static void MenuCustomer(Menu customer, Kamar[] kamar, Scanner Input) {
        boolean menu = true;
        //While Loop untuk melakukan perulangan pada Menu
        while (menu) {
            System.out.println("\nMenu Customer:");
            System.out.println("1. Cek Ketersediaan Kamar");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            int choice = Input.nextInt();
            //Switch Case untuk Pilihan fitur pada Menu Customer
            switch (choice) {
                case 1:
                    customer.Cekkamar(kamar);
                    break;
                case 2:
                    System.out.print("Masukkan nomor kamar yang ingin dipesan : ");
                    int NomorKamar = Input.nextInt();
                    Input.nextLine();
                    System.out.print("Masukkan Nama Anda : ");
                    String NamaCust = Input.nextLine();
                    System.out.print("Berapa malam Anda menginap : ");
                    int MalamInap = Input.nextInt();
                    customer.PesanKamar(kamar, NomorKamar, NamaCust, MalamInap);
                    break;
                case 3:
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}

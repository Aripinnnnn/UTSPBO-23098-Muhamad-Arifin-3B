/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author Asus
 */
//Class User mengimplement class interface
public abstract class user implements HotelInterface{
    //Membuat variabel untuk login user Admin
    protected String username;
    protected String password;
    //Konstruktor untuk login user Admin
    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //Membuat method untuk login admin
    public boolean login(String username, String password) {
        //Mengembalikan nilai hanya untuk input username dan password yang sama dengan value username dan password
        return this.username.equals(username) && this.password.equals(password);
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encap.siswa;

/**
 *
 * @author M. RAFI DUTA ATTALA
 */
public class TestSiswa {
    public static void main(String[] args) {
        datasiswa siswa = new datasiswa();
        siswa.setName("Muhammad Rafi Duta Attala");
        siswa.setAge(24);
        siswa.setAddress("jalan Gajahmada,Pare,Kab.Kediri");
        
        System.out.println("Name: " + siswa.getName()
        + " absen: " + siswa.getAbsen() + 
        " Adress: " + siswa.getAddress());
    }
}

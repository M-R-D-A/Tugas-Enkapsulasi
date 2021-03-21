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
public class Ujibus3 {
    public static void main(String[] abc) 
    {
        Bus3 bus = new Bus3(5);
        bus.getPenumpang(17);
        bus.getPenumpang(24);
        bus.cetakPenumpang();
        
        bus.addPenumpang(2);
        bus.cetakPenumpang();
        
        bus.addPenumpang(1);
        bus.cetakPenumpang();
        
        bus.addPenumpang(2);
        bus.cetakPenumpang();
        
        bus.addPenumpang(2);
        bus.cetakPenumpang();
    }
}

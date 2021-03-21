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
public class ujibus4 {
    public static void main(String[] args) {
        bus4 bus = new bus4(10);
        bus.getPenumpang(24);
        
        bus.addPenumpang(2);
        bus.cetakPenumpang();
        
        bus.addPenumpang(1);
        bus.cetakPenumpang();
        
        bus.addPenumpang(3);
        bus.cetakPenumpang();
        
        bus.addPenumpang(1);
        bus.cetakPenumpang();
        
        bus.addberat(34);
        bus.addberat(45);
        bus.addberat(50);
        bus.addberat(55);
        bus.addberat(35);
        bus.addberat(85);
        bus.addberat(40);
        
        bus.getAverage();
        bus.ratarataberat();
    }
}

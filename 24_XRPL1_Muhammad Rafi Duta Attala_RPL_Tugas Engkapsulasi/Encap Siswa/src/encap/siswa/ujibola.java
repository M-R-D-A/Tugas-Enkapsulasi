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
public class ujibola {
    public static void main(String[] args) {
        bola bolaa = new bola();
        bolaa.setJarijari(28);
        double Diameter = bolaa.Diameter;
        double LuasPermukaan = bolaa.LuasPermukaan;
        double VolumeBola = bolaa.VolumeBola;
        bolaa.showDiameter();
        bolaa.showLuasPermukaan();
        bolaa.showVolume();
    }
}

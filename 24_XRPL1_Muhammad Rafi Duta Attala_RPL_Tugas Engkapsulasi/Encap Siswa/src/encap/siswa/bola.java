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
    import javax.swing.JOptionPane;
public class bola {
    public double Jarijari;
    public double Diameter;
    public double LuasPermukaan;
    public double PHI = 3.14;
    public double VolumeBola;
    
    public void setJarijari( double newJarijari){
        Jarijari = newJarijari;
    }
    
    public void Diameter(){
        Diameter = 2 * Jarijari;
    }
    
    public void LuasBola(){
        LuasPermukaan = 4 * Jarijari * Jarijari * PHI ;
    }
    public void volume() {
       VolumeBola = 4/3 * PHI * Jarijari * Jarijari * Jarijari;
    }
    
    public void showDiameter(){
        JOptionPane.showMessageDialog(null,"Diameter: " + Diameter);
    }
    public void showLuasPermukaan(){
        JOptionPane.showMessageDialog(null,"Luas Permukaan: " + LuasPermukaan);
    }
    public void showVolume(){
        JOptionPane.showMessageDialog(null,"Volume: " + VolumeBola);
    }
}

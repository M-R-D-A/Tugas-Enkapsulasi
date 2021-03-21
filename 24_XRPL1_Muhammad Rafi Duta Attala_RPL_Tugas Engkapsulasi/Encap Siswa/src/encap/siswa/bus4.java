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
public class bus4 {
    public double Penumpang;
    public double maxPenumpang;
    public double Average;
    public double berat;
    int weight;
    
    public bus4(int maxPenumpang)
    {
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }
    
    public void addPenumpang(double Penumpang)
    {
        int temp;
        temp = (int) (this.Penumpang+Penumpang);
        if (temp>maxPenumpang)
        {
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.Penumpang=temp;
        }
    }
    public void getPenumpang(double password)
    {
        if (password == 24)
        {
            System.out.println("Password Benar");
        }
        else
        {
            System.out.println("Password Salah");
        }
    }
    public void addberat(double berat)
    {
        weight = (int) (this.berat + berat);
    }
    public double getAverage(){
         return Average = weight/Penumpang;
    }
    public void ratarataberat(){
        System.out.println("rata rata berat penumpang = " + Average);
    }
    public void cetakPenumpang()
    {
        System.out.println("Penumpang Bus Sekarang = " + Penumpang);
        System.out.println("Maksimum Penumpang yang seharusnya adalah = "+maxPenumpang);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author user
 */
public class KubusBalok {
    public void hitung(int s){
        System.out.println("Volume Kubus : "+(s*s*s));
    }
    public void hitung(int p, int l, int t){
        System.out.println("Volume Balok : "+(p*l*t));
    }
    
    
}

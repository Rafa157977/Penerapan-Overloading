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
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KubusBalok volume = new KubusBalok();
        
        volume.hitung(30);
        
        volume.hitung(30, 40, 50);
    }
    
}

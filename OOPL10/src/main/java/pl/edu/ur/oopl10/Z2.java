/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.*;

public class Z2 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        try{
            int[] tab = new int[5];
                for(int i = 0; i<=5; i++){
                    tab[i] = random.nextInt();
                }
            
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Wykroczenie poza indeks tablicy. Zakonczenie programu!");
        }
        
    }
}
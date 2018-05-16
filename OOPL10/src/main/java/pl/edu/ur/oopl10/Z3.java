/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

public class Z3 extends Exception {
    
    int liczba1;
    int liczba2;

    public Z3(int liczba1, int liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }
    
    public void dzielenie(){
        try{
            System.out.println(liczba1/liczba2);
        }
        catch(ArithmeticException e1){
            System.out.println("Wyjatek dzielenia przez 0 w metodzie. Zakonczenie programu!");
        }
    }
    
    public static void main(String[] args) {
        
        Z3 a = new Z3(5, 0);
        
        try{
            a.dzielenie();
        }
        catch(ArithmeticException e2){
            System.out.println("Wyjatek dzielenia przez 0 w main. Zakonczenie programu!");
        }
        
    }
}
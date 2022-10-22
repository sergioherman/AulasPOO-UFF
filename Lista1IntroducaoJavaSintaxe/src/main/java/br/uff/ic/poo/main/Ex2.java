/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.main;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Ex2 {
    
    public void exercicio2(){
        int R;
        int S;
        int T;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com o valor de R: ");
        R = teclado.nextInt();
        System.out.print("Entre com o valor de S: ");
        S = teclado.nextInt();
        System.out.print("Entre com o valor de T: ");
        T = teclado.nextInt();
        
        System.out.print("O maior é: ");
        if (R > S){
            if (R > T){
                System.out.println("R = " + R);
            }else{
                System.out.println("T = " + T);
            }
        }else{
            if (S > T){
                System.out.println("S = " + S);
            }else{
                System.out.println("T = " + T);
            }
        }
        
    }
    
}

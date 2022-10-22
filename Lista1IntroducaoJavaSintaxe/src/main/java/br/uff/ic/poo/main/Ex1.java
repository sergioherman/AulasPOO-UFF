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
public class Ex1 {
    
    public void exercicio1(){

        int n = 0;
        int qtdeNeg = 0;
        float valor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a quantidade de números a ser avaliada: ");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++){
            System.out.print("Entre com o " + (i+1) + "º valor: ");
            valor = teclado.nextFloat();
            if (valor < 0){
                qtdeNeg ++;
            }
        }
        
        System.out.println("Quantidade de negativos: " + qtdeNeg);

        
    }
    
}

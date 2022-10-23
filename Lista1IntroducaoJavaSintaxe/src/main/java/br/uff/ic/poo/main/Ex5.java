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
public class Ex5 {
    
    public int calculaFatorial(int valor){
        if(valor > 0){
            int fatorial = 1;
            for (int i = 1; i < valor; i++){
                fatorial *= i;
            }
            return fatorial;
        }else{
            return -1;
        }        
    }
    
    public void exercicio5(){
        int valor;
        int num;
        System.out.print("Entre com o valor para calcular o fatorial: ");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        valor = calculaFatorial(num);
        if (valor > 0){
            System.out.println("Fatorial de " + num + " vale: " + valor);
        }else{
            System.out.println("Impossível calcuar o fatorial de número negativo.");
        }
    }
}

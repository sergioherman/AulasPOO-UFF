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
public class Ex7 {
    
    public void exercicio7(){
        
        Scanner teclado = new Scanner(System.in);
        int nota;
        int total = 0;
        int n = 2;
        int qtdNotasPessimas = 0;
        int qtdNotasRuins = 0;
        int qtdNotasBoas = 0;
        int qtdNotasOtimas = 0;
        System.out.print("Entre com a 1º nota: ");        
        nota = teclado.nextInt();
        while (0 <= nota && nota <= 100){
            total++;
            if (nota <= 25){
                qtdNotasPessimas++;
            }else if (nota <= 50){
                qtdNotasRuins++;
            }else if (nota <= 75){
                qtdNotasBoas++;
            }else{
                qtdNotasOtimas++;
            }
                       
            System.out.print("Entre com a " + n + "º nota.");
            nota = teclado.nextInt();
            n++;
        }
        System.out.println();
        System.out.println("Percentual de notas ruins: " + (qtdNotasPessimas * 100 / total));
        System.out.println("Total de notas: " + total);
    }
    
    
    
}

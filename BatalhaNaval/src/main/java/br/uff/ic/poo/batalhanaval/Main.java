/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.batalhanaval;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Início do Jogo");
        BatalhaNaval jogo1 = new BatalhaNaval();
        jogo1.imprimeBatalha();
        while (jogo1.ehFimJogo() == false){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Entre com o palpite: ");
            String palpite = teclado.next();
            jogo1.verificaPalpite(Integer.parseInt(palpite));
            jogo1.imprimeBatalha();
        }
    }
}

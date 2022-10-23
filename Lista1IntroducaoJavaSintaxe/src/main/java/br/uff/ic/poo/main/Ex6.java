/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.main;

/**
 *
 * @author sergio
 */
public class Ex6 {
    public void exercicio6(){
        long primeiro = 0;
        long segundo = 1;
        long temp;
        System.out.println("1 -> " + primeiro);
        System.out.println("2 -> " + segundo);
        for (int i = 3; i <= 100; i++){
            System.out.println(i + " -> " + (primeiro + segundo));
            temp = segundo;
            segundo = primeiro + segundo;
            primeiro = temp;
        }
    }
}

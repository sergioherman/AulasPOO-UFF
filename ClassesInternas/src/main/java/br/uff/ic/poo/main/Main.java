/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.main;

import br.uff.ic.poo.classesinternasexternas.Externa;

/**
 *
 * @author sergio
 */
public class Main {
    public static void main(String[] args){
        Externa objexterna = new Externa(101);
        
        Externa.Aninhada objaninhada = objexterna.new Aninhada();
        
        objaninhada.exibir();
    
        Externa.AninhadaEstatica objAninhadaEstatica = new Externa.AninhadaEstatica();
                
        objAninhadaEstatica.exibir();
    }
    
}

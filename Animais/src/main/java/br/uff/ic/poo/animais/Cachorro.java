/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.animais;

/**
 *
 * @author sergio
 */
public class Cachorro extends Animal{
    
    @Override
    public void fazerRuido(){
        System.out.println("O cachorro está latindo");
    }
    public void comer(String comida){
        super.comer(comida);
        System.out.println("Cães comem de tudo.");
    }

    public Cachorro(){
        especie = "Cachorro";
    }
    
}

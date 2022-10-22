/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.animais;

/**
 *
 * @author sergio
 */
public class Ave extends Animal {
    
    @Override
    public void fazerRuido(){
        System.out.println("Animal fez ruido");
    }
    
    @Override
    public void circular(){
        System.out.println("Ave voando");
    }
    @Override
    public void comer(String comida){
        if (comida.equals("carne")){
            System.out.println("A ave não quer comer.");
        }
        else{
            super.comer(comida);
        }
    }
    
}

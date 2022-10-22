/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.animais;

/**
 *
 * @author sergio
 */
public class Cachorro extends Animal implements Domesticavel{
    
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
    
    @Override
    public void serAmigavel(){
        System.out.println("Cachorro quer carinho");
    }

    @Override
    public void bricar() {
        System.out.println("Cachorro está brincando");
    }
        
}

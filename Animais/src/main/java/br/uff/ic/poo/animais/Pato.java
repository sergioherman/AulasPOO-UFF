/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.animais;

/**
 *
 * @author sergio
 */
public class Pato extends Ave {
    @Override
    public void fazerRuido(){
        System.out.println("O pato está fazendo quac.");
    }
    public Pato(){
        especie = "Pato";
    }
}

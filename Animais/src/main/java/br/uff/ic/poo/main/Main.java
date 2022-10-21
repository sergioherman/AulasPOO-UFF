/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.main;

import br.uff.ic.poo.animais.*;
import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("Inicio");
        Animal animal = new Animal();
        animal.fazerRuido();
        Pato donald = new Pato();
        donald.circular();
        ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
        listaAnimais.add(animal);
        listaAnimais.add(donald);
        listaAnimais.add(new Cachorro());
        listaAnimais.add(new Passaro());
        for (Animal animalDaLista: listaAnimais){
            System.out.println("\n\nEspécie: " + animalDaLista.getEspecie());
            animalDaLista.fazerRuido();
            animalDaLista.circular();
            animalDaLista.comer("carne");
        }
    }
    
    
}

package br.uff.ic.poo.main;


import br.uff.ic.poo.bolos.BoloRetangular;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class Main {
    public static void main(String[] args) {
        BoloRetangular meuBolo = new BoloRetangular();
        
        imprimirBolo(meuBolo);

        meuBolo.setPeso(3);
        meuBolo.setSabor("Chocolate");
        meuBolo.comer(1);

        imprimirBolo(meuBolo);
        
        BoloRetangular boloDeMorango = new BoloRetangular();
        boloDeMorango.setSabor("Morango");
        boloDeMorango.setCobertura("Brigadeiro");
        boloDeMorango.setPeso(4);
        boloDeMorango.comer((float) 1.5);
        
        meuBolo.comer(1);
        
        imprimirBolo(boloDeMorango);
        
        BoloRetangular boloDeChocolate = new BoloRetangular(3,"Chocolate","Caramelo");
        imprimirBolo(boloDeChocolate);
        
        boloDeChocolate.comer((float)2.5);
        imprimirBolo(boloDeChocolate);
        boloDeChocolate.comer(1);
        imprimirBolo(boloDeChocolate);
        System.out.println("Quantos Bolos: " + BoloRetangular.getNumBolos());
    }
    
    static void imprimirBolo(BoloRetangular boloParaImprimir){
        
        System.out.println("\nSabor do bolo: " + boloParaImprimir.getSabor());
        System.out.println("Peso do bolo: " + boloParaImprimir.getPeso() + "\n");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.batalhanaval;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sergio
 */
public class BatalhaNaval {
    private char[] batalha = new char[10];
    //private int[] localizacao = new int[3];
    private ArrayList<Integer> localizacao = new ArrayList<Integer>();
    int numAcertos = 0;
    
    public BatalhaNaval(){
        Random r = new Random();
        int posInicial = r.nextInt(8);
        localizacao.add(posInicial);
        localizacao.add(posInicial + 1);
        localizacao.add(posInicial + 2);
        System.out.println("Localização do barco: " + posInicial);
        
    }
    private void inicializaBatalha(){
        for (int i = 0; i < this.batalha.length; i++){
            this.batalha[i] = 'o';
        }
        
    }
    
    public void verificaPalpite(Integer palpite){
        if (localizacao.contains(palpite)){
            this.batalha[palpite] = 'x';
            numAcertos++;
            localizacao.remove(palpite);
        }
        else{
            this.batalha[palpite] = '~';
        }
    }
    
    public void imprimeBatalha(){
        for (char celula: this.batalha){
            System.out.print(" | "+celula);
        }
        System.out.println(" |");
    }
    
    public boolean ehFimJogo(){
        return numAcertos == 3;
    }
}

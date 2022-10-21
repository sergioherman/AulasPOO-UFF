package br.uff.ic.poo.bolos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class BoloRetangular {
    
    public float peso;
    private String sabor;
    private String cobertura;
    private static int numBolos = 0;
    public static final int TEMPO_FORNO = 20;
    

    //Construtor
    public BoloRetangular() {
        numBolos++;
    }
    public BoloRetangular(float peso, String sabor, String cobertura) {
        this.peso = peso;
        this.cobertura = cobertura;
        this.sabor = sabor;
        numBolos++;
    }
    
    public BoloRetangular(float peso, String sabor){
        this.peso = peso;
        this.sabor = sabor;
        numBolos++;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public String getSabor(){
        return this.sabor;
    }
    
    public String getCobertura(){
        return this.cobertura;
    }
    
    public static int getNumBolos(){
        return numBolos;
    }
    
    public void setPeso(float peso){
        if (peso >= 0){
            this.peso = peso;
        }else{
            System.out.println("Valor inválido para peso do bolo.");
        }
        
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    
    public void setCobertura(String cobertura){
        this.cobertura = cobertura;
    }
    public void decorar(){
        System.out.println("Bolo decorado.");
    }
    public void comer(float pesoComido){
        if (peso - pesoComido > 0){
            System.out.println("Comi " + pesoComido + " Kg de bolo");
        }else{
            System.out.println("Não tem " + pesoComido + " de bolo para comer.");
        }
        setPeso(peso - pesoComido);
    }
    
}

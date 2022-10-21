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

    //Construtor
    public BoloRetangular() {
    }
    public BoloRetangular(float peso, String sabor, String cobertura) {
        this.peso = peso;
        this.cobertura = cobertura;
        this.sabor = sabor;
    }
    
    public BoloRetangular(float peso, String sabor){
        this.peso = peso;
        this.sabor = sabor;
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
        setPeso(peso - pesoComido);
        if (peso - pesoComido > 0){
            System.out.println("Comi " + pesoComido + " Kg de bolo");
        }else{
            System.out.println("Não tem " + pesoComido + " de bolo para comer.");
        }
    }
    
}

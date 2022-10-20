/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class BoloRetangular {
    
    float peso;
    String sabor;
    String cobertura;

    //Construtor
        BoloRetangular() {
    }
    BoloRetangular(float peso, String sabor, String cobertura) {
        this.peso = peso;
        this.cobertura = cobertura;
        this.sabor = sabor;
    }
    
    BoloRetangular(float peso, String sabor){
        this.peso = peso;
        this.sabor = sabor;
    }
    
    public void decorar(){
        System.out.println("Bolo decorado.");
    }
    void comer(float pesoComido){
        peso = peso - pesoComido;
        System.out.println("Comi " + pesoComido + " Kg de bolo");
    }
    
}

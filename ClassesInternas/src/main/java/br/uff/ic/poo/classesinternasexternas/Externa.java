/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.classesinternasexternas;

/**
 *
 * @author sergio
 */
public class Externa {
    private int valor;
    static int valorEstatico;
    
    public Externa (int valor){
        this.valor = valor;
    }
    
    public class Aninhada{
        public void exibir(){
            System.out.println("Valor = " + valor);
        }
    }
    
    public static class AninhadaEstatica{
        public void exibir(){
            System.out.println("Valor = " + valorEstatico);
        }
    }
}

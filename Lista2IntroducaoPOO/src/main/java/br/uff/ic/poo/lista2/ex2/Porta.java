/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista2.ex2;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Porta {
    private boolean estaAberta;
    String cor = "marrom";
    float tamanhoVertical = (float) 2.10;
    float tamanhoHorizontal = (float) 0.8;
    
    public void alterarTamanho(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a altura da porta: ");
        float novaAltura = teclado.nextFloat();
        System.out.print("Entre com a largura da porta: ");
        float novaLargura = teclado.nextFloat();
        this.tamanhoVertical = novaAltura;
        this.tamanhoHorizontal = novaLargura;
    }
    
    public void pintarPorta(String cor){
        this.cor = cor;
        System.out.println("A porta foi pintada e está na cor " + cor + ".");
    }
    
    public void abrirPorta(){
        if (this.estaAberta == true){
            System.out.println("A porta já estava aberta");
        }else{
            this.estaAberta = true;
            System.out.println("A porta foi aberta");
        }
    }
    
    public void fecharPorta(){
        if (this.estaAberta == true){
            this.estaAberta = false;
            System.out.println("A porta foi fechada");
        }else{
            System.out.println("A porta já estava fechada");
        }
    }
    
    public void estaAberta(){
        if (this.estaAberta){
            System.out.println("A porta está aberta.");
        }else{
            System.out.println("A porta está fechada.");
        }
    }
    
    public void imprimirEstadoPorta(){
        if (this.estaAberta == true){
            System.out.println("\nEstado: Aberta");
        }else{
            System.out.println("Estado: Fechada");
        }
        System.out.println("Cor: " + this.cor);
        System.out.println("Altura: " + this.tamanhoVertical);
        System.out.println("Largura: " + this.tamanhoHorizontal + "\n");
    }
    
}

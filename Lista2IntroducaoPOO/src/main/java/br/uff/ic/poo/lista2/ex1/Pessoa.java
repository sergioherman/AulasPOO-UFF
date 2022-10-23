/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista2.ex1;

/**
 *
 * @author sergio
 */
public class Pessoa {
    
    private String nome = "Fulano";
    private int idade = 25;
    
    public void fazerAniversario(){
        idade++;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void imprimirPessoa(){
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
    
    }

}
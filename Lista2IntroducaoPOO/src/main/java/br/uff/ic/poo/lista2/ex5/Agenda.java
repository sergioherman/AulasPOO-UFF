/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista2.ex5;

import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class Agenda {
    
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    private int NUMCONTATOS = 0;
        
    public void adicionarContato(String nome, String numero){
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setNumero(numero);
        contatos.add(contato);
        NUMCONTATOS++;
    }
    
    public void removerUltimoContato(){
        contatos.remove(NUMCONTATOS - 1);
        NUMCONTATOS -= 1;
    }
    
    public void listarContatos(){
        System.out.println("\n\n**********\nLista de contatos:\n");
        for (Contato i: contatos){
            System.out.println("Nome: " + i.getNome());
            System.out.println("Número: " + i.getNumero() + "\n");
        }
        System.out.println("************\n\n");
    }
    
}

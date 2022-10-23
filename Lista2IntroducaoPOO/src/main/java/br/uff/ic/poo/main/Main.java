/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.main;

import br.uff.ic.poo.lista2.ex1.Pessoa;
import br.uff.ic.poo.lista2.ex2.Porta;

/**
 *
 * @author sergio
 */
public class Main {
    
    public static void main(String args[]){
        //Exercício 1
        /*
        Pessoa pessoa1 = new Pessoa();
        pessoa1.imprimirPessoa();
        pessoa1.fazerAniversario();
        pessoa1.fazerAniversario();
        pessoa1.imprimirPessoa();
        */
        
        
        //Exercício2
        Porta porta = new Porta();
        porta.imprimirEstadoPorta();
        porta.abrirPorta();
        porta.alterarTamanho();
        porta.pintarPorta("cinza");
        porta.imprimirEstadoPorta();
        porta.fecharPorta();
        porta.pintarPorta("verde");
        porta.estaAberta();
    }
    
    
}

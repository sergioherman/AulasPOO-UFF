/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista2.main;

import br.uff.ic.poo.lista2.ex1.Pessoa;
import br.uff.ic.poo.lista2.ex2.Porta;
import br.uff.ic.poo.lista2.ex5.Agenda;

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
        
        
        //Exercício 2
        /*
        Porta porta = new Porta();
        porta.imprimirEstadoPorta();
        porta.abrirPorta();
        porta.alterarTamanho();
        porta.pintarPorta("cinza");
        porta.imprimirEstadoPorta();
        porta.fecharPorta();
        porta.pintarPorta("verde");
        porta.estaAberta();
        */
        
        //Exercicio 5
        
        Agenda agenda = new Agenda();
        agenda.listarContatos();
        
        agenda.adicionarContato("Fulano", "99123456");
        agenda.removerUltimoContato();
        agenda.listarContatos();
        agenda.adicionarContato("Fulano", "99123456");
        agenda.adicionarContato("Ciclano", "99000000");
        agenda.adicionarContato("Beltrano", "998876543");
        agenda.adicionarContato("Remover", "99111111");
        agenda.removerUltimoContato();

        agenda.listarContatos();


        
        
    }
    
    
}

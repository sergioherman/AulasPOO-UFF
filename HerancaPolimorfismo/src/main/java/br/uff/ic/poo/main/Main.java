/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.main;

import br.uff.ic.poo.pessoas.Cliente;
import br.uff.ic.poo.pessoas.Funcionario;

/**
 *
 * @author sergio
 */
public class Main {
    
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.atualizarContato("Rua 1", "99999999", "joao@ic.br");
        cliente.atualizarPontosFidelidade(50);
        cliente.imprimePessoa();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marcos");
        funcionario.atualizarContato("Rua 3", "99998888", "marcos@ic.br");
        funcionario.setDataAdmissao("03/10/2020");
        funcionario.imprimePessoa();
    
    
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.pessoas;

/**
 *
 * @author sergio
 */
public class Funcionario extends Pessoa{
    String dataAdmissao = "00/00/0000";
    
    public void promover(){
        System.out.println("Funcionario promovido");
    }
    
    public void aposentar(){
        System.out.println("Funcionario aposentado");
    }
    
    public void setDataAdmissao(String data){
        this.dataAdmissao = data;
    }
    
    public void imprimePessoa(){
        super.imprimePessoa();
        System.out.println("Data de Admissão: " + dataAdmissao);
    }
    
    
}

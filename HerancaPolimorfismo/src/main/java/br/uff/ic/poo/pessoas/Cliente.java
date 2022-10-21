/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.pessoas;

/**
 *
 * @author sergio
 */
public class Cliente extends Pessoa{
    private Integer pontosFidelidade = 0;
    
    public void atualizarPontosFidelidade(Integer pontos){
        this.pontosFidelidade += pontos;
    }
    
    public void imprimePessoa(){
        super.imprimePessoa();
        System.out.println("Pontos de Fidelidade: " + this.pontosFidelidade);
        
    }
}

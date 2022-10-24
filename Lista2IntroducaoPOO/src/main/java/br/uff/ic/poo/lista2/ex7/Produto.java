/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista2.ex7;

/**
 *
 * @author sergio
 */
public class Produto {
    private String tipo;
    private float preco;
    int qtdeEstoque;
    
    public Produto(String tipo, float preco, int qtde){
        this.tipo = tipo;
        this.preco = preco;
        this.qtdeEstoque = qtde;
    }
    
    public float getPreco(){
        return this.preco;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String nome){
        this.tipo = nome;
    }
    public void setQtdeEstoque(int qtde){
        this.qtdeEstoque = qtde;
    }
    public int getQtdeEstoq(){
        return this.qtdeEstoque;
    }

}

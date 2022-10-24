/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista2.ex7;

/**
 *
 * @author sergio
 */
public class Item {
    private Produto produto;
    private int qtde;
    
    public Item(Produto produto, int qtde){
        this.produto = produto;
        this.qtde = qtde;
    }
    
    public float calculaSubtotal(){
        return produto.getPreco() * qtde;
    }
    public String getNome(){
        return this.produto.getTipo();
    }
    public float getPreco(){
        return this.produto.getPreco();
    }
    public float getQtde(){
        return this.qtde;
    }
    public void setNome(String nome){
        this.produto.setTipo(nome);
    }
    public void setQtdeEstoque(int qtde){
        this.produto.setQtdeEstoque(qtde);
    }
    public int getQtdEstoque(){
        return this.produto.qtdeEstoque;
    }
    
    public void alterarQtdeEmEstoque(Produto produto, int qtde){
        produto.setQtdeEstoque(qtde);
    }

    
}

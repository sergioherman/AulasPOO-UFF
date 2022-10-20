/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class Pedido {
    
    Cliente cliente;
    Item[] itens = new Item[100];
    int qtdeItens = 0;
    
    float getTotal(){
        float total = 0;
        for (int i = 0; i<qtdeItens; i++){
            total += itens[i].getSubtotal();
        }
        return total;
    }
    
    void addItem(Produto prod, int qtde){
        Item item = new Item();
        item.produto = prod;
        item.quantidade = qtde;
        itens[qtdeItens] = item;
        qtdeItens += 1;
        if (qtdeItens > 2){
            System.out.println("Limite de itens atingido.");
        }
    }
    
}

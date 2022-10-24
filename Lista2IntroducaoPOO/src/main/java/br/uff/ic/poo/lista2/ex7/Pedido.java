/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista2.ex7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Pedido {
    ArrayList<Item> listaCliente = new ArrayList<Item>();
    int tamLista = 0;
    public void adicionarItemLista(Produto produto, int qtde){
        Item item = new Item(produto, qtde);
        listaCliente.add(item);
        tamLista++;
    }
    public void removerUltimoItemLista(){
        listaCliente.remove(tamLista - 1);
    }
    
    public void imprimirPedido(){
        System.out.print("\n");
        for (Item item: listaCliente){
            System.out.println(item.getNome() + " ----- " + item.getPreco() + "\nQuantidade: " + item.getQtde() + " ----- R$ " + item.calculaSubtotal() + "0\n");
        }
        System.out.print("\n");
    }
    
    public void calcularTotal(){
        float total = 0;
        int qtdeItens = 0;
        for (Item item: listaCliente){
            float subtotal = item.calculaSubtotal();
            total += subtotal;
            qtdeItens++;
        }
        System.out.println("Valor total: R$ " + total + "0");
        
    }
    
    public void finalizarPedido(){
        System.out.println("Opções de pagamento: 1.Dinheiro, 2.Cheque, 3.Cartão, 0.Cancelar");
        Scanner teclado = new Scanner(System.in);
        int opPgto = teclado.nextInt();
        while (opPgto < 0 && opPgto > 3){
            System.out.println("Opção Inválida, tente novamente: ");
            opPgto = teclado.nextInt();
        }
        if (opPgto > 0){
            for (Item item: listaCliente){
                
                item.setQtdeEstoque((int) (item.getQtdEstoque() - item.getQtde()));
            }
        }
    }
}

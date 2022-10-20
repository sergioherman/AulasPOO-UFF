/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class Caixa {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nome = "João da Silva";
        cliente.endereço = "Rua dos Bobos, Número Zero";;
        
        Produto acucar = new Produto();
        acucar.descricao = "Açucar";
        acucar.preco = (float) 2.5;
        
        Produto macarrao = new Produto();
        macarrao.descricao = "Macarrão";
        macarrao.preco = 3;
        
        Produto feijao = new Produto();
        feijao.descricao = "Feijão";
        feijao.preco = 4;
        
        
        Pedido pedido1 = new Pedido();
        pedido1.addItem(acucar,5);
        pedido1.addItem(macarrao,2);
        pedido1.addItem(feijao, 3);
        
        System.out.println("O total do pedido é: " + pedido1.getTotal();
        
    }
    
}

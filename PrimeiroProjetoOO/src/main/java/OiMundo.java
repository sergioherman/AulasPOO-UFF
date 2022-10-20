
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class OiMundo {
    public static void main(String[] args){
        System.out.println("Oi MUndo");
        Scanner teclado = new Scanner(System.in);
        int idade;
        String nome;
        System.out.println("Digite a sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Digite o seu nome: ");
        nome = teclado.next();
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
}

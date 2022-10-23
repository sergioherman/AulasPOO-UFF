/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Ex8 {
    public void exercicio8(){
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.print("Entre com o tamanho da matriz quadrada: ");
        n = teclado.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Entre com o elemento de linha " + (i+1) + " e coluna " + (j+1) + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        imprimeMatriz(matriz, n);
        verificaMatriz(matriz,n);
    }
    
    public void imprimeMatriz(int[][] mat, int tam){
        System.out.println("\nImpressão da matriz: \n");
        for (int i = 0; i < tam; i++){
            for (int j = 0; j < tam; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public void verificaMatriz(int[][] mat, int tam){
        System.out.println("\nVerificação de matriz: \n");
        //Verificação dar linhas;
        boolean continua = true;
        boolean magica = true;
        int soma1 = 0;
        
        for (int j = 0; j < tam; j++){
            soma1 += mat[0][j];
        }
        
        //Verifica linhas
        int soma2;
        for (int i = 1; i < tam; i++){
            soma2 = 0;
            for (int j = 0; j < tam; j++){
                soma2 += mat[i][j];
            }
            if (soma2 != soma1){
                continua = false;
                magica = false;
                break;
            }
        }
        
        if (continua){
            System.out.println("Passou no teste de linhas");
        }else{
            System.out.println("Não passou no teste de linhas");
        }
        
        //Verifica colunas
        continua = true;
        for (int i = 0; i < tam; i++){
            soma2 = 0;
            for (int j = 0; j < tam; j++){
                soma2 += mat[j][i];
            }
            if (soma2 != soma1){
                continua = false;
                magica = false;
                break;
            }
        }
        
        if (continua){
            System.out.println("Passou no teste de colunas");
        }else{
            System.out.println("Não passou no teste de colunas");
        }
        
        //teste de diagonal
        
        
    }
    
}

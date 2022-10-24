/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.lista3.ex1;

/**
 *
 * @author aluno
 */
public class Carro {
    private String marca;
    private String modelo;
    private String ano;
    private String placa;

    private int diarias;
    private float valorDiariaLocacao;
    private int id;
    
    private float valor;
    
    private float orcamento;
    private boolean consertado;
    
    private boolean revisaoAprovada;

    public Carro(String marca, String modelo, String ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    
    //Locadora
    public Carro(String marca, String modelo, String ano, String placa, float valorDiaria){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valorDiariaLocacao = valorDiaria;
    }
    
    //Revendedora
    public Carro(String marca, String modelo, String ano, String placa, boolean revisaoAprovada){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.revisaoAprovada = revisaoAprovada;
    }
    
    //Oficina
    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.consertado = false;
    }
    
    
    public Carro(String marca, String modelo, String ano, String placa, float valorDiaria, int id){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.id = id;
        this.valorDiariaLocacao = valorDiaria;
    }
    
    
}


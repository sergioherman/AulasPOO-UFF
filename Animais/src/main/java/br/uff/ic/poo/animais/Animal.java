/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uff.ic.poo.animais;

/**
 *
 * @author sergio
 */
public abstract class Animal {
    protected String especie;
    protected String imagem;
    public String comida;
    protected int nivelDeFome;
    protected int localizacaoX;
    protected int localizacaoY;
    
    public abstract void fazerRuido();/*{
       System.out.println("Animal fez ruido.");
    }*/
    
    public void comer(){
        System.out.println("Animal comeu.");
    }
    public void comer(String comida){
        System.out.println("Animal comeu " + comida + ".");
    }
    public void comer(String comida, int qtde){
        System.out.println("Animal comeu " + qtde + " unidades de " + comida + ".");
    }
    
    public void dormir(){
        System.out.println("Animal dormiu.");
    }
    public void circular(){
        System.out.println("Animal circulando.");
    }
    public String getEspecie(){
        return this.especie;
    }
    
    public Animal(String especie, String imagem, String comida, int nivelDeFome, int localizacaoX, int localizacaoY){
        this.imagem = imagem;
        this.comida = comida;
        this.nivelDeFome = nivelDeFome;
        this.localizacaoX = localizacaoX;
        this.localizacaoY = localizacaoY;
        this.especie = especie;
        
    }
    public Animal(){
        this("especie do animal não definida","url da imagem do animal nao definida","comida do animal nao definida",0,0,0);
    }
}

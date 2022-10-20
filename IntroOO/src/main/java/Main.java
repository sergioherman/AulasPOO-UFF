/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class Main {
    public static void main(String[] args) {
        BoloRetangular meuBolo = new BoloRetangular();
        
        imprimirBolo(meuBolo);

        meuBolo.peso = 3;
        meuBolo.sabor = "Chocolate";
        meuBolo.comer(1);

        imprimirBolo(meuBolo);
        
        BoloRetangular boloDeMorango = new BoloRetangular();
        boloDeMorango.sabor = "Morango";
        boloDeMorango.cobertura = "Brigadeiro";
        boloDeMorango.peso = 4;
        boloDeMorango.comer((float) 1.5);
        
        meuBolo.comer(1);
        
        imprimirBolo(boloDeMorango);

    }
    
    static void imprimirBolo(BoloRetangular boloParaImprimir){
        
        System.out.println("\nSabor do bolo: " + boloParaImprimir.sabor);
        System.out.println("Peso do bolo: " + boloParaImprimir.peso + "\n");
        
    }
}

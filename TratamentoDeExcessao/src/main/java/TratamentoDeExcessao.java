/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TratamentoDeExcessao {

    public static void main(String[] args) {
        int[] vetor = new int[5];
        int escalar = 0;
        metodoInteiro();
        try{
            System.out.println("Codigo dentro do try (antes do erro)");
            //vetor[6] = 10;
            //float r = 10 / escalar;
            System.out.println("Codigo dentro do try (depois do erro)");
        //}catch (Exception e){
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro ao colocar valor no vetor com índice inexistente");
        }catch(ArithmeticException d){
            System.out.println("Erro de divisão por zero");
            String mensagem = d.getMessage();
            System.out.println(mensagem);
            System.out.println("\n");
            d.printStackTrace();
            System.out.println("\n");
        }catch(Exception e){ //Excessão mais genérica de todas
            System.out.println("Erro não previsto");
        }finally{
            
        }
        System.out.println("Código importante\n\n");
        
        
        System.out.println("Try dentro do laço \n");

       
        for(int i=0; i<=7; i++){
            try{
                vetor[i] = i;
                System.out.println(i);            
            }catch(Exception d){
                System.out.println("erro");
            }
        }
        
        System.out.println("\n\nTry fora do laço \n");

        
        try{
            for(int i=0; i<=7; i++){
                vetor[i] = i;
                System.out.println(i);            
            }
        }catch(Exception e){
            System.out.println("erro");
        }
        
        
    }
    
    public static int metodoInteiro(){
        int[] vetor = new int[5];
        int escalar = 0;
        try{
            //System.exit(0); //Impede a execução do finally
            System.out.println("Codigo dentro do try (antes do erro)");
            //vetor[6] = 10;
            //float r = 10 / escalar;
            System.out.println("Codigo dentro do try (depois do erro)");
            return 1;
        //}catch (Exception e){
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro ao colocar valor no vetor com índice inexistente");
            return 0;
        }catch(ArithmeticException d){
            System.out.println("Erro de divisão por zero");
            String mensagem = d.getMessage();
            System.out.println(mensagem);
            System.out.println("\n");
            d.printStackTrace();
            System.out.println("\n");
            return 0;
        }catch(Exception e){ //Excessão mais genérica de todas
            System.out.println("Erro não previsto");
            return 0;
        }finally{
            System.out.println("Executado mesmo após o return do metodo");
            System.out.println("\n\n");
        }
    }
    
}

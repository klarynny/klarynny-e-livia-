package com.br.iffiana.klarynnyelivinha;

/**
 *
 * @author aluno
 */
public class Gato {
    int registro;
    String nome;
    String raca; 
    int idade; 
    boolean femea;
       public Gato (String x){
           this.nome=x; 
       }
       public void miado(){
           if (idade>=1){
               System.out.println("miiaauu!");
           } else{
               System.out.println("maaau!");
           }
       }
}

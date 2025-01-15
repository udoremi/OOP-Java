/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Ex01;

/**
 *
 * @author Aluno
 */
public class Letras {
    private String letra, resp;
    private int a,e,i,o,u,consoante;
    
    public void verificar(String letra){
        this.letra = letra;
        
        if(this.letra.equalsIgnoreCase("a")){
            this.a++;
        }else{
            if(this.letra.equalsIgnoreCase("e")){
                this.e++;
            }else{
                if(this.letra.equalsIgnoreCase("i")){
                    this.i++;
                }else{
                    if(this.letra.equalsIgnoreCase("o")){
                        this.o++;
                    }else{
                        if(this.letra.equalsIgnoreCase("u")){
                            this.u++;
                        }else{
                            this.consoante++;
                        }
                    }
                }
            }
        }
    }
    public String mostrar(){
        this.resp = "Quantidade de letras A: "+this.a +
               "\nQuantidade de letras E: "+this.e +
               "\nQuantidade de letras I: "+this.i +
               "\nQuantidade de letras O: "+this.o +
               "\nQuantidade de letras U: "+this.u +
               "\nQuantidade de consoantes: "+this.consoante;
        return this.resp;
    }
}
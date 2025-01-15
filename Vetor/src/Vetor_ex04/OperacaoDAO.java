/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex04;

/**
 *
 * @author doremi
 */
public class OperacaoDAO {
    private String resp = "";
    private double n3[] = new double [10];
    
    public void escolha(OperacaoDTO operacaoDTO){
        int []n1 = operacaoDTO.getVetor1();
        int []n2 = operacaoDTO.getVetor2();
        
        if(operacaoDTO.getOpcao().equalsIgnoreCase("a")){
            for(int i=0; i<10; i++){
                n3[i] = n1[i] + n2[i];
                this.resp += n1[i] + " + " + n2[i] + " = " + n3[i] + "\n"; 
            }
        } else{
            if(operacaoDTO.getOpcao().equalsIgnoreCase("s")){
               for(int i=0; i<10; i++){
                    n3[i] = n1[i] - n2[i];
                    this.resp += n1[i] + " - " + n2[i] + " = " + n3[i] + "\n"; 
               }
            } else{
                if(operacaoDTO.getOpcao().equalsIgnoreCase("m")){
                    for(int i=0; i<10; i++){
                        n3[i] = n1[i] * n2[i];
                        this.resp += n1[i] + " x " + n2[i] + " = " + n3[i] + "\n"; 
                    }
                } else{
                    if(operacaoDTO.getOpcao().equalsIgnoreCase("d")){
                        for(int i=0; i<10; i++){
                            n3[i] = n1[i] / n2[i];
                            this.resp += n1[i] + " / " + n2[i] + " = " + n3[i] + "\n"; 
                        }
                    } else{
                        this.resp = "Operação Inválida";
                    }
                }
            }
        }
    }
    
    public String imprimir(){
        return this.resp;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.sp.poo.model;

/**
 *
 * @author Jaquiel
 */
public class Instrutor extends Pessoa {
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int identificacao, String nome, String telefone){
        
        super(nome, telefone);
        this.identificacao = identificacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
   
    
}

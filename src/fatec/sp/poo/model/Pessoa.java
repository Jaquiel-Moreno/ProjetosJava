/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.sp.poo.model;

/**
 *
 * @author Jaquiel
 */
public class Pessoa {
    private String nome;
    private String telefone;
    
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

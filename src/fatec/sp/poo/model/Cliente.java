/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.sp.poo.model;

/**
 *
 * @author Jaquiel
 */
public class Cliente extends Pessoa {
    private String cpf;
    private double peso;
    private double altura;
    
    
    public Cliente(String cpf, String nome, String telefone){
        super(nome, telefone);
        this.cpf = cpf;
       
    }
    public void setPeso(double peso){
        this.peso = peso;
        
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getCpf() {
        return cpf;
    }
    
    
}

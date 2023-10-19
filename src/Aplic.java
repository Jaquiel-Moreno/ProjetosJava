
import fatec.sp.poo.model.Cliente;
import fatec.sp.poo.model.Instrutor;
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jaquiel
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat df = new DecimalFormat("##,##0.00");
        
        
        //Instanciação  objeto da classe Cliente com passagem de parâmetros
        Cliente objCli = new Cliente("032.518.772.10","Jaquiel Moreno", "(15) 99288-1815");
        
        //Passagem de parâmetro pela método set, objeto estaciado
        objCli.setPeso(99);
        objCli.setAltura(1.85);
        
        //Impressão dos dados do Cliente
        System.out.println("===============Dados do Cliente================");
        System.out.println(" ");
        System.out.println("O nome do Cliente é: " + objCli.getNome());
        System.out.println("O cpf é: " + objCli.getCpf());
        System.out.println("O telefone é : " + objCli.getTelefone());
        System.out.println("O Peso é: " + df.format(objCli.getPeso())+ "kg");
        System.out.println("A altura é: " + df.format(objCli.getAltura())+ "m");
        
        System.out.println(" ");
        
        //Instanciação  objeto da classe Instrutor com passagem de parâmetros
        Instrutor objInst = new Instrutor(1810,"Heloisa Silva", "(15) 99185-1519");
        
        //Passagem de parâmetro pela método set, objeto estaciado
        objInst.setAreaAtuacao("Educação Física");
        System.out.println("===============Dados do Instrutor=============="); 
        System.out.println(" ");
        System.out.println("O nome do(a) Instrutor(a) é: " + objInst.getNome());
        System.out.println("O telefone é: " + objInst.getTelefone());
        System.out.println("O cod identificador é: " + objInst.getIdentificacao());
        System.out.println("A área de Atuação é: " + objInst.getAreaAtuacao());
        
        
        
    }
    
}

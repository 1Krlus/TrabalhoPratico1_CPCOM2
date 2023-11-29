/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regularexpression;

/**
 *
 * @author Carlos
 */
public class ValidaCampos {

    public static boolean validaNome(String nome) {
        return nome.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
    
    public static boolean validaCpf(String cpf) {
        return cpf.matches("\\p{Digit}{3}.\\p{Digit}{3}.\\p{Digit}{3}-\\p{Digit}{2}");
    }
    
    public static boolean validaEndereco(String endereco) {
        return endereco.matches("\\p{Upper}[\\p{IsLatin}\\p{Alnum}[ ][,-]]+");
    }
    
    public static boolean validaTelefone(String telefone) {
        return telefone.matches("\\(\\p{Digit}{2}\\)\\s\\p{Digit}{4,5}-\\p{Digit}{4}");
    }
    
    public static boolean validaCrm(String crm) {
        return crm.matches("\\p{Digit}+");
    }
    
    public static boolean validaEspecialidade(String especialidade) {
        return especialidade.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
}

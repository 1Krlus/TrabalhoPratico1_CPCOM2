/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;
import model.bean.PlanoSaude;

/**
 *
 * @author Carlos
 */
public class Paciente extends Pessoa {
    int idPaciente;
    String dataNascimento;
    private PlanoSaude planoSaude;
    private int idPlanoSaude;
    
    public Paciente() {
        
    }
    
    public Paciente(int idPaciente, String nome, String cpf, String endereco, String telefone, String dataNascimento, PlanoSaude planoSaude, int idPlanoSaude) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.cpf  = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.planoSaude = planoSaude;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }    

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdPlanoSaude() {
        return idPlanoSaude;
    }

    public void setIdPlanoSaude(int idPlanoSaude) {
        this.idPlanoSaude = idPlanoSaude;
    }
}

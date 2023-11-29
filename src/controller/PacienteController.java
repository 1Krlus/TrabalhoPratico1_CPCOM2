/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.Paciente;
import model.bean.PlanoSaude;
import model.dao.PacienteDAO;

/**
 *
 * @author Carlos
 */
public class PacienteController {

    public boolean create(String nome, String cpf, String endereco, String telefone, String dataNascimento,
            PlanoSaude planoSaude) {
        Paciente paciente = new Paciente();
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setEndereco(endereco);
        paciente.setTelefone(telefone);
        paciente.setDataNascimento(dataNascimento);
        paciente.setPlanoSaude(planoSaude);

        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.create(paciente);
    }

    public ArrayList<Paciente> read() {
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.read();
    }

    public boolean update(int idPaciente, String nome, String cpf, String endereco, String telefone, String dataNascimento,
            PlanoSaude planoSaude) {
        Paciente paciente = new Paciente();
        
        paciente.setIdPaciente(idPaciente);
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setEndereco(endereco);
        paciente.setTelefone(telefone);
        paciente.setDataNascimento(dataNascimento);
        paciente.setPlanoSaude(planoSaude);

        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.update(paciente);
    }
    
    public boolean delete(int idPaciente) {
        Paciente paciente = new Paciente();
        paciente.setIdPaciente(idPaciente);
        
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.delete(paciente);
    }
    
    public ArrayList<Paciente> searchPacienteNome(String nome) {
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.searchPacienteNome(nome);
    }
    
    public ArrayList<Paciente> searchPacienteCPF(String cpf) {
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.searchPacienteCPF(cpf);
    }
}

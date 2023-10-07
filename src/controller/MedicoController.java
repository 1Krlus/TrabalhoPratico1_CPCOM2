/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.Medico;
import model.dao.MedicoDAO;

/**
 *
 * @author Carlos
 */
public class MedicoController {

    public boolean create(String nome, String cpf, String endereco, String telefone, String crm, String especialidade) {
        Medico medico = new Medico();
        
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setEndereco(endereco);
        medico.setTelefone(telefone);
        medico.setCrm(crm);
        medico.setEspecialidade(especialidade);

        MedicoDAO medicoDAO = new MedicoDAO();
        return medicoDAO.create(medico);
    }

    public boolean update(int idMedico,String nome, String cpf, String endereco, String telefone, String crm, String especialidade) {
        Medico medico = new Medico();
        
        medico.setIdMedico(idMedico);
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setEndereco(endereco);
        medico.setTelefone(telefone);
        medico.setCrm(crm);
        medico.setEspecialidade(especialidade);

        
        MedicoDAO medicoDAO = new MedicoDAO();
        return medicoDAO.update(medico);
    }
    
    public ArrayList<Medico> read() {
        MedicoDAO medicoDAO = new MedicoDAO();
        return medicoDAO.read();
    }
    
    public boolean delete(int idMedico) {
        Medico medico = new Medico();
        medico.setIdMedico(idMedico);
        
        MedicoDAO medicoDAO = new MedicoDAO();
        return medicoDAO.delete(medico);
    }
    
    public ArrayList<Medico> search(String nome) {
        MedicoDAO medicoDAO = new MedicoDAO();
        return medicoDAO.search(nome);
    }
}

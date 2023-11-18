/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.Medico;
import model.bean.Paciente;
import model.bean.PrescricaoExame;
import model.dao.PrescricaoExameDAO;

/**
 *
 * @author Carlos
 */
public class PrescricaoExameController {
    
    public boolean create(String data, Paciente paciente, Medico medico, double valorTotal) {
        PrescricaoExame pExame = new PrescricaoExame();
        
        pExame.setData(data);
        pExame.setPaciente(paciente);
        pExame.setMedico(medico);
        pExame.setValorTotal(valorTotal);
        
        PrescricaoExameDAO pExameDAO = new PrescricaoExameDAO();
        return pExameDAO.create(pExame);
    }
    
    public boolean update(int idPrescricao, String data, Paciente paciente, Medico medico, double valorTotal) {
        PrescricaoExame pExame = new PrescricaoExame();
        
        pExame.setIdPrescricao(idPrescricao);
        pExame.setPaciente(paciente);
        pExame.setMedico(medico);
        pExame.setValorTotal(valorTotal);
        
        PrescricaoExameDAO pExameDAO = new PrescricaoExameDAO();
        return pExameDAO.update(pExame);
    }
    
    public ArrayList<PrescricaoExame> read() {
        PrescricaoExameDAO pExameDAO = new PrescricaoExameDAO();
        return pExameDAO.read();
    }
    
    public boolean delete(int idPrescricao) {
        PrescricaoExame pExame = new PrescricaoExame();
        pExame.setIdPrescricao(idPrescricao);
        
        PrescricaoExameDAO pExameDAO = new PrescricaoExameDAO();
        return pExameDAO.delete(pExame);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.PlanoSaude;
import model.dao.PlanoSaudeDAO;

/**
 *
 * @author Carlos
 */
public class PlanoSaudeController {
    
    public boolean create(String nome, String cnpj) {
        PlanoSaude pSaude = new PlanoSaude();
        
        pSaude.setNome(nome);
        pSaude.setCnpj(cnpj);
        
        PlanoSaudeDAO pSaudeDAO = new PlanoSaudeDAO();
        return pSaudeDAO.create(pSaude);
    }
    
    public boolean update(int idPlanoSaude, String nome, String cnpj) {
        PlanoSaude pSaude = new PlanoSaude();
        
        pSaude.setIdPlanoSaude(idPlanoSaude);
        pSaude.setNome(nome);
        pSaude.setCnpj(cnpj);
        
        PlanoSaudeDAO pSaudeDAO = new PlanoSaudeDAO();
        return pSaudeDAO.update(pSaude);
    }
    
    public ArrayList<PlanoSaude> read() {
        PlanoSaudeDAO pSaudeDAO = new PlanoSaudeDAO();
        return pSaudeDAO.read();
    }
    
    public boolean delete(int idPlanoSaude) {
        PlanoSaude pSaude = new PlanoSaude();
        pSaude.setIdPlanoSaude(idPlanoSaude);
        
        PlanoSaudeDAO pSaudeDAO = new PlanoSaudeDAO();
        return pSaudeDAO.delete(pSaude);
    }
    
    public ArrayList<PlanoSaude> search(String nome) {
        PlanoSaudeDAO pSaudeDAO = new PlanoSaudeDAO();
        return pSaudeDAO.search(nome);
    }
}

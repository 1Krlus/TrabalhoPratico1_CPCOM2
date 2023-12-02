/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.Exame;
import model.dao.ExameDAO;

/**
 *
 * @author Carlos
 */
public class ExameController {
    
    public boolean create(String codigo, String materialColetado, String horasJejum, double valor) {
        Exame exame = new Exame();
        
        exame.setCodigo(codigo);
        exame.setMaterialColetado(materialColetado);
        exame.setHorasJejum(horasJejum);
        exame.setValor(valor);
        
        ExameDAO exameDAO = new ExameDAO();
        return exameDAO.update(exame);
    }
    
    public ArrayList<Exame> read() {
        ExameDAO exameDAO = new ExameDAO();
        return exameDAO.read();
    }
    
    public boolean update(int idExame, String codigo, String materialColetado, String horasJejum, double valor) {
        Exame exame = new Exame();
        
        exame.setCodigo(codigo);
        exame.setMaterialColetado(materialColetado);
        exame.setHorasJejum(horasJejum);
        exame.setValor(valor);
        
        ExameDAO exameDAO = new ExameDAO();
        return exameDAO.update(exame);
    }
    
    public boolean delete(int idExame) {
        Exame exame = new Exame();
        exame.setIdExame(idExame);
        
        ExameDAO exameDAO = new ExameDAO();
        return exameDAO.delete(exame);
    }
}

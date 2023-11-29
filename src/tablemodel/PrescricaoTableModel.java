/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.PrescricaoExame;

/**
 *
 * @author Carlos
 */
public class PrescricaoTableModel extends AbstractTableModel {
    private List<PrescricaoExame> listaPrescricoes;
    private String[] colunas = {"Data", "Paciente", "Médico", "Valor Total"};
    
    public PrescricaoTableModel() {
        listaPrescricoes = new ArrayList<>();
    }
    
    public PrescricaoTableModel(List<PrescricaoExame> pExame) {
        this();
        this.listaPrescricoes.addAll(pExame);
    }
    
    @Override
    public int getRowCount() {
        return listaPrescricoes.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        PrescricaoExame pExame = listaPrescricoes.get(linha);
        
        switch (coluna) {
            case 0:
                return pExame.getData();
            case 1:
                return pExame.getPaciente().getNome();
            case 2:
                return pExame.getMedico().getNome();
            case 3:
                return pExame.getValorTotal();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName (int column) {
        return colunas[column];
    }
    
    public PrescricaoExame getPrescricaoExame (int linha) {
        if (linha >= listaPrescricoes.size()) {
            return null;
        }
        return listaPrescricoes.get(linha);
    }
}

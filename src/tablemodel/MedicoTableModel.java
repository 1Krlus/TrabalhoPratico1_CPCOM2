/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import model.bean.Medico;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Carlos
 */
public class MedicoTableModel extends AbstractTableModel {
    private List<Medico> listaMedicos;
    private String[] colunas = {"Nome", "CPF", "Endereço", "Telefone", "CRM", "Especialidade"};
    
    public MedicoTableModel() {
        listaMedicos = new ArrayList<>();
    }
    
    public MedicoTableModel(List<Medico> medicos) {
        this();
        this.listaMedicos.addAll(medicos);
    }
    
    @Override
    public int getRowCount() {
        return listaMedicos.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        Medico medico = listaMedicos.get(linha);
        
        switch (coluna) {
            case 0:
                return medico.getNome();
            case 1:
                return medico.getCpf();
            case 2:
                return medico.getEndereco();
            case 3:
                return medico.getTelefone();
            case 4:
                return medico.getCrm();
            case 5:
                return medico.getEspecialidade();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName (int column) {
        return colunas[column];
    }
    
    public Medico getMedico ( int linha) {
        if (linha >= listaMedicos.size()) {
            return null;
        }
        return listaMedicos.get(linha);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Paciente;

/**
 *
 * @author Carlos
 */
public class PacienteTableModel extends AbstractTableModel {
    private List<Paciente> listaPacientes;
    private String[] colunas = {"Nome", "CPF", "Endereço", "Telefone", "Data de Nascimento", "Plano de Saúde"};

    public PacienteTableModel() {
        listaPacientes = new ArrayList<>();
    }
    
    public PacienteTableModel(List<Paciente> pacientes) {
        this();
        this.listaPacientes.addAll(pacientes);
    }
    
    @Override
    public int getRowCount() {
        return listaPacientes.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        Paciente paciente = listaPacientes.get(linha);
        
        switch (coluna) {
            case 0:
                return paciente.getNome();
            case 1:
                return paciente.getCpf();
            case 2:
                return paciente.getEndereco();
            case 3:
                return paciente.getTelefone();
            case 4:
                return paciente.getDataNascimento();
            case 5:
                return paciente.getPlanoSaude().getNome();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName (int column) {
        return colunas[column];
    }
    
    public Paciente getPaciente(int linha) {
        if (linha >= listaPacientes.size()) {
            return null;
        }
        return listaPacientes.get(linha);
    }
}

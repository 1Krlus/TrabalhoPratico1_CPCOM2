/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Exame;

/**
 *
 * @author Carlos
 */
public class ExameTableModel extends AbstractTableModel {
    private List<Exame> listaExames;
    private String[] colunas = {"Codigo", "Material Coletado", "Horas em Jejum", "Valor"};
    
    public ExameTableModel() {
        listaExames = new ArrayList<>();
    }
    
    public ExameTableModel(List<Exame> exames) {
        this();
        this.listaExames.addAll(exames);
    }
    
    @Override
    public int getRowCount() {
        return listaExames.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        Exame exame = listaExames.get(linha);
        
        switch(coluna) {
            case 0:
                return exame.getCodigo();
            case 1:
                return exame.getMaterialColetado();
            case 2:
                return exame.getHorasJejum();
            case 3:
                return exame.getValor();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName (int column) {
        return colunas[column];
    }
    
    public Exame getExame (int linha) {
        if (linha >= listaExames.size()) {
            return null;
        }
        return listaExames.get(linha);
    }
}

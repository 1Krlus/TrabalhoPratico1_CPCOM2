/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.bean.Exame;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ExameDAO {
    
    private Connection connect = null;
    
    public ExameDAO() {
        connect = connection.ConnectionFactory.getConnection();
    }
    
    public boolean create(Exame exame) {
        
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO exame (codigo, materialcoletado, horasjejum, valor"
                + "VALUES (?, ?, ?, ?)";
        
        try {
            stmt = connect.prepareStatement(sql);
            stmt.setString(1, exame.getCodigo());
            stmt.setString(2, exame.getMaterialColetado());
            stmt.setString(3, exame.getHorasJejum());
            stmt.setDouble(4, exame.getValor());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
    
    public ArrayList<Exame> read() {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Exame> listaExames = new ArrayList<>();
        
        String sql = "SELECT * FROM exame ORDER BY idexame";
        
        try {
            stmt = connect.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Exame exame = new Exame();
                exame.setIdExame(rs.getInt("idexame"));
                exame.setCodigo(rs.getString("codigo"));
                exame.setMaterialColetado(rs.getString("materialcoletado"));
                exame.setHorasJejum(rs.getString("horasjejum"));
                exame.setValor(rs.getDouble("valor"));
                
                listaExames.add(exame);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
        return listaExames;
    }
    
    public boolean update(Exame exame) {
        
        PreparedStatement stmt = null;
        
        String sql = "UPDATE exame SET codigo = ?, materialcoletado = ?, horasjejum = ?,"
                + "valor = ? WHERE idexame = ?";
        
        try {
            stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, exame.getCodigo());
            stmt.setString(2, exame.getMaterialColetado());
            stmt.setString(3, exame.getHorasJejum());
            stmt.setDouble(4, exame.getValor());
            stmt.setInt(5, exame.getIdExame());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
    
    public boolean delete(Exame exame) {
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM exame WHERE idexame = ?";
        
        try {
            stmt = connect.prepareStatement(sql);
            stmt.setInt(1, exame.getIdExame());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
}

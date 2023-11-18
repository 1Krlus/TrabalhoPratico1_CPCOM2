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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Medico;
import model.bean.Paciente;
import model.bean.PrescricaoExame;

/**
 *
 * @author Carlos
 */
public class PrescricaoExameDAO {

    private Connection connect = null;

    public PrescricaoExameDAO() {
        connect = connection.ConnectionFactory.getConnection();
    }

    public boolean create(PrescricaoExame pExame) {
        PreparedStatement stmt = null;

        String sql = "INSERT INTO prescricaoexame (data, idpaciente, idmedico, valortotal) VALUES (?, ?, ?, ?)";

        try {
            stmt = connect.prepareStatement(sql);
            stmt.setString(1, pExame.getData());
            stmt.setInt(2, pExame.getPaciente().getIdPaciente());
            stmt.setInt(3, pExame.getMedico().getIdMedico());
            stmt.setDouble(4, pExame.getValorTotal());

            stmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }

    public ArrayList<PrescricaoExame> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<PrescricaoExame> listaPrescricoes = new ArrayList<>();

        String sql = "SELECT * FROM prescricaoexame ORDER BY idprescricao";

        try {
            stmt = connect.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                PrescricaoExame pExame = new PrescricaoExame();
                pExame.setData(rs.getString("data"));
                
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("pid"));
                pExame.setPaciente(paciente);
                
                Medico medico = new Medico();
                medico.setIdMedico(rs.getInt("mid"));
                pExame.setMedico(medico);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
        return listaPrescricoes;
    }
    
    public boolean update(PrescricaoExame pExame) {
        PreparedStatement stmt = null;
        
        String sql = "UPDATE prescricaoexame SET idprescricao = ?, data =?, idpaciente = ?, idmedico = ?, valortotal = ? WHERE idprescricao";
        
        try {
            stmt = connect.prepareStatement(sql);
            
            stmt.setInt(0, pExame.getIdPrescricao());
            stmt.setString(1, pExame.getData());
            stmt.setInt(2, pExame.getPaciente().getIdPaciente());
            stmt.setInt(3, pExame.getMedico().getIdMedico());
            stmt.setDouble(4, pExame.getValorTotal());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
    
    public boolean delete(PrescricaoExame pExame) {
        Connection connect = connection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM planosaude WHERE idplanosaude = ?";
        
        try {
            stmt = connect.prepareStatement(sql);
            
            stmt.setInt(1, pExame.getIdPrescricao());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
}

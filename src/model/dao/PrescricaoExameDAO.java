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
import javax.swing.JOptionPane;
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

        String sql = "SELECT * FROM prescricaoview ORDER BY prescid";

        try {
            stmt = connect.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                PrescricaoExame pExame = new PrescricaoExame();
                pExame.setIdPrescricao(rs.getInt("prescid"));
                pExame.setData(rs.getString("prescdata"));
                pExame.setValorTotal(rs.getDouble("prescvtotal"));
                
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("pid"));
                paciente.setNome(rs.getString("pnome"));
                pExame.setPaciente(paciente);
                
                Medico medico = new Medico();
                medico.setIdMedico(rs.getInt("mid"));
                medico.setNome(rs.getString("mnome"));
                pExame.setMedico(medico);
                
                listaPrescricoes.add(pExame);
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
        
        String sql = "UPDATE prescricaoexame SET data = ?, idpaciente = ?, idmedico = ?, valortotal = ? WHERE idprescricao = ?";
        
        try {
            stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, pExame.getData());
            stmt.setInt(2, pExame.getPaciente().getIdPaciente());
            stmt.setInt(3, pExame.getMedico().getIdMedico());
            stmt.setDouble(4, pExame.getValorTotal());
            stmt.setInt(5, pExame.getIdPrescricao());
            
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
        
        String sql = "DELETE FROM prescricaoexame WHERE idprescricao = ?";
        
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
    
    public ArrayList<PrescricaoExame> searchMedicoNome(String nome) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<PrescricaoExame> listaPrescricoes = new ArrayList<>();
        
        String sql = "SELECT * FROM prescricaoview WHERE mnome ILIKE ? ORDER BY prescid";
        
        try {
            stmt = connect.prepareCall(sql);
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                PrescricaoExame pExame = new PrescricaoExame();
                pExame.setData(rs.getString("prescdata"));
                pExame.setValorTotal(rs.getDouble("prescvtotal"));
                
                Medico medico = new Medico();
                medico.setNome(rs.getString("mnome"));
                pExame.setMedico(medico);
                
                Paciente paciente = new Paciente();
                paciente.setNome(rs.getString("pnome"));
                pExame.setPaciente(paciente);
                
                listaPrescricoes.add(pExame);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler prescrições!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt, rs);
        }
        return listaPrescricoes;
    }
    
    public ArrayList<PrescricaoExame> searchPacienteNome(String nome) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<PrescricaoExame> listaPrescricoes = new ArrayList<>();
        
        String sql = "SELECT * FROM prescricaoview WHERE pnome ILIKE ? ORDER BY prescid";
        
        try {
            stmt = connect.prepareCall(sql);
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                PrescricaoExame pExame = new PrescricaoExame();
                pExame.setData(rs.getString("prescdata"));
                pExame.setValorTotal(rs.getDouble("prescvtotal"));
                
                Medico medico = new Medico();
                medico.setNome(rs.getString("mnome"));
                pExame.setMedico(medico);
                
                Paciente paciente = new Paciente();
                paciente.setNome(rs.getString("pnome"));
                pExame.setPaciente(paciente);
                
                listaPrescricoes.add(pExame);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler prescrições!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt, rs);
        }
        return listaPrescricoes;
    }
}

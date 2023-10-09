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
import model.bean.Paciente;
import model.bean.PlanoSaude;

public class PacienteDAO {

    private Connection connect = null;

    public PacienteDAO() {
        connect = connection.ConnectionFactory.getConnection();
    }

    public boolean create(Paciente paciente) {
        PreparedStatement stmt = null;

        String sql = "INSERT INTO paciente (nome, cpf, endereco, telefone, datanascimento, idplanosaude) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            stmt = connect.prepareStatement(sql);
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getEndereco());
            stmt.setString(4, paciente.getTelefone());
            stmt.setString(5, paciente.getDataNascimento());
            stmt.setInt(6, paciente.getPlanoSaude().getIdPlanoSaude());
            
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
    
    public ArrayList<Paciente> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        
        String sql = "SELECT paciente.idpaciente AS pid, "
                + "paciente.nome AS pnome, "
                + "paciente.cpf AS pcpf, "
                + "paciente.endereco AS pendereco, "
                + "paciente.telefone AS pfone, "
                + "paciente.datanascimento AS pdtnasc, "
                + "planosaude.idplanosaude AS psid "
                + "FROM paciente INNER JOIN planosaude ON planosaude.idplanosaude = paciente.idplanosaude";
        
        try {
            stmt = connect.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("pid"));
                paciente.setNome(rs.getString("pnome"));
                paciente.setCpf(rs.getString("pcpf"));
                paciente.setEndereco(rs.getString("pendereco"));
                paciente.setTelefone(rs.getString("pfone"));
                paciente.setDataNascimento(rs.getString("pdtnasc"));
                
                PlanoSaude pSaude = new PlanoSaude();
                pSaude.setIdPlanoSaude(rs.getInt("psid"));
                paciente.setPlanoSaude(pSaude);
                
                listaPacientes.add(paciente);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
        return listaPacientes;
    }
    
    public boolean update(Paciente paciente) {
        PreparedStatement stmt = null;
        
        String sql = "UPDATE paciente SET nome = ?, cpf = ?, endereco = ?, telefone = ?, datanascimento = ?, idplanosaude = ? WHERE idpaciente = ?";
        
        try {
            stmt = connect.prepareStatement(sql);
            
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getEndereco());
            stmt.setString(4, paciente.getTelefone());
            stmt.setString(5, paciente.getDataNascimento());
            stmt.setInt(6, paciente.getPlanoSaude().getIdPlanoSaude());
            stmt.setInt(7, paciente.getIdPaciente());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
    
    public boolean delete(Paciente paciente) {
        Connection connect =   connection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM paciente WHERE idpaciente = ?";
        
        try {
            stmt = connect.prepareStatement(sql);
            stmt.setInt(1, paciente.getIdPaciente());
            
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

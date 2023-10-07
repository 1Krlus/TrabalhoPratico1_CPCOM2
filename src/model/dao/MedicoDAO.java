/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import model.bean.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class MedicoDAO {

    private Connection connect = null;

    public MedicoDAO() {
        connect = connection.ConnectionFactory.getConnection();
    }

    public boolean create(Medico medico) {

        PreparedStatement stmt = null;

        String sql = "INSERT INTO medico (nome, cpf, endereco, telefone, crm, especialidade) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            stmt = connect.prepareStatement(sql);
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCpf());
            stmt.setString(3, medico.getEndereco());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getCrm());
            stmt.setString(6, medico.getEspecialidade());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }

    public ArrayList<Medico> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Medico> listaMedicos = new ArrayList<>();

        String sql = "SELECT * FROM medico ORDER BY idmedico";

        try {
            stmt = connect.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Medico medico = new Medico();
                medico.setIdMedico(rs.getInt("idmedico"));
                medico.setNome(rs.getString("nome"));
                medico.setCpf(rs.getString("cpf"));
                medico.setEndereco(rs.getString("endereco"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setCrm(rs.getString("crm"));
                medico.setEspecialidade(rs.getString("especialidade"));

                listaMedicos.add(medico);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
        return listaMedicos;
    }

    public boolean update(Medico medico) {
        PreparedStatement stmt = null;

        String sql = "UPDATE medico SET   nome = ?, cpf = ?, endereco = ?, telefone = ?, crm = ?, especialidade = ? WHERE idmedico = ?";

        try {
            stmt = connect.prepareStatement(sql);

            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCpf());
            stmt.setString(3, medico.getEndereco());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getCrm());
            stmt.setString(6, medico.getEspecialidade());
            stmt.setInt(7, medico.getIdMedico());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }

    public boolean delete(Medico medico) {
        Connection connect = connection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "DELETE FROM medico WHERE idmedico = ?";

        try {
            stmt = connect.prepareStatement(sql);
            stmt.setInt(1, medico.getIdMedico());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }

    public ArrayList<Medico> search(String nome) {
        Connection connect = connection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Medico> listaMedicos = new ArrayList<>();

        String sql = "SELECT * FROM medico WHERE nome LIKE ? ORDER by idmedico";

        try {
            stmt = connect.prepareCall(sql);
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Medico medico = new Medico();
                 medico.setIdMedico(rs.getInt("idmedico"));
                medico.setNome(rs.getString("nome"));
                medico.setCpf(rs.getString("cpf"));
                medico.setEndereco(rs.getString("endereco"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setCrm(rs.getString("crm"));
                medico.setEspecialidade(rs.getString("especialidade"));
                
                listaMedicos.add(medico);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler medicos: ", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt, rs);
        }
        return listaMedicos;
    }
}

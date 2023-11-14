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
import javax.swing.JOptionPane;
import model.bean.PlanoSaude;

public class PlanoSaudeDAO {

    private Connection connect = null;

    public PlanoSaudeDAO() {
        connect = connection.ConnectionFactory.getConnection();
    }

    public boolean create(PlanoSaude pSaude) {
        PreparedStatement stmt = null;

        String sql = "INSERT INTO planosaude (nome, cnpj) VALUES (?, ?)";

        try {
            stmt = connect.prepareStatement(sql);
            stmt.setString(1, pSaude.getNome());
            stmt.setString(2, pSaude.getCnpj());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }

    public ArrayList<PlanoSaude> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<PlanoSaude> listaPlanos = new ArrayList<>();

        String sql = "SELECT * FROM planosaude ORDER BY idplanosaude";

        try {
            stmt = connect.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                PlanoSaude pSaude = new PlanoSaude();
                pSaude.setIdPlanoSaude(rs.getInt("idplanosaude"));
                pSaude.setNome(rs.getString("nome"));
                pSaude.setCnpj(rs.getString("cnpj"));

                listaPlanos.add(pSaude);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
        return listaPlanos;
    }

    public boolean update(PlanoSaude pSaude) {
        PreparedStatement stmt = null;

        String sql = "UPDATE planosaude SET nome = ?, cnpj = ? WHERE idplanosaude = ?";

        try {
            stmt = connect.prepareStatement(sql);

            stmt.setString(1, pSaude.getNome());
            stmt.setString(2, pSaude.getCnpj());
            stmt.setInt(3, pSaude.getidPlanoSaude());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }

    public boolean delete(PlanoSaude pSaude) {
        Connection connect = connection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM planosaude WHERE idplanosaude = ?";

        try {
            stmt = connect.prepareStatement(sql);
            stmt.setInt(1, pSaude.getidPlanoSaude());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }

    public ArrayList<PlanoSaude> search(String nome) {
        Connection connect = connection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<PlanoSaude> listaPlanos = new ArrayList<>();

        String sql = "SELECT * FROM planosaude WHERE nome LIKE ? ORDER by idplanosaude";

        try {
            stmt = connect.prepareCall(sql);
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                PlanoSaude pSaude = new PlanoSaude();
                pSaude.setIdPlanoSaude(rs.getInt("idplanosaude"));
                pSaude.setNome(rs.getString("nome"));
                pSaude.setCnpj(rs.getString("cnpj"));
                
                listaPlanos.add(pSaude);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os planos de saúde!", " Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(connect, stmt, rs);
        }
        return listaPlanos;
    }
}

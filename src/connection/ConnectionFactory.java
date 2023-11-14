/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Carlos
 */
public class ConnectionFactory {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/TrabalhoPratico1";
    private static final String USER = "postgres";
    private static final String SENHA = "1234";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão com o Banco de Dados.", ex);
        }
    }
    
    public static void closeConnection(Connection connect) {
        if (connect != null) {
            try {
                connect.close();
            } catch (SQLException ex) {
                System.err.println("Erro" + ex);
            }
        }
    }
    
    public static void closeConnection(Connection connect, PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro" + ex);
            }
        }
        closeConnection(connect);
    }
    
    public static void closeConnection(Connection connect, PreparedStatement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro" + ex);
            }
        }
        closeConnection(connect, stmt);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;

/**
 *
 * @author Carlos
 */
public class TesteConexao {
    public static void main(String args[]) {
        Connection connect = ConnectionFactory.getConnection();
        
        if (connect != null) {
            System.out.println("Conectado com sucesso!");
        }
    }
}

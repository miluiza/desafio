/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//Classes necessárias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author macbook
 */

//Início da classe de conexão//

public class Conexao {
    
    public Connection getConnect() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/CADASTROS", "mysql", "mysql");
        return conexao;
    }
}

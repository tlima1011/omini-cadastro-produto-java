package br.com.omnia.draft.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
        String url = "jdbc:mysql://localhost/omniacadastro";
        String usuario = "root";
        String senha = "";
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

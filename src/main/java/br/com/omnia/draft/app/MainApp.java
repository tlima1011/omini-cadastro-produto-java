package br.com.omnia.draft.app;

import br.com.omnia.draft.dao.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class MainApp {

    public static void main(String[] args) throws SQLException {

        System.out.println("Abrindo conexao com bando de dados");
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conectado ao Banco de dados!");
        connection.close();
    }
}

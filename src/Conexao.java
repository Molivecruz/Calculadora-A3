import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {

    //Conectando ao BD
    public Connection conectaBD(){
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/orcamento?user=root&password=";
            conn = DriverManager.getConnection(url);
            System.out.print("Conectado com sucesso a: " + url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return conn;
    }
}
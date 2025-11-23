package controller;

import Model.Pasajero;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class ControladorLogin {

    Connection con;
 
    public Connection conector() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/base_data", "root", "");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error .\n porfavor comunicarse con el administrador" + e);

        }
        return con;

    }

}

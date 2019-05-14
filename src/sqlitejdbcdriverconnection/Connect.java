/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitejdbcdriverconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ifernandezblanco
 */
public class Connect {
    //clase que crea una conexion entre el programa y la base de datos
    public static void connect() {
        //variable conexion para trabajar con ella
        Connection conn = null;
        try {
           //url de donde esta situada la bas de datos
           //en caso de que no exista ninguna base reconocida
           //se crea una automaticamente
            String url = "jdbc:sqlite:chinook.db";
            // creacion de la conexion con la base de datos
            conn = DriverManager.getConnection(url);
            //mensaje para saber si realmente funciono el programa
            System.out.println("Confirmacion");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbd;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RLCR
 */
public class Gestionbd {
    Connection conexion = null;
    Statement sentencia =null;
    ResultSet rersultados=null;
    String NOMBREBD ="empresa.sqlite";
    String Driver = "org.sqlite.JDBC";
    String URL = "jdbc:sqlite:"+NOMBREBD;
    
    public void crearBD(){
        
        try{
            Class.forName(Driver);
            conexion = DriverManager.getConnection(URL);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Base de datos creada con exito");
    }
}


package com.litman.pe.cnegocio;
import com.litman.pe.cdatosdao.GeneroDao;
import java.sql.Connection;
import com.litman.pe.cmodelo.Genero;
import com.litman.pe.db.Conexion;
import java.sql.SQLException;
import javax.swing.JTable;


public class GeneroBO {
    private String  mensaje = "";
    private Genero genero = new Genero();
    private GeneroDao generoDao = new GeneroDao();
    
    public String AgregarGenero(Genero genero) throws SQLException{
        Connection connection = Conexion.getConnection();
        try {
            mensaje = generoDao.AgregarGenero(connection, genero);
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.close();
        }
        System.out.println(mensaje);
        return mensaje;
    }
    
    public String ModificarGenero(Genero genero) throws SQLException {
        Connection connection = Conexion.getConnection();
        try {
            mensaje = generoDao.ModificarGenero(connection, genero);
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.close();
        }
        System.out.println(mensaje);
        return mensaje;
    }
    
    public String EliminarGenero(int id) throws SQLException{
        Connection connection = Conexion.getConnection();
        try {
            mensaje = generoDao.EliminarGenero(connection, id);
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.close();
        }
        System.out.println(mensaje);
        return mensaje;
    }
    
    public void ListarGenero(JTable table){
        Connection connection = Conexion.getConnection();
        try {
            generoDao.ListarGenero(connection, table);
            connection.close();
     
        } catch (SQLException e) {
            System.out.println("Error al listar Genero"+ e.getMessage());

        } 
        System.out.println(mensaje);
        
    }
}

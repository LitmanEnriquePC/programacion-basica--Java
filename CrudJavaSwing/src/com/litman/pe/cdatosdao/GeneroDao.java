
package com.litman.pe.cdatosdao;
import java.sql.PreparedStatement;
import java.sql.Connection;


import com.litman.pe.cmodelo.Genero;
import java.sql.SQLException;
import javax.swing.JTable;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GeneroDao {
    private String mensaje = "";
    public String AgregarGenero(Connection connection, Genero genero){
        PreparedStatement ps = null;
        String Query = "INSERT INTO genero (nombre, estado, sigla, codigo) " + 
                       "VALUES (?,?,?,?) ";
        try {
            ps = connection.prepareStatement(Query);
            ps.setString(1, genero.getNombre());
            ps.setString(2, genero.getEstado());
            ps.setString(3, genero.getSigla());
            ps.setString(4, genero.getCodigo());
            mensaje = "Se Inserto Correctamente";
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            mensaje = "No se Inserto Corectamente"+ e.getMessage();
        }
        return mensaje;
    }
    
    public String ModificarGenero(Connection connection ,Genero genero) {
        PreparedStatement ps = null;
        String Query = "UPDATE genero SET NOMBRE = ?, ESTADO = ?, SIGLA = ?, CODIGO = ? " +
                       "WHERE id_genero = ? ";
        try {
            ps = connection.prepareStatement(Query);
            ps.setString(1, genero.getNombre());
            ps.setString(2, genero.getEstado());
            ps.setString(3, genero.getSigla());
            ps.setString(4, genero.getCodigo());
            ps.setInt(5, genero.getIdGenero());
            mensaje = "Se Modifico Correctamente";
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            mensaje = "No se Modifico Corectamente"+ e.getMessage();
        }
        
        return mensaje;
    }
    
    public String EliminarGenero(Connection connection ,int id){
        PreparedStatement ps = null;
        String sql = "DELETE FROM GENERO WHERE ID_GENERO = ? ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            mensaje = "Se elimino correctamente";
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            mensaje = "No se elimino correctamente" + e.getMessage();
        }
        return mensaje;
    }
    
    public void ListarGenero(Connection connection, JTable jTable){
        Statement statement = null;
        ResultSet resultset = null;
        DefaultTableModel model;
        
        String[] columnas = {"ID", "NOMBRE", "ESTADO", "SIGLA", "CODIGO",};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM genero "+
                     "ORDER BY id_genero";
        
        String[] datosGenero = new String[5];
        
        try {
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
            
            while(resultset.next()) {
                datosGenero[0] = resultset.getInt("id_genero")+"";
                datosGenero[1] = resultset.getString("nombre");
                datosGenero[2] = resultset.getString("estado");
                datosGenero[3] = resultset.getString("sigla");
                datosGenero[4] = resultset.getString("codigo");
                model.addRow(datosGenero);
            }
            jTable.setModel(model);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la tabla");
        }
    }
}

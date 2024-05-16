
package com.litman.pe.cdatosdao;

import com.litman.pe.cmodelo.TipoDocumento;

import java.sql.Connection;

import java.sql.Statement;

import java.sql.ResultSet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TipoDocumentoDao {

  public ArrayList<TipoDocumento> ListarTipoDocumento(Connection connection){

    ArrayList<TipoDocumento> listaDocumentos = new ArrayList<>();

    Statement statement = null;

    ResultSet resultSet = null;

     

    String sql = "SELECT * FROM tipo_documento";

    try {

      statement = connection.createStatement();

      resultSet = statement.executeQuery(sql);

       

      while(resultSet.next()){

        int idTipoDocumento = resultSet.getInt("id_tipodocumento");

        String nombre = resultSet.getString("nombre");

         

        TipoDocumento tipoDocumento = new TipoDocumento();

        tipoDocumento.setIdTipoDocumento(idTipoDocumento);

        tipoDocumento.setNombre(nombre);

        listaDocumentos.add(tipoDocumento);

      }

    } catch (Exception e) {

      JOptionPane.showMessageDialog(null, "No se pudo mostrar la tabla");

    }

    return listaDocumentos;
  }
}

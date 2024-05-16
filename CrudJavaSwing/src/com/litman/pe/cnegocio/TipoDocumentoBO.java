
package com.litman.pe.cnegocio;

import com.litman.pe.cdatosdao.TipoDocumentoDao;

import java.sql.Connection;

import java.sql.SQLException;

import com.litman.pe.cmodelo.TipoDocumento;

import com.litman.pe.db.Conexion;

import java.util.ArrayList;





public class TipoDocumentoBO {

    TipoDocumentoDao tipoDocumentoDao = new TipoDocumentoDao();

   

  public ArrayList<TipoDocumento> ListarTipoDocumento(){

    ArrayList<TipoDocumento> listaDocumentos = new ArrayList<>();

    Connection connection = Conexion.getConnection();

    try {

      listaDocumentos = tipoDocumentoDao.ListarTipoDocumento(connection);

      connection.close();

    } catch (SQLException e) {

      System.out.println("Eroor al listar Tipo Documento" + e.getMessage());

    }

    return listaDocumentos;

  }
}
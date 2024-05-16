package com.litman.pe.ctest;

import com.litman.pe.cmodelo.Genero;
import com.litman.pe.cnegocio.GeneroBO;
import java.sql.SQLException;

public class Test {
    GeneroBO generoBO = new GeneroBO();
    Genero genero = new Genero();
    
    public void insertar() throws SQLException {
        genero.setNombre("Litman");
        genero.setEstado("1");
        genero.setSigla("L");
        genero.setCodigo("1");
        
        generoBO.AgregarGenero(genero);
    }
    
    public void modificar() throws SQLException{
        genero.setIdGenero(8);
        genero.setNombre("Litman");
        genero.setEstado("1");
        genero.setSigla("L");
        genero.setCodigo("1");
        
        generoBO.ModificarGenero(genero);
    
    }
    
    public void eliminar() throws SQLException{
        genero.setIdGenero(6);
        
        generoBO.EliminarGenero(6);
    }
    
    public static void main(String[] args) throws SQLException {
        Test t = new Test();
        t.insertar();
        //t.modificar();
        //t.eliminar();
        
        
    }
    
    
    
}

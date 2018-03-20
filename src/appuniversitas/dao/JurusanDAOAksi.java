/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.dao;

import appuniversitas.database.koneksi;
import appuniversitas.model.Jurusan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author REZA
 */
public class JurusanDAOAksi implements JurusanDAO{
    @Override
    public boolean tambah(Jurusan J){
        String sql = "INSERT INTO jurusan values (null,?,?,?)";
            
    }
    
    @Override
    public boolean ubah(Jurusan J){
        
    }
    @Override
    public boolean hapus(Jurusan J){
        
    }
    
    @Override
    public List<Jurusan> getDataJurusan(){
        
    }
}

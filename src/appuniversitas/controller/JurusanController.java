/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.controller;

import appuniversitas.dao.JurusanDAO;
import appuniversitas.dao.JurusanDAOAksi;
import appuniversitas.model.Jurusan;
import java.util.List;
/**
 *
 * @author REZA
 */
public class JurusanController {
    private JurusanDAO JDAO = new JurusanDAOAksi();
    
    public List<Jurusan> getAllData(){
        return JDAO.getDataJurusan();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.controller;

import appuniversitas.dao.RuanganDAO;
import appuniversitas.dao.RuanganDAOAksi;
import appuniversitas.model.Ruangan;
import java.util.List;

/**
 *
 * @author REZA
 */
public class RuanganController {
    private RuanganDAO RDAO = new RuanganDAOAksi();
    
    public List<Ruangan> getAllData(){
        return RDAO.getDataRuangan();
    }
}

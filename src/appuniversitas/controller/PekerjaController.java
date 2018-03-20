/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.controller;

import appuniversitas.dao.PekerjaDAO;
import appuniversitas.dao.PekerjaDAOAksi;
import appuniversitas.model.Pekerja;
import java.util.List;
/**
 *
 * @author REZA
 */
public class PekerjaController {
    private PekerjaDAO PDAO = new PekerjaDAOAksi();
    
    public List<Pekerja> getAllData(){
        return PDAO.getDataPekerja();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.dao;

import appuniversitas.model.Ruangan;
import java.util.List;
/**
 *
 * @author REZA
 */
public interface RuanganDAO {
    public boolean tambah(Ruangan R);
    public boolean ubah(Ruangan R);
    public boolean hapus(Ruangan R);
    public List<Ruangan> getDataRuangan();
}

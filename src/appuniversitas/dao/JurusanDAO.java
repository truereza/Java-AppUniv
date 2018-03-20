/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.dao;

import appuniversitas.model.Jurusan;
import java.util.List;

/**
 *
 * @author REZA
 */
public interface JurusanDAO {
    public boolean tambah(Jurusan J);
    public boolean ubah(Jurusan J);
    public boolean hapus(Jurusan J);
    public List<Jurusan> getDataJurusan();
}

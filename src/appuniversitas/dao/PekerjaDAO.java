/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appuniversitas.dao;

import appuniversitas.model.Pekerja;
import java.util.List;
/**
 *
 * @author REZA
 */
public interface PekerjaDAO {
    public boolean tambah();
    public boolean ubah();
    public boolean hapus();
    public List<Pekerja> getDataPekerja();
}

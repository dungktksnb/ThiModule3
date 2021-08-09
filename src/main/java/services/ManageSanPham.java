package services;

import daos.CRUDSanPham;
import modules.SanPham;

import java.sql.SQLException;
import java.util.ArrayList;

public class ManageSanPham {
    public static ArrayList<SanPham> listSanPham = new ArrayList<>();

    public ManageSanPham() {
        try {
            listSanPham = (ArrayList<SanPham>) CRUDSanPham.showSanPham();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void  save(SanPham sanPham) throws Exception {
        CRUDSanPham.createSanPham(sanPham);
        listSanPham.add(sanPham);
    }

    public void edit(SanPham sanPham, int index) throws SQLException {
        CRUDSanPham.edit(sanPham);
        listSanPham.set(index, sanPham);
    }

    public void delete(int index) throws SQLException {
        CRUDSanPham.delete(listSanPham.get(index).getMaSanPham());
        listSanPham.remove(index);
    }


    public ArrayList<SanPham> findByName(String name) throws SQLException {
        return CRUDSanPham.findByName(name);

    }
}

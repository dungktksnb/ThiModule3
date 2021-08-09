package daos;

import modules.SanPham;

import java.sql.*;
import java.util.ArrayList;

public class CRUDSanPham {
    static Connection connection = ConnectionMySQL.getConnection();
    SanPham sanPham = new SanPham();

    public static ArrayList<SanPham> showSanPham() throws Exception {
        String query = "select * from sanpham";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<SanPham> listSanpham = new ArrayList<>();
        while (resultSet.next()) {
            int maSanPham = resultSet.getInt("MaSanPham");
            String tenSanPham = resultSet.getString("tensanpham");
            double gia = resultSet.getDouble("giasanpham");
            int soLuong = resultSet.getInt("soluong");
            String mauSac = resultSet.getString("mausac");
            String moTa = resultSet.getString("mota");
            int danhMuc = resultSet.getInt("danhmuc");
            listSanpham.add(new SanPham(maSanPham,tenSanPham,gia,soLuong,mauSac,moTa,danhMuc));

        }
        return listSanpham;
    }

    public static void createSanPham(SanPham sanPham) throws Exception {
        String query = "insert into sanpham value(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, sanPham.getMaSanPham());
        preparedStatement.setString(2, sanPham.getTenSanPham());
        preparedStatement.setDouble(3, sanPham.getGia());
        preparedStatement.setInt(4, sanPham.getSoLuong());
        preparedStatement.setString(5, sanPham.getMauSac());
        preparedStatement.setString(6, sanPham.getMoTa());
        preparedStatement.setInt(7, sanPham.getDanhMuc());
        preparedStatement.executeUpdate();

    }
    public static void edit(SanPham tensanpham) throws SQLException {
        String edit = "update sanpham set TenSanPham=?,giasanpham=?,soluong=?,mausac=?,mota=?,danhmuc=? where MaSanPham=?";
        PreparedStatement preparedStatement = connection.prepareStatement(edit);
        preparedStatement.setInt(7,tensanpham.getMaSanPham());
        preparedStatement.setString(1, tensanpham.getTenSanPham());
        preparedStatement.setDouble(2, tensanpham.getGia());
        preparedStatement.setInt(3, tensanpham.getSoLuong());
        preparedStatement.setString(4, tensanpham.getMauSac());
        preparedStatement.setString(5, tensanpham.getMoTa());
        preparedStatement.setInt(6, tensanpham.getDanhMuc());
        preparedStatement.executeUpdate();
    }

    public static void delete(int masanpham) throws SQLException {
        String delete = " SET FOREIGN_KEY_CHECKS=0;";
        String delete1 = " delete from sanpham where MaSanPham=?;";
        String delete2 = " SET FOREIGN_KEY_CHECKS=1;";
        Statement statement = connection.createStatement();
        statement.execute(delete);
        PreparedStatement preparedStatement = connection.prepareStatement(delete1);
        preparedStatement.setInt(1, masanpham);
        preparedStatement.execute();
        statement.execute(delete2);
    }
    public static ArrayList<SanPham> findByName(String findName) throws SQLException {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String findByName = "select * from books where name like '%" + findName + "%'";
        PreparedStatement preparedStatement = connection.prepareStatement(findByName);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int maSanPham = resultSet.getInt("masanpham");
            String tenSanPham = resultSet.getString("tensanpham");
            double gia = resultSet.getDouble("giasanpham");
            int soLuong = resultSet.getInt("soluong");
            String mauSac = resultSet.getString("mausac");
            String moTa = resultSet.getString("mota");
            int danhMuc = resultSet.getInt("danhmuc");
            listSanPham.add(new SanPham(maSanPham,tenSanPham,gia,soLuong,mauSac,moTa,danhMuc));

        }
        return listSanPham;
    }

}

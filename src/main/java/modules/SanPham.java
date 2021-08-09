package modules;

public class SanPham {
    private int maSanPham;
    private  String tenSanPham;
    private  double gia;
    private int soLuong;
    private  String mauSac;
    private  String moTa;
    private int danhMuc;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, double gia, int soLuong, String mauSac, String moTa, int danhMuc) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(int danhMuc) {
        this.danhMuc = danhMuc;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", mauSac='" + mauSac + '\'' +
                ", moTa='" + moTa + '\'' +
                ", danhMuc=" + danhMuc +
                '}';
    }
}

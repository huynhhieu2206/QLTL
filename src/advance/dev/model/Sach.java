package advance.dev.model;

public class Sach  extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh);
        this.setTenTacGia(tenTacGia);
        this.soTrang = soTrang;
    }

//    public String gettenTacGia(String tenTacGia) {
//        return tenTacGia;
//    }
//
//    public void settenTacGia(String tenTacGia) {
//        this.setTenTacGia(tenTacGia);
//    }
    public int getsoTrang() {
        return soTrang;
    }

    public void setsoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
}



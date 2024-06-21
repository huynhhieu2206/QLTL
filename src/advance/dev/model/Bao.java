package advance.dev.model;

public class Bao extends TaiLieu{
	
	private int ngayPhatHanh;
	public Bao( String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh,int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan,soLuongPhatHanh);
		this.setNgayPhatHanh(ngayPhatHanh);
	}

    
	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}
	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
}

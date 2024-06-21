package advance.dev.model;

public class TaiLieu {
	private String maTaiLieu;

	private String tenNhaXuatBan;
	private int soLuongPhatHanh;

	// Constructors, getters, and setters
	public TaiLieu(String maTaiLieu, String tenNhaXuatBan,int soLuongPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soLuongPhatHanh = soLuongPhatHanh;
        
    }

	public String getmaTaiLieu() {
		return maTaiLieu;
	}

	public void setmaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String gettenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void settenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getsoLuongPhatHanh() {
        return soLuongPhatHanh;
    }

    public void setsoLuongPhatHanh(int soLuongPhatHanh) {
        this.soLuongPhatHanh = soLuongPhatHanh;
    }
    @Override
    public String toString() {
        return "TaiLieu [maTaiLieu=" + maTaiLieu + ", tenNhaXuatBan=" + tenNhaXuatBan + ", soLuongPhatHanh=" + soLuongPhatHanh + "]";
    }
}
	


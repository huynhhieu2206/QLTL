package advande.dev;

import advance.dev.model.TaiLieu;

public class Engineer extends TaiLieu {

	private String certificate;

	public Engineer(String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh, String certificate) {
		super(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh);
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Engineer [certificate=" + certificate + ", " + super.toString() + "]";
	}

}
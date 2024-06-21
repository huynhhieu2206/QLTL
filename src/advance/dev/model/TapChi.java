package advance.dev.model;

public class TapChi extends TaiLieu{
	private String soPhatHanh;
	private int thangPhatHanh;
	public TapChi( String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh, String soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan,soLuongPhatHanh);
		this.setSoPhatHanh(soPhatHanh);
		this.thangPhatHanh = thangPhatHanh;
	}
//	public String getsoPhatHanh(String soPhatHanh) {
//        return soPhatHanh;
//    }
//
//    public void setsoPhatHanh(String soPhatHanh) {
//        this.setSoPhatHanh(soPhatHanh);
//    }
    public int getsthangPhatHanh() {
        return thangPhatHanh;
    }

    public void setthangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
	public String getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(String soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
}

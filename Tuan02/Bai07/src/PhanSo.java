public class PhanSo {
    private int TuSo, MauSo;
	public PhanSo(int tuSo, int mauSo) {
		TuSo = tuSo;
		MauSo = mauSo;
	}
    public PhanSo() {
	}

	public int getTuSo() {
		return TuSo;
	}

	public void setTuSo(int tuSo) {
		TuSo = tuSo;
	}

	public int getMauSo() {
		return MauSo;
	}

	public void setMauSo(int mauSo) {
		MauSo = mauSo;
	}
	
    public void nghichDao() {
        this.getTuSo();
        this.getMauSo();
        System.out.println("Nghịch đảo phân số của bạn là: "+ MauSo + "/" + TuSo); 
    }

    public void giaTriThuc() {
        this.getTuSo();
        this.getMauSo();
        System.out.println("Giá trị thực của phân số là: " + (float) TuSo/MauSo);
    } 
    public String toString() {
        return "Phân số của bạn là: "+ TuSo + "/" + MauSo; 
    }
}

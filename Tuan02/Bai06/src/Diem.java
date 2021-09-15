public class Diem {
    private int x, y;
    public Object setX;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
    public Diem() {		
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public void khoangCach() {
		this.getX();
		this.getY();
		System.out.println("Khoảng cách từ điểm ("+ x + ","+ y + ") đến gốc tọa độ là: " + Math.sqrt(x*x+y*y));
	}
    public String toString() {
        return "Điểm có tọa độ (" + x + ","+ y + ")" ;
    }
} 
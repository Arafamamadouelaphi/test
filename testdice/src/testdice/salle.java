package testdice;

public class salle {
	public int getNumsalle() {
		return numsalle;
	}
	public salle() {
		super();
	}
	public salle(int numsalle, String date) {
		super();
		this.numsalle = numsalle;
		this.date = date;
	}
	public void setNumsalle(int numsalle) {
		this.numsalle = numsalle;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int numsalle  ;
	public String date;
}

package main.java.balon;
import main.java.renkler.Renkler;
/**
 * @author MehmetAkif ILYASOGULLARI
 *
 */
public class Balon {
	/**
	 * 
	 */
	private String renk;
	/**
	 * 
	 */
	private int no;
	/**
	 * @param renk
	 * @param no
	 */
	public Balon(String renk, int no) {
		super();
		this.setRenk(renk);
		this.setNo(no);
	}
	/**
	 * 
	 */
	public Balon() {
	}

	@SuppressWarnings("unused")
	private Balon(int no) {
		this.setNo(no);
		this.setRenk(Renkler.random_renk());
	}

	/**
	 * @param no
	 * @param random_renk
	 */
	public Balon(int no, String random_renk) {
		// TODO Auto-generated constructor stub
		this.setNo(no);
		this.setRenk(Renkler.random_renk());
	}
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return
	 */
	public String getRenk() {
		return renk;
	}

	/**
	 * @param renk
	 */
	public void setRenk(String renk) {
		this.renk = renk;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Balon [renk=");
		builder.append(getRenk());
		builder.append(", no=");
		builder.append(getNo());
		builder.append("]");
		return builder.toString();
	}
}
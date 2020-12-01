package balon;
import others.Renkler;
public class Balon {
	/**
	 * @param renk
	 * @param no
	 */
	public Balon(String renk, int no) {
		super();
		this.renk = renk;
		this.no = no;
	}

	private String renk;
	private int no;

	@SuppressWarnings("unused")
	private Balon() {
		this.renk = Renkler.random_renk();
	}

	@SuppressWarnings("unused")
	private Balon(int no) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.renk = Renkler.random_renk();
	}

	public Balon(int no, String random_renk) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.renk = Renkler.random_renk();
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	@Override
	public String toString() {
		return "Balon [renk=" + renk + ", no=" + no + "]";
	}
}

public class Balon {
	private String renk;
	private int no;

	public Balon() {
		this.renk = Renkler.random_renk();
	}

	public Balon(int no) {
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
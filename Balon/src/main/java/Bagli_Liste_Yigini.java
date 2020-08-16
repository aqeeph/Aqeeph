import java.util.Stack;

public class Bagli_Liste_Yigini {

	private Stack<Bagli_Liste> yigin;
	private Bagli_Liste gecici = null;

	public Bagli_Liste_Yigini() {
		super();
		this.yigin = new Stack<Bagli_Liste>();
	}

	public Stack<Bagli_Liste> getYigin() {
		return yigin;
	}

	public void setYigin(Stack<Bagli_Liste> yigin) {
		this.yigin = yigin;
	}

	public void push_to_yigin(Bagli_Liste bagli_liste) {
		// TODO Auto-generated method stub
		if (bagli_liste == null) {
			System.out.println("bagli liste null");
			return;
		} else {
			// System.err.println(gecici1);
			if (yigin == null) {
				System.out.println("yigin null");
				return;
			} else {
				this.getYigin().push(bagli_liste);
			}
		}
	}

	public boolean yigin_bos_mu() {
		// TODO Auto-generated method stub
		return this.getYigin().empty();
	}

	public Bagli_Liste pop_from_yigin() {
		if (this.yigin == null) {
		} else {
			if (this.yigin.empty()) {
				System.out.println("yigin bos");
			} else {
				this.gecici = this.getYigin().pop();
			}
		}
		return this.gecici;
	}

}
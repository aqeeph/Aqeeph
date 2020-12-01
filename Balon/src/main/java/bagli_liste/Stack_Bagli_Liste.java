package bagli_liste;
import java.util.Stack;

/**
 * @author MehmetAkif-PC
 *
 */
public class Stack_Bagli_Liste {

	/**
	 * @param yigin
	 * @param gecici
	 */
	public Stack_Bagli_Liste(Stack<Bagli_Liste> yigin, Bagli_Liste gecici) {
		super();
		this.yigin = yigin;
		this.gecici = gecici;
	}

	/**
	 * 
	 */
	private Stack<Bagli_Liste> yigin;
	/**
	 * 
	 */
	private Bagli_Liste gecici = null;

	/**
	 * 
	 */
	public Stack_Bagli_Liste() {
		super();
		this.yigin = new Stack<Bagli_Liste>();
	}

	/**
	 * @return
	 */
	public Stack<Bagli_Liste> getYigin() {
		return yigin;
	}

	/**
	 * @param yigin
	 */
	public void setYigin(Stack<Bagli_Liste> yigin) {
		this.yigin = yigin;
	}

	/**
	 * @param bagli_liste
	 */
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

	/**
	 * @return
	 */
	public boolean yigin_bos_mu() {
		// TODO Auto-generated method stub
		return this.getYigin().empty();
	}

	/**
	 * @return
	 */
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
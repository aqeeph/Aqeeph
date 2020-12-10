package bagli_liste;
import java.util.Stack;

/**
 * @author MehmetAkif-PC
 *
 */
public class Stack_Bagli_Liste_balon {

	@Override
	public String toString() {
		return "Stack_Bagli_Liste_balon [yigin=" + yigin + ", gecici=" + gecici + "]";
	}

	/**
	 * @param yigin
	 * @param gecici
	 */
	public Stack_Bagli_Liste_balon(Stack<Bagli_Liste_balon> yigin, Bagli_Liste_balon gecici) {
		super();
		this.yigin = yigin;
		this.gecici = gecici;
	}

	/**
	 * 
	 */
	private Stack<Bagli_Liste_balon> yigin;
	/**
	 * 
	 */
	private Bagli_Liste_balon gecici = null;

	/**
	 * 
	 */
	public Stack_Bagli_Liste_balon() {
		super();
		this.yigin = new Stack<Bagli_Liste_balon>();
	}

	/**
	 * @return
	 */
	public Stack<Bagli_Liste_balon> getYigin() {
		return yigin;
	}

	/**
	 * @param yigin
	 */
	public void setYigin(Stack<Bagli_Liste_balon> yigin) {
		this.yigin = yigin;
	}

	/**
	 * @param bagli_liste
	 */
	public void push_to_yigin(Bagli_Liste_balon bagli_liste) {
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
		return this.getYigin().empty();
	}

	/**
	 * @return
	 */
	public Bagli_Liste_balon pop_from_yigin() {
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
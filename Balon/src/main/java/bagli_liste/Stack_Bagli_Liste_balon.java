package main.java.bagli_liste;
import java.util.Stack;

/**
 * @author MehmetAkif-PC
 *
 */
public class Stack_Bagli_Liste_balon {
	/**
	 * 
	 */
	private Stack<Bagli_Liste_Node_Balon> yigin;
	/**
	 * 
	 */
	private Bagli_Liste_Node_Balon gecici;


	/**
	 * @param yigin
	 * @param gecici
	 */
	public Stack_Bagli_Liste_balon(Stack<Bagli_Liste_Node_Balon> yigin, Bagli_Liste_Node_Balon gecici) {
		super();
		this.yigin = yigin;
		this.gecici = gecici;
	}



	/**
	 * 
	 */
	public Stack_Bagli_Liste_balon() {
		super();
		this.yigin = new Stack<Bagli_Liste_Node_Balon>();
		gecici = null;
	}

	/**
	 * @return
	 */
	public Stack<Bagli_Liste_Node_Balon> getYigin() {
		return yigin;
	}

	/**
	 * @param yigin
	 */
	public void setYigin(Stack<Bagli_Liste_Node_Balon> yigin) {
		this.yigin = yigin;
	}

	/**
	 * @param bagli_liste
	 */
	public void push_to_yigin(Bagli_Liste_Node_Balon bagli_liste) {
		if (bagli_liste == null) {
			//System.out.println("bagli liste null");
			System.exit(0);
			return;
		} else {
			// System.err.println(gecici1);
			if (yigin == null) {
				//System.out.println("yigin null");
				System.exit(0);
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
	public Bagli_Liste_Node_Balon pop_from_yigin() {
		if (this.yigin == null) {
		} else {
			if (this.yigin.empty()) {
				//System.out.println("yigin bos");
				System.exit(0);
			} else {
				this.gecici = this.getYigin().pop();
			}
		}
		return this.gecici;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stack_Bagli_Liste_balon [yigin=");
		builder.append(yigin);
		builder.append(", gecici=");
		builder.append(gecici);
		builder.append("]");
		return builder.toString();
	}
}
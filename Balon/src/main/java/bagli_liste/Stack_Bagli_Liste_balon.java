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
		this.setYigin(yigin);
		this.setGecici(gecici);
	}



	/**
	 * 
	 */
	public Stack_Bagli_Liste_balon() {
		super();
		this.setYigin(new Stack<Bagli_Liste_Node_Balon>());
		setGecici(null);
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
			if (getYigin() == null) {
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
		if (this.getYigin() == null) {
		} else {
			if (this.getYigin().empty()) {
				//System.out.println("yigin bos");
				System.exit(0);
			} else {
				this.setGecici(this.getYigin().pop());
			}
		}
		return this.getGecici();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stack_Bagli_Liste_balon [yigin=");
		builder.append(getYigin());
		builder.append(", gecici=");
		builder.append(getGecici());
		builder.append("]");
		return builder.toString();
	}



	/**
	 * @return the gecici
	 */
	private Bagli_Liste_Node_Balon getGecici() {
		return gecici;
	}



	/**
	 * @param gecici the gecici to set
	 */
	private void setGecici(Bagli_Liste_Node_Balon gecici) {
		this.gecici = gecici;
	}
}
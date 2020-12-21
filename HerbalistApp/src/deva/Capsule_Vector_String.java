/**
 * 
 */
package deva;

import java.util.Vector;

/**
 * @author MehmetAkif-PC
 */
public class Capsule_Vector_String {
	/**
	 * 
	 */
	private Vector<String> stringlistesi;
	/**
	 * @param stringlistesi
	 */
	public Capsule_Vector_String(Vector<String> stringlistesi) {
		super();
		this.stringlistesi = stringlistesi;
	}
	/**
	 * 
	 */
	public Capsule_Vector_String() {
		this.stringlistesi = new Vector<String>();
	}	

	/**
	 * @return the stringlistesi
	 */
	public Vector<String> getstringlistesi() {
		return stringlistesi;
	}

	/**
	 * @param stringlistesi the stringlistesi to set
	 */
	public void setstringlistesi(Vector<String> stringlistesi) {
		this.stringlistesi = stringlistesi;
	}

	/**
	 * @return
	 */
	public int size() {
		return stringlistesi.size();
	}

	/**
	 * @param i
	 * @return
	 */
	public String elementAt(int i) {
		return stringlistesi.elementAt(i);
	}

	/**
	 * @param nextToken
	 */
	public void add(String nextToken) {
		stringlistesi.add(nextToken);
	}

	/**
	 * @return
	 */
	public String lastElement() {
		return stringlistesi.lastElement();
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		String text = "";
		for (int i = 0; i < stringlistesi.size(); i++) {
			text += stringlistesi.elementAt(i);
		}
		return text;
	}
}
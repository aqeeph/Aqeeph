/**
 * 
 */
package deva;

import java.util.Vector;

/**
 * @author MehmetAkif-PC
 */
public class Vector_string {
	/**
	 * 
	 */
	private Vector<String> stringlistesi = new Vector<String>();

	/**
	 * 
	 */
	public Vector_string() {
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
}
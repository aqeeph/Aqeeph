/**
 * 
 */
package main.java.renkler;

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
		this.setStringlistesi(stringlistesi);
	}
	/**
	 * 
	 */
	public Capsule_Vector_String() {
		this.setStringlistesi(new Vector<String>());
	}	

	/**
	 * @return the stringlistesi
	 */
	public Vector<String> getstringlistesi() {
		return getStringlistesi();
	}

	/**
	 * @param stringlistesi the stringlistesi to set
	 */
	public void setstringlistesi(Vector<String> stringlistesi) {
		this.setStringlistesi(stringlistesi);
	}

	/**
	 * @return
	 */
	public int size() {
		return getStringlistesi().size();
	}

	/**
	 * @param i
	 * @return
	 */
	public String elementAt(int i) {
		return getStringlistesi().elementAt(i);
	}

	/**
	 * @param nextToken
	 */
	public void add(String nextToken) {
		getStringlistesi().add(nextToken);
	}

	/**
	 * @return
	 */
	public String lastElement() {
		return getStringlistesi().lastElement();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < getStringlistesi().size(); i++) {
			builder.append(getStringlistesi().elementAt(i));
		}
		return builder.toString();
	}
	/**
	 * @return the stringlistesi
	 */
	private Vector<String> getStringlistesi() {
		return stringlistesi;
	}
	/**
	 * @param stringlistesi the stringlistesi to set
	 */
	private void setStringlistesi(Vector<String> stringlistesi) {
		this.stringlistesi = stringlistesi;
	}
}
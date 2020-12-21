/**
 * 
 */
package veri_tabani;

import java.util.Vector;

import deva.Bitki;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 */
public class Capsule_Vector_Bitki {
	private Vector<Bitki> bitkiler;
	/**
	 * 
	 */
	public Capsule_Vector_Bitki() {
		bitkiler = new Vector<Bitki>();
	}
	public Vector<Bitki> getBitkiler() {
		return bitkiler;
	}
	public void setBitkiler(Vector<Bitki> bitkiler) {
		this.bitkiler = bitkiler;
	}
	public int size() {
		return bitkiler.size();
	}
	public Bitki elementAt(int i) {
		return bitkiler.elementAt(i);
	}
	public void remove(int i) {
		bitkiler.remove(i);
	}
	public void add(Bitki bitki) {
		bitkiler.add(bitki);
	}

}

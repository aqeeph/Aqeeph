/**
 * 
 */
package capsule;

import java.util.Vector;

import veri_tabani.Kategori;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 */
public class Capsule_Vector_Kategori {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < getKategoriler().size(); i++) {
			builder.append(getKategoriler().elementAt(i));
		}
		return builder.toString();
	}
	private Vector<Kategori> kategoriler;
	/**
	 * 
	 */
	public Capsule_Vector_Kategori() {
		setKategoriler(new Vector<Kategori>());
	}
	public Vector<Kategori> getKategoriler() {
		return kategoriler;
	}
	public void setKategoriler(Vector<Kategori> kategoriler) {
		this.kategoriler = kategoriler;
	}

}

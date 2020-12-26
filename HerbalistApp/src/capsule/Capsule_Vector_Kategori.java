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

package agaclar;

import java.util.Vector;

import agac.Agac;

public class Capsule_Vector_Agac {
	/**
	 * 
	 */
	private Vector<Agac> agaclar;
	/**
	 * 
	 */
	private int aranan_urun_hangi_kategoride_bulundu;

	/**
	 * @param kategori_cesidi
	 */
	public Capsule_Vector_Agac(int kategori_cesidi) {
		setAgaclar(new Vector<Agac>());
		agaclar.setSize(kategori_cesidi);
		for (int i = 0; i < kategori_cesidi; i++) {
			agaclar.set(i, new Agac());
		}
	}

	/**
	 * 
	 */
	public Capsule_Vector_Agac() {
		setAgaclar(new Vector<Agac>());
	}

	/**
	 * @return
	 */
	public Vector<Agac> getAgaclar() {
		return agaclar;
	}

	/**
	 * @param agaclar
	 */
	public void setAgaclar(Vector<Agac> agaclar) {
		this.agaclar = agaclar;
	}

	/**
	 * @param data
	 * @return
	 */
	public String find(String data) {
		String yanit = "";
		for (int i = 0; i < agaclar.size(); i++) {
			yanit = agaclar.elementAt(i).find(agaclar.elementAt(i).getNode(), data);
			if (yanit.compareTo("Bulunamadi") != 0) {
				// Bulunduysa diger kategorilerde arama yapmaya gerek yok
				setAranan_urun_hangi_kategoride_bulundu(i);
				return yanit;
			}
		}
		return yanit;
	}

	/**
	 * @param aranan_urun_hangi_kategoride_bulundu
	 */
	public void setAranan_urun_hangi_kategoride_bulundu(int aranan_urun_hangi_kategoride_bulundu) {
		this.aranan_urun_hangi_kategoride_bulundu = aranan_urun_hangi_kategoride_bulundu;
	}

	/**
	 * @return
	 */
	public int getAranan_urun_hangi_kategoride_bulundu() {
		return aranan_urun_hangi_kategoride_bulundu;
	}

}
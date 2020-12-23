package hash_table;

import java.util.Hashtable;
import java.util.Vector;

import dert.Hastalik;

public class Capsule_Hashtable_String_Hastalik {
	@Override
	public String toString() {
		return "Capsule_Hashtable_String_Hastalik [hash_hastalik=" + hash_hastalik + "]";
	}

	private Hashtable<String, Hastalik> hash_hastalik;

	// Örnek 46 Maraş

	public Capsule_Hashtable_String_Hastalik(Vector<Hastalik> hastaliklar) {
		hash_hastalik = new Hashtable<String, Hastalik>();
		for (final Hastalik hastalik : hastaliklar) {
			hash_hastalik.put(hastalik.getAdi(), hastalik);
			// System.out.println(kisi.yazdir2() + "*******");
		}
	}

	/**
	 * 
	 */
	public Capsule_Hashtable_String_Hastalik() {
		hash_hastalik = new Hashtable<String, Hastalik>();
	}

	public Hashtable<String, Hastalik> getHash_hastalik() {
		return hash_hastalik;
	}

	public void setHash(Hashtable<String, Hastalik> hash) {
		this.hash_hastalik = hash;
	}

	public String hastalik_ara(String hastalik_adi) {
		String yanit = "";

		if (hash_hastalik.get(hastalik_adi) != null) {
			yanit = "Bulundu";
		} else {
			yanit = "Bulunamadi";
		}
		return yanit;
	}

	public String hastalik_toString(String hastalik_adi) {
		String yanit = "";
		Hastalik hastalik;
		yanit = hastalik_ara(hastalik_adi);
		if (yanit.compareTo("Bulundu") == 0) {
			hastalik = hash_hastalik.get(hastalik_adi);
			yanit = hastalik.toString();
		} else {
			System.out.println("Bulunamadi\n");
		}
		return yanit;
	}
}
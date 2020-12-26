package test.java;

import java.io.IOException;

import capsule.Capsule_Vector_String;
import deva.Bitki;

public class Test_Bitki {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Bitki botan = new Bitki("0", "-1", "0", "0", "0", "0", "0", "0");
		String adi = "Mara� otu", diskteki_adi = "Maragee", diskteki_yeri = "C:\\", latince_adi = "Marageeka Botanika";
		Capsule_Vector_String ozellikleri = new Capsule_Vector_String();
		ozellikleri.add("Anestezi");
		float fiyati = (float) 1.9;
		int miktari = 23;
		Capsule_Vector_String onerilen_hastaliklar = new Capsule_Vector_String();
		onerilen_hastaliklar.add("Agri");
		onerilen_hastaliklar.add("Depresyon");
		onerilen_hastaliklar.add("Psikolojik Hastaliklar");
		botan.setAdi(adi);
		botan.setDiskteki_adi(diskteki_adi);
		botan.setDiskteki_yeri(diskteki_yeri);
		botan.setFiyati(fiyati);
		botan.setLatince_adi(latince_adi);
		botan.setMiktari(miktari);
		botan.setonerilen_hastaliklar(onerilen_hastaliklar);
		botan.setozellikleri(ozellikleri);
		botan.setKategori(-1);
		System.out.println(botan);
	}

}

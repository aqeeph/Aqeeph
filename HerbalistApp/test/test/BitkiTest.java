package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import capsule.Capsule_Vector_String;
import deva.Bitki;

public class BitkiTest {

	@Test
	public void test() {
		Bitki botan = new Bitki("0", "-1", "0", "0", "0", "0", "0", "0");
		String adi = "Maras otu", diskteki_adi = "Maragee", diskteki_yeri = "C:\\", latince_adi = "Marageeka Botanika";
		Capsule_Vector_String ozellikleri = new Capsule_Vector_String();
		ozellikleri.getstringlistesi().add("Anestezi");
		float fiyati = (float) 1.9;
		int miktari = 23;
		Capsule_Vector_String onerilen_hastaliklar = new Capsule_Vector_String();
		onerilen_hastaliklar.getstringlistesi().add("Agri");
		onerilen_hastaliklar.getstringlistesi().add("Depresyon");
		onerilen_hastaliklar.getstringlistesi().add("Psikolojik Hastaliklar");
		botan.setAdi(adi);
		botan.setDiskteki_adi(diskteki_adi);
		botan.setDiskteki_yeri(diskteki_yeri);
		botan.setFiyati(fiyati);
		botan.setLatince_adi(latince_adi);
		botan.setMiktari(miktari);
		botan.setonerilen_hastaliklar(onerilen_hastaliklar);
		botan.setozellikleri(ozellikleri);
		botan.setKategori(-1);

		assertEquals("Maras otu", botan.getAdi());
		System.out.println(botan);
	}

}

package test.java;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestResult;
import veri_tabani.Veritabani_Listesi;

public class TestHerbalist extends TestCase {
	Veritabani_Listesi veritabani_listesi;
	public void setUp() {
		// subclass responsibility
		veritabani_listesi = new Veritabani_Listesi();
		try {
			// veri_tabanlarini_veri_yapilarina_kopyala();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void tearDown() throws Exception {
		// subclass responsibility
	}
	//Test decoratedSuite;
	public TestResult run() {
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Test
	public void test() {
		try {
			run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("veritabani_listesi.getHash_table().toString()"+veritabani_listesi.getHash_table().toString());
			//assertEquals("Bulundu", veritabani_listesi.Hash_tableda_hastalik_ara("Anemi"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}










}
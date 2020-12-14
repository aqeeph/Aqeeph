package test.java;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestResult;
import veri_tabani.Veritabani_Listesi;

public class TestHerbalist extends TestCase {

	@Test
	public void test() {
		try {
			run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			assertEquals("Bulundu", Veritabani_Listesi.getHash_table().hastalik_hash_table_de_var_mi("Anemi"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Test decoratedSuite;

	void AbstractSetupDecorator(Test testSuiteToDecorate) {
		decoratedSuite = testSuiteToDecorate;
	}

	public void setUp() {
		// subclass responsibility
		Veritabani_Listesi.veri_tabanlarini_olustur();
		try {
			// veri_tabanlarini_veri_yapilarina_kopyala();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tearDown() throws Exception {
		// subclass responsibility
	}

	public TestResult run() {
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		((TestCase) decoratedSuite).run();// casting to TestHerbalist
		try {
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
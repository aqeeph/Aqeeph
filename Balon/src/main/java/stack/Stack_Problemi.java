package stack;

import problem.Problem;

/**
 * @author MehmetAkif-PC
 *
 */
public class Stack_Problemi extends Problem {
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Stack_Problemi [getBly()=" + getBly() + ", getStr1()=" + getStr1() + ", getStr2()=" + getStr2()
				+ ", getUretilecek_olan_balon_sayisi()=" + getUretilecek_olan_balon_sayisi()
				+ ", getKacta_bir_patlatilacak()=" + getKacta_bir_patlatilacak() + ", getSayac1()=" + getSayac1()
				+ ", getSayac2()=" + getSayac2() + ", getKatNo()=" + getKatNo() + ", getProblemSayisi()="
				+ getProblemSayisi() + ", getProblem_cozum_suresi()=" + getProblem_cozum_suresi() + ", getBaslangic()="
				+ getBaslangic() + ", getGecici1()=" + getGecici1() + ", getGecici2()="
				+ getGecici2() + ", getListe_eleman_sayisi()=" + getListe_eleman_sayisi() + ", isStack_bos_mu()="
				+ isStack_bos_mu() + ", getOrtalama_problem_cozum_suresi()=" + getOrtalama_problem_cozum_suresi()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	/**
	 * 
	 */
	public Stack_Problemi() {
		super();
		try {
			this.node_sayisini_kullanicidan_al();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
		try {
			this.kac_tanede_bir_stackden_cikarilacak();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
		try {
			this.insert_item_to_bly();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
	}

	/**
	 * 
	 */
	public void solution() {
		//System.err.println("solution() started");	
		try {
			this.coz();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}	
		try {
			this.hesaplama_suresini_yazdir();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
		//System.err.println("solution() finished");
	}
}

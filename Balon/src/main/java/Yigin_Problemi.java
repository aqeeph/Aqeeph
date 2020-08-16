public class Yigin_Problemi extends Problem {
	public Yigin_Problemi() {
		super();
		try {
			this.node_sayisini_kullanicidan_al();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
		try {
			this.kac_tanede_bir_yigindan_cikarilacak();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
		try {
			this.insert_item_to_bly();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
	}

	public void solution() {
		System.err.println("----------------------------------------");	
		try {
			this.coz();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}	
		try {
			this.hesaplama_suresini_yazdir();
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
	}
}

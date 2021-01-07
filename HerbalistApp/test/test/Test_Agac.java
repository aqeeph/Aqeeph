package test;

import capsule.Capsule_Vector_Agac_Bitki;
import deva.Bitki;
import generic.Node;
import veri_tabani.Bitki_veri_tabani;
import veri_tabani.Veritabani_Listesi;

public class Test_Agac {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Veritabani_Listesi veritabani_listesi = new Veritabani_Listesi();
		Bitki_veri_tabani database = null;
		try {
			database = new Bitki_veri_tabani("files\\bitki.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (database != null) {
			if (database.getVector_bitki() != null) {
				//Agac<Bitki> tree = new Agac<Bitki>();
				Node<Bitki> newyeninode;
				try {
					//System.out.println("datebase.getBitkiler().size()" + database.getVector_bitki().size());
				} catch (NullPointerException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				for (int i = 0; i < database.getVector_bitki().size(); i++) {
					newyeninode = new Node<Bitki>(database.getVector_bitki().elementAt(i));
					//System.out.println("newyeninode.toString()" + newyeninode.toString());
					Veritabani_Listesi.getAgac_vektoru().insert(0,newyeninode);
				}
				System.out.println("Capsule_Vector_Agac_Bitki.find_request(0, \"Adacayi\")\n" + Capsule_Vector_Agac_Bitki.find_request(0, "Adacayi"));
				System.out.println("pre");
				Capsule_Vector_Agac_Bitki.preOrder_request(0, 0);
				System.out.println("in");
				Capsule_Vector_Agac_Bitki.inOrder_request(0, 0);
				System.out.println("post");
				Capsule_Vector_Agac_Bitki.postOrder_request(0, 0);

				// String aranan = "51";
				/*
				 * System.out.println("Aranan" + aranan); tree.find(tree.node, aranan);
				 * //tree.remove("51"); tree.find(tree.node, aranan); System.out.println("pre");
				 * tree.preOrder(tree.getNode(),0); System.out.println("in");
				 * tree.inOrder(tree.getNode(),0); System.out.println("post");
				 * tree.postOrder(tree.getNode(),0); tree.find(tree.node, aranan);
				 * System.out.println("pre"); tree.preOrder(tree.getNode(),0);
				 * System.out.println("in"); tree.inOrder(tree.getNode(),0);
				 * System.out.println("post"); tree.postOrder(tree.getNode(),0); aranan = "51";
				 * System.out.println("Aranan" + aranan); tree.find(tree.node, aranan);
				 * //tree.remove(aranan); tree.find(tree.node, aranan); aranan = "57";
				 * System.out.println("Aranan" + aranan); tree.find(tree.node, aranan);
				 * //tree.remove(aranan); tree.find(tree.node, aranan); aranan = "58";
				 * System.out.println("Aranan" + aranan); tree.find(tree.node, aranan);
				 * //tree.remove(aranan); tree.find(tree.node, aranan); aranan = "55";
				 * System.out.println("Aranan" + aranan); tree.find(tree.node, aranan);
				 * //tree.remove(aranan); tree.find(tree.node, aranan); aranan = "65";
				 * System.out.println("Aranan" + aranan); tree.find(tree.node, aranan);
				 * //tree.remove(aranan); tree.find(tree.node, aranan);
				 * System.out.println("pre"); tree.preOrder(tree.getNode(),0);
				 * System.out.println("in"); tree.inOrder(tree.getNode(),0);
				 * System.out.println("post");
				 */
				// System.out.println(datebase.getBitkiler().elementAt(0).toString());
				// datebase.getBitkiler().add(tree.getNode().getBitki());
				// datebase.update_file();
			} else {
				System.out.println("Database.getBitkiler() null");
			}
		} else {
			System.out.println("Database null");
		}

	}
}

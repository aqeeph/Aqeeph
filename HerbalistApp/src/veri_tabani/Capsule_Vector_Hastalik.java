package veri_tabani;

import java.util.Vector;

import dert.Hastalik;

public class Capsule_Vector_Hastalik {

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < this.hastaliklar.size(); i++) {
			stringBuilder.append(this.hastaliklar.elementAt(i).toString());
		}
		return stringBuilder.toString();
	}
	public Capsule_Vector_Hastalik() {
		hastaliklar = new Vector<Hastalik>();
	}
	private Vector<Hastalik> hastaliklar;

	public Vector<Hastalik> getHastalikler() {
		return hastaliklar;
	}
	public void setHastalikler(Vector<Hastalik> hastaliklar) {
		this.hastaliklar = hastaliklar;
	}
	public int size() {
		return hastaliklar.size();
	}
	public Hastalik elementAt(int i) {
		return hastaliklar.elementAt(i);
	}
	public void remove(int i) {
		hastaliklar.remove(i);
	}
	public void add(Hastalik bitki) {
		hastaliklar.add(bitki);
	}
}

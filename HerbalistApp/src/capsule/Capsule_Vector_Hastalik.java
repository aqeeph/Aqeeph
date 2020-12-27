package capsule;

import java.util.Vector;

import dert.Hastalik;

public class Capsule_Vector_Hastalik {

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < this.getHastaliklar().size(); i++) {
			stringBuilder.append(this.getHastaliklar().elementAt(i).toString());
		}
		return stringBuilder.toString();
	}
	public Capsule_Vector_Hastalik() {
		setHastaliklar(new Vector<Hastalik>());
	}
	private Vector<Hastalik> hastaliklar;

	public Vector<Hastalik> getHastalikler() {
		return getHastaliklar();
	}
	public void setHastalikler(Vector<Hastalik> hastaliklar) {
		this.setHastaliklar(hastaliklar);
	}
	public int size() {
		return getHastaliklar().size();
	}
	public Hastalik elementAt(int i) {
		return getHastaliklar().elementAt(i);
	}
	public void remove(int i) {
		getHastaliklar().remove(i);
	}
	public void add(Hastalik bitki) {
		getHastaliklar().add(bitki);
	}
	/**
	 * @return the hastaliklar
	 */
	private Vector<Hastalik> getHastaliklar() {
		return hastaliklar;
	}
	/**
	 * @param hastaliklar the hastaliklar to set
	 */
	private void setHastaliklar(Vector<Hastalik> hastaliklar) {
		this.hastaliklar = hastaliklar;
	}
}

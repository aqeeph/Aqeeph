package gui;

import capsule.Capsule_Vector_String;

public class Herbalist_AppStringData {
	private String yanit;
	private Capsule_Vector_String belirtiler;
	private Capsule_Vector_String nedenler;
	private Capsule_Vector_String tedaviler;
	private Capsule_Vector_String bitkiler;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_AppStringData [yanit=");
		builder.append(yanit);
		builder.append(", belirtiler=");
		builder.append(belirtiler);
		builder.append(", nedenler=");
		builder.append(nedenler);
		builder.append(", tedaviler=");
		builder.append(tedaviler);
		builder.append(", bitkiler=");
		builder.append(bitkiler);
		builder.append("]");
		return builder.toString();
	}
	public Herbalist_AppStringData() {
	}

	public String getYanit() {
		return yanit;
	}

	public void setYanit(String yanit) {
		this.yanit = yanit;
	}

	public Capsule_Vector_String getBelirtiler() {
		return belirtiler;
	}

	public void setBelirtiler(Capsule_Vector_String belirtiler) {
		this.belirtiler = belirtiler;
	}

	public Capsule_Vector_String getNedenler() {
		return nedenler;
	}

	public void setNedenler(Capsule_Vector_String nedenler) {
		this.nedenler = nedenler;
	}

	public Capsule_Vector_String getTedaviler() {
		return tedaviler;
	}

	public void setTedaviler(Capsule_Vector_String tedaviler) {
		this.tedaviler = tedaviler;
	}

	public Capsule_Vector_String getBitkiler() {
		return bitkiler;
	}

	public void setBitkiler(Capsule_Vector_String bitkiler) {
		this.bitkiler = bitkiler;
	}
}
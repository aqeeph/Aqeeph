package gui;

import java.util.Vector;

public class Herbalist_AppStringData {
	@Override
	public String toString() {
		return "Herbalist_AppStringData [yanit=" + yanit + ", belirtiler=" + belirtiler + ", nedenler=" + nedenler
				+ ", tedaviler=" + tedaviler + ", bitkiler=" + bitkiler + "]";
	}

	private String yanit;
	private Vector<String> belirtiler;
	private Vector<String> nedenler;
	private Vector<String> tedaviler;
	private Vector<String> bitkiler;

	public Herbalist_AppStringData() {
	}

	public String getYanit() {
		return yanit;
	}

	public void setYanit(String yanit) {
		this.yanit = yanit;
	}

	public Vector<String> getBelirtiler() {
		return belirtiler;
	}

	public void setBelirtiler(Vector<String> belirtiler) {
		this.belirtiler = belirtiler;
	}

	public Vector<String> getNedenler() {
		return nedenler;
	}

	public void setNedenler(Vector<String> nedenler) {
		this.nedenler = nedenler;
	}

	public Vector<String> getTedaviler() {
		return tedaviler;
	}

	public void setTedaviler(Vector<String> tedaviler) {
		this.tedaviler = tedaviler;
	}

	public Vector<String> getBitkiler() {
		return bitkiler;
	}

	public void setBitkiler(Vector<String> bitkiler) {
		this.bitkiler = bitkiler;
	}
}
package gui;

import javax.swing.JMenuItem;

public class Herbalist_AppJMenuItemData {
	private JMenuItem exitMenuItem;
	private JMenuItem aboutMenuItem;
	private JMenuItem cutMenuItem;
	private JMenuItem copyMenuItem;
	private JMenuItem pasteMenuItem;
	private JMenuItem saveMenuItem;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_AppJMenuItemData [exitMenuItem=");
		builder.append(exitMenuItem);
		builder.append(", aboutMenuItem=");
		builder.append(aboutMenuItem);
		builder.append(", cutMenuItem=");
		builder.append(cutMenuItem);
		builder.append(", copyMenuItem=");
		builder.append(copyMenuItem);
		builder.append(", pasteMenuItem=");
		builder.append(pasteMenuItem);
		builder.append(", saveMenuItem=");
		builder.append(saveMenuItem);
		builder.append("]");
		return builder.toString();
	}
	public Herbalist_AppJMenuItemData() {
	}
	public JMenuItem getExitMenuItem() {
		return exitMenuItem;
	}

	public void setExitMenuItem(JMenuItem exitMenuItem) {
		this.exitMenuItem = exitMenuItem;
	}

	public JMenuItem getAboutMenuItem() {
		return aboutMenuItem;
	}

	public void setAboutMenuItem(JMenuItem aboutMenuItem) {
		this.aboutMenuItem = aboutMenuItem;
	}

	public JMenuItem getCutMenuItem() {
		return cutMenuItem;
	}

	public void setCutMenuItem(JMenuItem cutMenuItem) {
		this.cutMenuItem = cutMenuItem;
	}

	public JMenuItem getCopyMenuItem() {
		return copyMenuItem;
	}

	public void setCopyMenuItem(JMenuItem copyMenuItem) {
		this.copyMenuItem = copyMenuItem;
	}

	public JMenuItem getPasteMenuItem() {
		return pasteMenuItem;
	}

	public void setPasteMenuItem(JMenuItem pasteMenuItem) {
		this.pasteMenuItem = pasteMenuItem;
	}

	public JMenuItem getSaveMenuItem() {
		return saveMenuItem;
	}

	public void setSaveMenuItem(JMenuItem saveMenuItem) {
		this.saveMenuItem = saveMenuItem;
	}
}
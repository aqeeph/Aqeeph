package gui;

import javax.swing.JMenu;

public class Herbalist_AppJMenuData {
	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu helpMenu;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_AppJMenuData [fileMenu=");
		builder.append(fileMenu);
		builder.append(", editMenu=");
		builder.append(editMenu);
		builder.append(", helpMenu=");
		builder.append(helpMenu);
		builder.append("]");
		return builder.toString();
	}

	public Herbalist_AppJMenuData() {
	}

	public JMenu getFileMenu() {
		return fileMenu;
	}

	public void setFileMenu(JMenu fileMenu) {
		this.fileMenu = fileMenu;
	}

	public JMenu getEditMenu() {
		return editMenu;
	}

	public void setEditMenu(JMenu editMenu) {
		this.editMenu = editMenu;
	}

	public JMenu getHelpMenu() {
		return helpMenu;
	}

	public void setHelpMenu(JMenu helpMenu) {
		this.helpMenu = helpMenu;
	}
}
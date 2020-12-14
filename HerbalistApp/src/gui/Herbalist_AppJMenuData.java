package gui;

import javax.swing.JMenu;

public class Herbalist_AppJMenuData {
	@Override
	public String toString() {
		return "Herbalist_AppJMenuData [fileMenu=" + fileMenu + ", editMenu=" + editMenu + ", helpMenu=" + helpMenu
				+ "]";
	}

	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu helpMenu;

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
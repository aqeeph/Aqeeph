/**
 * 
 */
package gui;

import javax.swing.JDialog;

/**
 * @author  MehmetAkif-PC
 */
public class Herbalist_AppJDialogData {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_AppJDialogData [aboutDialog=");
		builder.append(aboutDialog);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 */
	private JDialog aboutDialog;

	/**
	 * 
	 */
	public Herbalist_AppJDialogData() {
	}

	/**
	 * @return the aboutDialog
	 */
	public JDialog getAboutDialog() {
		return aboutDialog;
	}

	/**
	 * @param aboutDialog the aboutDialog to set
	 */
	public void setAboutDialog(JDialog aboutDialog) {
		this.aboutDialog = aboutDialog;
	}
}
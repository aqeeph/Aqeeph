/**
 * 
 */
package gui;

import javax.swing.JMenuBar;

/**
 * @author  MehmetAkif-PC
 */
public class Herbalist_AppJMenuBarData {
	/**
	 * 
	 */
	private JMenuBar jJMenuBar;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_AppJMenuBarData [jJMenuBar=");
		builder.append(jJMenuBar);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * 
	 */
	public Herbalist_AppJMenuBarData() {
	}

	/**
	 * @return the jJMenuBar
	 */
	public JMenuBar getjJMenuBar() {
		return jJMenuBar;
	}

	/**
	 * @param jJMenuBar the jJMenuBar to set
	 */
	public void setjJMenuBar(JMenuBar jJMenuBar) {
		this.jJMenuBar = jJMenuBar;
	}
}
/**
 * 
 */
package gui;

import javax.swing.JFrame;

/**
 * @author MehmetAkif-PC
 */
public class Herbalist_AppJFrameData {
	/**
	 * 
	 */
	private JFrame Herbalist_Application;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Herbalist_AppJFrameData [Herbalist_Application=");
		builder.append(Herbalist_Application);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * 
	 */
	public Herbalist_AppJFrameData() {
	}

	public JFrame getHerbalist_Application() {
		return Herbalist_Application;
	}

	public void setHerbalist_Application(JFrame herbalist_Application) {
		Herbalist_Application = herbalist_Application;
	}
}
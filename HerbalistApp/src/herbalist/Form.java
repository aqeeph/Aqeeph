package herbalist;

import java.util.Vector;

import javax.swing.SwingUtilities;

public class Form {
	/**
	 * 
	 */
	private Runnable herbalist_app_runnable;
	/**
	 * @return the herbalist_app_runnable
	 */
	public Runnable getHerbalist_app_runnable() {
		return herbalist_app_runnable;
	}

	/**
	 * @param herbalist_app_runnable the herbalist_app_runnable to set
	 */
	public void setHerbalist_app_runnable(Runnable herbalist_app_runnable) {
		this.herbalist_app_runnable = herbalist_app_runnable;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Form [herbalist_app_runnable=" + herbalist_app_runnable + "]";
	}

	/**
	 * 
	 */
	public Form() {
		super();
		herbalist_app_runnable =new Runnable() {
			public void run() {
				Herbalist_App application = new Herbalist_App(new Herbalist_AppGUIData(new Herbalist_AppStringData(),
						new Herbalist_AppSwingData(new Herbalist_AppJFrameData(), new Herbalist_AppJMenuBarData(),
								new Herbalist_AppJMenuData(), new Herbalist_AppJMenuItemData(),
								new Herbalist_AppJDialogData(), new Herbalist_AppJTabbedPaneData(),
								new Herbalist_AppJTextAreaData(), new Herbalist_AppJPanelData(),
								new Herbalist_AppJTextFieldData(), new Herbalist_AppJButtonData(),
								new Herbalist_AppJLabelData(), null),
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, new Vector<String>(),
						new Vector<String>(), new Vector<String>(), new Vector<String>(), null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null));
				application.getHerbalist_Application().setVisible(true);
			}
		};
	}

	/**
	 * 
	 */
	void herbalist_appgui() {
		SwingUtilities.invokeLater(herbalist_app_runnable);
	}

}

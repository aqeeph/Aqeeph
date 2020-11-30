package herbalist;

import java.util.Vector;

import javax.swing.SwingUtilities;

import veri_tabani.Veritabani_Listesi;

public class Form {

	@Override
	public String toString() {
		return "Form []";
	}

	/**
	 * 
	 */
	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	void herbalist_appgui() {
		Veritabani_Listesi.veri_tabanlarini_olustur();
		Veritabani_Listesi.veri_tabanlarini_veri_yapilarina_kopyala();

		SwingUtilities.invokeLater(new Runnable() {
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
		});
	}

}

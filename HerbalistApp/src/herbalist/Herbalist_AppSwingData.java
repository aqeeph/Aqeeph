package herbalist;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Herbalist_AppSwingData {
	private Herbalist_AppJFrameData jframedata;
	private Herbalist_AppJMenuBarData jmenubardata;
	private Herbalist_AppJMenuData jmenudata;
	private Herbalist_AppJMenuItemData jmenuitemdata;
	private Herbalist_AppJDialogData jdialogdata;
	private Herbalist_AppJTabbedPaneData jtabbedpanedata;
	private JScrollPaneData jscrollpanedata = new JScrollPaneData();
	private Herbalist_AppJTextAreaData jtextareadata;
	private Herbalist_AppJPanelData jpaneldata;
	private Herbalist_AppJTextFieldData jtextfielddata;
	private Herbalist_AppJButtonData jbuttondata;
	private Herbalist_AppJLabelData jlabeldata;
	private static JTextArea jTextArea8;


	public Herbalist_AppSwingData(Herbalist_AppJFrameData jframedata, Herbalist_AppJMenuBarData jmenubardata,
			Herbalist_AppJMenuData jmenudata, Herbalist_AppJMenuItemData jmenuitemdata,
			Herbalist_AppJDialogData jdialogdata, Herbalist_AppJTabbedPaneData jtabbedpanedata,
			Herbalist_AppJTextAreaData jtextareadata, Herbalist_AppJPanelData jpaneldata,
			Herbalist_AppJTextFieldData jtextfielddata, Herbalist_AppJButtonData jbuttondata,
			Herbalist_AppJLabelData jlabeldata, JTextArea jTextArea8) {
		this.setJframedata(jframedata);
		this.jmenubardata = jmenubardata;
		this.jmenudata = jmenudata;
		this.jmenuitemdata = jmenuitemdata;
		this.jdialogdata = jdialogdata;
		this.jtabbedpanedata = jtabbedpanedata;
		this.jtextareadata = jtextareadata;
		this.jpaneldata = jpaneldata;
		this.jtextfielddata = jtextfielddata;
		this.jbuttondata = jbuttondata;
		this.setJlabeldata(jlabeldata);
		this.setjTextArea8(jTextArea8);
	}

	public JMenuBar getjJMenuBar() {
		return jmenubardata.getjJMenuBar();
	}

	public void setjJMenuBar(JMenuBar jJMenuBar) {
		this.jmenubardata.setjJMenuBar(jJMenuBar);
	}

	public Herbalist_AppJMenuData getJmenudata() {
		return jmenudata;
	}

	public void setJmenudata(Herbalist_AppJMenuData jmenudata) {
		this.jmenudata = jmenudata;
	}

	public Herbalist_AppJMenuItemData getJmenuitemdata() {
		return jmenuitemdata;
	}

	public void setJmenuitemdata(Herbalist_AppJMenuItemData jmenuitemdata) {
		this.jmenuitemdata = jmenuitemdata;
	}

	public JDialog getAboutDialog() {
		return jdialogdata.getAboutDialog();
	}

	public void setAboutDialog(JDialog aboutDialog) {
		this.jdialogdata.setAboutDialog(aboutDialog);
	}

	public Herbalist_AppJTabbedPaneData getJtabbedpanedata() {
		return jtabbedpanedata;
	}

	public void setJtabbedpanedata(Herbalist_AppJTabbedPaneData jtabbedpanedata) {
		this.jtabbedpanedata = jtabbedpanedata;
	}

	public JScrollPane getjScrollPane1() {
		return jscrollpanedata.getjScrollPane1();
	}

	public void setjScrollPane1(JScrollPane jScrollPane1) {
		this.jscrollpanedata.setjScrollPane1(jScrollPane1);
	}

	public Herbalist_AppJTextAreaData getJtextareadata() {
		return jtextareadata;
	}

	public void setJtextareadata(Herbalist_AppJTextAreaData jtextareadata) {
		this.jtextareadata = jtextareadata;
	}

	public Herbalist_AppJPanelData getJpaneldata() {
		return jpaneldata;
	}

	public void setJpaneldata(Herbalist_AppJPanelData jpaneldata) {
		this.jpaneldata = jpaneldata;
	}

	public Herbalist_AppJTextFieldData getJtextfielddata() {
		return jtextfielddata;
	}

	public void setJtextfielddata(Herbalist_AppJTextFieldData jtextfielddata) {
		this.jtextfielddata = jtextfielddata;
	}

	public Herbalist_AppJButtonData getJbuttondata() {
		return jbuttondata;
	}

	public void setJbuttondata(Herbalist_AppJButtonData jbuttondata) {
		this.jbuttondata = jbuttondata;
	}

	public Herbalist_AppJLabelData getJlabeldata() {
		return jlabeldata;
	}

	public void setJlabeldata(Herbalist_AppJLabelData jlabeldata) {
		this.jlabeldata = jlabeldata;
	}

	public Herbalist_AppJFrameData getJframedata() {
		return jframedata;
	}

	public void setJframedata(Herbalist_AppJFrameData jframedata) {
		this.jframedata = jframedata;
	}

	public JTextArea getjTextArea8() {
		return jTextArea8;
	}

	public void setjTextArea8(JTextArea jTextArea8) {
		Herbalist_AppSwingData.jTextArea8 = jTextArea8;
	}

	public JTextField getJTextField2() {
		return jtextfielddata.getjTextField2();
	}


	public void setjTextField2(JTextField jTextField2) {
		jtextfielddata.setjTextField2(jTextField2);
	}

	/**
	 * This method initializes jTextField5
	 * 
	 * @return javax.swing.JTextField
	 */
	public JTextField getJTextField5() {
		return jtextfielddata.getjTextField5();
	}

	public void setjTextField5(JTextField jTextField5) {
		jtextfielddata.setjTextField5(jTextField5);
	}

	/**
	 * This method initializes jTextField3
	 * 
	 * @return javax.swing.JTextField
	 */
	public JTextField getJTextField3() {
		
		return jtextfielddata.getjTextField3();
	}

	public void setjTextField3(JTextField jTextField3) {
		jtextfielddata.setjTextField3(jTextField3);
	}

	/**
	 * This method initializes jTextField7
	 * 
	 * @return javax.swing.JTextField
	 */
	public JTextField getJTextField7() {
		return jtextfielddata.getjTextField7();
	}

	public void setjTextField7(JTextField jTextField7) {
		jtextfielddata.setjTextField7(jTextField7);
	}
	
}
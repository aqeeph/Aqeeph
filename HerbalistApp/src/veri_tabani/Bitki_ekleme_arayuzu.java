package veri_tabani;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Bitki_ekleme_arayuzu extends JFrame {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bitki_ekleme_arayuzu [jContentPane=");
		builder.append(jContentPane);
		builder.append(", jLabel=");
		builder.append(jLabel);
		builder.append(", jLabel1=");
		builder.append(jLabel1);
		builder.append(", jLabel2=");
		builder.append(jLabel2);
		builder.append("]");
		return builder.toString();
	}

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;

	/**
	 * This is the default constructor
	 */
	public Bitki_ekleme_arayuzu() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Bitki Ekleme Arayuzu");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(17, 78, 77, 16));
			jLabel2.setText("JLabel");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(16, 45, 76, 16));
			jLabel1.setText("Kategori");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(13, 14, 77, 16));
			jLabel.setText("Bitki adi");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
		}
		return jContentPane;
	}

} // @jve:decl-index=0:visual-constraint="11,11"

package gui;

import javax.swing.JScrollPane;

public class JScrollPaneData {
	private JScrollPane jScrollPane1;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JScrollPaneData [jScrollPane1=");
		builder.append(jScrollPane1);
		builder.append("]");
		return builder.toString();
	}

	public JScrollPaneData() {
	}

	public JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public void setjScrollPane1(JScrollPane jScrollPane1) {
		this.jScrollPane1 = jScrollPane1;
	}
}
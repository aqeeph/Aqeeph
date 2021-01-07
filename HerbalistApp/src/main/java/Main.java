/**
 * 
 */
package main.java;

import herbalist.Form;
import veri_tabani.SQL;

/**
 * @author MehmetAkif-PC
 *
 */
public class Main {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Main []");
		return builder.toString();
	}

	/**
	 * 
	 */
	private static Form form1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nm = System.getProperty("java.awt.headless");

	    Boolean headless;
		if (nm == null) {
	        @SuppressWarnings("unused")
			Boolean defaultHeadless;
			/* No need to ask for DISPLAY when run in a browser */
	        if (System.getProperty("javaplugin.version") != null) {
	            headless = defaultHeadless = Boolean.FALSE;
	        } else {
	            String osName = System.getProperty("os.name");
	            headless = defaultHeadless =
	                Boolean.valueOf(("Linux".equals(osName) || "SunOS".equals(osName)) &&
	                                (System.getenv("DISPLAY") == null));
	        }
	    } else if (nm.equals("true")) {
	        headless = Boolean.TRUE;
	    } else {
	        headless = Boolean.FALSE;
	    }
		if(headless == Boolean.FALSE) {
			System.out.println("Sistem gorsel uygulamayı destekliyor.");
			@SuppressWarnings("unused")
			
			SQL sql;
			try {
				sql = new SQL();
			} catch (Exception e) {
				System.out.println("hata var");
				e.printStackTrace();
				System.exit(0);
			}
			setForm1(new Form());
			getForm1().herbalist_appgui();			
		}else {
			System.out.println("Sistem gorsel uygulamayı desteklemiyor.");
			System.exit(0);
		}
	}

	/**
	 * 
	 */
	public Main() {
		super();
	}

	/**
	 * @return the form1
	 */
	public static Form getForm1() {
		return form1;
	}

	/**
	 * @param form1 the form1 to set
	 */
	public static void setForm1(Form form1) {
		Main.form1 = form1;
	}

}
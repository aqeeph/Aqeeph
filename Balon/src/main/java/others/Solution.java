package others;


/**
 * @author MehmetAkif-PC
 *
 */
public class Solution {
	/**
	 * 
	 */
	private static Stack_Yigin_Problemi p;
	/**
	 * 
	 */
	private static Yigin_Problemi yigin_problemi;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setP(new Stack_Yigin_Problemi());
		if (getP() == null) {
			System.err.println("problem listesi null");
			return;
		} else {
			try {
				setY(new Yigin_Problemi());
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				getP().yeni_problem_ekle(yigin_problemi);
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				getP().solution();
			} catch (NullPointerException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
	}

	/**
	 * @return
	 */
	public static Stack_Yigin_Problemi getP() {
		return p;
	}

	/**
	 * @return
	 */
	public static Yigin_Problemi getY() {
		return yigin_problemi;
	}

	/**
	 * @param y
	 */
	public static void setY(Yigin_Problemi y) {
		Solution.yigin_problemi = y;
	}

	/**
	 * @param p
	 */
	public static void setP(Stack_Yigin_Problemi p) {
		Solution.p = p;
	}
}

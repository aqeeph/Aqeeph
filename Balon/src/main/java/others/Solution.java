package others;


public class Solution {
	private static Problem_listesi p;
	private static Yigin_Problemi yigin_problemi;

	public static void main(String[] args) {
		setP(new Problem_listesi());
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

	public static Problem_listesi getP() {
		return p;
	}

	public static Yigin_Problemi getY() {
		return yigin_problemi;
	}

	public static void setY(Yigin_Problemi y) {
		Solution.yigin_problemi = y;
	}

	public static void setP(Problem_listesi p) {
		Solution.p = p;
	}
}

package main.java.main;

import main.java.renkler.Renkler;
import main.java.stack.Stack_Problemi;
import main.java.stack.Stack_Stack_Problemi;

/**
 * @author MehmetAkif-PC
 *
 */
public class Solution {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Solution []");
		return builder.toString();
	}

	/**
	 * 
	 */
	private static Stack_Stack_Problemi p;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Renkler r=new Renkler();
		r.renkleri_init();
		setP(new Stack_Stack_Problemi());
		if (getP() == null) {
			//System.err.println("problem listesi null");
			System.exit(0);
			return;
		} else {
			Solution.yeni_problem_ekle();
			Solution.problemi_coz();
		}
	}

	/**
	 * 
	 */
	private static void problemi_coz() {
		try {
			getP().solution();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
	}

	/**
	 * 
	 */
	private static void yeni_problem_ekle() {
		try {
			getP().yeni_problem_ekle(new Stack_Problemi());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
	}

	/**
	 * @return
	 */
	public static Stack_Stack_Problemi getP() {
		return p;
	}

	/**
	 * @param p
	 */
	public static void setP(Stack_Stack_Problemi p) {
		Solution.p = p;
	}
}

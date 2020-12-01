package others;
import java.util.Stack;

/**
 * @author MehmetAkif-PC
 *
 */
public class Stack_Yigin_Problemi {
	/**
	 * @param problem_yigini
	 */
	public Stack_Yigin_Problemi(Stack<Yigin_Problemi> problem_yigini) {
		super();
		this.problem_yigini = problem_yigini;
	}

	/**
	 * 
	 */
	private Stack<Yigin_Problemi> problem_yigini;
	/**
	 * 
	 */
	public Stack_Yigin_Problemi() {
		super();//2
		setProblem_yigini(new Stack<Yigin_Problemi>());
	}

	/**
	 * 
	 */
	void solution() {
		try {
			this.problem_yigini.pop().solution();// Paralel hesaplama yap�labilinir.
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * @return
	 */
	public Stack<Yigin_Problemi> getProblem_yigini() {
		return problem_yigini;
	}

	/**
	 * @param problem_yigini
	 */
	public void setProblem_yigini(Stack<Yigin_Problemi> problem_yigini) {
		this.problem_yigini = problem_yigini;
	}

	/**
	 * @param yigin_Problemi
	 */
	void yeni_problem_ekle(Yigin_Problemi yigin_Problemi) {
		System.err.println("yeni_problem_ekleniyor");
		try {
			this.problem_yigini.push(yigin_Problemi);
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
		System.err.println("yeni_problem_eklendi.");
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Stack_Yigin_Problemi [problem_yigini=" + problem_yigini + ", toString()=" + super.toString() + "]";
	}

}

package main.java.stack;
import java.util.Stack;

/**
 * @author MehmetAkif-PC
 *
 */
public class Stack_Stack_Problemi {
	/**
	 * 
	 */
	private Stack<Stack_Problemi> problem_yigini;
	/**
	 * @param problem_yigini
	 */
	public Stack_Stack_Problemi(Stack<Stack_Problemi> problem_yigini) {
		super();
		this.setProblem_yigini(problem_yigini);
	}


	/**
	 * 
	 */
	public Stack_Stack_Problemi() {
		super();//2
		setProblem_yigini(new Stack<Stack_Problemi>());
	}

	/**
	 * 
	 */
	public void solution() {
		//System.err.println("solution() started");
		try {
			this.getProblem_yigini().pop().solution();// Paralel hesaplama yap�labilinir.
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
		//System.err.println("solution() finished");
	}

	/**
	 * @return
	 */
	public Stack<Stack_Problemi> getProblem_yigini() {
		return problem_yigini;
	}

	/**
	 * @param problem_yigini
	 */
	public void setProblem_yigini(Stack<Stack_Problemi> problem_yigini) {
		this.problem_yigini = problem_yigini;
	}

	/**
	 * @param stack_Problemi
	 */
	public void yeni_problem_ekle(Stack_Problemi stack_Problemi) {
		//System.err.println("yeni_problem_ekleniyor");
		try {
			this.getProblem_yigini().push(stack_Problemi);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
			return;
		}
		//System.err.println("yeni_problem_eklendi.");
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Stack_Stack_Problemi [problem_yigini=" + getProblem_yigini() + ", toString()=" + super.toString() + "]";
	}

}

import java.util.Stack;

public class Problem_listesi {
	private Stack<Yigin_Problemi> problem_yigini;
	public Problem_listesi() {
		super();//2
		setProblem_yigini(new Stack<Yigin_Problemi>());
	}

	void solution() {
		try {
			this.problem_yigini.pop().solution();// Paralel hesaplama yapýlabilinir.
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
	}

	public Stack<Yigin_Problemi> getProblem_yigini() {
		return problem_yigini;
	}

	public void setProblem_yigini(Stack<Yigin_Problemi> problem_yigini) {
		this.problem_yigini = problem_yigini;
	}

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

	@Override
	public String toString() {
		return "Problem_listesi [problem_yigini=" + problem_yigini + ", toString()=" + super.toString() + "]";
	}

}

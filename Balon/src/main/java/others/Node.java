package others;
/**
 * @author MehmetAkif-PC
 *
 * @param <T>
 */
public class Node<T> {
	// T stands for "Type"
	/**
	 * 
	 */
	private T t;

	/**
	 * @param t
	 */
	public void set(T t) {
		this.t = t;
	}

	/**
	 * @return
	 */
	public T get() {
		return t;
	}

	/**
	 * 
	 */
	private Node<T> sonraki;

	/**
	 * 
	 */
	public Node() {
	}

	/**
	 * @return the sonraki
	 */
	public Node<T> getSonraki() {
		return sonraki;
	}

	/**
	 * @param sonraki the sonraki to set
	 */
	public void setSonraki(Node<T> sonraki) {
		this.sonraki = sonraki;
	}

	/**
	 *
	 */
	public String toString() {
		// return "Balonun numarasi:" + no + "\t" + "Balonun rengi:"+ ((Node<T>)
		// t).getRenk();
		return t.toString();
	}

}
package agac;

import deva.Bitki;

/**
 * @author MehmetAkif-PC
 *
 * @param <T> generic tip
 */
public class Node<T> {
	
	/**
	 * @param node current node
	 * @param sonraki sonraki node
	 * @param left_node sol cocuk dugum
	 * @param right_node sag cocuk dugum
	 */
	public Node(T node, Node<T> sonraki, Node<T> left_node, Node<T> right_node) {
		super();
		this.node = node;
		this.sonraki = sonraki;
		this.left_node = left_node;
		this.right_node = right_node;
	}

	// T stands for "Type"
	/**
	 * 
	 */
	private T node;

	/**
	 * 
	 */
	private Node<T> sonraki;
	/**
	 * 
	 */
	private Node<T> left_node, right_node;

	/**
	 * 
	 */
	public Node() {
	}

	/**
	 * @param t
	 */
	public Node(T t) {
		this.node = t;
	}

	/**
	 * @param t
	 */
	public void set(T t) {
		this.node = t;
	}

	/**
	 * @return
	 */
	public T get() {
		return node;
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
		return node.toString();
	}

	/**
	 * @return
	 */
	public Node<T> getLeft_node() {
		return left_node;
	}

	/**
	 * @param left_node
	 */
	public void setLeft_node(Node<T> left_node) {
		this.left_node = left_node;
	}

	/**
	 * @return
	 */
	public Node<T> getRight_node() {
		return right_node;
	}

	/**
	 * @param right_node
	 */
	public void setRight_node(Node<T> right_node) {
		this.right_node = right_node;
	}

	/**
	 * @param value value
	 * @param parent Node Bitki
	 * @return true or false
	 */
	@SuppressWarnings("unchecked")
	public boolean remove(String value, Node<Bitki> parent) {
		if (value.compareTo(((Bitki) this.get()).getAdi()) < 0) {
			if (this.left_node != null) {
				return left_node.remove(value, (Node<Bitki>) this);
			} else {
				return false;
			}
		} else if (value.compareTo(((Bitki) this.get()).getAdi()) > 0) {
			if (right_node != null) {
				return right_node.remove(value, (Node<Bitki>) this);
			} else {
				return false;
			}
		} else {
			if (left_node != null && right_node != null) {
				((Bitki) this.get()).setAdi(right_node.minValue());
				right_node.remove(((Bitki) this.get()).getAdi(), (Node<Bitki>) this);
			} else if (parent.getLeft_node() == this) {
				parent.setLeft_node((left_node != null) ? (Node<Bitki>) left_node : (Node<Bitki>) right_node);
			} else if (parent.getRight_node() == this) {
				parent.setRight_node((left_node != null) ? (Node<Bitki>) left_node : (Node<Bitki>) right_node);
			}
			return true;
		}
	}

	/**
	 * @return left_node.minValue()
	 */
	public String minValue() {
		if (left_node == null) {
			return ((Bitki) this.get()).getAdi();
		} else {
			return left_node.minValue();
		}
	}
}
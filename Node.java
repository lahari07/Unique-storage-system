
public class Node<E extends Comparable<E> > implements Comparable<E>{
	Node<E> left;
	Node<E> right;
	E value;
	int counter = 0;
	
	Node(E value){
		this.value = value;
	}
	
	public E getValue() {
		return value;

	}

	@Override
	public int compareTo( E obj ) {
		return this.getValue().compareTo( obj );

	}
}

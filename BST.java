
public class BST< E extends Comparable< E > > implements StorageInterface< E > {

	Node< E > root;
	int noOfNullVal;

	public BST() {
		noOfNullVal = 0;

	}

	@Override
	public void add( E x ) {

		if ( x == null ) {
			noOfNullVal += 1;
			System.out.println( "added a null, counter: " + noOfNullVal );
		} else {
			if ( root == null ) {
				root = new Node< E >( x );
				root.counter += 1;
				System.out.println( "done root: " + x );
			} else {
				Node< E > current = root;
				boolean posfound = false;

				System.out.println(
						"...........Tracing Movement................" );

				while ( !posfound ) {

					if ( current.value.compareTo( x ) == 0 ) {
						current.counter += 1;
						posfound = true;
						System.out.println(
								"added equal: " + x + "/" + current.counter );

						// value < root => move to left
					} else if ( current.value.compareTo( x ) > 0 ) {

						if ( current.left == null ) {
							current.left = new Node< E >( x );
							current.left.counter += 1;
							posfound = true;
							System.out.println( "added to left: " + x + "/"
									+ current.left.counter );
						} else {
							current = current.left;
							System.out.println( "moved left" );
						}
					} else { // value > root => move to right

						if ( current.right == null ) {
							current.right = new Node< E >( x );
							current.right.counter += 1;
							posfound = true;
							System.out.println( "added to right: " + x + "/"
									+ current.right.counter );
						} else {
							current = current.right;
							System.out.println( "moved right" );
						}
					}
				}
			}
		}

	}

	@Override
	public boolean find( E x ) {

		if ( x == null ) {

			if ( noOfNullVal > 0 ) {
				return true;
			}
			return false;
		} else {
			Node< E > current = root;
			boolean found = false;

			System.out.println( "-----------------------------------------" );
			System.out.println( "for: " + x );

			while ( !found
					|| ( current.left != null && current.right != null ) ) {

				if ( current.value.compareTo( x ) == 0 ) {
					found = true;
					System.out.println( "found" );
					return true;
				} else if ( current.value.compareTo( x ) > 0 ) { // move to left

					if ( current.left == null ) {
						return false;
					} else {
						current = current.left;
						System.out.println( "moved left" );
					}
				} else { // move to right

					if ( current.right == null ) {
						return false;
					} else {
						current = current.right;
						System.out.println( "moved right" );
					}
				}
			}
		}

		return false;

	}

	@Override
	public boolean includesNull() {

		if ( noOfNullVal > 0 ) {
			return true;
		}
		return false;

	}

	private Node< E > minimumElement( Node< E > thisNode ) {

		if ( thisNode.left == null ) return thisNode;
		else {
			return minimumElement( thisNode.left );
		}

	}

	public Node< E > deleteThisElementInTree( Node< E > root, E payLoad ) {
		if ( root == null ) return null;

		if ( root.value.compareTo( payLoad ) > 0 ) { // see insert
			root.left = deleteThisElementInTree( root.left, payLoad );
		} else if ( root.value.compareTo( payLoad ) < 0 ) { // see insert
			root.right = deleteThisElementInTree( root.right, payLoad );
		} else {

			if ( root.counter > 1 ) {
				root.counter -= 1;
			} else {

				if ( ( root.left != null ) && ( root.right != null ) ) {
					Node< E > tmp = root;
					Node< E > minimumNodeOnRight = minimumElement( tmp.right );
					root.value = minimumNodeOnRight.value;
					root.counter = minimumNodeOnRight.counter;
					root.right = deleteThisElementInTree( root.right,
							minimumNodeOnRight.value );
				} else if ( root.left != null ) {
					root = root.left;
				} else if ( root.right != null ) {
					root = root.right;
				} else {
					root = null;
					
				}
			}
		}
		return root;

	}

	@Override
	public boolean delete( E x ) {
		Node< E > n = deleteThisElementInTree( root, x );

		if ( n == null ) {
			return false;
		} else {
			return true;
		}

	}

	public String getValuesStored( Node< E > root ) {
		String left = "";
		String right = "";

		if ( root.left == null && root.right == null ) {
			return root.value.toString() + "/" + root.counter;
		} else {

			if ( root != null ) {

				if ( root.left == null ) {
					left += "L: null ";
				} else {
					left += "L: " + getValuesStored( root.left ) + " ";
				}

				if ( root.right == null ) {
					right += "R: null ";
				} else {
					right += "R: " + getValuesStored( root.right ) + " ";
				}
				return "(" + left + " " + "<-[" + root.value + "/"
						+ root.counter + "]->" + " " + right + ")";

			} else {
				return "";
			}
		}


	}
	

    
    
 	
	public String toString() {

		return "soManyNullValues: "+ noOfNullVal + "\n" + getValuesStored( root );

	}

}

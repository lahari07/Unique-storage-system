
public class testStringBuild {
	public static void main(String[] args) {
//		BST< Integer > a  = new BST<Integer>();
//    	a.add( 1 );
//		a.add( null );
//		a.add( 10 );
//		a.add( 0 );
//		a.add( 0 );
//		a.add( 10 );
//		a.add( 100 );
//		a.add( null );
//		a.add( -1 );
//		a.add( 50 );
//		a.add( 150 );
//		a.add( 5 );
//		a.add( 2 );
//		a.add( 7 );
//		a.add( 9 );
//		
//		a.delete( 0 );
//		a.delete( 1 );
//				
//		System.out.println( a.find( -1 ) );
//		
//		System.out.println( "------------------------------" );
//		System.out.println( a );
		
		
	BST < String > aStorageInterfaceString =  new BST<String>();
	aStorageInterfaceString.add("1");
    aStorageInterfaceString.add("1");
    aStorageInterfaceString.add(new String("1"));

	System.out.println ( "1." + aStorageInterfaceString ) ;
	
    aStorageInterfaceString.delete(new String("1"));
    aStorageInterfaceString.delete("1");
    aStorageInterfaceString.delete ( "1" );
    System.out.println( "-----------------------" );
	System.out.println ( "1.1" + aStorageInterfaceString ) ;
	
//	aStorageInterfaceInteger.add ( null ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "20" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "30" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "10" ) ) ;
//
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "15" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "35" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "5" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "18" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "12" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "25" ) ) ;
//	aStorageInterfaceInteger.add ( Integer.valueOf ( "13" ) ) ;
//	System.out.println ( "3: " + aStorageInterfaceInteger ) ;
//	aStorageInterfaceInteger.delete ( Integer.valueOf ( "10" ) );
//	System.out.println ( "3:after delete :" + aStorageInterfaceInteger) ;

	
		
//		Node<Integer> n = new Node<Integer>(1);
//		System.out.println( n.compareTo( 3 ) );
		
	}
	
}




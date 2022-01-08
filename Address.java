/*
 * Address.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

/**
 * A class to stores the objects of Address class
 * 
 * @author      Lahari Chepuri
 * @author      Smita Subhadarshinee Mishra
 */

class Address implements Comparable< Address > {
	Integer houseNo;
	String addressLine1;
	String city;
	String state;
	Integer pincode;

	public Address( int houseNo, String addressLine1, String city, String state,
			int pincode ) {

		this.houseNo = houseNo;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.pincode = pincode;

	}

	/**
	 * returns a string representation of the object
	 * 
	 * @return  a string representation of the object  
	 */
	
	public String toString() {
		return "[" + "(" + "House no : " + this.houseNo + ")" + ", " + "("
				+ "Address : " + this.addressLine1 + ")" + ", " + "("
				+ "City : " + this.city + ")" + ", " + "(" + "state : "
				+ this.state + ")" + ", " + "(" + "pinCode: : " + this.pincode
				+ ")" + "]" + "\n";

	}

	/**
	 * compares two objects and returns an integer value based 	
	 * on the results of the comparison
	 * 
	 * @param  ad an object of Address class
	 * @return    0: if two objects are equal
	 * 			 -1: if this object is less than the one passed as argument	
	 * 			  1: if this object is greater than the one passed as argument
	 */
	
	@Override
	public int compareTo( Address ad ) {

		return this.houseNo.compareTo( ad.houseNo );

	}

}
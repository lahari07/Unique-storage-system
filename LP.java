/*
 * LP.java
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

public class LP implements Comparable<LP> {
	Integer releaseYear;
	String albumTitle;
	String bandName;
	float songsLength;
	Integer numberOfSongs;
	
	public LP(Integer releaseYear, String albumTitle, String bandName, float songsLength, Integer numberOfSongs) {
		
		this.releaseYear = releaseYear;
		this.albumTitle = albumTitle;
		this.bandName = bandName;
		this.songsLength = songsLength;
		this.numberOfSongs = numberOfSongs;
	}
	
	public Integer getReleaseYear() {
		return releaseYear;
	
	}
	public void setReleaseYear( Integer releaseYear ) {
		this.releaseYear = releaseYear;
	
	}
	public String getAlbumTitle() {
		return albumTitle;
	
	}
	public void setAlbumTitle( String albumTitle ) {
		this.albumTitle = albumTitle;
	
	}
	public String getBandName() {
		return bandName;
	
	}
	public void setBandName( String bandName ) {
		this.bandName = bandName;
	
	}
	public float getSongsLength() {
		return songsLength;
	
	}
	public void setSongsLength( float songsLength ) {
		this.songsLength = songsLength;
	
	}
	public Integer getNumberOfSongs() {
		return numberOfSongs;
	
	}
	public void setNumberOfSongs( Integer numberOfSongs ) {
		this.numberOfSongs = numberOfSongs;
	
	}
	
	/**
	 * compares two objects and returns an integer value based 	
	 * on the results of the comparison
	 * 
	 * @param  newLP  an object of LP class
	 * @return    	  0: if two objects are equal
	 * 			 	 -1: if this object is less than the one passed as argument	
	 * 			  	  1: if this object is greater than the one passed as argument
	 */
	
	@Override
	public int compareTo( LP newLP ) {
		if(this.releaseYear == newLP.getReleaseYear() ) {
			return 0;
		} 
		else if(this.releaseYear > newLP.getReleaseYear()) {
			return 1;
		}
		else {
			return -1;
		}

	}
	
	/**
	 * returns a string representation of the object
	 * 
	 * @return  a string representation of the object  
	 */
	
	public String toString() {
	
		return "[" + "(" + "Release Year : " + this.releaseYear + ")" + ", " + "("
		+ "Album Title : " + this.albumTitle + ")" + ", " + "("
		+ "Band Name : " + this.bandName + ")" + ", " + "("
		+ this.songsLength + ")" + ", " + "(" + "Number Of Songs: : " + this.numberOfSongs
		+ ")" + "]" + "\n";
	}
	
	
}

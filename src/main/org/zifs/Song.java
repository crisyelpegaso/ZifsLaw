package org.zifs;


public class Song implements Comparable<Song> {

	public String name;
	public double qi;
	
	public Song(String name, double qi){
		this.name = name;
		this.qi = qi;
	}

	@Override
	public int compareTo(Song o) {
		if (this.qi > o.qi) {
			return -1;
		} else if (this.qi == this.qi) {
			return 0;
		} 
		return 1;
	}
	
}

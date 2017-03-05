package org.zifs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ZifsApp {
	
	
	public static void main(String[] args) {
		
		/*
		 * 
			Sample input 1
			4 2
			30 one
			30 two
			15 three
			25 four
		 * */
//	
		
		int numberOfSongs = 15;
		int numberOfBestSongs = 3;
		String song1 = "197812 re_hash";
		String song2 = "78906 5_4";
		String song3 = "189518 tomorrow_comes_today";
		String song4 = "39453 new_genious";
		String song5 = "210492 clint_eastwood";
		String song6 = "26302 man_research";
		String song7 = "22544 punk";
		String song8 = "19727 sound_check";
		String song9 = "17535 double_bass";
		String song10 = "18782 rock_the_house";
		String song11 = "198189 19_2000";
		String song12 = "13151 latin_simone";
		String song13 = "12139 starshine";
		String song14 = "11272 slow_country";
		String song15 = "10521 m1_a1";
		
		List<String> songsIn = new ArrayList<String>();
		songsIn.add(song1);
		songsIn.add(song2);
		songsIn.add(song3);
		songsIn.add(song4);
		songsIn.add(song5);
		songsIn.add(song6);
		songsIn.add(song7);
		songsIn.add(song8);
		songsIn.add(song9);
		songsIn.add(song10);
		songsIn.add(song11);
		songsIn.add(song12);
		songsIn.add(song13);
		songsIn.add(song14);
		songsIn.add(song15);
		
		
		List<String> bestSongs = resolveBestSongsWithTreeSet(numberOfSongs, numberOfBestSongs, songsIn);
		Iterator<String> it = bestSongs.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	public static List<String> resolveBestSongsWithTreeSet(int numberOfSongs, int numberOfBestSongs, List<String> songsIn){
		SortedSet<Song> songs = new TreeSet<Song>();
		
		for (int i=0; i<numberOfSongs; i++){
			String[] splittedSong = songsIn.get(i).split(" ");
			int fi = Integer.parseInt(splittedSong[0]);

			String name = splittedSong[1];
			double zi = ((double) i / (double) numberOfSongs);
			double qi = fi * zi;
			Song song = new Song(name, qi);
			songs.add(song);
		}
	
		
		Iterator<Song> it = songs.iterator();
		int numberOfSongsFound = 0;
		List<String> bestSongs = new ArrayList<String>();
		while (it.hasNext() && numberOfSongsFound < numberOfBestSongs){
			Song currentSong = it.next();
			bestSongs.add(currentSong.name);
			numberOfSongsFound++;
		}
		return bestSongs;
	}
}

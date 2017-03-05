package org.zifs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ZifsAppTester {

	@Test
	public void testResolveBestSongsSimpleInput(){
		int numberOfSongs = 4;
		int numberOfBestSongs = 2;
		String song1 = "30 one";
		String song2 = "30 two";
		String song3 = "15 three";
		String song4 = "25 four";
		
		List<String> songsIn = new ArrayList<String>();
		songsIn.add(song1);
		songsIn.add(song2);
		songsIn.add(song3);
		songsIn.add(song4);
		
		List<String> bestSongsFound = ZifsApp.resolveBestSongsWithTreeSet(numberOfSongs, numberOfBestSongs, songsIn);
		List<String> expectedResult = Arrays.asList("four", "two");
		
		assertEquals(expectedResult, bestSongsFound);
	}
	
	@Test
	public void testResolveGorillazInput(){
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
		
		
		List<String> bestSongs = ZifsApp.resolveBestSongsWithTreeSet(numberOfSongs, numberOfBestSongs, songsIn);

		
		List<String> expectedResult = Arrays.asList("19_2000", "clint_eastwood", "tomorrow_comes_today");
		
		assertEquals(expectedResult, bestSongs);
	}
	
	@Test
	public void testInvalidInput(){
		//No expected exceptions or error
		List<String> bestSongs = ZifsApp.resolveBestSongsWithTreeSet(0, 0, null);
		assertNotNull(bestSongs);
		assertEquals(0, bestSongs.size());
		
	}
}

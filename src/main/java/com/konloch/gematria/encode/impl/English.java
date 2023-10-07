package com.konloch.gematria.encode.impl;

import com.konloch.gematria.Gematria;
import com.konloch.gematria.encode.Encoder;

import java.util.HashMap;

/**
 * @author Konloch
 * @since 10/7/2023
 */
public class English implements Encoder
{
	private static final HashMap<Character, Integer> map = new HashMap<>();
	
	static
	{
		map.put('a', 6);
		map.put('b', 12);
		map.put('c', 18);
		map.put('d', 24);
		map.put('e', 30);
		map.put('f', 36);
		map.put('g', 42);
		map.put('h', 48);
		map.put('i', 54);
		map.put('j', 60);
		map.put('k', 66);
		map.put('l', 72);
		map.put('m', 78);
		map.put('n', 84);
		map.put('o', 90);
		map.put('p', 96);
		map.put('q', 102);
		map.put('r', 108);
		map.put('s', 114);
		map.put('t', 120);
		map.put('u', 126);
		map.put('v', 132);
		map.put('w', 138);
		map.put('x', 144);
		map.put('y', 150);
		map.put('z', 156);
	}
	
	@Override
	public long encode(String phrase)
	{
		return Gematria.encode(phrase, map);
	}
}
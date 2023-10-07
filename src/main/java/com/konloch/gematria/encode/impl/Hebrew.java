package com.konloch.gematria.encode.impl;

import com.konloch.gematria.Gematria;
import com.konloch.gematria.encode.Encoder;

import java.util.HashMap;

/**
 * @author Konloch
 * @since 10/7/2023
 */
public class Hebrew implements Encoder
{
	private static final HashMap<Character, Integer> map = new HashMap<>();
	
	static
	{
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);
		map.put('g', 7);
		map.put('h', 8);
		map.put('i', 9);
		map.put('j', 600);
		map.put('k', 10);
		map.put('l', 20);
		map.put('m', 30);
		map.put('n', 40);
		map.put('o', 50);
		map.put('p', 60);
		map.put('q', 70);
		map.put('r', 80);
		map.put('s', 90);
		map.put('t', 100);
		map.put('u', 200);
		map.put('v', 700);
		map.put('w', 900);
		map.put('x', 300);
		map.put('y', 400);
		map.put('z', 500);
	}
	
	@Override
	public long encode(String phrase)
	{
		return Gematria.encode(phrase, map);
	}
}
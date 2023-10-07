package com.konloch.gematria.encode.impl;

import com.konloch.gematria.Gematria;
import com.konloch.gematria.encode.Encoder;

import java.util.HashMap;

/**
 * @author Konloch
 * @since 10/7/2023
 */
public class Simple implements Encoder
{
	private static final HashMap<Character, Integer> map = new HashMap<>();
	
	static
	{
		char letter = 'a';
		for (int i = 1; i <= 26; i++)
		{
			map.put(letter, i);
			letter++;
		}
	}
	
	@Override
	public long encode(String phrase)
	{
		return Gematria.encode(phrase, map);
	}
}

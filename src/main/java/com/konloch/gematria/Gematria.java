package com.konloch.gematria;

import com.konloch.gematria.encode.Encoder;
import com.konloch.gematria.encode.impl.English;
import com.konloch.gematria.encode.impl.Hebrew;
import com.konloch.gematria.encode.impl.Simple;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Konloch
 * @since 10/7/2023
 */
public enum Gematria
{
	HEBREW(new Hebrew()),
	ENGLISH(new English()),
	SIMPLE(new Simple()),
	;
	
	private final Encoder encodingMethod;
	
	Gematria(Encoder encodingMethod)
	{
		this.encodingMethod = encodingMethod;
	}
	
	public long encode(String phrase)
	{
		return encodingMethod.encode(phrase.toLowerCase());
	}
	
	public static void main(String[] args)
	{
		if(args == null || args.length < 2)
		{
			System.out.println("Missing program arguments: 'english hello world'");
			System.out.println("The first argument is encoding method, the rest is the phrase.");
			System.exit(1);
			return;
		}
		
		String encodingMethod = args[0];
		String phrase = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
		
		for(Gematria gematria : values())
		{
			if(gematria.name().toLowerCase().equalsIgnoreCase(encodingMethod))
			{
				System.out.println(gematria.encode(phrase));
				return;
			}
		}
		
		System.out.println("Could not find supplied encoding method.");
		System.out.println("Example program arguments: 'english hello world'");
		System.out.println("The first argument is encoding method, the rest is the phrase.");
		System.exit(1);
	}
	
	public static long encode(String phrase, HashMap<Character, Integer> map)
	{
		long sum = 0;
		char[] characters = phrase.toLowerCase().toCharArray();
		for(char character : characters)
		{
			Integer value = map.get(character);
			
			//if the character is not mapped the value is 0
			if(value != null)
				sum += value;
		}
		return sum;
	}
}

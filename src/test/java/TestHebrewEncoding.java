import com.konloch.gematria.Gematria;

/**
 * @author Konloch
 * @since 10/7/2023
 */
public class TestHebrewEncoding
{
	public static void main(String[] args)
	{
		long encoded = Gematria.HEBREW.encode("Hello World");
		System.out.println("Hello World[HEBREW]: " + encoded);
		assert encoded == 1157;
	}
}

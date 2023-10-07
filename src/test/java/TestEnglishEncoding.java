import com.konloch.gematria.Gematria;

/**
 * @author Konloch
 * @since 10/7/2023
 */
public class TestEnglishEncoding
{
	public static void main(String[] args)
	{
		long encoded = Gematria.ENGLISH.encode("Hello World");
		System.out.println("Hello World[ENGLISH]: " + encoded);
		assert encoded == 744;
	}
}

import com.konloch.gematria.Gematria;

/**
 * @author Konloch
 * @since 10/7/2023
 */
public class TestSimpleEncoding
{
	public static void main(String[] args)
	{
		long encoded = Gematria.SIMPLE.encode("Hello World");
		System.out.println("Hello World[SIMPLE]: " + encoded);
		assert encoded == 124;
	}
}

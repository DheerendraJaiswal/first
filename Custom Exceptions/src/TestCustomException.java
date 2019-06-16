public class TestCustomException 
{
	public static void main(String[] args) {
		int age = 5;
		if(age<10)
		{
			throw new ABC("too young exc"); 
		}
	}
}

class ABC extends RuntimeException
{
	public ABC(String s) {
		super(s);
	}
}
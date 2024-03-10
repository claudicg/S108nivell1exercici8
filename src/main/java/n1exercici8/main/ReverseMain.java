package n1exercici8.main;

public class ReverseMain {

	public static void main(String[] args) {
		
		IReverse rev = (str)-> {return new StringBuilder().append(str).reverse().toString();};
		System.out.println(rev.reverse("Avuí és dimarts"));		
	}
	
	@FunctionalInterface
	interface IReverse{
		
		String reverse(String str);
	}
}
	
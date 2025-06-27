package methodchaining;

public class ParentClas {
	public ParentClas reverse(String str) {
		System.out.println(new StringBuilder(str).reverse());
		return this;
	}
}

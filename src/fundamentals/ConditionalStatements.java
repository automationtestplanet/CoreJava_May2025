package fundamentals;

public class ConditionalStatements {

	public static void main(String[] args) {
		int a = 100;
		
		int b = 400;
		
		if(a>b) {
			System.out.println(a);
		}
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		if(a>b) {
			System.out.println(a);
		}else if(b==a){
			System.out.println(b);
		}else {
			System.out.println("No result");
		}
		
		if(a>b) {
			if(a==100) {
				System.out.println(a);
			}else {
				System.out.println("A value is not 100");
			}
		}else {
			if(b==200) {
				System.out.println(b);
			}else {
				System.out.println("B value is not 200");
			}
		}
		
		int value = 30;
		
		switch (value) {
			case 10: 
				System.out.println(value);
				break;
				
			case 20: 
				System.out.println(value);
				break;
			default:
				System.out.println("No Match Found");
				break;
			
		}
		
		String str = "Java";
		switch (str) {
		case "Hello": 
			System.out.println(str);
			break;
			
		case "Java": 
			System.out.println(value);
			break;
		default:
			System.out.println("No Match Found");
			break;
		
	}
		
		
	}

}

package fundamentals;

public class StaticAndInstanceData {

	int a = 100;

	static int b = 200; // memory will be allocated by JVM while loading the class
						// JVM can allocate memory only one time
	
	public StaticAndInstanceData(){
		
	}
	
	public void display1() {  // Instance Method
		System.out.println(a);
	} 
	
	public static void display2() {  // static Method
		System.out.println(b);
	} 
	
	public void display3() {  // static Method
		System.out.println(this.a);
		this.display1();
		System.out.println(StaticAndInstanceData.b);
		StaticAndInstanceData.display2();
//		System.out.println(c);  // local variable of main method
	} 
	
	public static void display4() {  // static Method
		System.out.println(StaticAndInstanceData.b);
		StaticAndInstanceData.display2();
//		System.out.println(this.a);  // Instance data can not access in static methods
//		this.display1();  // Instance data can not access in static methods
//		System.out.println(c); // local variable of main method
		
		StaticAndInstanceData staticIns1 = new StaticAndInstanceData();
		System.out.println(staticIns1.a);
		staticIns1.display1();
	} 

	public static void main(String[] args) {
		
//		System.out.println(a); // Can not access, memory is not allocated
		
		System.out.println(b); // Can access, memory allocated by JVM
		
		display4();
		
		StaticAndInstanceData staticIns1 = new StaticAndInstanceData();
		
		StaticAndInstanceData staticIns2 = new StaticAndInstanceData();
		
		StaticAndInstanceData staticIns3 = new StaticAndInstanceData();
		
		System.out.println(staticIns1);
		
		System.out.println(staticIns1.a);
		
//		display1(); // instance method
		
		staticIns1.display1();
		
		display2(); // static method
		
		System.out.println("--------------------------------------------------------");
		
		staticIns1.a = 300; 
		
		staticIns1.display1(); // 300
		
		staticIns2.display1(); // 100
		
		staticIns3.display1(); // 100
		
		
		System.out.println(staticIns1.b);
		staticIns1.display2();
		
		System.out.println(staticIns2.b);
		staticIns2.display2();
		
		System.out.println(staticIns3.b);
		staticIns3.display2();
		
		staticIns1.b = 400; 
		
		staticIns1.display2(); // 400
		
		staticIns2.display2(); // 400
		
		staticIns3.display2(); // 400
		
		
		System.out.println("---------------------Access Static Intance ----------------------------");
		
		System.out.println(StaticAndInstanceData.b);
		StaticAndInstanceData.display2();
		
		int c = 500;
		System.out.println(c);
		
//		this.display1();  // We can not use 'this' keyword inside static method
		
		

	}

}

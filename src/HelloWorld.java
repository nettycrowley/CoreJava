
public class HelloWorld {
	// member variables
	
	//member functions / method
	
	//main method - this will start the project
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		double d = Math.random();
		
		System.out.println("The random no is: " + d);
		
		//int i = 0;
		int j = 100;
		double f = 1.0;
		double d2 = 3.14159;
		int my_int = 100; 
		
		int aLowerCamelCaseVariable = 100;
		
		//int answer = i + 100;
		
		boolean b = true;
		
		boolean c = false;
		
		String s ="this is a string";
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.length());
		
		int[] iArray = new int[10];
		
		int[] iArray2 = {1,2,3,4,5};
		
		String[] months = {"jan", "feb", "mar", "apr", 
							"may", "jun", "jul", "aug", 
							"sep", "oct", "nov", "dec"};
		
		for (int i = 0; i<months.length; i++){
			
			System.out.println(months[i]);
		}
		
		int i = 0; 
		while (i < months.length) {
			
			System.out.print(months[i] + " ");
			i++;
		}
		
		System.out.println();//move to the next line
		
		i = 0;
		do {
			System.out.print(months[i] + " ");
			i++;
		} while (i< months.length);
		System.out.println();
		
		//same loop backwards
		i=11;
		do{
			System.out.print(months[i] + " ");
			i--;
			
			if(i==2 || i == 5 || i == 8 || i == 11){
				System.out.println();
			}
			
			boolean answer = true;
			if (i == 2 && answer == false){
				
			}
		} while (i>=0);
	}

}

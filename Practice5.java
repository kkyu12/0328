package Mar28th;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 3, z = 5;
		System.out.println(x == y);		//true
		System.out.println(x != y);		//false
		System.out.println(x > y);		//false
		System.out.println(x < z);		//true
		System.out.println(x >= z);		//false
		System.out.println(y >= z);		//false
		System.out.println();
		
		x = 10;
		y = 20;
		System.out.println(x < 5 && y > 10);		//false
		System.out.println(x < 5 || y > 10);		//true
		System.out.println(!(x < 5 && y > 10));		//true

	}

}

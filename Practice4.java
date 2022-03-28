package Mar26th;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		System.out.println(x);		// 7

		x += 3;
		System.out.println(x);		// 10
		x -= 3;
		System.out.println(x);		// 7
		x *= 3;
		System.out.println(x);		// 21
		x /= 3;
		System.out.println(x);		// 7
		x %= 3;
		System.out.println(x);		// 1
		x = 10;
		System.out.println(x);		// 10
		x &= 3;
		System.out.println(x);		// 2
		x |= 3;
		System.out.println(x);		// 3
		x = 10;
		System.out.println(x);		// 10
		x ^= 3;
		System.out.println(x);		// 9
		x >>= 3;
		System.out.println(x);		// 1
		x <<= 3;
		System.out.println(x);		// 8

		x = 12;
		x *= 3;							// 36
		System.out.println(++x);		// 37
		System.out.println(++x);		// 38

		x = 12;
		x /= 3;							// 4
		System.out.println(x--);		// 4
		System.out.println(--x);		// 2

	}

}

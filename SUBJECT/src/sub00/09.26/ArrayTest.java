import java.util.Arrays;

class  ArrayTest
{
	public static void main(String[] args) 
	{
		int[] a = new int[]{10, 20, 30, 40, 50};
		int[] b;
		int[] c;

		b = Arrays.copyOf(a, a.length);
		for(int i = 0;i<a.length;i++){
			System.out.println(b[i]);
		}
		c = a;
		for(int i = 0;i<a.length;i++){
			System.out.println(c[i]);
		}

		b[2] = 0;
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}

		c[2] = 0;
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
}
package test11;

public class Snippet {
	public static void main(String[] args) {
		int a[] = {5, 9, 3, 4, 7, 2, 1};
		int b[] = a;
		for (int i=0; i<a.length; i++) {
			if (b[i]%2 == 1) {
				b[i] = i;
			}
			System.out.println(a[i] + " ");
		}
	}

}

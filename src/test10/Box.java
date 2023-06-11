package test10;

public class Box {
	
		int w;
		int h;
		int l;
		int v;
		void volume(int h, int l, int w) {
			v = w*h*l;
		}
	}

/*public class Parameterized_method{
*		public static void main(String[] args) {
			Box obj = new Box();
			obj.h=1;
			obj.l=5;
			obj.w=5;
			obj.volume(3,2,1);
			System.out.println(obj.v);
		}
}
*/
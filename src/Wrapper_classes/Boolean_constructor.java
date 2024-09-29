package Wrapper_classes;

public class Boolean_constructor {
// 2 const 
	//- 1.primitive 
	//- 2.String---> loophole
	public static void main(String[] args) {
		Boolean x = new Boolean("yes");
		Boolean y = new Boolean("no");
		System.out.println(x);
		System.out.println(y);
		System.out.println(x.equals(y));

		Boolean x1 = new Boolean("left");
		Boolean y1 = new Boolean("right");
		System.out.println(x1.equals(y));

	}

}

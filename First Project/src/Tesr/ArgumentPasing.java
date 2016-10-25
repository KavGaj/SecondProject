package Tesr;

public class ArgumentPasing {
	public static void main (String args[])
	{
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.DimensionsSet(10, 10, 20);
		box2.DimensionsSet(20, 20, 30);
		
		double vol1 = box1.voulme();
		double vol2 = box2.voulme();
		System.out.println("Box 1 volume is :" + vol1);
		System.out.println("Box 2 volume is :" + vol2);
	}
}

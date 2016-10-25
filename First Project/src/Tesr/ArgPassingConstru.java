package Tesr;

public class ArgPassingConstru {
	public static void main (String args[])
	{
		BoxConstructor box1 = new BoxConstructor(10, 10, 10);
		BoxConstructor box2 = new BoxConstructor(20, 20, 10);
		
		double vol1 = box1.volume();
		double vol2 = box2.volume();
		
		System.out.println(vol1);
		System.out.println(vol2);
	}

}

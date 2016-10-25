package Tesr;

public class Box {
	double width;
	double height;
	double depth;
	
	public void DimensionsSet(double w, double h, double d)
		{
			width =w;
			height = h;
			depth = d;
		}
	public double voulme ()
	{
		return width * height * depth;
	}
}

package Tesr;

public class BoxConstructor {
	double width;
	double height;
	double depth;
	
	BoxConstructor (double w, double h, double d)
	{
		width =w;
		height =  h;
		depth = d;
	}
	
	public  double volume ()
	{
		double vol;
		vol =   width * height * depth;
		return vol;
	}
}

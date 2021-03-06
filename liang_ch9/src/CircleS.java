
public class CircleS
{
	/** The radius of the circle */
	double radius;

	/** The number of the objects created */
	static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	CircleS()
	{
		radius = 1.0;
		CircleS.numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	CircleS(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return numberOfObjects */
	static int getNumberOfObjects()
	{
		return numberOfObjects;
	}

	/** Return the area of this circle */
	double getArea()
	{
		return radius * radius * Math.PI;
	}
}

package Lab8;

public class CircleWithException {
    double radius,area,diameter;
    public CircleWithException(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        if(radius <= 0)
        {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        else
        {
            this.radius = radius;
        }
    }

    public double getArea() throws Exception {
        area = Math.PI*radius*radius;
        if (area > 1000)
        {
            throw new Exception("Exception");
        }
        else
        {
            return area;
        }

    }

    public double getDiameter()
    {
        return (2*radius);
    }
}

import java.util.Scanner;
public class SquareRoom extends Room{

    private double width,length,height;
    Scanner input;
    private double wallArea;
    private double paintRequired;
    private double volume;
    private double floorArea;

	public SquareRoom(){
		input = new Scanner(System.in);
        setWidth();
        setLength();
        setHeight();
        wallArea = ((length * height) + (width*height)) * 2;
        //This assumes that there is 1 standard door and no windows.
        paintRequired = (wallArea - doorArea) * litresPerSquareMetre;
        floorArea = width*length;
        volume = floorArea*height;
	}

    public void setWidth(){
    	System.out.print("Enter room width in metres: ");
		width = enterDouble(doorWidth);
	}

	public double getWidth(){
		return width;
	}

    public void setLength(){
    	System.out.print("Enter room length in metres: ");
		length = enterDouble(doorWidth);
	}

	public double getLength(){
		return length;
	}

    public void setHeight(){
    	System.out.print("Enter room height in metres: ");
		height = enterDouble(doorHeight);
	}

	public double getHeight(){
		return height;
	}

	public double getWallArea(){
		return wallArea;
	}

	public double getPaintRequired(){
		return paintRequired;
	}
 
    public double getFloorArea(){
    	return floorArea;
    }

	public double getVolume(){
		return volume;
	}

	private double enterDouble(double limit){
		double d;
        while (true) {
            try {
                d = Double.parseDouble(input.next());
                if (d< limit){
                	throw new IllegalArgumentException();
                }
                break; 
            }
            catch (Exception e) {
                System.out.print("Enter a positive value no less than " + limit + ": ");
            }
	    }
	    return d;
	}

}
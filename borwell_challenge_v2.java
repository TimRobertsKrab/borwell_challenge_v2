public class borwell_challenge_v2{

	public static void main(String[] args){
        SquareRoom room = new SquareRoom();

        System.out.println("\nFloor area = " + room.getFloorArea() + "m^2");
        System.out.println("Litres of paint required to paint the walls with 1 coat = " + room.getPaintRequired()+ " litres");

        System.out.println("Volume = " + room.getVolume() + "m^3");

	}
}
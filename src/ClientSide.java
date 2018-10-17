
public class ClientSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tour passenger1 = new FirstClassDecorator(new EuropeTour());
		System.out.println("Passenger 1 will pay " + passenger1.cost());
		passenger1.getDesc("Passenger 1");	
		System.out.println();
		Tour passenger2 = new AviaTourDecoration(new USATour());
		System.out.println("Passenger 2 will pay " + passenger2.cost());
		passenger2.getDesc("Passenger 2");	
		
		passenger2 = new FirstClassDecorator(passenger2);
		System.out.println("Passenger 2 will pay " + passenger2.cost());
	}

}

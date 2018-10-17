
public class AviaTourDecoration extends TourDecoration {

	Tour tour;
	public  AviaTourDecoration(Tour tour) {
		// TODO Auto-generated constructor stub
		this.tour = tour;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return tour.cost() + 150;
	
	}

	@Override
	public void getDesc(String name) {
		// TODO Auto-generated method stub
		tour.getDesc(name);
		System.out.println("This " + name +" will use just airplane tickets");
	}


}

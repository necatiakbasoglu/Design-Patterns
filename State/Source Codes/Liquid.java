public class Liquid implements IWaterState {
	private Water water;
	
	public Liquid(Water water) {
		this.water = water; 
	}
	@Override
	public void increaseHeat() {
		// TODO Auto-generated method stub
		System.out.println("In Liquid state heat is increased, water state will changed to gas");
		water.setState(new Gas(water));
	}

	@Override
	public void decreaseHeat() {
		// TODO Auto-generated method stub
		System.out.println("In Liquid state heat is decrease, water state will changed to solid");
		water.setState(new Solid(water));
	}

}
public class Solid implements IWaterState {
	private Water water;
	
	public Solid(Water water) {
		this.water = water; 
	}
	@Override
	public void increaseHeat() {
		// TODO Auto-generated method stub
		System.out.println("In Solid state heat is increased, water state will changed to liquid");
		water.setState(new Liquid(water));
	}

	@Override
	public void decreaseHeat() {
		// TODO Auto-generated method stub
		System.out.println("In Solid state heat is decrease, water state will not changed");
		
	}

}
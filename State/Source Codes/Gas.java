public class Gas implements IWaterState {
	private Water water;
	
	public Gas(Water water) {
		this.water = water; 
	}
	@Override
	public void increaseHeat() {
		// TODO Auto-generated method stub
		System.out.println("In Gas state heat is increased, water state will not changed");
	}

	@Override
	public void decreaseHeat() {
		// TODO Auto-generated method stub
		System.out.println("In Gas state heat is decrease, water state will changed to liquid");
		water.setState(new Liquid(water));
	}

}
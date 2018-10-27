public class Water {
	private IWaterState waterState;
	
	public Water() {
		waterState = new Liquid(this);
	}
	
	public void increaseHeat() {
		waterState.increaseHeat();
	}
	
	public void decreaseHeat() {
		waterState.decreaseHeat();
	}
	
	public void setState(IWaterState waterState) {
		this.waterState = waterState;
	}
}
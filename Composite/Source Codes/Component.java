public abstract class Component{
	private String name;
	
	public abstract int size();
	
	public void setName(String name){
		this.name  =name;
	}
	
	public String getName(){
		return name;
	}
}
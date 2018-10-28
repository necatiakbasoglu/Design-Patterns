public class File extends Component{
	private int size;
	
	public File(){
		super.setName(null);
		setSize(0);
	}
	
	public File(String name,int size){
		super.setName(name);
		setSize(size);
	}
	
	@Override
	public int size(){
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
}
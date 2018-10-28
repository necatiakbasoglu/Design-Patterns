import java.util.List;
import java.util.ArrayList;

public class Directory extends Component{
	private List<Component> components;
	
	public Directory(){
		super.setName(null);
		components = new ArrayList<Component>();
	}
	
	public Directory(String name){
		super.setName(name);
		components = new ArrayList<Component>();
	}
	
	public void addComponent(Component c){
		components.add(c);
	}
	
	public void removeComponent(Component c){
		components.remove(c);
	}
	
	@Override
	public int size(){
		int size = 0;
		for(Component c : components){
			size += c.size();
		}
		return size;
	}
}
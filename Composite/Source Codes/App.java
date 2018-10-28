public class App{
	public static void main(String args[]){
		/*
			-root
			 -dir1
				-file1 --10
				-file2 --20
				-file3 --30
			 -dir2
				-file4 --40
				-file5 --50
			 -file6    --60
			 
			 root size = 210
			 dir1 size = 60
			 dir2 size = 90
		*/
		
		Directory root = new Directory("Root");
		Directory dir1 = new Directory("Directory 1");
		Directory dir2 = new Directory("Directory 2");
		Component file1 = new File("File 1",10);
		Component file2 = new File("File 1",20);
		Component file3 = new File("File 1",30);
		Component file4 = new File("File 1",40);
		Component file5 = new File("File 1",50);
		Component file6 = new File("File 1",60);
		//add dir1 files
		dir1.addComponent(file1);
		dir1.addComponent(file2);
		dir1.addComponent(file3);
		//add dir2 files
		dir2.addComponent(file4);
		dir2.addComponent(file5);
		//add root files
		root.addComponent(file6);
		root.addComponent(dir1);
		root.addComponent(dir2);
		
		//dir1 size
		System.out.println("Size of "+dir1.getName()+" is : "+dir1.size());
		
		//dir2 size
		System.out.println("Size of "+dir2.getName()+" is : "+dir2.size());
		
		//root size
		System.out.println("Size of "+root.getName()+" is : "+root.size());
		
	}
}
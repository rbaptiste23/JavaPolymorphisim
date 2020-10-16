
public class App {

	public static void main(String[] args) {
		// Polymorphism = Many Shapes
		// You can always use the child class where you can use the Parent class
		
		Plant plant1 = new Plant();
		Tree tree = new Tree(); 
	  
		 
		
		Plant plant2 = tree;
		plant2.grow();
		
		
		tree.shedLeaves();
		//plant2.shedLeaves();
		
		
		//Plant plant3; 
		//plant3.grow();
		
		doGrow(tree);
	

	}
	
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	

}

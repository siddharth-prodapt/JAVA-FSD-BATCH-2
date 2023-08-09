import java.util.ArrayList;
import java.util.Scanner;



interface DigitalTree{
	void absorbSunlight(int hours);
	void getTreeDetails();
}


class BinaryTree implements DigitalTree{
	private String name;
	private int energy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	@Override
	public void absorbSunlight(int hours) {
		this.energy = 2*hours;
		
	}
	
	@Override
	public void getTreeDetails() {
		System.out.println(this.name+ " - Energy: "+ this.energy);
		
	}
}
class QuantumTree implements DigitalTree{
	String name;
	int energy;
	@Override
	public void absorbSunlight(int hours) {
		this.energy = 3*(hours*hours);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	@Override
	public void getTreeDetails() {
		System.out.println(this.name+ " - Energy: "+ this.energy);
	}
	
}


class NeutralTree implements DigitalTree{
	String name;
	int energy;
	@Override
	public void absorbSunlight(int hours) {
		
		this.energy = (hours*hours*hours);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	@Override
	public void getTreeDetails() {
		// TODO Auto-generated method stub
		System.out.println(this.name+ " - Energy: "+ this.energy);
	}
	
}



class ForestManagerClass {
	static ArrayList<BinaryTree> binaryTreeList = new ArrayList<>();
	static ArrayList<QuantumTree> quantumTreeList = new ArrayList<>();
	static ArrayList<NeutralTree> neutralTreeList = new ArrayList<>();
	
	void addTreesToForest() {
		Scanner sc = new Scanner(System.in);
		String name;
		int options = -1;
		
		do {
		System.out.println("1. Binary Tree\n2. Quantum Tree\n3. Neutral Tree\n4. Exit");
		options = sc.nextInt();
		
		switch(options) {
		case 1: 
			BinaryTree bt = new BinaryTree();
			System.out.println("Enter Name of Tree: ");
			sc.nextLine();
			name = sc.nextLine();
			bt.setName(name);
			
			binaryTreeList.add(bt);
		break;
		
		case 2: 
			QuantumTree qt = new QuantumTree();
			System.out.println("Enter Name of Tree: ");
			sc.nextLine();
			name = sc.nextLine();
			qt.setName(name);
			
			quantumTreeList.add(qt);
			
			break;
		case 3: 
			NeutralTree nt = new NeutralTree();
			System.out.println("Enter Name of Tree: ");
			sc.nextLine();
			name = sc.nextLine();
			nt.setName(name);
			
			neutralTreeList.add(nt);
			break;
			
		default: System.out.println("Enter correct Option");
		}
		}while(options !=4);
	}
	
		
	
	
	void produceEnergyForForest(int hours) {
		int totalHours = 0;
		
		for(BinaryTree ele: binaryTreeList) {
			ele.absorbSunlight(hours);
			totalHours+=ele.getEnergy();
		}
		for(QuantumTree ele: quantumTreeList) {
			ele.absorbSunlight(hours);
			totalHours+=ele.getEnergy();
		}
		for(NeutralTree ele: neutralTreeList) {
			ele.absorbSunlight(hours);
			totalHours+=ele.getEnergy();
		}
		System.out.println("Total Energy Produced: "+totalHours);
	}
	void getForestReport() {
		for(BinaryTree ele: binaryTreeList) {
			ele.getTreeDetails();
		}
		for(QuantumTree ele: quantumTreeList) {
			ele.getTreeDetails();
		}
		for(NeutralTree ele: neutralTreeList) {
			ele.getTreeDetails();
		}
	}
		
}



public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ForestManagerClass ob = new ForestManagerClass();
		
		Scanner sc = new Scanner(System.in);
		int option = -1;
		do {
			System.out.println("1. Add Trees\n2. Produce Energy\n 3. Get Report");
			System.out.print("Select Option: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1: 
				ob.addTreesToForest();
				break;
			case 2: {
				System.out.println("Enter Hours: ");
				int hours = sc.nextInt();
				ob.produceEnergyForForest(hours);
				break;
			}	
			case 3: 
				ob.getForestReport();
				break;
			}
			
		}while(option!=4);
	}
}

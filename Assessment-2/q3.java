import java.util.ArrayList;
import java.util.Scanner;

interface MenuItem{
	
}

class Sandwich implements MenuItem{
	String name;
	double price;
	
}
class Salad implements MenuItem{
	String name;
	double price;
	
}
class Drink implements MenuItem{
	String name;
	double price;
	
}
class Trio implements MenuItem{
	private String trioName;
	private double trioAmount;
	Trio(){}
	
	Trio(String trioName, double trioAmount){
		this.trioName = trioName;
		this.trioAmount = trioAmount;
	}	
	
	public String getTrioName() {
		return trioName;
	}
	public void setTrioName(String trioName) {
		this.trioName = trioName;
	}
	public double getTrioAmount() {
		return trioAmount;
	}
	public void setTrioAmount(double trioAmount) {
		this.trioAmount = trioAmount;
	}
}

class MenuItemDriver{
	static ArrayList<String> trioName = new ArrayList<String>();
	static ArrayList<Double> trioPrice = new ArrayList<Double>(); 
	
	void selectBurger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. CheeseBurger - $2.75\n2. Club Sandwich - $ 2.75");
		System.out.println("Enter Option to Select: ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1: 
			trioName.add("CheeseBurger");
			trioPrice.add(2.75);
			break;
		case 2:
			trioName.add("ClubSandwich");
			trioPrice.add(2.75);
			break;
		}
	}
	
	void selectSalad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Spinach salad - $1.15\n2. Coleslaw - $3.50");
		System.out.println("Enter Option to Select: ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1: 
			trioName.add("Spinach salad");
			trioPrice.add(1.15);
			break;
		case 2:
			trioName.add("Coleslaw");
			trioPrice.add(3.50);
			break;
		}
	}
	
	void selectDrink() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Orange Soda - $1.15\n Cappuccino - $2.30");
		System.out.println("Enter Option to Select: ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1: 
			trioName.add("Orange Soda");
			trioPrice.add(1.15);
			
			break;
		case 2:
			trioName.add("Cappuccino");
			trioPrice.add(2.30);
			break;
		}
	}
	
	void displayTrio() {
		double Min = trioPrice.get(0);
		int minIndex = 0;
		double sum = 0;
		for(int i = 0;i<trioPrice.size(); i++) {
			if(trioPrice.get(i) < Min) {
				Min = trioPrice.get(i);
				minIndex = i;
			}
				sum+=trioPrice.get(i);
		}
		
		sum = sum - trioPrice.get(minIndex);
		
		System.out.println("Selected Items: ");
		System.out.println("NAME: ");
		trioName.stream().forEach(ele -> System.out.print(ele + "/"));
		System.out.println("\nPRICE: "+ sum);	
	}
	
	void display() {
		Scanner sc = new Scanner(System.in);
		int option = -1;
		do {
			System.out.println("1. Sandwich\n2. Salads\n3. Drinks \n4.DisplayTrio");
			System.out.println("Select Option: ");
			option = sc.nextInt();
		
			switch(option) {
			case 1: selectBurger();
			break;
			case 2: selectSalad();
			break;
			case 3: selectDrink();
				break;
			case 4: displayTrio();
			break;
			case 5: System.out.println("Thank You");
			}
		}while(option!=5);
	}
}


public class q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuItemDriver ob = new MenuItemDriver();
		ob.display();
	}
}

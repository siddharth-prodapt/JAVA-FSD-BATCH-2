import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	void qns1() {
//		Marathon Runner
		int option = 0;
		int i = -1;
		int remainingDistance;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a starting distance(Between 5 to 8 km): ");
			option = sc.nextInt();
			if(option>5 && option<8) {
				for( i = option; i>=0; i--) {
					if(i!=0) {
						System.out.println("Distance to run : "+i);	
					}
					
					if((option-1) == i) {
						System.out.println("Good Start! Keep it Up");
					}
					if(i <3) {
						if(i!=0)
							System.out.println("Almost There !");
					}
					if(i == 0) {
						System.out.println("Done for the day!");
						break;
					}
					
				}
			}else {
				System.out.println("Sorry!, choose between 5km to 8km");
				
			}
			
		}while(i != 0);
		
	}

	void qns3() {
//		developer of game company
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		
		int[] treasures = new int[size];
		
		for(int i = 0; i<size; i++) {
			treasures[i] = sc.nextInt();
		}
		
		System.out.println("Treasures: "+Arrays.toString(treasures));
		
		int sum = 0;
		
		for(int i = 0; i<size; i++) {
			sum = sum + treasures[i];
		}
		
		if((sum%2) ==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	
	void qns2() {
		System.out.println("Question 2");
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int maxSum = Integer.MIN_VALUE;
		int currentSum = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			currentSum = Math.max(arr[i], (currentSum+arr[i]) );
			maxSum = Math.max(currentSum, maxSum);
			if(maxSum < 0) {
				maxSum = 0;
			}
		}
		System.out.println("Max Sum : "+ maxSum);
		
	}
	
		
	public int qns4() {
			
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
		int size = arr.length;
	        
	    int jumps[] = new int[size];
	        
	    int index, j;
	 
	        
	        if (size == 0 || arr[0] == 0)
	            return Integer.MAX_VALUE;
	        
	 
	        jumps[0] = 0;
	 
	        for (index = 1; index < size; index++) {
	            jumps[index] = Integer.MAX_VALUE;
	            for (j = 0; j < index; j++) {
	                if (index <= j + arr[j]
	                    && jumps[j] != Integer.MAX_VALUE) {
	                    jumps[index]
	                        = Math.min(jumps[index], jumps[j] + 1);
	                    break;
	                }
	            }
	        }
	        return jumps[size - 1];
	    }
	
	
	void qns5() {
		String[] students = {"John", "Alice", "Zack", "Bella", "Edward"};
		
		for(int i = 0; i<students.length; i++) {
			for(int j = i+1; j< students.length ; j++) {				
				if( students[i].compareTo(students[j]) > 0) {
//					swap
					String temp ;
					
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
					
//					System.out.println(Arrays.toString(students));
				}
			}
		}
		
		System.out.println("Students : "+ Arrays.toString(students));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob = new Test();
//		ob.qns1();
//		ob.qns3();
//		ob.qns2();
//		ob.qns5;
//		System.out.println(ob.qns4());
		
		
	}

}

/*Daniel J. Gallegos
  WorldCup assignment
  Professor Chatterjee
  Data Structures CSC311
  2/22/2016*/






import java.util.*;
public class WCArrayList1 implements WCArrayList{	
	
	int size;
	int capacity;
	String[] myArray;
	String error;
	int[] position;
	int[][] scoreArray;
	
	
	public WCArrayList1(){		//default constructor
	myArray = new String[8];
	this.size = 0;				//this is how many elements are in the array currently
	this.capacity = 8; 		//this is the total space of the array
	this.error = "Error";
	position = new int[8];
	scoreArray = new int[8][2];
	}

	public WCArrayList1(int beginSize){		//arguement constructor
	myArray = new String[beginSize];
	this.size = 0;
	this.capacity = beginSize;
	this.error = "Error";
	position = new int[beginSize];
	scoreArray = new int[beginSize][beginSize];
	
	}
		public void reallocate(){
		//
		this.capacity *=2;
		String[] tmp = new String [this.capacity];		//this creates an array double the size
		//code to copy array data
		for(int i = 0; i < myArray.length; i++){
			tmp[i] = myArray[i];
		}
		this.myArray = tmp;
	}
	
	public void add(String a){
		// method adds the data at the end
		if(size < capacity){
			myArray[size] = a;
			size++;
		}
		else{
			System.out.println("Reallocate called");
			this.reallocate();
			myArray[size++] = a;
		}
	}
	
	public void add(String a, int index){
	
		//method adds data to a specific location
		if(index == size){
			this.add(a);
		}
		else{
			if(size == capacity){
				this.reallocate();
				//move data
			}
			for(int i = size ; i > index ; i --){
				this.myArray[i] = this.myArray[i -1]; 
			}
			this.myArray[index] = a;
			size++;
		}
	}
			//else need to move data to accomodate
			
	public String remove(int index){
			
			//method removes 
			if(index < 0 || index > (size-1)){
				System.out.println("Invalid index. Data not deleted");
				return this.error;
			}
			String tmp = this.myArray[index];
			for(int i = index; i < size-1;i++){
				this.myArray[i] = this.myArray[i+1];
			}
			size--;
			return tmp;
	}
	
	public String get(int index){    //gets the content of the index
		//check if the index is valid
		if(index>= 0 && index < size)
			return myArray[index];
		else
			return this.error;		//indicates invalid
	}
	
	public int getSize(){		//shows the curret size of the array
	
	return this.size;
	}

	public int getCapacity(){   //Shows current capacity
		
		return this.capacity;
		
	}
	
	public void display(){				//prints the name of the team and rank
		for(int i =0; i < size; i++){
			
			System.out.println(myArray[i]+" is Ranked "+ (i+1) );
		}
		System.out.println("");
		
	}
	public void add(int a){				//adds data at the end of the array 
		// method adds the data at the end
		if(size < capacity){
			position[size] = a;
			size++;
		}
		else{
			System.out.println("Reallocate called");
			this.reallocate();
			position[size++] = a;
		}
	}
	public void show(){				//prints the rank of each team
		score();
		for(int i =0; i < this.size-4; i++){
			System.out.println(myArray[i] +" "+"["+(i+1)+"]" +" vs " +myArray[7-i] +" "+"["+(8-i)+"]"+ scoreArray.toString());
		}
		System.out.println("");
		
	}
	public void shuffle(String[] myArray){  //shuffles the teams.. youtube java programming tutorial series Dinish Varyani
		int noOfElements = this.size;
		for(int i = 0; i < this.size; i++){
			int shuf = 1 + (int)(Math.random() * (noOfElements - 1));
			
			String temp = myArray[shuf];
			myArray[shuf] = myArray[i];
			myArray[i] = temp;
		}
	}
	public void score(){						//Develops the scores unfinished

	for(int i =0; i < scoreArray.length; i++){
		scoreArray[i][1]= (int)(7*Math.random());//instantiates the second column
		scoreArray[i][0]= (int)(7*Math.random());//instantiates the first column
		while(scoreArray[i][0]==scoreArray[i][1]){		//checks to see that there are different scores
			scoreArray[i][0]= (int)(7*Math.random());
		}
	}
		/*for(int k =0; k < this.size/2; k++){ //rows
		 System.out.println(scoreArray[k][0]+ " - "+scoreArray[k][1]);	
		}*/
		System.out.println("");
	}

		

public void sort(int[] myArray){
	int[] temp = new int[myArray.length];
	int tmp =0;
	for(int i = 0; i < myArray.length; i++){
		tmp = myArray[i];
		for(int j = i+1; j < myArray.length-1; j++){
			if(tmp > myArray[j]){
				
				tmp = myArray[j];
				myArray[j] = myArray[i];
				myArray[i] = tmp;
				

				//System.out.println(" new tmp = " + tmp);
				
			}
		}
		temp [i]= tmp;
	}
	for(int i = 0 ; i < 8; i++){
		System.out.println("This is the sorted array score" + temp[i]);
	
	}	
	
}

	
	
	}
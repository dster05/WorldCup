/*Daniel J. Gallegos
  WorldCup assignment
  Professor Chatterjee
  Data Structures CSC311
  2/22/2016*/


public interface WCArrayList {


	
	void reallocate();
	void add(String a, int index);
	void add(String a);
	String remove(int index);
	String get(int index);
	int getSize();
	int getCapacity();
	void display();
	void add(int a);
	void show();
	void shuffle(String[] myArray);
	void score();
	void sort(int[] myArray);
	



}

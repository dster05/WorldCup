/*Daniel J. Gallegos		Could not get passed creating a unique random number generator
  WorldCup assignment
  Professor Chatterjee
  Data Structures CSC311
  2/22/2016*/

public class WorldCup extends WCArrayList1{

public static void main(String[] args){		//Main class adds the teams and calls methods from WCArrayList1
	
	WCArrayList1 teamList = new WCArrayList1();
	teamList.add("Argentina");
	teamList.add("Brazil");
	teamList.add("England");
	teamList.add("United States");
	teamList.add("Spain");
	teamList.add("Mexico");
	teamList.add("Italy");
	teamList.add("Germany");
	teamList.display();
	teamList.shuffle(teamList.myArray);
	teamList.show(); 

	

	

}
}

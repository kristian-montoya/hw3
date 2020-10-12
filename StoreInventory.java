import java.util.*;

//Singleton pattern used to track the store's inventory
public class StoreInventory{

	private static StoreInventory storeInventory = null;
	private RollFactory rollFactory;
	private List<Roll> inventory;

	private StoreInventory(){
		rollFactory = new RollFactory();
		inventory = new ArrayList<Roll>();
	}

	public static StoreInventory getStoreInventory(){
		if(storeInventory == null){
			storeInventory = new StoreInventory();
		}
		return storeInventory;
	}

	//generates a specefied roll type and adds it to store inventory
	public void generateRolls(String type){
		if(type == "all"){ //used to fill initial inventory with 30 of each type
			generateRolls("egg");
			generateRolls("jelly");
			generateRolls("pastry");
			generateRolls("sausage");
			generateRolls("spring");
		}
		else{ //refills inventory of specified type
			for(int i = 0; i < 30; i++){
				inventory.add(rollFactory.createRoll(type));
			}
		}
	}

	//returns the number of rolls currently in inventory
	public int getInventorySize(){
		return inventory.size();
	}

	//gets count of specified roll types in inventory
	public int getTypeCount(String type){
		int count = 0;
		int length = getInventorySize();

		//cycle over all rolls in the list
		for(int i = 0; i < length; i++){
			Roll roll = inventory.get(i);
			if(type == roll.getType()){ //check if roll type matches
				count++;
			}
		}
		return count;
	}

	//prints out the current inventory of all rolls
	public void generateReport(){
		System.out.println("Egg Rolls: "+getTypeCount("egg"));
		System.out.println("Jelly Rolls: "+getTypeCount("jelly"));
		System.out.println("Pastry Rolls: "+getTypeCount("pastry"));
		System.out.println("Sausage Rolls: "+getTypeCount("sausage"));
		System.out.println("Spring Rolls: "+getTypeCount("spring"));
	}

	//given a desired amount, function returns a list of
	//roll types that have stock >= desired amount
	public List<String> getAvailableTypes(int amount){
		List<String> availableTypes = new ArrayList<String>();
		
		if(getTypeCount("egg") >= amount){
			availableTypes.add("egg");
		}
		if(getTypeCount("jelly") >= amount){
			availableTypes.add("jelly");
		}
		if(getTypeCount("pastry") >= amount){
			availableTypes.add("pastry");
		}
		if(getTypeCount("sausage") >= amount){
			availableTypes.add("sausage");
		}
		if(getTypeCount("spring") >= amount){
			availableTypes.add("spring");
		}

		return availableTypes;
	}

	//checks whether or not all rolls are sold out
	public Boolean soldOut(){
		Boolean value = false;
		List<String> available = getAvailableTypes(1); //checks if any roll type has at least 1 roll
		if(available.size() == 0){ //if all rolls are sold out
			value = true;
		}
		return value;
	}
}
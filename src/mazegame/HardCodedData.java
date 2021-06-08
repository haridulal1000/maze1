package mazegame;

import mazegame.boundary.IMazeData;
import mazegame.entity.*;
import mazegame.entity.utility.*;

public class HardCodedData implements IMazeData {
	private Location startUp, field, gate, restaurant, church, shop ;                                                          
	private Item sword, knife, shield, armor;
	private NonPlayerCharacter thanos, darkseid,pikachu;
	
	public HardCodedData()
	{
		createItems();
		createLocations();
		populateWeightLimitTable();
		populateStrengthTable();
		populateAgilityTable();
		
		createNPC();
	}
	

	public void createNPC(){
		thanos = new NonPlayerCharacter("thanos");
		thanos.setHostile(true);
		field.getCharacters().put("thanos", thanos);
		thanos.setLocation(field);
		
		darkseid=new NonPlayerCharacter("darkseid");
		darkseid.setHostile(true);
		gate.getCharacters().put("darkseid", darkseid);
		darkseid.setLocation(gate);
		
		pikachu=new NonPlayerCharacter("pikachu");
		pikachu.setHostile(false);
		startUp.getCharacters().put("pikachu", pikachu);
		pikachu.setLocation(startUp);
	}
	
	private void createItems() {
		
		
		sword = new Weapon("sword", 25, 6,"katana");
		knife = new Weapon("khukuri", 15, 4, "gurkhali weapon");
		shield = new Weapon("shield", 30, 10, "protection");
		armor = new Weapon("armor", 10, 15, "protection");
		
	}

	public Location getStartingLocation()
	{
		return startUp;
	}
	
	public String getWelcomeMessage()
	{
		return "Welcome to the game of Death";
	}
	
	private void createLocations () 
	{
		
		startUp = new Location ("At the beginning", "Highway");
		field = new Location("place to play","field");
		gate = new Location("gate","entrance");
		restaurant = new Location("place to buy coffee","restaurant");
		church = new Location("place to pray","church");
		shop = new Shop("place to buy weapons","shop");
		startUp.getDirections().addDirection("east", new Direction("main gate",gate));
		//startUp.getDirections().addDirection("south", new Direction("way to fashionD",fashionD));
		gate.getDirections().addDirection("west", new Direction("back to startUp",startUp));
		gate.getDirections().addDirection("east", new Direction("restaurant",restaurant));
		gate.getDirections().addDirection("north", new Direction("field",field));
		field.getDirections().addDirection("south", new Direction("back to gate",gate));
		restaurant.getDirections().addDirection("west", new Direction("main gate",gate));
		restaurant.getDirections().addDirection("east", new Direction("way to the shop",shop));
		restaurant.getDirections().addDirection("south", new Direction("way to the church",church));
		church.getDirections().addDirection("north", new Direction("way to restaurant",restaurant));
		shop.getDirections().addDirection("west", new Direction("way to the restaurant",restaurant));
		
		startUp.getInventory().addItem(sword);
		shop.getInventory().addItem(knife);
		shop.getInventory().addItem(armor);
		startUp.getInventory().addItem(shield);

		

		
		
			
	}
	

	
	private void populateStrengthTable()
    {
        StrengthTable strengthModifiers = StrengthTable.getInstance();
        strengthModifiers.setModifier(1, -5);
        strengthModifiers.setModifier(2, -4);
        strengthModifiers.setModifier(3, -4);
        strengthModifiers.setModifier(4, -3);
        strengthModifiers.setModifier(5, -3);
        strengthModifiers.setModifier(6, -2);
        strengthModifiers.setModifier(7, -2);
        strengthModifiers.setModifier(8, -1);
        strengthModifiers.setModifier(9, -1);
        strengthModifiers.setModifier(10, 0);
        strengthModifiers.setModifier(11, 0);
        strengthModifiers.setModifier(12, 1);
        strengthModifiers.setModifier(13, 1);
        strengthModifiers.setModifier(14, 2);
        strengthModifiers.setModifier(15, 2);
        strengthModifiers.setModifier(16, 3);
        strengthModifiers.setModifier(17, 3);
        strengthModifiers.setModifier(18, 4);
        strengthModifiers.setModifier(19, 4);
        strengthModifiers.setModifier(20, 5);
        strengthModifiers.setModifier(21, 5);
        strengthModifiers.setModifier(22, 5);
        strengthModifiers.setModifier(23, 5);
        strengthModifiers.setModifier(24, 5);
        strengthModifiers.setModifier(25, 5);
        strengthModifiers.setModifier(26, 8);
        strengthModifiers.setModifier(27, 8);
        strengthModifiers.setModifier(28, 8);
        strengthModifiers.setModifier(29, 8);
        strengthModifiers.setModifier(30, 10);
        strengthModifiers.setModifier(31, 10);
        strengthModifiers.setModifier(32, 10);
        strengthModifiers.setModifier(33, 10);
        strengthModifiers.setModifier(34, 10);
        strengthModifiers.setModifier(35, 10);
        strengthModifiers.setModifier(36, 12);
        strengthModifiers.setModifier(37, 12);
        strengthModifiers.setModifier(38, 12);
        strengthModifiers.setModifier(39, 12);
        strengthModifiers.setModifier(40, 12);
        strengthModifiers.setModifier(41, 15);
        strengthModifiers.setModifier(42, 15);
        strengthModifiers.setModifier(43, 15);
        strengthModifiers.setModifier(44, 17);
        strengthModifiers.setModifier(45, 17);
        strengthModifiers.setModifier(46, 18);
    }

    private void populateAgilityTable()
    {
        AgilityTable agilityModifiers = AgilityTable.GetInstance();
        agilityModifiers.SetModifier(1, -5);
        agilityModifiers.SetModifier(2, -5);
        agilityModifiers.SetModifier(3, -5);
        agilityModifiers.SetModifier(4, -3);
        agilityModifiers.SetModifier(5, -3);
        agilityModifiers.SetModifier(6, -2);
        agilityModifiers.SetModifier(7, -2);
        agilityModifiers.SetModifier(8, -1);
        agilityModifiers.SetModifier(9, -1);
        agilityModifiers.SetModifier(10, 0);
        agilityModifiers.SetModifier(11, 0);
        agilityModifiers.SetModifier(12, 1);
        agilityModifiers.SetModifier(13, 1);
        agilityModifiers.SetModifier(14, 2);
        agilityModifiers.SetModifier(15, 2);
        agilityModifiers.SetModifier(16, 3);
        agilityModifiers.SetModifier(17, 3);
        agilityModifiers.SetModifier(18, 4);
        agilityModifiers.SetModifier(19, 4);
        agilityModifiers.SetModifier(20, 6);
        agilityModifiers.SetModifier(21, 6);
        agilityModifiers.SetModifier(22, 6);
        agilityModifiers.SetModifier(23, 6);
        agilityModifiers.SetModifier(24, 6);
        agilityModifiers.SetModifier(25, 6);
        agilityModifiers.SetModifier(26, 8);
        agilityModifiers.SetModifier(27, 8);
        agilityModifiers.SetModifier(28, 8);
        agilityModifiers.SetModifier(29, 8);
        agilityModifiers.SetModifier(30, 8);
        agilityModifiers.SetModifier(31, 8);
        agilityModifiers.SetModifier(32, 11);
        agilityModifiers.SetModifier(33, 11);
        agilityModifiers.SetModifier(34, 11);
        agilityModifiers.SetModifier(35, 11);
        agilityModifiers.SetModifier(36, 11);
        agilityModifiers.SetModifier(37, 11);
        agilityModifiers.SetModifier(38, 13);
        agilityModifiers.SetModifier(39, 13);
        agilityModifiers.SetModifier(40, 13);
        agilityModifiers.SetModifier(41, 13);
        agilityModifiers.SetModifier(42, 13);
        agilityModifiers.SetModifier(43, 13);
        agilityModifiers.SetModifier(44, 15);
        agilityModifiers.SetModifier(45, 15);
        agilityModifiers.SetModifier(46, 15);
    }

    private void populateWeightLimitTable()
    {
        WeightLimit weightModifier = WeightLimit.getInstance();
        weightModifier.setModifier(1, 6);
        weightModifier.setModifier(2, 13);
        weightModifier.setModifier(3, 20);
        weightModifier.setModifier(4, 26);
        weightModifier.setModifier(5, 33);
        weightModifier.setModifier(6, 40);
        weightModifier.setModifier(7, 46);
        weightModifier.setModifier(8, 53);
        weightModifier.setModifier(9, 60);
        weightModifier.setModifier(10, 66);
        weightModifier.setModifier(11, 76);
        weightModifier.setModifier(12, 86);
        weightModifier.setModifier(13, 100);
        weightModifier.setModifier(14, 116);
        weightModifier.setModifier(15, 133);
        weightModifier.setModifier(16, 153);
        weightModifier.setModifier(17, 173);
        weightModifier.setModifier(18, 200);
        weightModifier.setModifier(19, 233);
        weightModifier.setModifier(20, 266);
        weightModifier.setModifier(21, 306);
        weightModifier.setModifier(22, 346);
        weightModifier.setModifier(23, 400);
        weightModifier.setModifier(24, 466);
        weightModifier.setModifier(25, 533);
        weightModifier.setModifier(26, 613);
        weightModifier.setModifier(27, 693);
        weightModifier.setModifier(28, 800);
        weightModifier.setModifier(29, 933);
        weightModifier.setModifier(30, 1013);
        weightModifier.setModifier(31, 1093);
        weightModifier.setModifier(32, 1300);
        weightModifier.setModifier(33, 1433);
        weightModifier.setModifier(34, 1513);
        weightModifier.setModifier(35, 1593);
        weightModifier.setModifier(36, 1700);
        weightModifier.setModifier(37, 1833);
        weightModifier.setModifier(38, 1913);
        weightModifier.setModifier(39, 1993);
        weightModifier.setModifier(40, 2100);
        weightModifier.setModifier(41, 2233);
        weightModifier.setModifier(42, 2313);
        weightModifier.setModifier(43, 2393);
        weightModifier.setModifier(44, 2500);
        weightModifier.setModifier(45, 2633);
        weightModifier.setModifier(46, 2713);
    }
	
}

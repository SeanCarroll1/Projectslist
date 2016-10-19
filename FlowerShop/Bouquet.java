package FlowerShop;

 class Bouquet
{
	 //Variables to store total price amount of each flower.
	private static int price;
	private static int rose;
	private static int tulip;
	private static int daffodil;
	private static int max=15;
	
	//setters and getters for price.
	public static double getTotalPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public static void setTotalPrice(int amount) {
		//Increment price by the the amount of flowers multiplied by that specific flower cost.
		price +=amount;
	}
	
	
	public static double getSize() {
		// TODO Auto-generated method stub
		return getRose()+getTulip()+getDaffodil();
	}


	public static int getRose() {
		return rose;
	}

	public static void setRose(int rose) {
		//Set rose to the amount added.
		Bouquet.rose +=rose;
		//Update room left in Bouquet.
		Bouquet.setMax(Bouquet.getMax() - rose);
	}

	public static int getTulip() {
		return tulip;
	}
	//Repeat steps as setRose
	public static void setTulip(int tulip) {
		Bouquet.tulip += tulip;
		Bouquet.setMax(Bouquet.getMax() - tulip);
	}

	public static int getDaffodil() {
		return daffodil;
	}
	//Repeat steps
	public static void setDaffodil(int daffodil) {
		Bouquet.daffodil += daffodil;
		Bouquet.setMax(Bouquet.getMax() - daffodil);
	}

	public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		Bouquet.max = max;
	}
	
}

class Rose extends Bouquet
{
	//We get the amount the customer wants to add.
	void add(int amount)
	{
		//Add how many roses are in the bouquet.
		setRose(amount);
		//Increment total price.
		setTotalPrice(6*amount);
	}
	
	double getPrice() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}

class Tulip extends Bouquet
{
	//Repeat steps 
	void add(int amount)
	{
		setTulip(amount);
		setTotalPrice(5*amount);
	}
	
	double getPrice() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}
class Daffodil extends Bouquet
{
	//Repeat Steps.
	void add(int amount)
	{
		setDaffodil(amount);
		setTotalPrice(4*amount);
	}
	
	double getPrice() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}

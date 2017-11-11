package Builder;

public class Water extends ColdDrink {

	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Water";
	   }
	}
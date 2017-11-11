package Builder;

public abstract class Toy implements Item {

	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	}
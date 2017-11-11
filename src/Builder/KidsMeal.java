package Builder;

public abstract class KidsMeal implements Item {

	@Override
	public Packing packing() {
       return new Wrapper();
	}

	@Override
	public abstract float price();
}
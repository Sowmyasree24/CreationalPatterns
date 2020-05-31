package CreationalPattern4;

public abstract class Softdrink implements ItemType{
	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
}

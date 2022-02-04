package Abstract;

public abstract class ParentAircraft {
	
	public void engine() {
		System.out.println("Follow Engine Rules");
	}

	public void safetyGuidelines() {
		System.out.println("Follow safety guidelines");
	}
	
	public abstract void bodyColor();
}

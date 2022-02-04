package Abstract;

public class ChildEmirates extends ParentAircraft{

	public static void main(String[] args) {
		ChildEmirates CE = new ChildEmirates();
		CE.bodyColor();
		CE.engine();
		CE.safetyGuidelines();
	}

	@Override
	public void bodyColor() {
		System.out.println("Body Color is red");
	}

}

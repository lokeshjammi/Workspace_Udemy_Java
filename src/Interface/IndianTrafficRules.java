package Interface;

public class IndianTrafficRules implements CentralTrafficRules,ContinentialTrafficRules{

	public static void main(String[] args) {
		IndianTrafficRules ITR = new IndianTrafficRules();
		ITR.goGreen();
		ITR.redStop();
		ITR.flashYellow();
		IndianTrafficRules.walkOnSeeingSymbol();
		CentralTrafficRules CTR = new IndianTrafficRules();
		System.out.println("============================");
		CTR.goGreen();
		CTR.redStop();
		CTR.flashYellow();
		System.out.println("============================");
		ContinentialTrafficRules CTR1 = new IndianTrafficRules();
		CTR1.stopOnShowingTrainSymbol();
		CTR1.slowOnShowingChildSymbol();
	}

	@Override
	public void goGreen() {
		System.out.println("Green is blinked, can start going");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red is blinked, can't start going");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow is blinked, slowdown");
	}
	
	/**
	 * Class specific method
	 * 
	 * @return null
	 */
	public static void walkOnSeeingSymbol() {
		System.out.println("Walk on seeing hand symbol");
	}
	
	static {
		System.out.println("Welcome to Traffic Rules");
		System.out.println("============================");
	}

	@Override
	public void stopOnShowingTrainSymbol() {
		System.out.println("Stop on seeing train crossing symbol");
	}

	@Override
	public void slowOnShowingChildSymbol() {
		System.out.println("Stop on seeing school indication board");
	}

}

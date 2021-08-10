package Day18;

import java.util.LinkedList;

public class Station {
	
	LinkedList<String> trains = new LinkedList<>();
	
	
	public Station() {}
	
	public void trainadd(String a) {
		trains.offer(a);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a" + trains;
	}

}

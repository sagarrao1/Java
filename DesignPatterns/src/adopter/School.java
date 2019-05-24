package adopter;

import com.krishna.PilotPen;

public class School {
	public static void main(String[] args) {
		
		Pen pa=new PenAdopter();		
		AssignmentWork aw =new AssignmentWork();
		aw.setP(pa);		
		aw.writeAssignment("I am tired to write assignment");

	}
}

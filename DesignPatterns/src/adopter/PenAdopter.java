package adopter;

import com.krishna.PilotPen;

public class PenAdopter implements Pen {
	
	PilotPen pp=new PilotPen();
	
	@Override
	public void write(String str) {
			pp.mark(str);

	}

}

public class Marks {
	
	private int totalCounter;	
	private int distinctionCounter;
	private int passCounter;
	private int failCounter;
	
	public Marks () {
	    totalCounter = 0;
		distinctionCounter = 0;
		passCounter = 0;
		failCounter = 0;
		
	}
	
	public void processMarks(int mark) {
		totalCounter++;
		if (mark >= 70) {
			distinctionCounter++;
		}
		else if (mark >= 50) {
			passCounter++;
		}
		else if ((mark < 50) && (mark > -1)) {
			failCounter++;
		}
		
	}  //compiles to this point successfully.
	
	public static void main(String[] args) {
		System.out.println("Please enter the students' marks, finishing with -1: ");
		int counter = 0;
		Marks autumn12 = new Marks();
		int mark = 0;
		do {
			mark = Integer.parseInt(System.console().readLine());
			counter++;
			autumn12.processMarks(mark);
		} while (!(mark == -1));
		System.out.print("There are " + (autumn12.totalCounter - 1) + " students: " + autumn12.distinctionCounter + " distinction(s), " + autumn12.passCounter + " pass(es), " + autumn12.failCounter + " fail(s).");	
	}
}



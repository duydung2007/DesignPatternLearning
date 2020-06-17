package engineering.papers;

public abstract class BasicEngineering {
	public void Papers() {
		// Common Papers
		Math();
		SoftSkills();
		// Specialized Paper
		SpecialPaper();
	}
	
	private void Math() {
		System.out.println("Mathematics");
	}
	
	private void SoftSkills() {
		System.out.println("SoftSkills");
	}
	
	//Abstract method SpecialPaper() must be implemented in derived classes
	public abstract void SpecialPaper();
}


public class FictionL extends Department {

	@Override
	public void printDepartment () {
		System.out.println("Художественный отдел: Книг = " + getDepartment().length);
		for(int i = 0; i < getDepartment().length; i++) {
			if(getDepartment()[i] != null) {
			System.out.println(getDepartment()[i]);
			}
		}
	
	}

	@Override
	public String toString() {
		int count = 0;
		for(int i = 0; i < getDepartment().length; i++) {
			if(getDepartment()[i] != null) {
				count++;
			}
		}
		return "Художественная литература, книг: " + count + " ";
	}
}


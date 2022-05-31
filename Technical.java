
public class Technical extends Department {
	
	private boolean PC;
	
	public boolean isPC() {
		return PC;
	}

	public void setPC(boolean pC) {
		PC = pC;
	}

	@Override
	public void printDepartment () {
		System.out.println("Технической литература: Книг = " + getDepartment().length + "Наличие компьютера: " + PC );
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
		return "Техническая литература, книг: " + count + " ";
	}
}

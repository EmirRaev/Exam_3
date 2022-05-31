
public class Department {
	private int placeFor = 10;
	private Book department[] = new Book[placeFor];
	
	public void addBook(String author, String name, String releaseYear) {
		for(int i = 0; i < department.length; i++) {
			if(department[i] == null) {
				department[i] = new Book(author, name, releaseYear);
				break;
		
			}	
		}
	}
	
	public void printBooks() {
		for(int i = 0; i < department.length; i++) {
			if(department[i] != null) {
			System.out.println(department[i]);
			}
		}	
	}
	public void printDepartment () {
		System.out.println("" + department.length);
		for(int i = 0; i < department.length; i++) {
			if(department[i] != null) {
				System.out.println(department[i]);
			}
		}
	}	
	public void search(String author) {
		for(int i = 0; i < department.length; i++) {
			if(department[i] != null) {
			if(department[i].getAuthor().equals(author)) {
				System.out.println(department[i]);
				break;
			}else {
				System.out.println("Нет такой книги!");
				}
			}
		}		
	}
	public int amount() {
		int count = 0;
		for(int i = 0; i < department.length; i++) {
			if(department[i] != null) {
				count++;
			}
		}
		return count;
	}

	public int getPlaceFor() {
		return placeFor;
	}

	public void setPlaceFor(int placeFor) {
		this.placeFor = placeFor;
	}

	public Book[] getDepartment() {
		return department;
	}

	public void setDepartment(Book[] department) {
		this.department = department;
	}	
}



public class Library {
	
	public static void main(String[] args) {
		FictionL f = new FictionL();
		f.setPlaceFor(10);
		Legal l = new Legal();
		l.setPlaceFor(10);
		Technical t = new Technical();
		t.setPlaceFor(10);
		
		
		System.out.println(f);
		f.addBook("Bob", "Bob`s live", "05.05.1234");
		f.addBook("Tom", "Tom`s live", "05.05.1235");
		f.addBook("Rob", "Rob`s live", "05.05.1236");
		
		f.printBooks();
		f.printDepartment();
		f.search("Bob");
		System.out.println(f.amount());

	}

}

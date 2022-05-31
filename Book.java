
public class Book {
	private String author;
	private int identifier;
	private String name;
	private String releaseYear;
	
	public Book(String author, String titul, String releaseYear) {
		this.author = author;		
		this.name = titul;
		this.releaseYear = releaseYear;
		this.identifier++; 
	}

	public Book() {
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static int getIdentifier() {
		return identifier;
	}

	public static void setIdentifier(int identifier) {
		Book.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Книга Автор=" + author + ", Название=" + name + ", Дата выхода=" + releaseYear + " identifier= " + identifier;
	}
	

}

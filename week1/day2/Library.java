package week1.day2;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		String s=lib.addBook("Ponniyin selvan");
		System.out.println(s);
		lib.issueBook();

	}

}

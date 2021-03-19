public class Main {
	public static void main(String[] args) {
		Author autor1 = new Author("H.P.Lovecraft", "hp@lovecraft.com", 'M');
		Author autor2 = new Author("Ayn Rand", "atlas@shrugged.com", 'F');

		Book livro1 = new Book("A Cor Que Caiu do Céu", autor1, 25.00, 23);
		Book livro2 = new Book("A Revolta de Atlas", autor2, 67.00, 12);

		System.out.print(livro1.toString());
		System.out.print(livro2.toString());
	}
}

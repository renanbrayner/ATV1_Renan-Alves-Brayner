public class Book {
	public String name;
	public Author author;
	public double price;
	public int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return this.name;
	}

	public Author getAuthor() {
		return this.author;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return this.qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String toString() {
		String authorInfo = this.author.toString();
		return "------------------\n" +
			"title: " + this.name +
			"\nprice: " + this.price +
			"\navailable in stock: " + this.qtyInStock + "\n" +
			authorInfo;
	}
}

package com.aurionpro.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.comparator.model.Book;
import com.aurionpro.comparator.model.BookComparator;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		List<Book> books = new ArrayList<Book>();

		boolean exitOption = false;
		while (!exitOption) {
			System.out.println("Enter the title of book");
			String title = scanner.nextLine();
			System.out.println("Enter the author name");
			String author = scanner.nextLine();
			System.out.println("Enter the price of book");
			double price = scanner.nextDouble();
			System.out.println("Enter the publication year");
			int publicationYear = scanner.nextInt();

			books.add(new Book(title, author, price, publicationYear));
			System.out.println("Enter the option");
			System.out.println("0. Exit");
			System.out.println("1. Add one more book");

			int n = scanner.nextInt();
			if (n == 0) {
				exitOption = true;
			}
			scanner.nextLine();
		}

		System.out.println("Before Sort");
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("After Sorting first by author name then by title finally by price");
		Collections.sort(books, new BookComparator.BookAuthorComparator().thenComparing(new BookComparator.BookTitleComparator().thenComparing(new BookComparator.BookPriceComparator())));
		for (Book book : books) {
			System.out.println(book);
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("After Sorting first by publication year then by price finally by author");
		Collections.sort(books, new BookComparator.BookPublicationYearComparator().thenComparing(new BookComparator.BookPriceComparator().thenComparing(new BookComparator.BookAuthorComparator())));
		for (Book book : books) {
			System.out.println(book);
		}

	}

}

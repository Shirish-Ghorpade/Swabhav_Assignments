package com.aurionpro.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.comparator.model.Book;
import com.aurionpro.comparator.model.BookComparator;
import com.aurionpro.comparator.model.BookComparator.BookAuthorComparator;
import com.aurionpro.comparator.model.BookComparator.BookPriceComparator;
import com.aurionpro.comparator.model.BookComparator.BookPublicationYearComparator;
import com.aurionpro.comparator.model.BookComparator.BookTitleComparator;

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

			while (true) {
				int n = scanner.nextInt();
				if (n == 0) {
					exitOption = true;
					break;
				}
				else if(n==1) {
					break;
				}
			}
			scanner.nextLine();
		}

		System.out.println("Before Sort");
		for (Book book : books) {
			System.out.println(book);
		}

		BookTitleComparator sortByTitle = new BookComparator.BookTitleComparator();
		BookAuthorComparator sortByAuthor = new BookComparator.BookAuthorComparator();
		BookPriceComparator sortByPrice = new BookComparator.BookPriceComparator();
		BookPublicationYearComparator descendingSortByPublicationYear = new BookComparator.BookPublicationYearComparator();

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("After Sorting books by title in alphabhetical order");
		Collections.sort(books, sortByTitle);
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("After Sorting books by author in alphabhetical order");
		Collections.sort(books, sortByAuthor);
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("After Sorting books by price in ascending order");
		Collections.sort(books, sortByPrice);
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("After Sorting books by publication year in descending order");
		Collections.sort(books, descendingSortByPublicationYear);
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("After Sorting first by author name then by title finally by price");
		Collections.sort(books, sortByAuthor.thenComparing(sortByTitle.thenComparing(sortByPrice)));
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("After Sorting first by publication year then by price finally by author");
		Collections.sort(books, descendingSortByPublicationYear.thenComparing(sortByPrice.thenComparing(sortByAuthor)));
		for (Book book : books) {
			System.out.println(book);
		}

	}

}

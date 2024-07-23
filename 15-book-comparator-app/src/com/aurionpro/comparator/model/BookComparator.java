package com.aurionpro.comparator.model;

import java.util.Comparator;

public class BookComparator {
	public static class BookTitleComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return book1.getTitle().compareTo(book2.getTitle());
		}
		
	}
	
	public static class BookAuthorComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return book1.getAuthor().compareTo(book2.getAuthor());
		}
		
	}
	
	
	public static class BookPriceComparator implements Comparator<Book>{
		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return (int) (book1.getPrice()-book2.getPrice());
		}
		
	}
	public static class BookPublicationYearComparator implements Comparator<Book>{
		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return book2.getPublicationYear()-book1.getPublicationYear();
		}
		
	}

}

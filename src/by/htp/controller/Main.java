package by.htp.controller;

import by.htp.bean.Book;
import by.htp.list.MyLinkedList;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book("Гиперион", "Дэн Симмонс", 1989);
		Book book2 = new Book("Рита Хейуорт и спасение из Шоушенка", "Стивен Кинг", 1982);
		Book book3 = new Book("Спектр", "Сергей Лукьяненко", 2002);
		Book book4 = new Book("Отель «У Погибшего Альпиниста»", "Аркадий и Борис Стругацкие", 1970);

		MyLinkedList list = new MyLinkedList();

		list.addElement(book1);
		list.addElement(book2);
		list.addElement(book3);

		System.out.println("List size - " + list.size());

		list.viewList();

		System.out.println(list.getElement(2).toString());

		list.addElement(2, book4);

		list.viewList();

		list.deleteElement(2);

		list.viewList();
	}
}

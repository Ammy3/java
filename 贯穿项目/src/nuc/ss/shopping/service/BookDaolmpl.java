package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;

public class BookDaolmpl implements BookDao {
	private BookDataSet bds = new BookDataSet();
	@Override
	public Book[] queryAllBooks() {
		// TODO 自动生成的方法存根
		return bds.getBooks();
	}

	@Override
	public Book queryBookById(String id) {
		// TODO 自动生成的方法存根
		// 索取所有的书籍信息
				Book[] books = bds.getBooks();
				
				// 遍历所有的书籍信息
				for (Book book : books) {
					if (book.getBid().equals(id))
						return book;
				}

				// 没有找到任何书籍信息
				return null;
	}

}

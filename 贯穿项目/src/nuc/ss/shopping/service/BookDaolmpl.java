package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;

public class BookDaolmpl implements BookDao {
	private BookDataSet bds = new BookDataSet();
	@Override
	public Book[] queryAllBooks() {
		// TODO �Զ����ɵķ������
		return bds.getBooks();
	}

	@Override
	public Book queryBookById(String id) {
		// TODO �Զ����ɵķ������
		// ��ȡ���е��鼮��Ϣ
				Book[] books = bds.getBooks();
				
				// �������е��鼮��Ϣ
				for (Book book : books) {
					if (book.getBid().equals(id))
						return book;
				}

				// û���ҵ��κ��鼮��Ϣ
				return null;
	}

}

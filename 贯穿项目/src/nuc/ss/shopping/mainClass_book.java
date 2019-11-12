package nuc.ss.shopping;
import java.util.Scanner;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.service.BookDao;
import nuc.ss.shopping.service.BookDaolmpl;

public class mainClass_book {
	static Scanner i=new Scanner(System.in);
	public void meun(){
		while(true) {
			System.out.println("**********��Ʒ����ϵͳ" + "*************");
			System.out.println("1.��ѯ������Ʒ");
			System.out.println("2.������Ʒ��Ų���ͼ��");
			System.out.println("3.�����鼮");
			System.out.println("4.ȡ������");
			System.out.println("5.��ѯ�������");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("*****************************************");
			System.out.println("��ѡ��(1-6)");
			switch(Integer.valueOf(i.nextInt())) {
				case 1:System.out.println("��ѡ����: �����ѯ�����鼮��ҵ��");
					queryAllBooks();
					break;
				case 2:System.out.println("��ѡ����: �����鼮��Ų�ѯ��");
					queryBookById();
					break;
				case 3:System.out.println("��ѡ����: �����鼮��");
					break;
				case 4:System.out.println("��ѡ����: ɾ���鼮��");
					break;
				case 5:System.out.println("��ѡ����: ��ʾ�û����ﳵ�е��鼮��");
					break;
				case 6:System.out.println("��ѡ����: �˳���ǰӦ�ó���");
				    
				    return;
				default:System.out.println("����ѡ����ȷ");
					break;
			}	
		}
	}
	
	private static void queryAllBooks() {
		BookDao bd = new BookDaolmpl();
		// ͨ��ҵ�����ѯ���е��鼮
		Book[] books = bd.queryAllBooks();
		// ��ʾ���е��鼮
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	private static void queryBookById() {
		BookDao bd = new BookDaolmpl();
		
		System.out.println("��������Ʒ�ı��:");
		// ��ȡ�û�������鼮���
		String bid = i.next();
		
		// ͨ��ҵ�����ѯ��Ӧ���鼮
		Book book = bd.queryBookById(bid);
		if(book == null) {
			System.out.println("��Ʒ��Ϣ�����ڣ�");
			return;
		}
		
		// ��ʾ�鼮��Ϣ
		System.out.println(book);
		
	}
}

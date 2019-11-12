package nuc.ss.shopping;
import java.util.Scanner;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.service.BookDao;
import nuc.ss.shopping.service.BookDaolmpl;

public class mainClass_book {
	static Scanner i=new Scanner(System.in);
	public void meun(){
		while(true) {
			System.out.println("**********商品管理系统" + "*************");
			System.out.println("1.查询所有商品");
			System.out.println("2.根据商品编号查找图书");
			System.out.println("3.购买书籍");
			System.out.println("4.取消购买");
			System.out.println("5.查询购买情况");
			System.out.println("6.退出系统");
			System.out.println("*****************************************");
			System.out.println("请选择(1-6)");
			switch(Integer.valueOf(i.nextInt())) {
				case 1:System.out.println("您选择了: 处理查询所有书籍的业务。");
					queryAllBooks();
					break;
				case 2:System.out.println("您选择了: 处理按书籍编号查询。");
					queryBookById();
					break;
				case 3:System.out.println("您选择了: 购买书籍。");
					break;
				case 4:System.out.println("您选择了: 删除书籍。");
					break;
				case 5:System.out.println("您选择了: 显示用户购物车中的书籍。");
					break;
				case 6:System.out.println("您选择了: 退出当前应用程序。");
				    
				    return;
				default:System.out.println("您的选择不正确");
					break;
			}	
		}
	}
	
	private static void queryAllBooks() {
		BookDao bd = new BookDaolmpl();
		// 通过业务类查询所有的书籍
		Book[] books = bd.queryAllBooks();
		// 显示所有的书籍
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	private static void queryBookById() {
		BookDao bd = new BookDaolmpl();
		
		System.out.println("请输入商品的编号:");
		// 获取用户输入的书籍编号
		String bid = i.next();
		
		// 通过业务类查询对应的书籍
		Book book = bd.queryBookById(bid);
		if(book == null) {
			System.out.println("商品信息不存在！");
			return;
		}
		
		// 显示书籍信息
		System.out.println(book);
		
	}
}

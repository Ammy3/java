package nuc.ss.shopping;

import java.util.Scanner;

import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.entity.UserDataSet;
import nuc.ss.shopping.service.UserDao;
import nuc.ss.shopping.service.UserDaolmpl;

public class mainClass_user {
		static Scanner in=new Scanner(System.in);
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			UserDataSet.init();
			while(true) {
				System.out.println("**********��¼ϵͳ" + "*************");
				System.out.println("1.�û�ע��");
				System.out.println("2.�û���¼");
				System.out.println("3.�˳�ϵͳ");
				System.out.println("��ѡ��(1-3)");
				int a;
				a=Integer.valueOf(sc.nextInt());
				switch(a) {
					case 1:System.out.println("��ѡ����: �û�ע�ᡣ");
						if(registe()==true) {
							System.out.println("��ϲ����ע��ɹ���");
							mainClass_book bo = new mainClass_book();
							bo.meun();
						}
						break;
					case 2:System.out.println("��ѡ����: �û���¼");
							while(true) {
								if(login()==true) {
									System.out.println("��ϲ������¼�ɹ���");
									mainClass_book bo = new mainClass_book();
									bo.meun();
									break;
								}else {
									System.out.println("id�������벻��ȷ������������");
								}
							}
						
					case 3:System.out.println("��ѡ����: �˳�ϵͳ");
						return;
					case 999:
						Info();
						break;
					default:System.out.println("����ѡ����ȷ");
						break;
				}	
			}
		}
		
		public static boolean registe() {//ע��
			UserDaolmpl use= new UserDaolmpl();
			User us = new User();
			System.out.println("�����������û�����");
			us.setName(in.next());
			System.out.println("����������id��");
			us.setId(in.next());
			System.out.println("�����������Ա𣺣�0����Ů��1�����У�");
			us.setSex(in.nextByte());
			System.out.println("���������ĳ��У�");
			us.setCity(in.next());
			System.out.println("�������������룺");
			us.setPassword(in.next());
			return use.register(us);
	    }
		
		public static void Info() {//����Աѡ��
			for(int i=0;i<UserDataSet.getUsers().length;i++) {
				if(UserDataSet.getUsers()[i]!=null) {
					System.out.println(UserDataSet.getUsers()[i].toString());
				}
				else {
					return;
				}
			}
			return;
		}
		
		public static boolean login() {//��¼
			User us = new User();
			System.out.println("����������id��");
			us.setId(in.next());
			System.out.println("�������������룺");
			us.setPassword(in.next());
			
			for(User u:UserDataSet.getUsers()) {
				if((u.getId()==us.getId())&&(u.getPassword()==us.getPassword())) {
					return true;
				}else  
					return false;
			}
			return true;
			
			
				
		}
}

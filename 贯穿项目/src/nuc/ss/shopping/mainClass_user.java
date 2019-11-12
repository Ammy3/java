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
				System.out.println("**********登录系统" + "*************");
				System.out.println("1.用户注册");
				System.out.println("2.用户登录");
				System.out.println("3.退出系统");
				System.out.println("请选择(1-3)");
				int a;
				a=Integer.valueOf(sc.nextInt());
				switch(a) {
					case 1:System.out.println("您选择了: 用户注册。");
						if(registe()==true) {
							System.out.println("恭喜您！注册成功！");
							mainClass_book bo = new mainClass_book();
							bo.meun();
						}
						break;
					case 2:System.out.println("您选择了: 用户登录");
							while(true) {
								if(login()==true) {
									System.out.println("恭喜您！登录成功！");
									mainClass_book bo = new mainClass_book();
									bo.meun();
									break;
								}else {
									System.out.println("id或者密码不正确！请重新输入");
								}
							}
						
					case 3:System.out.println("您选择了: 退出系统");
						return;
					case 999:
						Info();
						break;
					default:System.out.println("您的选择不正确");
						break;
				}	
			}
		}
		
		public static boolean registe() {//注册
			UserDaolmpl use= new UserDaolmpl();
			User us = new User();
			System.out.println("请设置您的用户名：");
			us.setName(in.next());
			System.out.println("请设置您的id：");
			us.setId(in.next());
			System.out.println("请设置您的性别：（0代表女，1代表男）");
			us.setSex(in.nextByte());
			System.out.println("请设置您的城市：");
			us.setCity(in.next());
			System.out.println("请设置您的密码：");
			us.setPassword(in.next());
			return use.register(us);
	    }
		
		public static void Info() {//管理员选项
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
		
		public static boolean login() {//登录
			User us = new User();
			System.out.println("请输入您的id：");
			us.setId(in.next());
			System.out.println("请输入您的密码：");
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

package team1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class IdRe {
	Scanner sc = new Scanner(System.in);
	OutputData outData = new OutputData();
	static String list[];

	void idcheck(String Id) {
		String ID = Id;
		Controller ctr = new Controller();
		boolean ctn = true;
		try {
			BufferedReader in = new BufferedReader(new FileReader("d:userList.txt"));

			String userList;
			String id;
			// String id[];
			System.out.println("asdasd");
			
			while ((userList = in.readLine()) != null) {
				list = userList.split(",");
			}
			for (int i = 0; i < list.length; i++) {
				String list2 = list[i];
				System.out.println("�ߺ��� �߻�1");
			}
			id = list2[];
			while(ID.contains(id)) {
					System.out.println("�ߺ��� �߻�2");
					ID = sc.next();
					outData.input();
		}
		}catch (

		Exception e) {
			// TODO: handle exception
		}

//				System.out.println(id[i]);
//				for (int j = 0; j < id.length; j++) {
//					System.out.println("asdasdsad");
//					if (ID.equals(id[j])) {
//						System.out.println("�ߺ��� ����");
//						ID = sc.next();
//						while(ID.equals(id[j])) {
//							System.out.println("�ߺ��� ����");
//							ID = sc.next();
//						}
//					} else {
//						System.out.println("�ߺ��� Ȯ��");
//					}
//				}
	}

	void idcheck2(String Id) {

		String id2[] = null;
		String ID = Id;
		try {
			BufferedReader in = new BufferedReader(new FileReader("d:userList.txt"));

			String userList;
			View view = new View();

			while ((userList = in.readLine()) != null) { // ���� ȣ��
				int i;
				for (i = 0; i < userList.length(); i++) {

					String[] list = userList.split(",");
					id2[i] = list[i];
				}
				while (!ID.equals(id2[i])) {
					System.out.println("��ϵ� ID�� �����ϴ�.");
					System.out.println("�ùٸ� ID�� �Է����ּ���.");
					ID = sc.next();
				}
				break;
			}
		} catch (

		Exception e) {
			// TODO: handle exception
		}
	}
}
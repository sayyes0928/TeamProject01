package team1;

import java.io.BufferedReader;
import java.io.FileReader;

public class View {
	// UserInfo my = new UserInfo();

Model model = new Model();

	void st() { // ���۸޴� �޼ҵ�
		System.out.println("ȸ���������α׷�");
		System.out.println("[1] ����");
		System.out.println("[2] �α���");
		System.out.println("[3] ����");
		System.out.print("��ȣ�� �Է����ּ���: ");
	}

	void Log(String Id) { // �α��� ȭ�� �޼ҵ�
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("d:" + Id + ".txt"));
			
			String s;
			while ((s = in.readLine()) != null) {

				String[] list = s.split(",");
				String id = list[0];
				String pw = list[1];
				String name = list[2];
				String bir = list[3];
				String tel = list[4];
				String addr = list[5];
				String mail = list[6];
			
			System.out.println(id+ "���� �α��� �Ǽ̽��ϴ�.");
			System.out.println("==============");
			System.out.println("[] ID: " + id);
		//	System.out.println("[] PassWord: " + model.getPass());
			System.out.println("[] Name: " + name);
			System.out.println("[] Year: " +bir);
			System.out.println("[] Tell: " + tel);
			System.out.println("[] Addres: " + addr);
			System.out.println("[] Mail: " + mail);
			System.out.println("[1] ����, [2] ����, [3] �α׾ƿ�");
			
		} 
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	void Re() {
		System.out.println("ID,PassWord�� ������ �����ϰ� ���� �κ��� �������ּ���.");
		System.out.println("[1]�̸� [2]������� [3]��ȭ��ȣ [4]�ּ� [5]���� [6]����");

	}
}

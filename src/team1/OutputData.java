package team1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class OutputData {
	Scanner sc = new Scanner(System.in);
	Model model = new Model();
	View view = new View();

	void update() {
		try {

			Model model = new Model();

			FileOutputStream user = new FileOutputStream("d:" + model.getId() + ".txt");

			System.out.println("name �Է�");
			String Name = "," + sc.next();
			model.setName(Name);

			System.out.println("birth �Է�");
			String Birth = "," + sc.next();
			model.setBir(Birth);

			System.out.println("email �Է�");
			String Email = "," + sc.next();
			model.setMail(Email);

			System.out.println("addr �Է�");
			String Addr = "," + sc.next();
			model.setAddr(Addr);

			System.out.println("phone �Է�");
			String Phone = "," + sc.next();
			model.setTel(Phone);

			byte name[] = Name.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(name); // method�� �̿��ؼ� b�� ������ bw�� write
			byte birth[] = Birth.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(birth); // method�� �̿��ؼ� b�� ������ bw�� write
			byte email[] = Email.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(email); // method�� �̿��ؼ� b�� ������ bw�� write
			byte addr[] = Addr.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(addr); // method�� �̿��ؼ� b�� ������ bw�� write
			byte phone[] = Phone.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(phone); // method�� �̿��ؼ� b�� ������ bw�� write

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	void delete() {
		try {
			Model model = new Model();

			File user = new File("d:" + model.getId() + ".txt");
			user.delete();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		// FileOutputStream user = null; // fileOutPut�� �� ��ü ����
		FileOutputStream userList = null;
		IdRe idre = new IdRe();

		try { // IO������ �ʼ��� ����
			System.out.println("id �Է�");
			String IdTxt = sc.next();
			// model.setId(IdTxt);

			userList = new FileOutputStream("d:userList.txt", true);// user ���� ����Ʈ

			FileOutputStream user = new FileOutputStream("d:" + IdTxt + ".txt", true);

			//idre.idcheck(IdTxt);

			System.out.println("pw �Է�");
			String Pw = "," + sc.next();
			// model.setPass(Pw);

			System.out.println("pw Ȯ�� �Է�");
			String PwRe = "," + sc.next();

			while (!Pw.equals(PwRe)) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. ���Է� �ϼ���");

				System.out.println("pw �Է�");
				Pw = "," + sc.next();
				// model.setPass(Pw);

				System.out.println("pw Ȯ�� �Է�");
				PwRe = "," + sc.next();
			}

			System.out.println("name �Է�");
			String Name = "," + sc.next();
			// model.setName(Name);

			System.out.println("birth �Է�");
			String Birth = "," + sc.next();
			// model.setBir(Birth);

			System.out.println("email �Է�");
			String Email = "," + sc.next();
			// model.setMail(Email);

			System.out.println("addr �Է�");
			String Addr = "," + sc.next();
			// model.setAddr(Addr);

			System.out.println("phone �Է�");
			String Phone = "," + sc.next();
			// model.setTel(Phone);

			byte id[] = IdTxt.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(id); // method�� �̿��ؼ� b�� ������ bw�� write
//
//			String Idtxtcheck = IdTxt.getBytes()+",";
			String IdTxt2 = IdTxt + ",";
			byte idCheck[] = IdTxt2.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			userList.write(idCheck); // method�� �̿��ؼ� b�� ������ bw�� write
			
			byte pw[] = Pw.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(pw); // method�� �̿��ؼ� b�� ������ bw�� write
			byte pwre[] = PwRe.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(pwre); // method�� �̿��ؼ� b�� ������ bw�� write
			byte name[] = Name.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(name); // method�� �̿��ؼ� b�� ������ bw�� write
			byte birth[] = Birth.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(birth); // method�� �̿��ؼ� b�� ������ bw�� write
			byte email[] = Email.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(email); // method�� �̿��ؼ� b�� ������ bw�� write
			byte addr[] = Addr.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(addr); // method�� �̿��ؼ� b�� ������ bw�� write
			byte phone[] = Phone.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
			user.write(phone); // method�� �̿��ؼ� b�� ������ bw�� write

			

		} catch (Exception e) {
			System.out.println(e + " => ���");
		} finally {
			try {
				userList.close();
			} catch (Exception e) {
				System.out.println(e + " + close fail");
			}
		}
	}
}
// Input�� In�� �ؼ� ������ ����� ���⶧���� ������ ����
//
//System.out.println("available = " + f2.available()); //�о� �� �� �ִ� byte ��
//byte b3[] = new byte[f2.available()]; //�Ͼ�� �� �ִ� ��ŭ�� byte
//
//while(f2.read(b3) != -1) {} //file�� ���� ' -1 '�� ó���Ѵ�. -1�� file ���� ��ȯ�Ǳ� ����
//                  //read b�� �о� �´�.
//
//String data4 = new String(b3); //b�� �������� Data�� �������� 
//System.out.println(data4);

// while (!(Id = sc.nextLine()).equals("quit")) {// ���Ṯ �Է½� ����
// data ������ sc.next()�� ���ٰ� �߱� ������
// data �� Object �� �ȴ�.
// }

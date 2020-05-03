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

			System.out.println("name 입력");
			String Name = "," + sc.next();
			model.setName(Name);

			System.out.println("birth 입력");
			String Birth = "," + sc.next();
			model.setBir(Birth);

			System.out.println("email 입력");
			String Email = "," + sc.next();
			model.setMail(Email);

			System.out.println("addr 입력");
			String Addr = "," + sc.next();
			model.setAddr(Addr);

			System.out.println("phone 입력");
			String Phone = "," + sc.next();
			model.setTel(Phone);

			byte name[] = Name.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(name); // method를 이용해서 b의 내용을 bw에 write
			byte birth[] = Birth.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(birth); // method를 이용해서 b의 내용을 bw에 write
			byte email[] = Email.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(email); // method를 이용해서 b의 내용을 bw에 write
			byte addr[] = Addr.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(addr); // method를 이용해서 b의 내용을 bw에 write
			byte phone[] = Phone.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(phone); // method를 이용해서 b의 내용을 bw에 write

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
		// FileOutputStream user = null; // fileOutPut을 할 객체 생성
		FileOutputStream userList = null;
		IdRe idre = new IdRe();

		try { // IO에서는 필수로 설정
			System.out.println("id 입력");
			String IdTxt = sc.next();
			// model.setId(IdTxt);

			userList = new FileOutputStream("d:userList.txt", true);// user 공통 리스트

			FileOutputStream user = new FileOutputStream("d:" + IdTxt + ".txt", true);

			//idre.idcheck(IdTxt);

			System.out.println("pw 입력");
			String Pw = "," + sc.next();
			// model.setPass(Pw);

			System.out.println("pw 확인 입력");
			String PwRe = "," + sc.next();

			while (!Pw.equals(PwRe)) {
				System.out.println("비밀번호가 틀렸습니다. 재입력 하세요");

				System.out.println("pw 입력");
				Pw = "," + sc.next();
				// model.setPass(Pw);

				System.out.println("pw 확인 입력");
				PwRe = "," + sc.next();
			}

			System.out.println("name 입력");
			String Name = "," + sc.next();
			// model.setName(Name);

			System.out.println("birth 입력");
			String Birth = "," + sc.next();
			// model.setBir(Birth);

			System.out.println("email 입력");
			String Email = "," + sc.next();
			// model.setMail(Email);

			System.out.println("addr 입력");
			String Addr = "," + sc.next();
			// model.setAddr(Addr);

			System.out.println("phone 입력");
			String Phone = "," + sc.next();
			// model.setTel(Phone);

			byte id[] = IdTxt.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(id); // method를 이용해서 b의 내용을 bw에 write
//
//			String Idtxtcheck = IdTxt.getBytes()+",";
			String IdTxt2 = IdTxt + ",";
			byte idCheck[] = IdTxt2.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			userList.write(idCheck); // method를 이용해서 b의 내용을 bw에 write
			
			byte pw[] = Pw.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(pw); // method를 이용해서 b의 내용을 bw에 write
			byte pwre[] = PwRe.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(pwre); // method를 이용해서 b의 내용을 bw에 write
			byte name[] = Name.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(name); // method를 이용해서 b의 내용을 bw에 write
			byte birth[] = Birth.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(birth); // method를 이용해서 b의 내용을 bw에 write
			byte email[] = Email.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(email); // method를 이용해서 b의 내용을 bw에 write
			byte addr[] = Addr.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(addr); // method를 이용해서 b의 내용을 bw에 write
			byte phone[] = Phone.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
			user.write(phone); // method를 이용해서 b의 내용을 bw에 write

			

		} catch (Exception e) {
			System.out.println(e + " => 요류");
		} finally {
			try {
				userList.close();
			} catch (Exception e) {
				System.out.println(e + " + close fail");
			}
		}
	}
}
// Input은 In을 해서 가져올 결과가 없기때문에 오류를 띄운다
//
//System.out.println("available = " + f2.available()); //읽어 올 수 있는 byte 수
//byte b3[] = new byte[f2.available()]; //일어올 수 있는 만큼의 byte
//
//while(f2.read(b3) != -1) {} //file의 끝을 ' -1 '로 처리한다. -1이 file 끝에 반환되기 떄문
//                  //read b를 읽어 온다.
//
//String data4 = new String(b3); //b를 정상적인 Data로 만들어줘라 
//System.out.println(data4);

// while (!(Id = sc.nextLine()).equals("quit")) {// 종료문 입력시 종료
// data 변수를 sc.next()와 같다고 했기 때문에
// data 는 Object 가 된다.
// }

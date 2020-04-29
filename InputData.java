package team1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class InputData {

	Scanner sc = new Scanner(System.in);
	Model model = new Model();
	View view = new View();
	IdRe idre = new IdRe();
	static String Id = null;

	void print() {
		try {
			// 로그인 선택시 출력화면
			System.out.println("로그인을 선택하셨습니다.\n");
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("========================\n");
			System.out.println("ID:");

			BufferedReader userList = new BufferedReader(new FileReader("d:userList.txt"));

			Id = sc.nextLine(); // ID 입력시

			idre.idcheck2(Id);
			
			String s2;
			while ((s2 = userList.readLine()) != null) {

				String[] list2 = s2.split(",");
				String id = list2[0];
				String pw = list2[1];
				String name = list2[2];
				String bir = list2[3];
				String tel = list2[4];
				String addr = list2[5];
				String mail = list2[6];
			
				for (int i = 0; i < list2.length; i++) {
					String Id = list2[i];
				}
				
					if (Id.equals(Id)) {
						System.out.println("비밀번호입력");
						passw();
						break;

					} else {
						System.out.println("ID가 틀렸습니다");
						break;
					}
				}
		} catch (

		Exception e) {
		}
	}

	void passw() {
		
		try {
			String pass = sc.nextLine();

			BufferedReader in = new BufferedReader(new FileReader("d:" + Id + ".txt"));
			Controller ctr = new Controller();
			String s;
			while ((s = in.readLine()) != null) {

				String[] list = s.split(",");
				String id = list[0];
				String pw = list[1];
//				String name = list[2];
//				String bir = list[3];
//				String tel = list[4];
//				String addr = list[5];
//				String mail = list[6];
				

				if (pass.equals(pw)) {
					view.Log(id);
					System.out.println("입력하신 회원정보입니다.");
					// view.Log();
				} else {
					System.out.println("회원정보가 일치하지 않습니다.");
					System.out.println("처음부터 시작해주세요\n");
					ctr.Start();
				}
			}
		} catch (
		Exception e) {
		}
	}
}

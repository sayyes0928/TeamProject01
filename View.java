package team1;

import java.io.BufferedReader;
import java.io.FileReader;

public class View {
	// UserInfo my = new UserInfo();

Model model = new Model();

	void st() { // 시작메뉴 메소드
		System.out.println("회원관리프로그램");
		System.out.println("[1] 가입");
		System.out.println("[2] 로그인");
		System.out.println("[3] 종료");
		System.out.print("번호를 입력해주세요: ");
	}

	void Log(String Id) { // 로그인 화면 메소드
		
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
			
			System.out.println(id+ "님이 로그인 되셨습니다.");
			System.out.println("==============");
			System.out.println("[] ID: " + id);
		//	System.out.println("[] PassWord: " + model.getPass());
			System.out.println("[] Name: " + name);
			System.out.println("[] Year: " +bir);
			System.out.println("[] Tell: " + tel);
			System.out.println("[] Addres: " + addr);
			System.out.println("[] Mail: " + mail);
			System.out.println("[1] 수정, [2] 삭제, [3] 로그아웃");
			
		} 
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	void Re() {
		System.out.println("ID,PassWord를 제외한 수정하고 싶은 부분을 선택해주세요.");
		System.out.println("[1]이름 [2]생년월일 [3]전화번호 [4]주소 [5]메일 [6]종료");

	}
}

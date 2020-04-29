package team1;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	OutputData outdata = new OutputData();
	InputData indata = new InputData();
	//ArrayList<Model> arr = new ArrayList<Model>();
	Model info = new Model();
	View view = new View();
	
	void Start() {
	view.st();  // 시작메뉴 출력
	Scanner in = new Scanner(System.in);
    int num = in.nextInt(); //시작메뉴 컨텐츠 번호 입력
    while(num!=3) {
    	if(num==1) { // 1번 입력시 회원정보 입력
    		
    		outdata.input();
    		Start();
    		break;
    	}
    	if(num==2) { //로그인
    		
    		indata.print();
    		num = in.nextInt();
    		//view.Log();//로그인 된 화면으로 이동. 수정,삭제 화면
    	    while(num!=3) {
    	    	if (num ==1) {//수정
    	    		view.Re();
    	    		outdata.update();
    	    		break;
    			} else if(num ==2) {
    				view.Re();
    				outdata.delete();
    				break;
    			}else { break;}
    	    }
    		break;
        }
      }
    
    
 }//Start method 
}//Controller class 

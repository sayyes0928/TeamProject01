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
	view.st();  // ���۸޴� ���
	Scanner in = new Scanner(System.in);
    int num = in.nextInt(); //���۸޴� ������ ��ȣ �Է�
    while(num!=3) {
    	if(num==1) { // 1�� �Է½� ȸ������ �Է�
    		
    		outdata.input();
    		Start();
    		break;
    	}
    	if(num==2) { //�α���
    		
    		indata.print();
    		num = in.nextInt();
    		//view.Log();//�α��� �� ȭ������ �̵�. ����,���� ȭ��
    	    while(num!=3) {
    	    	if (num ==1) {//����
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

package hanseAR;

import java.util.ArrayList;
import java.util.Scanner;

public class IdPwCheck {
	
	//입력한 아이디가 acMenber 리스트의 아이디가 맞는지 검사하는 메소드이다.
	public int idCheck(ArrayList<Account> acMenber, Scanner sc) {
		while(true) {
			System.out.print("id : ");
			String s = sc.next();
			int index = 0;
			for(Account ac : acMenber) {
				if(ac.getId().equals(s)) {
					return index;
				}
				index++;
			}
			System.out.println("* 입력한 아이디가 없습니다. *");
		}
	}
	
	//입력한 비밀번호가 acMenber 리스트의 비밀번호가 맞는지 검사하는 메소드이다.
	public String pwCheck(Scanner sc) {
		System.out.print("pw : ");
		String s = sc.next();
		return s;
	}
}

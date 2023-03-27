package hanseAR;

import java.util.ArrayList;
import java.util.Scanner;

public class CommendCenter {
	
	//문자열값을 반환해주는 메소드이다.
	public String commendSet(ArrayList<Account> acMenber, Scanner sc, int acIndex) {
		System.out.print(acMenber.get(acIndex).getId() + "@HsAR> ");
		return sc.next();
	}
	
	//현재 생성된 mvMember 리스트를 모두 출력해주는 메소드이다.
	public void vListAll(ArrayList<MovieMember> mvMenber) {
		if(mvMenber.size() == 0) {
			System.out.println("* 생성된 리스트가 없습니다. *");
			
		} else {
			for(int i=0; i<mvMenber.size(); i++) {
				System.out.println("mvMenber[" + i + "]" + mvMenber.get(i).toString());
			}
		}
	}
	
	//현재 생성된 mvMember 리스트 중 입력한 인덱스 번호에 맞는 리스틀 찾아 출력해주는 클래스이다.
	public void vListIndex(ArrayList<MovieMember> mvMenber, Scanner sc) {
		if(mvMenber.size() == 0) {
			System.out.println("* 생성된 리스트가 없습니다. *");
			
		} else {
			System.out.print("출력할 인덱스 번호: ");
			int index = sc.nextInt();
			System.out.println("mvMenber[" + index + "]" + mvMenber.get(index).toString());
		}
	}
	
	//mvMenber 리스트를 추가해주는 메소드이다.
	public void addList(ArrayList<MovieMember> mvMenber, Scanner sc) {
		String[] input = new String[5];
		
		System.out.print("이름 : ");
		input[0] = sc.next();
		System.out.print("성별 : ");
		input[1] = sc.next();
		System.out.print("아이디 : ");
		input[2] = sc.next();
		System.out.print("vip등급 : ");
		input[3] = sc.next();
		System.out.print("예매영화 : ");
		input[4] = sc.next();
			
		mvMenber.add(new MovieMember(input[0], input[1], input[2], input[3], input[4]));
	}
	
	//mvMenber 리스트 중 입력한 인덱스 번호의 요소를 선택해 변경하는 메소드이다.
	public void setList(ArrayList<MovieMember> mvMenber, Scanner sc) {
		if(mvMenber.size() == 0) {
			System.out.println("* 생성된 리스트가 없습니다. *");
		}
		
		System.out.print("수정할 인덱스 번호: ");
		int index = sc.nextInt();
		System.out.println("1.name 2.gender 3.id 4.vip 5.recMovie");
		System.out.print("수정할 필드 선택: ");
		int c = sc.nextInt();
		System.out.print("수정할 값 입력: ");
		String s = sc.next();
		mvMenber.get(index).set(c, s);
	}
	
	//mvMenber 리스트 중 입력한 번호의 리스트를 삭제해주는 메소드이다.
	public void delList(ArrayList<MovieMember> mvMenber, Scanner sc) {
		System.out.print("삭제할 인덱스 번호: ");
		int index = sc.nextInt();
		mvMenber.remove(index);
		System.out.println("[" + index + "] 삭제 완료");
	}
	
	//입력한 단어를 포함하는 모든 mvMenber 리스트를 출력하는 메소드이다.
	public void selectList(ArrayList<MovieMember> mvMenber, Scanner sc) {
		System.out.print("검색할 단어: ");
		String s = sc.next();
		int index = 0;
		for(MovieMember mm : mvMenber) {
			if(mm.getName().equals(s)) {
				System.out.println("mvMenber[" + index + "]" + mm.toString());
				index++;
				continue;
			} else if(mm.getGender().equals(s)) {
				System.out.println("mvMenber[" + index + "]" + mm.toString());
				index++;
				continue;
			} else if(mm.getId().equals(s)) {
				System.out.println("mvMenber[" + index + "]" + mm.toString());
				index++;
				continue;
			} else if(mm.getVip().equals(s)) {
				System.out.println("mvMenber[" + index + "]" + mm.toString());
				index++;
				continue;
			} else if(mm.getRecMovie().equals(s)) {
				System.out.println("mvMenber[" + index + "]" + mm.toString());
				index++;
				continue;
			}
		}
	}
	
	//acMenber 리스트를 추가하는 메소드이다.
	public void userAdd(ArrayList<Account> acMenber, Scanner sc) {
		String id, pw;
		System.out.print("id 입력 : ");
		id = sc.next();
		System.out.print("pw 입력 : ");
		pw = sc.next();
		acMenber.add(new Account(id, pw));
	}
	
	//acMenber 리스트 중 입력한 번호의 리스트를 삭제하는 메소드이다.
	public void userDel(ArrayList<Account> acMenber, Scanner sc) {
		System.out.println("* 삭제할 아이디 인덱스 입력 *");
		System.out.print("Index : ");
		int index = sc.nextInt();
		if(index == 0) {
			System.out.println("* root는 삭제할 수 없습니다 *");
		} else {
			System.out.print("pw 입력 : ");
			String pw = sc.next();
			if(acMenber.get(index).getPw().equals(pw)) {
				acMenber.remove(index);
			} else {
				System.out.println("* 비밀번호가 틀렸습니다 *");
			}
		}
		
	}
	
	//acMenber 리스트를 모두 출력하는 메소드이다.
	public void userList(ArrayList<Account> acMenber, Scanner sc) {
		for(int i=0; i<acMenber.size(); i++) 
			System.out.println("acMenber[" + i + "]" + acMenber.get(i).toString());
	}
	
	//acMenber 리스트 중 입력한 번호의 리스트의 요소 중 하나인 pw를 변경하는 메소드이다.
	public void userPwSet(ArrayList<Account> acMenber, Scanner sc) {
		System.out.println("* 바꿀 아이디 인덱스 입력 *");
		System.out.print("Index : ");
		int index = sc.nextInt();
		System.out.println("* 비밀번호 입력 *");
		System.out.print("pw : ");
		if(acMenber.get(index).getPw().equals(sc.next())) {
			System.out.println("* 바꿀 비밀번호 입력 *");
			System.out.print("pw : ");
			acMenber.get(index).setPw(sc.next());
		} else {
			System.out.println("* 비밀번호가 잘못됬습니다 *");
		}
	}
	
	//어떤 단어를 입력해야 해당 메소드가 출력되는지를 알려주는 메소드이다.
	public void helpCommend() {
		System.out.println("vList : 보고싶은 인덱스 번호의 리스트를 출력");
		System.out.println("vListAll : 모든 리스트를 출력");
		System.out.println("addList : 리스트를 생성");
		System.out.println("setList : 리스트를 수정");
		System.out.println("delList : 리스트를 삭제");
		System.out.println("selList : 리스트를 검색");
		System.out.println("userAdd : 유저를 생성");
		System.out.println("userDel : 유저를 삭제");
		System.out.println("userPwSet : 유저의 비밀번호를 수정");
		System.out.println("userList : 유저를 검색");
		System.out.println("exit : 프로그램 종료");
	}
}

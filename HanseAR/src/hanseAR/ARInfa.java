package hanseAR;

import java.util.ArrayList;
import java.util.Scanner;

public class ARInfa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MovieMember> mvMember = new ArrayList<>();
		ArrayList<Account> acMember = new ArrayList<>();
		IdPwCheck check = new IdPwCheck();
		CommendCenter cc = new CommendCenter();
		acMember.add(0, new Account("root", "1234"));
		
		System.out.println("---------- CGV 회원 관리 프로그램 ----------");
		try {
			while(true) {
				int acIndex = check.idCheck(acMember, sc);
				//acIndex값과 같은 번호의 acMember 리스트 중 입력한 문자열과 pw가 같은지 확인한 후 같으면 true를 반환해 while문을 실행시킨다.
				if(acMember.get(acIndex).getPw().equals(check.pwCheck(sc))) {
					while(true) {
						//commendSet 메소드를 호출하면서 입력한 명령어를 commend 함수에 넣어준다.
						String commend = cc.commendSet(acMember, sc, acIndex);
						
						//만약 commend 함수 값이 exit라면 로그인 화면으로 돌아간다.
						if(commend.equals("exit")) {
							System.out.println("* 안녕히가세요. *");
							sc.close();
							break;
						}
						
						//switch case 문을 이용하여 commend값에 알맞은 메소드를 호출해준다.
						switch (commend) {
							case "vListAll": {
								cc.vListAll(mvMember);
								break;
							}
							case "vList": {
								cc.vListIndex(mvMember, sc);
								break;
							}
							case "addList": {
								cc.addList(mvMember, sc);
								break;
							}
							case "setList": {
								cc.setList(mvMember, sc);
								break;
							}
							case "delList": {
								cc.delList(mvMember, sc);
								break;
							}
							case "selList": {
								cc.selectList(mvMember, sc);
								break;
							}
							case "userAdd": {
								cc.userAdd(acMember, sc);
				 				break;
							}
							case "userDel": {
								cc.userDel(acMember, sc);
								break;
							}
							case "userList": {
								cc.userList(acMember, sc);
								break;
							}
							case "userPwSet": {
								cc.userPwSet(acMember, sc);
								break;
							}
							case "?": {
								cc.helpCommend();
								break;
							}
						}
						
					}
				}
			}
		} catch (Exception e) {
			System.out.println("* 오류발생 프로그램 종료 *");
		}
		
	}
	
	

}

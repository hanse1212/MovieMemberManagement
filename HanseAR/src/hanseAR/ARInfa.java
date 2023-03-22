package hanseAR;

import java.util.ArrayList;
import java.util.Scanner;

public class ARInfa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MovieMember> mvMenber = new ArrayList<>();
		
		System.out.println("---------- 영화 회원 관리 프로그램 ----------");
		try {
			while(true) {
				System.out.print("HsAR> ");
				String commend = sc.nextLine();
				
				if(commend.equals("v list all")) {
					if(mvMenber.size() == 0) {
						System.out.println("* 생성된 리스트가 없습니다. *");
						continue;
					}
					for(int i=0; i<mvMenber.size(); i++) {
						System.out.println("mvMenber[" + i + "]" + mvMenber.get(i).toString());
					}
					
				} else if(commend.equals("v list")) {
					System.out.print("출력할 인덱스 번호: ");
					int index = sc.nextInt();
					System.out.println("mvMenber[" + index + "]" + mvMenber.get(index).toString());
					
				} else if(commend.equals("list add")) {
					System.out.println("* 이름, 성별, 아이디, vip등급, 예매한영화 순으로 적어주세요. *");
					String[] input = new String[5];
					
					for(int i=0; i<input.length; i++) {
						input[i] = sc.next();
					}
						
					mvMenber.add(new MovieMember(input[0], input[1], input[2], input[3], input[4]));
					
				} else if(commend.equals("list set")) {
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
					
				} else if(commend.equals("list rm")) {
					System.out.print("삭제할 인덱스 번호: ");
					int index = sc.nextInt();
					mvMenber.remove(index);
					System.out.println("[" + index + "] 삭제 완료");
					
				} else if(commend.equals("list select")) {
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
				} else if(commend.equals("?")) {
					System.out.println("v list 인덱스 : 보고싶은 인덱스 번호의 리스트를 출력");
					System.out.println("v list all : 모든 리스트를 출력");
					System.out.println("lits add : 리스트를 생성");
					System.out.println("list set : 리스트를 수정");
					System.out.println("list rm : 리스트를 삭제");
					System.out.println("list select : 리스트를 검색");
					System.out.println("exit : 프로그램 종료");
					
				} else if(commend.equals("exit")) {
					System.out.println("* 안녕히가세요. *");
					sc.close();
					break;
				} else {
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println("* 오류발생 프로그램 종료 *");
		}
		
	}

}

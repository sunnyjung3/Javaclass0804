import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // 게시물 제목
		int[] ids = new int[10]; // 게시물 제목
		String[] titles = new String[10]; // 게시물 내용
		String[] bodies = new String[10]; // 게시물수
		int lastIndex = 0;// 게시물 번호
		int lastId = 0;// 마지막 게시물 번호

		while(true) {
			System.out.println("명령어를 입력하세요");
			String s = sc.nextLine();
			System.out.println(s);

			if (s.equals("exit")) {
				System.out.println("프로그램 종료!");
				break;
			} else if(s.equals("help")) {

				System.out.println("add : 게시물 등록 ");
				System.out.println("list : 게시물 목록 ");
				System.out.println("exit : 프로그램종료");


			} else if(s.equals("add")) {
				
				lastId++;
				int id = lastId;
				ids[lastIndex] = id;
				
				System.out.println("제목을 입력해주세요");
				titles[lastIndex] = sc.nextLine();

				System.out.println("내용을 입력해주세요");
				bodies[lastIndex] = sc.nextLine();

				lastIndex++;

			} else if(s.equals("list")) {

				for(int i = 0; i < lastIndex; i++) {
					System.out.println("번호 : " + ids[i]);
					System.out.println("제목 : " + titles[i]);
					System.out.println("내용 : " + bodies[i]);
					System.out.println("======================");
				}

			} else if(s.equals("update")) {

				System.out.println("게시물 번호 선택");
				String target = sc.nextLine();
				int targetNo = Integer.parseInt(target);
				
				int targetIndex = -1; // 찾는게 없을 때 -1
				
				for(int i = 0; i < lastIndex; i++) {
					if(ids[i] == targetNo) {
						targetIndex = i;
						break;
					}
				}
				
				if(targetIndex == -1) {
					System.out.println("잘못된 게시물 번호");
				} else {
					System.out.println("제목");
					String title = sc.nextLine();
					System.out.println("내용");
					String body = sc.nextLine();
					
					titles[targetIndex] = title;
					bodies[targetIndex] = body;
				}
			
			} else if(s.equals("delete")) {
				System.out.println("게시물 번호 선택");
				String target = sc.nextLine();
				int targetNo = Integer.parseInt(target);
				
				int targetIndex = -1; // 찾는게 없을 때 -1
				
				for(int i = 0; i < lastIndex; i++) {
					if(ids[i] == targetNo) {
						targetIndex = i;
						break;
					}
				}
				
				if(targetIndex == -1) {
					System.out.println("잘못된 게시물 번호");
				}
			} else {
				System.out.println("올바른 명령어가 아닙니다.");

			}
		}

	}

}
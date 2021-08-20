package 자바심화2;
import java.util.Scanner;

public class 복습문제 {

		public static void main(String[] args) {
			//1. 이름 나이 입력받아 전체 인원수 출력
			String[] name = new String[5];
			int[] age = new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("이름과 나이를 입력하세요.");
			for (int i = 0; i < 5; i++) {
				System.out.print("입력>>>> ");
				//입력한 5개값 원본을 배열에 저장하여 남겨놓을 필요가 없다.
				//원본을 쪼개서 쓰고 말거니까!!
				String data = sc.nextLine(); // 김 11
				//쪼갠 것을 담아놓을 임시 배열(이것도 쓰고 날릴 것)
				//name[]에 한번에 담으면 안 된다!
				String n[] = data.split(" ");//{김, 11}
				name[i] = n[0]; //김
				age[i] = Integer.parseInt(n[1]); //11
			}
			sc.close();
			System.out.println("전체 인원수는 " + name.length + "명");
			
			//2. 전체명단 출력
			System.out.println("파티 참석자 전체 명단입니다.");
			for (int i = 0; i < name.length; i++) {
				System.out.println("이름은: " + name[i] + ", 나이는: " + age[i]);
			}
			//참석자 나이 평균
			int sum = 0;
			double avg = 0;
			for (int i = 0; i < age.length; i++) {
				sum += age[i];
				avg = sum / age.length;
			}
			System.out.println("파티 참석자 나이의 평균은 " + avg + "세");
			
			
			
			
			
			
			
			
			
//			for (int i = 0; i < nameAge.length; i++) {
//				nameAge = mem[i].split(" "); //nameAge[0] = {김, 11}
//				System.out.println(nameAge);
//			}
//			party.put(nameAge[i], nameAge[i+1]);
//			System.out.println("전체 인원수는 " + party.size() + "명");
			
			
			
//			party.put("김아무개","22");
//			
//			System.out.println("참여명단: " + party);
			
			
		}
	}


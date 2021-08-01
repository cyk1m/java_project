package 알고리즘;
import java.util.Arrays;
// 이거 복기해보기!
import java.util.Random;

public class 랜덤최소값찾기 {

	public static void main(String[] args) {
		// 1. 1~1000까지의 값을 랜덤하게 10000개 만들어서 최소값을 찾아보세요.
		// 2. 개수를 세어보세요.
		// 3. 위치값을 찾아보세요.
		Random r = new Random(100);
		int[] s2 = new int[10000];
		// 배열에 값 넣는 for문부터 돌려야
		for (int i = 0; i < s2.length; i++) { 
			s2[i] = r.nextInt(1000) + 1;
		}
//		for (int i : s2) {
//			System.out.println(i);
//		}
		
		int min = s2[0]; // 0번값도 구할 수 있다.
		int count = 0; // 2.최소값 1이 몇개인지
		//더 작은지만 체크하는 for문. 계속 순회하며 min는 계속 바뀌는 상황.
		for (int i = 1; i < s2.length; i++) {
			if (s2[i] < min) { 
				min = s2[i];
				//count++; 여기 카운트를 넣으면 안 된다. 여기 if문이 min = 1이란 건 아니니까. 
				//새 for문으로 다시 순회해서 찾아야.
			}
		}
		System.out.println("최소값: " + min); // 이제 min = 1
		
		//아래의 for문으로 최소값의 개수와 위치값을 구할 수 있다.
		String sum = "";
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] == min) { // 1의 개수 찾기
				count++;
				sum = sum + i + "번 "; //sum += i + " ";
			}
		}
		System.out.println(min + "의 개수는 " + count + "개");
		System.out.println(min + "의 위치값은 " + sum);
		
		// 파괴 함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		Arrays.sort(s2);
		System.out.println(s2[0]);
		System.out.println(s2[s2.length-1]);

	}

}

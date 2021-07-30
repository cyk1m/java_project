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
		for (int i = 0; i < s2.length; i++) { // 값 넣은 배열 만드는 for문부터 돌려야
			s2[i] = r.nextInt(1000) + 1;
		}
		
		int min2 = s2[0]; // 0번값도 구할 수 있다.
		int count = 0; // 2.최소값 1이 몇개인지
		for (int i = 1; i < s2.length; i++) {
			if (s2[i] < min2) { //더 작은지만 체크하는 것. 계속 순회하며 min2는 계속 바뀌는 상황.
				min2 = s2[i];
				//count++; 여기 카운트를 넣으면 안 된다. 여기 if문이 min2 = 1이란 건 아니니까. 
				//새 for문으로 다시 순회해서 찾아야.
			}
		}
		System.out.println("최소값: " + min2); // 이제 min2 = 1
		
		//아래의 for문으로 2, 3번 구할 수 있다.
		String sum = "";
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] == min2) { // 1의 개수 찾기
				count++;
				sum = sum + i + "번 "; //sum += i + " ";
			}
		}
		System.out.println(min2 + "의 개수는 " + count + "개");
		System.out.println(min2 + "의 위치값은 " + sum);
		
		// 파괴 함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		Arrays.sort(s2);
		System.out.println(s2[0]);
		System.out.println(s2[s2.length-1]);

	}

}

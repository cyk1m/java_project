package 이차원배열;

public class 열이동일 {

	public static void main(String[] args) {
		// 값을 아는 경우
		int[][] n2 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		}; //->한줄로 써도 ok
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 값을 모르는 경우
		int[][] n1 = new int[3][4];
		System.out.println("2차원 배열의 행의 개수: " + n1.length);
		System.out.println("0행의 배열의 열의 개수: " + n1[0].length);
		System.out.println("1행의 배열의 열의 개수: " + n1[1].length);
		System.out.println("2행의 배열의 열의 개수: " + n1[2].length);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) { //행마다 돌아가는 for문이 다르게
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
	}

}

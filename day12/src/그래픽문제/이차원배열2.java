package 그래픽문제;

public class 이차원배열2 {
// 1차원배열의 모음이기 때문에
// 삐뚤빼뚤하게도 만들 수 있다.(끼워넣는 식)
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int[][] arrList = new int[3][]; // 정방이 아니라(각 행마다 열의 개수가 달라서) 열은 못 정한다.
		arrList[0] = arr1; // 2차원 배열의 0행에 1차원 배열을 끼워넣어라
		arrList[1] = arr2;
		arrList[2] = arr3;
		//		0	1	2	3	4
		//0		0	0	0
		//1		0	0	0	0	0
		//2		0	0	0	0
		arrList[1][1] = 1;
		System.out.println(arrList.length); // 행
		System.out.println(arrList[0].length); //0행의 배열의 크기 3개
		System.out.println(arrList[1].length); //1행의 배열의 크기 5개
		System.out.println(arrList[2].length); //2행의 배열의 크기 4개
	}

}

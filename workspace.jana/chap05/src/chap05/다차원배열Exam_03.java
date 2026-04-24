package chap05;

public class 다차원배열Exam_03 {

	public static void main(String[] args) {
		
		int a0 = 5;
		int a1 = 15;
		int a2 = 34;
		
		// int를 여러개 만들기
		int[] b0 = new int[3];
		// b의 첫번째 변수에 a0넣기
		// 두번째 변수에 a1 넣기
		b0[0] = a0;
		b0[1] = a1;
		b0[2] = a2;
		
		int[] b1 = new int[3];
		b1[0] = a0+1;
		b1[1] = a1+1;
		b1[2] = a2+1;
		
		// b0과 b1을 배열로 만들기
		int[] [] c0 = new int[2][3];
		c0[0] = b0;
		c0[1] = b1;
		
		System.out.println( c0[0][1] == a1 );
		
		System.out.println("c0.length: "+ c0.length);
		System.out.println("b1의 길이: "+ c0[1].length);
		
		
		int[][] c1 = new int[][] { {1,2,3},new int[] {4,5,6} };
		int[][] c2 = {
				         {1,2,3},
				         {4,5,6,7},
				         null
		             };
		
		int[][] arr = new int[2][];
		// 가장 바깥 차원은 꼭 있어야한다
		// heap에 공간은 만들어야해서
		// 모두 null로 초기화
		//   참조 공간은 만들고 실제 배열은 나중에 만들기
		// 가면(비정형) 배열
		// 공간을 연속으로 잡지 않아서 고성능에서는 불리할 수 있다
		
		
		System.out.println(c0);
		System.out.println(c0[0]);
		System.out.println(c0[0][0]);
		
		///////////////////////////////////////////
		System.out.println("---------------------");
		
		int k1 = 10;
		int k2 = k1;
		System.out.println("k2: "+ k2);
		k1 = 5;
		System.out.println("k2: "+ k2);
		
		int[] d1 = {1,2,3};
		// 얕은 복사 ( call by reference )
		// = 기호는 stack의 값(또는 주소)만 복사
		// 값을 변경하는 경우 원본도 바뀐다
		int[] d2 = d1;
		
		System.out.println("d2[0]:"+ d2[0]);
		d1[0] = 4;
		System.out.println("d2[0]:"+ d2[0]);
		
		System.out.println("d1[2]:"+ d1[2]);
		d2[2] = 40;
		System.out.println("d1[2]:"+ d1[2]);
		
		// 깊은 복사( call by value )
		int[] d3 = new int[d1.length];
		for(int i=0; i<d1.length; i++) {
			d3[i] = d1[i];
		}
		
		// 문제 1
		// 꼭 반복문 쓰기
		// 1~5, 11~15, 101~105 를 저장하는 2차원 배열을 만드시오
		// 그리고 거기말고 다른 반복문으로 모두 출력하시오
		
		// 문제 1
	    int[][] array = new int[3][5]; // 3줄짜리 배열한다, 각 줄마다 5칸씩한다
	    
	    for (int i = 0; i < array.length; i++) {
	    	int start = 0;
			
			if (i == 0) start = 1;
			if (i == 1) start = 11;
			if (i == 2) start = 101;
			
			for (int j =0; j < array[i].length; j++) {
				array[i][j] = start + j;
			}						
	    }
	    for (int i1 = 0; i1 < array.length; i1++) {
	    	for (int j = 0; j < array[i1].length; j++) {
	    		System.out.println(array[i1][j] + " ");
	    	}
	    }
	    System.out.println();
	    
	    // 3차원 배열 문제
	    int[][][] array1 = new int[3][1][5];
	    
	    int start = 0;
	    for (int i = 0; i < array1.length; i++) {
	    	
	    	if (i == 0) start = 1;
			if (i == 1) start = 11;
			if (i == 2) start = 101;
			
			for (int i1 = 0; i1 < array1[0].length; i1++) {
				 for (int k = 0; k < array1[0][0].length; k++) {
					 array1[i][i1][k] = start + k;
					 System.out.print(array1[i][i1][k] + " ");
				 }
			}
			System.out.println();
	    }
	}
}

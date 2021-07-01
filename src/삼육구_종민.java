package 숫자;

public class 삼육구_종민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("369 게임 시작~ \n");
		for (int index=1 ; index <= 1000 ; index++)
		{
			if( (index == 3) || (index == 6) || (index == 9) ) {
				System.out.printf("%d (짝)\n", index);
			}
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100의 자리가 369 이고 10의자리가 369 1의 자리가 369
					&& (index / 10 % 10 == 3) | (index / 10 % 10 == 6) | (index / 10 % 10 == 9)
					&& (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9)
				    ) System.out.printf("%d (짝짝짝)\n", index);
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100의 자리가 369 이고 10의자리가 369
					&& (index / 10 % 10 == 3) | (index / 10 % 10 == 6) | (index / 10 % 10 == 9)
				    ) System.out.printf("%d (짝짝)\n", index);
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100의 자리가 369 이고 1의자리가 369
					&& (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9)
				    ) System.out.printf("%d (짝짝)\n", index);
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100의 자리가 369
				    ) System.out.printf("%d (짝)\n", index);
			else if ( (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9) // 1의 자리가 369 이고 10 의자리가 369
					&& (index / 10 == 3) | (index / 10 == 6) | (index / 10 == 9)
				    ) System.out.printf("%d (짝짝)\n", index);
			else if ( (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9) // 1의 자리가 369일때
					) System.out.printf("%d (짝)\n", index);
			else if ( (index / 10 == 3) | (index / 10 == 6) | (index / 10 == 9) // 10의 자리가 369일때
				    ) System.out.printf("%d (짝)\n", index);
			else {
				System.out.printf("%d\n", index);
				}
		}
		System.out.println("\n369 게임 끝\n");
	}
}

//&& (index / 10 == 3) | (index / 10 == 6) | (index / 10 == 9)
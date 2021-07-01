package 숫자;
import java.util.Scanner;

public class 숫자비교_종민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne, numberTwo, numberThree, numberFour, numberFive;
		Scanner myInput = new Scanner(System.in);
			
		System.out.print("첫번째숫자 : ");
		numberOne = myInput.nextInt();
		System.out.print("두번째숫자 : ");
		numberTwo = myInput.nextInt();
		System.out.print("세번째숫자 : ");
		numberThree = myInput.nextInt();
		System.out.print("네번째숫자 : ");
		numberFour = myInput.nextInt();
		System.out.print("다섯번째숫자 : ");
		numberFive = myInput.nextInt();
		
		if(numberOne >= numberTwo) {
				if (numberTwo >= numberThree)
					System.out.printf("%d > %d > %d > %d > %d", numberOne, numberTwo, numberThree, numberFour, numberFive);
					else if (numberThree >= numberTwo)
						System.out.printf("%d > %d > %d > %d > %d", numberOne, numberTwo, numberThree, numberFour, numberFive);
		}
		else if (numberOne >= numberThree) {
			System.out.printf("%d > %d > %d > %d > %d", numberOne, numberTwo, numberThree, numberFour, numberFive);
				if (numberThree >= numberOne)
					System.out.printf("%d > %d > %d > %d > %d", numberOne, numberTwo, numberThree, numberFour, numberFive);;
		}
		else if (numberThree >= numberTwo) {
					if (numberTwo >= numberOne)
						System.out.printf("%d > %d > %d > %d > %d", numberOne, numberTwo, numberThree, numberFour, numberFive);
					else if (numberOne >= numberTwo)
						System.out.printf("%d > %d > %d > %d > %d", numberOne, numberTwo, numberThree, numberFour, numberFive);		
		}

		System.out.print("\n\n프로그램 수행완료");
		myInput.close();
	}
}
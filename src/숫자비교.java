package 숫자;
import java.util.Scanner;

public class 숫자비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne, numberTwo, numberThree, numberFour, numberFive, temp;
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
		
		if(numberOne < numberTwo) {
			temp = numberOne;
			numberOne = numberTwo;
			numberTwo = temp;
		}
		if(numberOne < numberThree) {
			temp = numberOne;
			numberOne = numberThree;
			numberThree = temp;
		}
		if(numberOne < numberFour) {
			temp = numberOne;
			numberOne = numberFour;
			numberFour = temp;
		}
		if(numberOne < numberFive) {
			temp = numberOne;
			numberOne = numberFive;
			numberFive = temp;
		}
		if(numberTwo < numberThree) {
			temp = numberTwo;
			numberTwo = numberThree;
			numberThree = temp;
		}
		if(numberTwo < numberFour) {
			temp = numberTwo;
			numberTwo = numberFour;
			numberFour = temp;
		}
		if(numberTwo < numberFive) {
			temp = numberTwo;
			numberTwo = numberFive;
			numberFive = temp;
		}
		if(numberThree < numberFour) {
			temp = numberThree;
			numberThree = numberFour;
			numberFour = temp;
		}
		if(numberThree < numberFive) {
			temp = numberThree;
			numberThree = numberFive;
			numberFive = temp;
		}
		if(numberFour < numberFive) {
			temp = numberFour;
			numberFour = numberFive;
			numberFive = temp;
		}		
		System.out.printf("%d > %d > %d > %d > %d\n", numberOne, numberTwo, numberThree, numberFour, numberFive);
		System.out.print("\n프로그램 수행완료");
		myInput.close();
	}

}
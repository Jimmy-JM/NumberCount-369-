package ����;
import java.util.Scanner;

public class ���ں�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne, numberTwo, numberThree, numberFour, numberFive;
		Scanner myInput = new Scanner(System.in);
			
		System.out.print("ù��°���� : ");
		numberOne = myInput.nextInt();
		System.out.print("�ι�°���� : ");
		numberTwo = myInput.nextInt();
		System.out.print("����°���� : ");
		numberThree = myInput.nextInt();
		System.out.print("�׹�°���� : ");
		numberFour = myInput.nextInt();
		System.out.print("�ټ���°���� : ");
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

		System.out.print("\n\n���α׷� ����Ϸ�");
		myInput.close();
	}
}
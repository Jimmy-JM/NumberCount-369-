package ����;

public class ������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("369 ���� ����~ \n");
		for (int index=1 ; index <= 1000 ; index++)
		{
			if( (index == 3) || (index == 6) || (index == 9) ) {
				System.out.printf("%d (¦)\n", index);
			}
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100�� �ڸ��� 369 �̰� 10���ڸ��� 369 1�� �ڸ��� 369
					&& (index / 10 % 10 == 3) | (index / 10 % 10 == 6) | (index / 10 % 10 == 9)
					&& (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9)
				    ) System.out.printf("%d (¦¦¦)\n", index);
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100�� �ڸ��� 369 �̰� 10���ڸ��� 369
					&& (index / 10 % 10 == 3) | (index / 10 % 10 == 6) | (index / 10 % 10 == 9)
				    ) System.out.printf("%d (¦¦)\n", index);
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100�� �ڸ��� 369 �̰� 1���ڸ��� 369
					&& (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9)
				    ) System.out.printf("%d (¦¦)\n", index);
			else if ( (index / 100 == 3) | (index / 100 == 6) | (index / 100 == 9) // 100�� �ڸ��� 369
				    ) System.out.printf("%d (¦)\n", index);
			else if ( (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9) // 1�� �ڸ��� 369 �̰� 10 ���ڸ��� 369
					&& (index / 10 == 3) | (index / 10 == 6) | (index / 10 == 9)
				    ) System.out.printf("%d (¦¦)\n", index);
			else if ( (index % 10 == 3) | (index % 10 == 6) | (index % 10 == 9) // 1�� �ڸ��� 369�϶�
					) System.out.printf("%d (¦)\n", index);
			else if ( (index / 10 == 3) | (index / 10 == 6) | (index / 10 == 9) // 10�� �ڸ��� 369�϶�
				    ) System.out.printf("%d (¦)\n", index);
			else {
				System.out.printf("%d\n", index);
				}
		}
		System.out.println("\n369 ���� ��\n");
	}
}

//&& (index / 10 == 3) | (index / 10 == 6) | (index / 10 == 9)
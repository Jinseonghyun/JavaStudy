package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� ����� �Է��ϼ���[GUEST, LOGIN, ADMIN]: ");
		String grade = scanner.nextLine();
		
		AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
		System.out.println("����� ����� " + authGrade.getDescription() + "�Դϴ�.");
		
		System.out.println("==�޴� ���==");
		if (authGrade.getLevel() > 0) {
			System.out.println("- ���� ȭ��");
		}
		
		if (authGrade.getLevel() > 1) {
			System.out.println("- �̸��� ���� ȭ��");
		}
		
		if (authGrade.getLevel() > 2) {
			System.out.println(" - ������ ȭ��");
		}
		
	}

}

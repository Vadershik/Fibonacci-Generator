package com.vader;

/* � ����� ��� ���� ���� �������� � �����������.
 * ���� � ��� ��� � ����� ���������� int ���� ����������� � ��������� �����, 
 * ��-�� ����� ��� ������� ���-�� ����� �� �������� ���������� ���-�� ������������� � ������������� �������� */

import com.vader.lib.Fibonacci;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� ����� > ");
		int n = in.nextInt();
		Fibonacci.gen(n); //��� ��������� ���������� ��� �������� � ����
	}
}

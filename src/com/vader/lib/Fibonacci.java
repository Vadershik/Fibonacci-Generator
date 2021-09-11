package com.vader.lib;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
	public static void gen(int count) {
		int s[] = new int[count+2];
		int index;
		s[0] = 0;
		s[1] = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Название файла в который будут записаны числа > ");
		String out = in.nextLine();
		//Сам генератор чисел Фибоначчи
		for(index = 2;index <= count; index++) {
			s[index] = s[index-1] + s[index-2];
		}
		try(FileWriter writer = new FileWriter(out+".txt")) {
			//Запись всех значений из массива
			for(int i = 0;i<count;i++) {
				writer.write(s[i]+" ");
			}
			writer.flush();
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

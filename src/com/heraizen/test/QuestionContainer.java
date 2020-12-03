package com.heraizen.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionContainer {

	List<Question> list = new ArrayList<Question>();
	int correctAnswerCount = 0;
	int wrongAnswerCount = 0;

	public QuestionContainer() {

		list.add(new Question("java is programming or platform", "A. Programming", "B. Platform", "C.Both",
				"D.None of the above", "C"));
		list.add(new Question("Which of the following is not a Java features", "A. Dynamic", "B. Architecture Neutral",
				"C.Use of pointers", "D.Object-oriented", "C"));
		list.add(new Question("Which is used to find and fix bugs in the Java programs", "A. JVM", "B. JRE", "C.JDK",
				"D.JDB", "D"));
		list.add(new Question("Which package contains the Random class?", "A. java.util package",
				"B. java.lang package", "C.java.awt package", "D.java.io package", "A"));

	}

	public void beginTest() {

//		for (Question ques : list) {
//			System.out.println(ques.question + "?");
//			System.out.println(ques.option1 + " " + ques.option2 + " " + ques.option3 + " " + ques.option4);
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter your answer");
//			String answer = scan.next();
//			if (answer.matches("^[A-D]")) {
//				if (answer.equals(ques.answer)) {
//
//					correctAnswerCount++;
//
//				} else {
//					wrongAnswerCount++;
//
//				}
//			} else {
//				System.out.println("enter correct input");
//
//				break;
//			}
//
//		}
		int i = list.size();
		while (i > 0) {
			System.out.println(list.get(i - 1).question + "?");
			System.out.println(list.get(i - 1).option1 + " " + list.get(i - 1).option2 + " " + list.get(i - 1).option3
					+ " " + list.get(i - 1).option4);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your answer");
			String answer = scan.next();
			if (answer.matches("^[A-D]")) {
				if (answer.equals(list.get(i - 1).answer)) {

					correctAnswerCount++;

				} else {
					wrongAnswerCount++;

				}
				i--;
			} else {
				System.out.println("enter correct input");

			}

		}

	}

	void showResult() {

		System.out.println("Correct:" + correctAnswerCount);
		System.out.println("Wrong:" + wrongAnswerCount);
		int result;
		result = (correctAnswerCount * 100) / 4;
		System.out.println("Marks:" + result);
		if (result > 40) {
			System.out.println("Result:Pass");
		}

		else {
			System.out.println("Result:Fail");
		}

	}

}

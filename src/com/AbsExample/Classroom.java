package com.AbsExample;

import java.util.Scanner;

public class Classroom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Students in class: ");
		
		int totalStu = sc.nextInt();
		
		int[]score = new int[totalStu];
		
		System.out.println("Enter the Scores for " + totalStu + "students");
		
		for(int i = 0; i<score.length; i++){
			System.out.print("Student " + (i+1) + " score: ");
			
			score[i] = sc.nextInt();
		}
		
		int totalSum = 0;
		int highestScore = score[0];
		
		for(int i = 0; i<score.length; i++){
			totalSum += score[i];
			
			if(score[i]>highestScore){
				highestScore = score[i];
				
				
			}
		}
		
		double classAvg = (double)totalSum/totalStu;
		
		System.out.println("-------class performance summary---------");
		System.out.println("class avg: " + classAvg);
		System.out.println("Highest Score Achieved: " + highestScore );
		
		
		sc.close();
		
		
	}	
		
		
	}
		


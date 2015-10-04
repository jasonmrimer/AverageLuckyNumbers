//CMIS141_Week2_Project1
//Project 1
//Programmer: Jason M. Rimer
//Date: 17FEB2012
//Purpose: This program uses input boxes to gather a user's name, age, and three lucky numbers;
//	calculates an average of the three numbers; and outputs the name and average.

//Note: you will find in the lucky number section, the luckyStrings are parsed into
//	doubles and then cast into integers. The strings are able to parse into integer, but
//	the casting was implemented to show understanding of the function. The integers merely
//	allow a more confined, clean output.

import javax.swing.*;
import java.util.*;
import java.text.*;

public class Main {//startClass

	public static void main(String[] args) {//startMethod

        //Get Today
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEEEE", Locale.US);
        String day = dateFormat.format(today);

		//Initialize and Input name strings
		String firstName = "";
		String middleName = "";
		String lastName = "";
		
				
		//First Name
		firstName = 
		JOptionPane.showInputDialog(null,
		"Hi! It's " + day + " and today we will be averaging your three lucky numbers.\n" +
		"What is your first name?",
		"Lucky Numbers",
		JOptionPane.QUESTION_MESSAGE);
		
		//Middle Name & Get Initial
		middleName = 
		JOptionPane.showInputDialog(null,
		"Your middle name?",
		"Lucky Numbers",
		JOptionPane.QUESTION_MESSAGE);
		char middleInitial = middleName.charAt(0);
		
		//Last Name
		lastName = 
		JOptionPane.showInputDialog(null,
		"Last name?",
		"Lucky Numbers",
		JOptionPane.QUESTION_MESSAGE);
		
		//Initialize and Input age and lucky names
		String ageString = "";
		String ageMessage = "";
		String luckyString1 = "";
		String luckyString2 = "";
		String luckyString3 = "";
		double ageDouble = 0;
		double luckyDouble1 = 0;
		double luckyDouble2 = 0;
		double luckyDouble3 = 0;
		int luckyInt1 = 0;
		int luckyInt2 = 0;
		int luckyInt3 = 0;
		int luckyAverage = 0;
				
		//Get Age, change string to double
		ageString = 
			JOptionPane.showInputDialog(null,
			"Well, " + firstName + " " + middleInitial + ". " + lastName + ", " +
			"it's nice to get things started with you.\n" + 
			"How old are you?",
			"Lucky Numbers",
			JOptionPane.QUESTION_MESSAGE);
		ageDouble = Double.parseDouble(ageString);
		
		//Check age, print message
		if (ageDouble < 12)
			ageMessage = "Heya, kiddo! ";
		else if (ageDouble < 20)
			ageMessage = "A teenager, ey? ";
		else if (ageDouble == 20)
			ageMessage = "Wow, so close! I'll buy you a drink in a year, but in the meantime...";
		else 
			ageMessage = "An adult with lucky numbers?? Well... ";
		
		//Get Lucky Numbers, parse String to Double, cast double as int
		
		//Lucky Number 1
		luckyString1 = 
			JOptionPane.showInputDialog(null,
			ageMessage + "What is your first lucky number?",
			"Lucky Numbers",
			JOptionPane.QUESTION_MESSAGE);
		luckyDouble1 = Double.parseDouble(luckyString1);
		luckyInt1 = (int)luckyDouble1;
		
		//Lucky Number 2
		luckyString2 = 
			JOptionPane.showInputDialog(null,
			"What about your second?",
			"Lucky Numbers",
			JOptionPane.QUESTION_MESSAGE);
		luckyDouble2 = Double.parseDouble(luckyString2);
		luckyInt2 = (int)luckyDouble2;
		
		//Lucky Number 3
		luckyString3 = 
			JOptionPane.showInputDialog(null,
			"And your third?",
			"Lucky Numbers",
			JOptionPane.QUESTION_MESSAGE);
		luckyDouble3 = Double.parseDouble(luckyString3);
		luckyInt3 = (int)luckyDouble3;
		
		//Calculate Lucky Average
		luckyAverage = (luckyInt1 + luckyInt2 + luckyInt3)/3;
		
		//Display Name, Lucky Numbers, and Lucky Average
		JOptionPane.showMessageDialog(null,
		firstName + " " + middleName + " " + lastName +
		", the average of your lucky numbers " + 
		"(" + luckyInt1 + ", " + luckyInt2 + ", " + luckyInt3 + ") " +
		"is: " + luckyAverage,
		"Lucky Numbers",
		JOptionPane.INFORMATION_MESSAGE);	

	}//endMethod

}//endClass

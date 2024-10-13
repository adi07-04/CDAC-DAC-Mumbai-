package oop.assignment4.Q3;

import java.util.Scanner;

public class BmiTracker {
	
	 float height;
	 float weight;
	 float BMI;
	 String result;
	


		public void setHeight(float height) {
			this.height = height;
		}

		public void setWeight(float weight) {
			this.weight = weight;
		}

		public float getBMI() {
			return BMI;
		}

		public void setBMI(float bMI) {
			BMI = bMI;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}
		
		
		
		void acceptRecord(){
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter height (in meter): ");
	        float height = sc.nextFloat();
	        setHeight(height); 
	        System.out.print("Enter weight (in Kg): ");
	        weight = sc.nextFloat();
	        setWeight(weight);
	    }
	 
	 
		void calculateBMI(){
	        BMI = weight/(height*height);
	        setBMI(BMI);
	        if (BMI < 18.5) {
	        	setResult("UnderWeight");
	        } else if (BMI >= 18.5 && BMI <= 24.9) {
	        	setResult("Normal Weight");
	        } else if (BMI >= 25 && BMI <= 29.9) {
	        	setResult("Overweight");
	        }else{
	        	setResult("Obesity");
	        }
	    }
		
		void printRecord() {
			System.out.println("Bmi index: "+ getBMI());
			System.out.println("Result: "+ getResult());
		}


}

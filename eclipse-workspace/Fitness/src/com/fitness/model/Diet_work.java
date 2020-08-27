package com.fitness.model;

public class Diet_work {

	public String[] diet_and_work(float bmi) {
		String[] res = new String[2];
		
		////////DIET///////////
		
		String diet1 = "\n1. Eating at least 5 portions of a variety of fruit and vegetables every day.\n2. Basing meals on potatoes, bread, rice, pasta or other starchy carbohydrates.\n3. Choose wholegrain where possible.\n4. Having some dairy or dairy alternatives (such as soya drinks and yoghurts).\n5. Have whole (full-fat) milk until you build your weight back up.\n6. Drinking plenty of fluids. The government recommends 6 to 8 glasses a day. \n7. But try not to have drinks just before meals to avoid feeling too full to eat.\n";
		String diet2 = "\n1. Emphasizes fruits, vegetables, whole grains, and fat-free or low-fat milk and milk products.\n2. Includes lean meats, poultry, fish, beans, eggs, and nuts.\n3. low in saturated fats, trans fats, cholesterol, salt (sodium), and added sugars.\n4. Stays within your daily calorie needs.\n";
		String diet3 = "\n1. Swap refined carb sources for whole grains.\n2. Just like grains, whole dals are also a better bet than the washed dals.\n3. Avoid red meat and opt for lean meat like chicken and salmon.\n4. Adding protein with every meal could prove to be a game changer for anyone trying to lose weight.\n5. Load up on seasonal vegetables.\n";
		
		////////WORKOUT///////////
		
		String work_plan1 = "\nPushups"+"\n"+"Pullups"+"\n"+"Squats"+"\n"+"Lunges"+"\n"+"BenchPress";
		String work_plan2 = "\nWalking"+"\n"+"Bicycling"+"\n"+"Streching"+"\n"+"Aerobics"+"\n"+"Light weightlift";
		String work_plan3 = "\nJump Rope"+"\n"+"Forward Lunges"+"\n"+"Squats"+"\n"+"Mountain Climber"+"\n"+"Swimming";
		
		////////LOGIC///////////
		
		if(bmi<=18.5) {
			res[0] = diet1;
			res[1] = work_plan1;
		}else if(bmi>18.5 && bmi<=25) {
			res[0] = diet2;
			res[1] = work_plan2;
		}else {
			res[0] = diet3;
			res[1] = work_plan3;
		}
		
		return res;
	}
}

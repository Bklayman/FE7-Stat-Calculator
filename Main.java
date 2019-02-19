package fe7calculator;

import java.util.List;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
	List<String> dataList = getData(args[0]);
	String data1 = dataList.get(0);
	data1.trim();
	String[] splitted = data1.split(" ");
	String difficulty = splitted[0];
	boolean hard;
	if(difficulty.equals("Hard")){
	    hard = true;
	} else {
	    hard = false;
	}
	String storyStart = splitted[1];
	boolean willPromote = false;
	for(int i = 1; i < dataList.size(); i++){
	    CurrentChar current = new CurrentChar(dataList.get(i), storyStart, hard);
	    CheckChar check = new CheckChar(current.getBases());
	    do{
		int levelsNeeded = levelsNeeded(dataList.get(i), check, current);
		check.gainLevels(current.getBases(), levelsNeeded);
		check.checkStatCaps();
		if(!check.getCharClass().equals(current.getCurClass())){
		    check.classChange(current.getBases().getName());
		    willPromote = true;
		} else {
		    willPromote = false;
		}
	    } while(willPromote);
	    check.addStatBoosters(dataList.get(i));
	    printResults(check, current);
	} 
    }    

    public static List<String> getData(String fileName){
	DataExtractor using = new DataExtractor(fileName);
	return using.getData();
    }

    public static int levelsNeeded(String data, CheckChar check, CurrentChar current){
	String[] splitted = data.split(" ");
	if(check.getCharClass() != current.getCurClass()){
	    return Integer.parseInt(splitted[3]) - check.getCurLvl();
	} else {
	    return Integer.parseInt(splitted[2]) - check.getCurLvl();
	}
    }

    public static void printResults(CheckChar check, CurrentChar current){
      	System.out.println(current.getBases().getName() + "'s Results: ");
	double diffHP, diffStr, diffSkl, diffSpd, diffLck, diffDef, diffRes;
	diffHP = check.getCurHP() - (double) current.getCurHP();
	diffStr = check.getCurStr() - (double) current.getCurStr();
	diffSkl = check.getCurSkl() - (double) current.getCurSkl();
	diffSpd = check.getCurSpd() - (double) current.getCurSpd();
	diffLck = check.getCurLck() - (double) current.getCurLck();
	diffDef = check.getCurDef() - (double) current.getCurDef();
	diffRes = check.getCurRes() - (double) current.getCurRes();
	if(diffHP >= 0){
	    System.out.println("Their HP is " + diffHP + " points higher than average (" + check.getCurHP() + ").");
	} else {
	    System.out.println("Their HP is " + diffHP + " points lower than average (" + check.getCurHP() + ").");
	}
	if(diffStr >= 0){
	    System.out.println("Their strength is " + diffStr + " points higher than average (" + check.getCurStr() + ").");
	} else {
	    System.out.println("Their strength is " + diffStr + " points lower than average (" + check.getCurStr() + ").");
	}
	if(diffSkl >= 0){
	    System.out.println("Their skill is " + diffSkl + " points higher than average (" + check.getCurSkl() + ").");
	} else {
	    System.out.println("Their skill is " + diffSkl + " points lower than average (" + check.getCurSkl() + ").");
	}
	if(diffSpd >= 0){
	    System.out.println("Their speed is " + diffSpd + " points higher than average (" + check.getCurSpd() + ").");
	} else {
	    System.out.println("Their speed is " + diffSpd + " points lower than average (" + check.getCurSpd() + ").");
	}
	if(diffLck >= 0){
	    System.out.println("Their luck is " + diffLck + " points higher than average (" + check.getCurLck() + ").");
	} else {
	    System.out.println("Their luck is " + diffLck + " points lower than average (" + check.getCurLck() + ").");
	}
	if(diffDef >= 0){
	    System.out.println("Their defense is " + diffDef + " points higher than average (" + check.getCurDef() + ").");
	} else {
	    System.out.println("Their defense is " + diffDef + " points lower than average (" + check.getCurDef() + ").");
	}
	if(diffRes >= 0){
	    System.out.println("Their resistance is " + diffRes + " points higher than average (" + check.getCurRes() + ").");
	} else {
	    System.out.println("Their resistance is " + diffRes + " points lower than average (" + check.getCurRes() + ").");
	}
    }

}
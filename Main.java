package fe7calculator;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

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
	try(PrintWriter pw = new PrintWriter("Character_Stat_Distributions.txt")){
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
		    printResults(check, current, pw);
		}
	    } catch (FileNotFoundException e){
	    e.printStackTrace();
	}
    }    

    public static List<String> getData(String fileName){
	DataExtractor using = new DataExtractor(fileName);
	return using.getData();
    }

    public static int levelsNeeded(String data, CheckChar check, CurrentChar current){
	String[] splitted = data.split(" ");
	if(!check.getCharClass().equals(current.getCurClass())){
	    return Integer.parseInt(splitted[3]) - check.getCurLvl();
	} else {
	    return Integer.parseInt(splitted[2]) - check.getCurLvl();
	}
    }

    public static void printResults(CheckChar check, CurrentChar current, PrintWriter pw){
      	pw.println(current.getBases().getName() + "'s Results: ");
	double diffHP, diffStr, diffSkl, diffSpd, diffLck, diffDef, diffRes;
	diffHP = check.getCurHP() - (double) current.getCurHP();
	diffStr = check.getCurStr() - (double) current.getCurStr();
	diffSkl = check.getCurSkl() - (double) current.getCurSkl();
	diffSpd = check.getCurSpd() - (double) current.getCurSpd();
	diffLck = check.getCurLck() - (double) current.getCurLck();
	diffDef = check.getCurDef() - (double) current.getCurDef();
	diffRes = check.getCurRes() - (double) current.getCurRes();
	DecimalFormat df = new DecimalFormat("###.##");
	if(diffHP < 0){
	    pw.println("     Their HP is " + df.format(-1 * diffHP) + " points higher than average (" + df.format(check.getCurHP()) + ").");
	} else if(diffHP > 0) {
	    pw.println("     Their HP is " + df.format(diffHP) + " points lower than average (" + df.format(check.getCurHP()) + ").");
	} else {
	    pw.println("     Their HP is average (" + df.format(check.getCurHP()) + ").");
	}
	if(diffStr < 0){
	    pw.println("     Their strength is " + df.format(-1 * diffStr) + " points higher than average (" + df.format(check.getCurStr()) + ").");
	} else if(diffStr > 0){
	    pw.println("     Their strength is " + df.format(diffStr) + " points lower than average (" + df.format(check.getCurStr()) + ").");
	} else {
	    pw.println("     Their strength is average (" + df.format(check.getCurStr()) + ").");
	}
	if(diffSkl < 0){
	    pw.println("     Their skill is " + df.format(-1 * diffSkl) + " points higher than average (" + df.format(check.getCurSkl()) + ").");
	} else if(diffSkl > 0){
	    pw.println("     Their skill is " +  df.format(diffSkl) + " points lower than average (" + df.format(check.getCurSkl()) + ").");
	} else {
	    pw.println("Their skill is average (" + df.format(check.getCurSkl()) + ").");
	}
	if(diffSpd < 0){
	    pw.println("     Their speed is " + df.format(-1 * diffSpd) + " points higher than average (" + df.format(check.getCurSpd()) + ").");
	} else if(diffSpd > 0){
	    pw.println("     Their speed is " + df.format(diffSpd) + " points lower than average (" + df.format(check.getCurSpd()) + ").");
	} else {
	    pw.println("     Their speed is average (" + df.format(check.getCurSpd()) + ").");
	}
	if(diffLck < 0){
	    pw.println("     Their luck is " + df.format(-1 * diffLck) + " points higher than average (" + df.format(check.getCurLck()) + ").");
	} else if(diffLck > 0) {
	    pw.println("     Their luck is " + df.format(diffLck) + " points lower than average (" + df.format(check.getCurLck()) + ").");
	} else {
	    pw. println("     Their luck is average (" + df.format(check.getCurLck()) + ").");
	}
	if(diffDef < 0){
	    pw.println("     Their defense is " + df.format(-1 * diffDef) + " points higher than average (" + df.format(check.getCurDef()) + ").");
	} else if(diffDef > 0){
	    pw.println("     Their defense is " + df.format(diffDef) + " points lower than average (" + df.format(check.getCurDef()) + ").");
	} else {
	    pw.println("     Their defense is average (" + df.format(check.getCurDef()) + ").");
	}
	if(diffRes < 0){
	    pw.println("     Their resistance is " + df.format(-1 * diffRes) + " points higher than average (" + df.format(check.getCurRes()) + ").");
	} else if(diffRes > 0){
	    pw.println("     Their resistance is " + df.format(diffRes) + " points lower than average (" + df.format(check.getCurRes()) + ").");
	} else {
	    pw.println("     Their resistance is average (" + df.format(check.getCurRes()) + ").");
	}
    }

}
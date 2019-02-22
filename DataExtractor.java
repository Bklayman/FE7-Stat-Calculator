package fe7calculator;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DataExtractor{

    private List<String> data;

    public DataExtractor(String fileName){
	data = new ArrayList<String>();
	try(Scanner reader = new Scanner(new File(fileName))){
		while(reader.hasNext()){
		    String next = reader.nextLine();
		    String[] splitted = next.split(" ");
		    if(splitted.length == 19){
			String firstWord = splitted[1];
			String secondWord = splitted[2];
			String combined = firstWord + "_" + secondWord;
			next = splitted[0] + " " + combined + " ";
			for(int i = 3; i < splitted.length; i++){
			    next += splitted[i] + " ";
			}
		    }
		    data.add(next);
		}
	}
	catch(FileNotFoundException e){
	    System.out.println("The file " + fileName + " could not be found. The data has been initialized as empty.");
	}
	catch(Exception e){
	    System.out.println("Error occured while extracting data.");
	}
    }

    public List<String> getData(){
	return data;
    }
}
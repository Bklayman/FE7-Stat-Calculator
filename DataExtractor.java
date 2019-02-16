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
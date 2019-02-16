package fe7calculator;

import java.util.List;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

    }    

    public static List<String> getData(String fileName){
	DataExtractor using = new DataExtractor(fileName);
	return using.getData();
    }

}
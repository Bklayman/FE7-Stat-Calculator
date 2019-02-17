package fe7calculator;

public class CurrentChar{

    private BaseChar Bases; //Finds this character's base stats without manipulation.
    private int CurHP, CurStr, CurSkl, CurSpd, CurLck, CurDef, CurRes; //Creates variables for the player's current stats
    private String CurClass; //Creates a varibale for the player's current class.

    public CurrentChar(String data){
	String[] splitted = data.split(" ");
	CurClass = splitted[1];
	CurHP = Integer.parseInt(splitted[3]);
	CurStr = Integer.parseInt(splitted[4]);
	CurSkl = Integer.parseInt(splitted[5]);
	CurSpd = Integer.parseInt(splitted[6]);
	CurLck = Integer.parseInt(splitted[7]);
	CurDef = Integer.parseInt(splitted[8]);
	CurRes = Integer.parseInt(splitted[9]);
    }

    public BaseChar getBases(){
	return Bases;
    }

    public int getCurHP(){
	return CurHP;
    }

    public int getCurStr(){
	return CurStr;
    }

    public int getCurSkl(){
	return CurSkl;
    }

    public int getCurSpd(){
	return CurSpd;
    }

    public int getCurLck(){
	return CurLck;
    }

    public int getCurDef(){
	return CurDef;
    }

    public int getCurRes(){
	return CurRes;
    }

    public String getCurClass(){
	return CurClass;
    }

}
package fe7calculator;

public class CurrentChar{

    private BaseChar Bases; //Finds this character's base stats without manipulation.
    private int CurHP, CurStr, CurSkl, CurSpd, CurLck, CurDef, CurRes; //Creates variables for the player's current stats
    private String CurClass; //Creates a varibale for the player's current class.

    public CurrentChar(String data){
	String[] splitted = data.split(" ");
	CurClass = splitted[1];
	CurHP = Integer.parseInt(splitted[4]);
	CurStr = Integer.parseInt(splitted[5]);
	CurSkl = Integer.parseInt(splitted[6]);
	CurSpd = Integer.parseInt(splitted[7]);
	CurLck = Integer.parseInt(splitted[8]);
	CurDef = Integer.parseInt(splitted[9]);
	CurRes = Integer.parseInt(splitted[10]);
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
package fe7calculator;

public class CurrentChar{

    private BaseChar Bases; //Finds this character's base stats without manipulation.
    private int CurHP, CurStr, CurSkl, CurSpd, CurLck, CurDef, CurRes, AddHP, AddStr, AddSkl, AddSpd, AddLck, AddDef, AddRes; //Creates variables for the player's current stats and added stat boosters
    private String CurClass; //Creates a varibale for the player's current class.
    private boolean HardMode; //Checks to see if the player is playing on hard mode.

    public CurrentChar(BaseChar BaseStats, int HPCur, int StrCur, int SklCur, int SpdCur, int LckCur, int DefCur, int ResCur, int HPAdd, int StrAdd, int SklAdd, int SpdAdd, int LckAdd, int DefAdd, int ResAdd, String ClassCur, boolean ModeHard){
	Bases = BaseStats;
	CurHP = HPCur;
	CurStr = StrCur;
	CurSkl = SklCur;
	CurSpd = SpdCur;
	CurLck = LckCur;
	CurDef = DefCur;
	CurRes = ResCur;
	AddHP = HPAdd;
	AddSkl = SklAdd;
	AddSpd = SpdAdd;
	AddLck = LckAdd;
	AddDef = DefAdd;
	AddRes = ResAdd;
	CurClass = ClassCur;
	HardMode = ModeHard;
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

    public int getAddHP(){
	return AddHP;
    }

    public int getAddSkl(){
	return AddSkl;
    }

    public int getAddSpd(){
	return AddSpd;
    }

    public int getAddLck(){
	return AddLck;
    }

    public int getAddDef(){
	return AddDef;
    }

    public int getAddRes(){
	return AddRes;
    }

    public String getCurClass(){
	return CurClass;
    }

    public boolean getHardMode(){
	return HardMode;
    }

}
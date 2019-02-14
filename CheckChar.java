package fe7calculator;

public class CheckChar{

    private double CurHP, CurStr, CurSkl, CurSpd, CurLck, CurDef, CurRes;

    public CheckChar(double HPCur, double StrCur, double SklCur, double SpdCur, double LckCur, double DefCur, double ResCur){
	CurHP = HPCur;
	CurStr = StrCur;
	CurSkl = SklCur;
	CurSpd = SpdCur;
	CurLck = LckCur;
	CurDef = DefCur;
	CurRes = ResCur;
    }

    public double getCurHP(){
	return CurHP;
    }

    public double getCurStr(){
	return CurStr;
    }

    //    public CheckChar gainLevels(BaseChar bases, int numLevels){
    //  double addHP, addStr, addSkl, addSpd, addLck, addDef, addRes;
	
    //}

}
package fe7calculator;

public class BaseChar{

    private String Name, CharClass;
    private int BaseHP, BaseStr, BaseSkl, BaseSpd, BaseLck, BaseDef, BaseRes;
    private double HPGrowth, StrGrowth, SklGrowth,SpdGrowth, LckGrowth, DefGrowth, ResGrowth;

    public BaseChar(String title, String type, int HPBase, int StrBase, int SklBase, int SpdBase, int LckBase, int DefBase, int ResBase, double GrowthHP, double GrowthStr, double GrowthSkl, double GrowthSpd, double GrowthLck, double GrowthDef, double GrowthRes){
	Name = title;
	CharClass = type;
	BaseHP = HPBase;
	BaseStr = StrBase;
	BaseSkl = SklBase;
	BaseSpd = SpdBase;
	BaseLck = LckBase;
	BaseDef = DefBase;
	BaseRes = ResBase;
	HPGrowth = GrowthHP;
	StrGrowth = GrowthStr;
	SklGrowth = GrowthSkl;
	SpdGrowth = GrowthSpd;
	LckGrowth = GrowthLck;
	DefGrowth = GrowthDef;
	ResGrowth = GrowthRes;
    }

    public String getName(){
	return Name;
    }

    public String getCharClass(){
	return CharClass;
    }

    public int getBaseHP(){
	return BaseHP;
    }

    public int getBaseStr(){
	return BaseStr;
    }

    public int getBaseSkl(){
	return BaseSkl;
    }

    public int getBaseSpd(){
	return BaseSpd;
    }

    public int getBaseLck(){
	return BaseLck;
    }

    public int getBaseDef(){
	return BaseDef;
    }

    public int getBaseRes(){
	return BaseRes;
    }

    public double getHPGrowth(){
	return HPGrowth;
    }

    public double getStrGrowth(){
	return StrGrowth;
    }

    public double getSklGrowth(){
	return SklGrowth;
    }

    public double getSpdGrowth(){
	return SpdGrowth;
    }

    public double getLckGrowth(){
	return LckGrowth;
    }

    public double getDefGrowth(){
	return DefGrowth;
    }

    public double getResGrowth(){
	return ResGrowth;
    }

}
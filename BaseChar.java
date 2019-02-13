package fe7calculator;

public class BaseChar{

    private String Name, CharClass; //Writes the character's name and base class. 
    private int BaseHP, BaseStr, BaseSkl, BaseSpd, BaseLck, BaseDef, BaseRes, BaseLvl; //Writes the character's base stats.
    private double HPGrowth, StrGrowth, SklGrowth,SpdGrowth, LckGrowth, DefGrowth, ResGrowth; //Writes the character's stat growth rates.
    private boolean HardBonuses; //Says if the character recieves hard mode bonuses.
    
    public BaseChar(String title, String type, int HPBase, int StrBase, int SklBase, int SpdBase, int LckBase, int DefBase, int ResBase, double GrowthHP, double GrowthStr, double GrowthSkl, double GrowthSpd, double GrowthLck, double GrowthDef, double GrowthRes, boolean Bonuses, int LvlBase){
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
	HardBonuses = Bonuses;
	BaseLvl = LvlBase;
    }
 
    //Methods for getting every variable in a BaseChar.
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

    public boolean getHardBonuses(){
	return HardBonuses;
    }

    public int getBaseLvl(){
	return BaseLvl;
    }

    //Creating each unit with the bases they have as they join
    public BaseChar createBaseUnitEli(String name){
	BaseChar result;
	switch(name.toLowerCase()){
	case "eliwood":
	    result = new BaseChar("Eliwood", "Lord", 18, 5, 5, 7, 7, 5, 0, .80, .45, .50, .40, .45, .30, .35, false, 1);
	case "lyn":
	    result = new BaseChar("Lyn", "Lord", 18, 5, 10, 11, 5, 2, 0, .7, .4, .6, .6, .55, .2, .3, false, 4);
	case "sain":
	    result = new BaseChar("Sain", "Cavalier", 22, 9, 5, 7, 5, 7, 0, .8, .6, .35, .4, .35, .2, .2, false, 4);
	case "kent":
	    result = new BaseChar("Kent", "Cavalier", 23, 8, 7, 8, 4, 6, 1, .85, .4, .5, .45, .2, .25, .25, false, 5);
	case "florina":
	    result = new BaseChar("Florina", "Pegasus Knight", 18, 6, 8, 9, 8, 4, 5, .6, .4, .5, .55, .5, .15, .35, false, 3);
	case "wil":
	    result = new BaseChar("Wil", "Archer", 21, 6, 5, 6, 7, 5, 1, .75, .5, .5, .4, .4, .2, .25, false, 4);
	case "dorcas":
	    result = new BaseChar("Dorcas", "Fighter", 30, 7, 7, 6, 3, 3, 0, .8, .6, .4, .2, .45, .25, .15, false, 3);
	case "serra":
	    result = new BaseChar("Serra", "Cleric", 17, 2, 5, 8, 6, 2, 5, .5, .5, .3, .4, .6, .15, .55, false, 1);
	case "erk":
	    result = new BaseChar("Erk", "Mage", 17, 5, 6, 7, 3, 2, 4, .65, .4, .4, .5, .3, .2, .4, false, 1);
	case "rath":
	    result = new BaseChar("Rath", "Nomad", 27, 9, 10, 11, 5, 8, 2, .8, .5, .4, .5, .3, .1, .25, false, 9);
	case "matthew":
	    result = new BaseChar("Matthew", "Thief", 18, 4, 4, 11, 2, 3, 0, .75, .3, .4, .7, .5, .25, .2, false, 2);
	case "nils":
	    result = new BaseChar("Nils", "Bard", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	case "ninian":
	    result = new BaseChar("Ninian", "Dancer", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	case "lucius":
	    result = new BaseChar("Lucius", "Monk", 18, 7, 6, 10, 2, 1, 6, .55, .6, .5, .4, .2, .1, .6, false, 3);
	case "wallace":
	    result = new BaseChar("Wallace", "General", 34, 16, 9, 8, 10, 19, 5, .7, .45, .4, .2, .3, .35, .35, false, 1);
	case "marcus":
	    result = new BaseChar("Marcus", "Paladin", 31, 15, 15, 11, 8, 10, 8, .6, .25, .2, .25, .2, .15, .2, false, 1);
	case "lowen":
	    result = new BaseChar("Lowen", "Cavalier", 23, 7, 5, 7, 3, 7, 0, .9, .3, .3, .3, .5, .4, .3, false, 2);
	default:
	    result = new BaseChar("NoInput", "NoInput", 0, 0, 0, 0, 0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, false, 0);
	}
	return result;
    }

    public BaseChar createBaseUnitLyn(String name){
	BaseChar result;
	switch(name.toLowerCase()){
	case "lyn":
	    result = new BaseChar("Lyn", "Lord", 16, 4, 7, 9, 5, 2, 0, .7, .4, .6, .6, .55, .2, .3, false, 1);
	case "sain":
	    result = new BaseChar("Sain", "Cavalier", 19, 8, 4, 6, 4, 6, 0, .8, .6, .35, .4, .35, .2, .2, false, 1);
	case "kent":
	    result = new BaseChar("Kent", "Cavalier", 20, 6, 6, 7, 2, 5, 1, .85, .4, .5, .45, .2, .25, .25, false, 1);
	case "florina":
	    result = new BaseChar("Florina", "Pegasus Knight", 17, 5, 7, 9, 7, 4, 4, .6, .4, .5, .55, .5, .15, .35, false, 1);
	case "wil":
	    result = new BaseChar("Wil", "Archer", 20, 6, 5, 5, 6, 5, 0, .75, .5, .5, .4, .4, .2, .25, false, 2);
	case "dorcas":
	    result = new BaseChar("Dorcas", "Fighter", 30, 7, 7, 6, 3, 3, 0, .8, .6, .4, .2, .45, .25, .15, true, 3);
	case "serrs":
	    result = new BaseChar("Serra", "Cleric", 17, 2, 5, 8, 6, 2, 5, .5,.5, .3, .4, .6, .15, .55, false, 1);
	case "erk":
	    result = new BaseChar("Erk", "Mage", 17, 5, 6, 7, 3, 2, 4, .65, .4, .4, .5, .3, .2, .4, false, 1);
	case "rath":
	    result = new BaseChar("Rath", "Nomad", 25, 8, 9, 10, 5, 7, 2, .8, .5, .4, .5, .3, .1, .25, false, 7);
	case "matthew":
	    result = new BaseChar("Matthew", "Thief", 18, 4, 4, 11, 2, 3, 0, .75, .3, .4, .7, .5, .25, .2, false, 2);
	case "nils":
	    result = new BaseChar("Nils", "Bard", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	case "ninian":
	    result = new BaseChar("Ninian", "Dancer", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	case "lucius":
	    result = new BaseChar("Lucius", "Monk", 18, 7, 6, 10, 2, 1, 6, .55,.6, .5, .4, .2, .1, .6, false, 3);
	case "wallace":
	    result = new BaseChar("Wallace", "Knight", 30, 13, 7, 5, 10, 15, 2, .7, .45, .4, .2, .3, .35, .35, false, 12);
	default:
	    result = new BaseChar("NoInput", "NoInput", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0);
	}
	return result;
    }

}
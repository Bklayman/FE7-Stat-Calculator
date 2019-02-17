package fe7calculator;

public class CheckChar{

    private double CurHP, CurStr, CurSkl, CurSpd, CurLck, CurDef, CurRes;
    private String CharClass;
    private int CurLvl;

    public CheckChar(BaseChar bases){ //Creates a base unit with normal bases
	CurHP = bases.getBaseHP();
        CurStr = bases.getBaseStr();
        CurSkl = bases.getBaseSkl();
        CurSpd = bases.getBaseSpd();
        CurLck = bases.getBaseLck();
        CurDef = bases.getBaseDef();
        CurRes = bases.getBaseRes();
        CharClass = bases.getCharClass();
        CurLvl = bases.getBaseLvl();
    }

    public double getCurHP(){
	return CurHP;
    }

    public double getCurStr(){
	return CurStr;
    }

    public double getCurSkl(){
	return CurSkl;
    }

    public double getCurSpd(){
	return CurSpd;
    }

    public double getCurLck(){
	return CurLck;
    }

    public double getCurDef(){
	return CurDef;
    }

    public double GetCurRes(){
	return CurRes;
    }

    public String getCharClass(){
	return CharClass;
    }

    public int getCurLvl(){
	return CurLvl;
    }

    public void gainLevels(BaseChar bases, int numLevels){ //Increments this unit's stats by its estimated stats gained by an input amount of levels
	double addHP, addStr, addSkl, addSpd, addLck, addDef, addRes;
	addHP = numLevels * bases.getHPGrowth();
	addStr = numLevels * bases.getStrGrowth();
	addSkl = numLevels * bases.getSklGrowth();
	addSpd = numLevels * bases.getSpdGrowth();
	addLck = numLevels * bases.getLckGrowth();
	addDef = numLevels * bases.getDefGrowth();
	addRes = numLevels * bases.getResGrowth();
	CurHP += addHP;
	CurStr += addStr;
	CurSkl += addSkl;
	CurSpd += addSpd;
	CurLck += addLck;
	CurDef += addDef;
	CurRes += addRes;
    }

    public void addStatBoosters(String data){ //Adds extra stats gained through stat boosting items
	String[] splitted = data.split(" ");
	for(int AddHP = Integer.parseInt(splitted[10]); AddHP > 0; AddHP--){
	    CurHP += 7;
	}
	for(int AddStr = Integer.parseInt(splitted[11]); AddStr > 0; AddStr--){
	    CurStr += 2;
	} 
	for(int AddSkl = Integer.parseInt(splitted[12]); AddSkl > 0; AddSkl--){
	    CurSkl += 2;
	}
	for(int AddSpd = Integer.parseInt(splitted[13]); AddSpd > 0; AddSpd--){
	    CurSpd += 2;
	}
	for(int AddLck = Integer.parseInt(splitted[14]); AddLck > 0; AddLck--){
	    CurLck += 2;
	}
	for(int AddDef = Integer.parseInt(splitted[15]); AddDef > 0; AddDef--){
	    CurDef += 2;
	}
	for(int AddRes = Integer.parseInt(splitted[16]); AddRes > 0; AddRes--){
	    CurRes += 2;
	}	
    }

    public void addPromoBonuses(UnitType type){ //Adds bonus stats gained by class promotion
	CurHP += type.getProHP();
	CurStr += type.getProStr();
	CurSkl += type.getProSkl();
	CurSpd += type.getProSpd();
	CurDef += type.getProDef();
	CurRes += type.getProRes();
    }

    public void checkStatCaps(){ //Checks to make sure a unit's stats are not over the class's stat caps
	UnitType type = UnitType.createClass(CharClass);
	if(CurHP > type.getMaxHP()){
	    CurHP = type.getMaxHP();
	}
	if(CurStr > type.getMaxStr()){
	    CurStr = type.getMaxStr();
	}
	if(CurSkl > type.getMaxSkl()){
	    CurSkl = type.getMaxSkl();
	}
	if(CurSpd > type.getMaxSpd()){
	    CurSpd = type.getMaxSpd();
	}
	if(CurLck > type.getMaxLck()){
	    CurLck = type.getMaxLck();
	}
	if(CurDef > type.getMaxDef()){
	    CurDef = type.getMaxDef();
	}
	if(CurRes > type.getMaxRes()){
	    CurRes = type.getMaxRes();
	}
    }

    public void classChange(String name){
	UnitType changed;
        switch(CharClass){
	case "Lord":
	    if(name.equals("Lyn")){
		CharClass = "Blade Lord";
	    } else if(name.equals("Hector")){
		CharClass = "Great Lord";
	    } else if(name.equals("Eliwood")){
		CharClass = "Knight Lord";
	    }
	    break;
	case "Cavalier":
	    CharClass = "Paladin";
	    break;
	case "Knight":
	    CharClass = "General";
	    break;
	case "Mercenary":
	    CharClass = "Hero";
	    break;
	case "Myrmidon":
	    CharClass = "Swordmaster";
	    break;
	case "Thief":
	    CharClass = "Assassin";
	    break;
	case "Archer":
	    if(name.equals("Wil")){
		CharClass = "Sniper(M)";
	    } else {
		CharClass = "Sniper(F)";
	    }
	    break;
	case "Nomad":
	    CharClass = "Nomad Trooper";
	    break;
	case "Wyvern Rider":
	    CharClass = "Wyvern Lord";
	    break;
	case "Mage":
	    if(name.equals("Erk")){
		CharClass = "Sage(M)";
	    } else {
		CharClass = "Sage(F)";
	    }
	    break;
	case "Cleric":
	    CharClass = "Bishop(F)";
	    break;
	case "Monk":
	    CharClass = "Bishop(M)";
	    break;
	case "Shaman":
	    CharClass = "Druid";
	    break;
	case "Fighter":
	    CharClass = "Warrior";
	    break;
	case "Pirate":
	    CharClass = "Berserker";
	    break;
	case "Pegasus Knight":
	    CharClass = "Falcoknight";
	    break;
	case "Troubadour":
	    CharClass = "Valkyrie";
	    break;
	}
	changed = UnitType.createClass(CharClass);
	this.addPromoBonuses(changed);
    }

}
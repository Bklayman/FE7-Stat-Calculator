package fe7calculator;

public class UnitType{

    private int MaxHP, MaxStr, MaxSkl, MaxSpd, MaxLck, MaxDef, MaxRes, ProHP, ProStr, ProSkl, ProSpd,  ProDef, ProRes; //Varibales for the class's max stats and promotion bonuses

    public UnitType(int HPMax, int StrMax, int SklMax, int SpdMax, int LckMax, int DefMax, int ResMax, int HPPro, int StrPro, int SklPro, int SpdPro, int DefPro, int ResPro){
	MaxHP = HPMax;
	MaxStr = StrMax;
	MaxSkl = SklMax;
	MaxSpd = SpdMax;
	MaxLck = LckMax;
	MaxDef = DefMax;
	MaxRes = ResMax;
	ProHP = HPPro;
	ProStr = StrPro;
	ProSkl = SklPro;
	ProSpd = SpdPro;
	ProDef = DefPro;
	ProRes = ResPro;
    }

    public int getMaxHP(){
	return MaxHP;
    }

    public int getMaxStr(){
	return MaxStr;
    }

    public int getMaxSkl(){
	return MaxSkl;
    }

    public int getMaxSpd(){
	return MaxSpd;
    }

    public int getMaxLck(){
	return MaxLck;
    }

    public int getMaxDef(){
	return MaxDef;
    }

    public int getMaxRes(){
	return MaxRes;
    }

    public int getProHP(){
	return ProHP;
    }

    public int getProStr(){
	return ProStr;
    }

    public int getProSkl(){
	return ProSkl;
    }

    public int getProSpd(){
	return ProSpd;
    }

    public int getProDef(){
	return ProDef;
    }

    public int getProRes(){
	return ProRes;
    }

    public static UnitType createClass(String name){
	switch(name){
	case "Blade Lord":
	    return new UnitType(60, 27, 26, 24, 30, 23, 25, 3, 2, 2, 0, 3, 5);
	case "Knight Lord":
	    return new UnitType(60, 27, 26, 24, 30, 23, 25, 4, 2, 0, 1, 1, 3);
	case "Great Lord":
	    return new UnitType(60, 30, 24, 24, 30, 29, 20, 3, 0, 2, 3, 1, 5);
	case "Dancer":
	    return new UnitType(60, 10, 10, 30, 30, 24, 26, 0, 0, 0, 0, 0, 0);
	case "Bard":
	    return new UnitType(60, 10, 10, 30, 30, 24, 26, 0, 0, 0, 0, 0, 0);
	case "Transporter":
	    return new UnitType(60, 20, 20, 20, 30, 20, 20, 0, 0, 0, 0, 0, 0);
	case "Paladin":
	    return new UnitType(60, 25, 26, 24, 30, 25, 25, 2, 1, 1, 1, 2, 1);
	case "General":
	    return new UnitType(60, 29, 27, 24, 30, 30, 25, 4, 2, 2, 3, 2, 3);
	case "Hero":
	    return new UnitType(60, 25, 30, 26, 30, 25, 22, 4, 0, 2, 2, 2, 2);
	case "Swordmaster":
	    return new UnitType(60, 24, 29, 30, 30, 22, 23, 5, 2, 0, 0, 2, 1);
	case "Assassin":
	    return new UnitType(60, 20, 30, 30, 30, 20, 20, 3, 1, 0, 0, 2, 2);
	case "Sniper(M)":
	    return new UnitType(60, 25, 30, 28, 30, 25, 23, 3, 1, 2, 2, 2, 3);
	case "Sniper(F)":
	    return new UnitType(60, 24, 30, 29, 30, 24, 24, 4, 3, 1, 1, 2, 2);
	case "Nomad Trooper":
	    return new UnitType(60, 25, 28, 30, 30, 24, 23, 3, 2, 1, 1, 3, 3);
	case "Wyvern Lord":
	    return new UnitType(60, 27, 25, 23, 30, 28, 22, 4, 0, 2, 2, 0, 2);
	case "Sage(M)":
	    return new UnitType(60, 28, 30, 26, 30, 21, 25, 4, 1, 0, 0, 3, 3);
	case "Sage(F)":
	    return new UnitType(60, 30, 28, 26, 30, 21, 25, 3, 1, 1, 0, 3, 3);
	case "Bishop(M)":
	    return new UnitType(60, 25, 26, 24, 30, 22, 30, 3, 2, 1, 0, 3, 2);
	case "Bishop(F)":
	    return new UnitType(60, 25, 25, 26, 30, 21, 30, 3, 1, 2, 1, 2, 2);
	case "Druid":
	    return new UnitType(60, 29, 26, 26, 30, 21, 28, 4, 0, 0, 3, 2, 2);
	case "Warrior":
	    return new UnitType(60, 30, 28, 26, 30, 26, 22, 3, 1, 2, 0, 3, 3);
	case "Berserker":
	    return new UnitType(60, 30, 29, 28, 30, 23, 21, 4, 1, 1, 1, 2, 2);
	case "Falcoknight":
	    return new UnitType(60, 23, 25, 28, 30, 23, 26, 5, 2, 0, 0, 2, 2);
	case "Valkyrie":
	    return new UnitType(60, 25, 24, 25, 30, 24, 28, 3, 2, 1, 0, 2, 3);
	default: 
	    return new UnitType(60, 20, 20, 20, 30, 20, 20, 0, 0, 0, 0, 0, 0);
	}
    }

}
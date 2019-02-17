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
	    break;
	case "lyn":
	    result = new BaseChar("Lyn", "Lord", 18, 5, 10, 11, 5, 2, 0, .7, .4, .6, .6, .55, .2, .3, false, 4);
	    break;
	case "sain":
	    result = new BaseChar("Sain", "Cavalier", 22, 9, 5, 7, 5, 7, 0, .8, .6, .35, .4, .35, .2, .2, false, 4);
	    break;
	case "kent":
	    result = new BaseChar("Kent", "Cavalier", 23, 8, 7, 8, 4, 6, 1, .85, .4, .5, .45, .2, .25, .25, false, 5);
	    break;
	case "florina":
	    result = new BaseChar("Florina", "Pegasus Knight", 18, 6, 8, 9, 8, 4, 5, .6, .4, .5, .55, .5, .15, .35, false, 3);
	    break;
	case "wil":
	    result = new BaseChar("Wil", "Archer", 21, 6, 5, 6, 7, 5, 1, .75, .5, .5, .4, .4, .2, .25, false, 4);
	    break;
	case "dorcas":
	    result = new BaseChar("Dorcas", "Fighter", 30, 7, 7, 6, 3, 3, 0, .8, .6, .4, .2, .45, .25, .15, false, 3);
	    break;
	case "serra":
	    result = new BaseChar("Serra", "Cleric", 17, 2, 5, 8, 6, 2, 5, .5, .5, .3, .4, .6, .15, .55, false, 1);
	    break;
	case "erk":
	    result = new BaseChar("Erk", "Mage", 17, 5, 6, 7, 3, 2, 4, .65, .4, .4, .5, .3, .2, .4, false, 1);
	    break;
	case "rath":
	    result = new BaseChar("Rath", "Nomad", 27, 9, 10, 11, 5, 8, 2, .8, .5, .4, .5, .3, .1, .25, false, 9);
	    break;
	case "matthew":
	    result = new BaseChar("Matthew", "Thief", 18, 4, 4, 11, 2, 3, 0, .75, .3, .4, .7, .5, .25, .2, false, 2);
	    break;
	case "nils":
	    result = new BaseChar("Nils", "Bard", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	    break;
	case "ninian":
	    result = new BaseChar("Ninian", "Dancer", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	    break;
	case "lucius":
	    result = new BaseChar("Lucius", "Monk", 18, 7, 6, 10, 2, 1, 6, .55, .6, .5, .4, .2, .1, .6, false, 3);
	    break;
	case "wallace":
	    result = new BaseChar("Wallace", "General", 34, 16, 9, 8, 10, 19, 5, .7, .45, .4, .2, .3, .35, .35, false, 1);
	    break;
	case "marcus":
	    result = new BaseChar("Marcus", "Paladin", 31, 15, 15, 11, 8, 10, 8, .6, .25, .2, .25, .2, .15, .2, false, 1);
	    break;
	case "lowen":
	    result = new BaseChar("Lowen", "Cavalier", 23, 7, 5, 7, 3, 7, 0, .9, .3, .3, .3, .5, .4, .3, false, 2);
	    break;
	case "rebecca":
	    result = new BaseChar("Rebecca", "Archer", 17, 4, 5, 6, 4, 3, 1, .6, .4, .5, .6, .5, .15, .3, false, 1);
	    break;
	case "bartre":
	    result = new BaseChar("Bartre", "Fighter", 29, 9, 5, 3, 4, 4, 0, .85, .5, .35, .4, .3, .3, .25, false, 2);
	    break;
	case "hector":
	    result = new BaseChar("Hector", "Lord", 19, 7, 4, 5, 3, 8, 0, .9, .6, .45, .35, .3, .5, .25, false, 1);
	    break;
	case "oswin":
	    result = new BaseChar("Oswin", "Knight", 28, 13, 9, 5, 3, 13, 3, .9, .4, .3, .3, .35, .55, .3, false, 9);
	    break;
	case "guy":
	    result = new BaseChar("Guy", "Myrmidon", 21, 6, 11, 11, 5, 5, 0, .75, .3, .5, .7, .45, .15, .25, true, 3);
	    break;
	case "merlinus":
	    result = new BaseChar("Merlinus", "Transporter", 18, 0, 4, 5, 12, 5, 2, 1.2, 0, .9, .9, 1, .3, .15, false, 5);
	    break;
	case "priscilla":
	    result = new BaseChar("Priscilla", "Troubadour", 16, 6, 6, 8, 7, 3, 6, .45, .4, .5, .4, .65, .15, .5, false, 3);
	    break;
	case "raven":
	    result = new BaseChar("Raven", "Mercenary", 25, 8, 11, 13, 2, 5, 1, .85, .55, .4, .45, .35, .25, .15, true, 5);
	    break;
	case "canas":
	    result = new BaseChar("Canas", "Shaman", 21, 10, 9, 8, 7, 5, 8, .7, .45, .4, .35, .25, .25, .45, false, 8);
	    break;
	case "dart":
	    result = new BaseChar("Dart", "Pirate", 34, 12, 8, 8, 3, 6, 1, .7, .65, .2, .6, .35, .2, .15, false, 8);
	    break;
	case "fiora":
	    result = new BaseChar("Fiora", "Pegasus Knight", 21, 8, 11, 13, 6, 6, 7, .7, .35, .6, .5, .3, .2, .5, false, 7);
	    break;
	case "legault":
	    result = new BaseChar("Legault", "Thief", 26, 8, 11, 15, 10, 8, 3, .6, .25, .45, .6, .6, .25, .25, true, 12);
	    break;
	case "isadora":
	    result = new BaseChar("Isadora", "Paladin", 28, 13, 12, 16, 10, 8, 6, .75, .3, .35, .5, .45, .2, .25, false, 1);
	    break;
	case "heath":
	    result = new BaseChar("Heath", "Wyvern Rider", 28, 11, 8, 7, 7, 10, 1, .8, .5, .5, .45, .2, .3, .2, true, 7);
	    break;
	case "hawkeye":
	    result = new BaseChar("Hawkeye", "Berserker", 50, 18, 14, 11, 13, 14, 10, .5, .4, .3, .25, .4, .2, .35, false, 4);
	    break;
	case "geitz":
	    result = new BaseChar("Geitz", "Warrior", 40, 17, 12, 13, 10, 11, 3, .85, .5, .3, .4, .4, .2, .2, true, 3);
	    break;
	case "pent":
	    result = new BaseChar("Pent", "Sage(M)", 33, 18, 21, 17, 14, 11, 16, .5, .3, .2, .4, .4, .3, .35, false, 6);
	    break;
	case "louise":
	    result = new BaseChar("Louise", "Sniper(F)", 28, 12, 14, 17, 16, 9, 12, .6, .4, .4, .4, .3, .2, .3, false, 4);
	    break;
	case "karel":
	    result = new BaseChar("Karel", "Swordmaster", 31, 16, 23, 20, 15, 13, 12, .7, .3, .5, .5, .3, .1, .15, false, 8);
	    break;
	case "harken":
	    result = new BaseChar("Harken", "Hero", 38, 21, 20, 17, 12, 15, 10, .8, .35, .3, .4, .2, .3, .25, true, 8);
	    break;
	case "nino":
	    result = new BaseChar("Nino", "Mage", 19, 7, 8, 11, 10, 4, 7, .55, .5, .55, .6, .45, .15, .5, false, 5);
	    break;
	case "jaffar":
	    result = new BaseChar("Jaffar", "Assassin", 34, 19, 25, 24, 10, 15, 11, .65, .15, .4, .35, .2, .3, .3, false, 13);
	    break;
	case "vaida":
	    result = new BaseChar("Vaida", "Wyvern Lord", 43, 20, 19, 13, 11, 21, 6, .6, .45, .25, .4, .3, .25, .15, true, 9);
	    break;
	case "renault":
	    result = new BaseChar("Renault", "Bishop", 43, 12, 22, 20, 10, 15, 18, .6, .4, .3, .35, .15, .2, .4, false, 16);
	    break;
	case "athos":
	    result = new BaseChar("Athos", "Archsage", 40, 30, 24, 20, 25, 20, 28, 3.14, 1.59, 2.65, 3.58, 9.79, 3.23, 8.46, false, 20);
	    break;
	case "farina":
	    result = new BaseChar("Farina", "Pegasus Knight", 24, 10, 13, 14, 10, 10, 12, .75, .5, .4, .45, .45, .25, .3, false, 12);
	    break;
	case "karla":
	    result = new BaseChar("Karla", "Swordmaster", 29, 14, 21, 18, 16, 11, 12, .6, .25, .45, .55, .4, .1, .2, false, 5);
	    break;
	default:
	    result = new BaseChar("NoInput", "NoInput", 0, 0, 0, 0, 0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, false, 0);
	}
	if(result.getHardBonuses()){
            result.hardModeBonuses();
	}
	return result;
    }

    public BaseChar createBaseUnitLyn(String name){
	BaseChar result;
	switch(name.toLowerCase()){
	case "lyn":
	    result = new BaseChar("Lyn", "Lord", 16, 4, 7, 9, 5, 2, 0, .7, .4, .6, .6, .55, .2, .3, false, 1);
	    break;
	case "sain":
	    result = new BaseChar("Sain", "Cavalier", 19, 8, 4, 6, 4, 6, 0, .8, .6, .35, .4, .35, .2, .2, false, 1);
	    break;
	case "kent":
	    result = new BaseChar("Kent", "Cavalier", 20, 6, 6, 7, 2, 5, 1, .85, .4, .5, .45, .2, .25, .25, false, 1);
	    break;
	case "florina":
	    result = new BaseChar("Florina", "Pegasus Knight", 17, 5, 7, 9, 7, 4, 4, .6, .4, .5, .55, .5, .15, .35, false, 1);
	    break;
	case "wil":
	    result = new BaseChar("Wil", "Archer", 20, 6, 5, 5, 6, 5, 0, .75, .5, .5, .4, .4, .2, .25, false, 2);
	    break;
	case "dorcas":
	    result = new BaseChar("Dorcas", "Fighter", 30, 7, 7, 6, 3, 3, 0, .8, .6, .4, .2, .45, .25, .15, true, 3);
	    break;
	case "serra":
	    result = new BaseChar("Serra", "Cleric", 17, 2, 5, 8, 6, 2, 5, .5,.5, .3, .4, .6, .15, .55, false, 1);
	    break;
	case "erk":
	    result = new BaseChar("Erk", "Mage", 17, 5, 6, 7, 3, 2, 4, .65, .4, .4, .5, .3, .2, .4, false, 1);
	    break;
	case "rath":
	    result = new BaseChar("Rath", "Nomad", 25, 8, 9, 10, 5, 7, 2, .8, .5, .4, .5, .3, .1, .25, false, 7);
	    break;
	case "matthew":
	    result = new BaseChar("Matthew", "Thief", 18, 4, 4, 11, 2, 3, 0, .75, .3, .4, .7, .5, .25, .2, false, 2);
	    break;
	case "nils":
	    result = new BaseChar("Nils", "Bard", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	    break;
	case "ninian":
	    result = new BaseChar("Ninian", "Dancer", 14, 0, 0, 12, 10, 5, 4, .85, .05, .05, .7, .8, .3, .7, false, 1);
	    break;
	case "lucius":
	    result = new BaseChar("Lucius", "Monk", 18, 7, 6, 10, 2, 1, 6, .55,.6, .5, .4, .2, .1, .6, false, 3);
	    break;
	case "wallace":
	    result = new BaseChar("Wallace", "Knight", 30, 13, 7, 5, 10, 15, 2, .7, .45, .4, .2, .3, .35, .35, false, 12);
	    break;
	default:
	    result = new BaseChar("NoInput", "NoInput", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0);
	}
	if(result.getHardBonuses()){
	    result.hardModeBonuses();
	}
	return result;
    }

    public void hardModeBonuses(){
	switch(Name){
	case "Dorcas":
	    BaseHP += 5*.85;
	    BaseStr += 5*.55;
	    BaseSkl += 5*.35;
	    BaseSpd += 5*.3;
	    BaseDef += 5*.15;
	    BaseRes += 5*.15;
	    break;
	case "Guy":
	    BaseHP += 5*.7;
	    BaseStr += 5*.35;
	    BaseSkl += 5*.4;
	    BaseSpd += 5*.4;
	    BaseDef += 5*.15;
	    BaseRes += 5*.2;
	    break;
	case "Raven":
	    BaseHP += 5*.8;
	    BaseStr += 5*.4;
	    BaseSkl += 5*.4;
	    BaseSpd += 5*.32;
	    BaseDef += 5*.18;
	    BaseRes += 5*.2;
	    break;
	case "Legault":
	    BaseHP += 5*.5;
	    BaseStr += 5*.05;
	    BaseSkl += 5*.45;
	    BaseSpd += 5*.4;
	    BaseDef += 5*.05;
	    BaseRes += 5*.2;
	    break;
	case "Heath":
	    BaseHP += 5*.8;
	    BaseStr += 5*.45;
	    BaseSkl += 5*.35;
	    BaseSpd += 5*.3;
	    BaseDef += 5*.25;
	    BaseRes += 5*.15;
	    break;
	case "Harken":
	    BaseHP += 5*.75;
	    BaseStr += 5*.3;
	    BaseSkl += 5*.3;
	    BaseSpd += 5*.2;
	    BaseDef += 5*.2;
	    BaseRes += 5*.2;
	    break;
	case "Vaida":
	    BaseHP += 5*.75;
	    BaseStr += 5*.4;
	    BaseSkl += 5*.3;
	    BaseSpd += 5*.2;
	    BaseDef += 5*.2;
	    BaseRes += 5*.17;
	    break;
	case "Geitz":
	    BaseHP += 5*.8;
	    BaseStr += 5*.45;
	    BaseSkl += 5*.25;
	    BaseSpd += 5*.2;
	    BaseDef += 5*.16;
	    BaseRes += 5*.17;
	    break;
	}
    }
}
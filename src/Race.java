import java.util.LinkedHashMap;

public enum Race {
	ALTMER(		100,

				30, 		50, 		40, 		40,
				30, 			40, 		40, 		50,

				0, 	5, 		10, 	0,
				0, 		0, 		0, 		0,
				5, 	10, 	0, 	0,
				5, 		0, 	0, 	0,
				10, 	0, 	0, 		0,
				0,

				-25, 		-25, 	-25,
				0, 		0, 		75),
	ARGONIAN(	0,

				40, 		40, 		30, 		50,
				50, 			30, 		30, 		50,

				0, 	5, 		0, 	0,
				10, 	5, 		0, 		0,
				0, 	0, 	5, 	0,
				5, 		0, 	0, 	0,
				5, 		0, 	10, 		0,
				0,

				0, 		0, 		0,
				0, 		100, 	75),
	BOSMER(		0,

				30, 		40, 		30, 		50,
				50, 			40, 		30, 		50,

				5, 	10, 	5, 	0,
				0, 		0, 		0, 		0,
				0, 	0, 	0, 	0,
				0, 		5, 	10, 	0,
				0, 		0, 	0, 		10,
				0,

				0, 		0, 		0,
				0, 		0, 		75),
	BRETON(		50,

				40, 		50, 		50, 		30,
				30, 			30, 		40, 		50,

				0, 	5, 		5, 	0,
				0, 		0, 		0, 		0,
				10, 	0, 	0, 	0,
				5, 		0, 	0, 	0,
				10, 	10, 	0, 		0,
				0,

				0, 		0, 		0,
				50, 		0, 		0),
	DUNMER(		0,

				40, 		40, 		30, 		40,
				50, 			40, 		30, 		50,

				0, 	0, 		0, 	0,
				5, 		10, 		0, 		5,
				0, 	10, 	0, 	0,
				0, 		5, 	5, 	0,
				5, 		0, 	0, 		0,
				0,

				75, 		0, 		0,
				0, 		0, 		0),
	IMPERIAL(	0,

				40, 		40, 		30, 		30,
				40, 			40, 		50, 		50,

				0, 	0, 		0, 	0,
				0, 		5, 		0, 		5,
				0, 	0, 	5, 	10,
				0, 		0, 	0, 	10,
				0, 		0, 	0, 		0,
				10,

				0, 		0, 		0,
				0, 		0, 		0),
	KHAJIIT(	0,

				40, 		40, 		30, 		50,
				40, 			30, 		40, 		50,

				10, 	0, 		0, 	0,
				5, 		5, 		0, 		0,
				0, 	0, 	10, 	0,
				0, 		5, 	0, 	0,
				0, 		0, 	5, 		5,
				0,

				0, 		0, 		0,
				0, 		0, 		0),
	NORD(		0,

				50, 		30, 		30, 		40,
				40, 			50, 		30, 		50,

				0, 	0, 		0, 	5,
				0, 		10, 		5, 		10,
				0, 	0, 	0, 	10,
				0, 		0, 	0, 	0,
				0, 		5, 	0, 		0,
				0,

				0, 		50, 		0,
				0, 		0, 		0),
	ORC(		0,

				45, 		30, 		50, 		35,
				30, 			50, 		30, 		50,

				0, 	0, 		0, 	10,
				0, 		0, 		10, 		10,
				0, 	0, 	5, 	10,
				0, 		0, 	0, 	0,
				0, 		0, 	0, 		0,
				0,

				0, 		0, 		0,
				25, 		0, 		0),
	REDGUARD(	0,

				50, 		30, 		30, 		40,
				40, 			50, 		30, 		50,

				0, 	0, 		0, 	0,
				10, 	10, 		0, 		10,
				0, 	0, 	0, 	5,
				0, 		5, 	0, 	5,
				0, 		0, 	0, 		0,
				0,

				0, 		0, 		0,
				0, 		75, 	75),
	DREMORA(	0,

				50, 		60, 		35, 		30,
				50, 			45, 		10, 		40,

				0, 	0, 		5, 	0,
				0, 		5, 		0, 		5,
				0, 	10, 	0, 	10,
				0, 		0, 	0, 	0,
				5, 		0, 	0, 		5,
				0,

				33, 		0, 		-20,
				0, 		0, 		0);
	private final int MAGICKAMODIFIER;
		//base stats
	private final int BASESTRENGTH;
	private final int BASEINTELLIGENCE;
	private final int BASEWILLPOWER;
	private final int BASEAGILITY;
	private final int BASESPEED;
	private final int BASEENDURANCE;
	private final int BASEPERSONALITY;
	private final int BASELUCK;
		//skill modifier
	private final int ACROBATICSMODIFIER;
	private final int ALCHEMYMODIFIER;
	private final int ALTERATIONMODIFIER;
	private final int ARMORERMODIFIER;
	private final int ATHLETICSMODIFIER;
	private final int BLADEMODIFIER;
	private final int BLOCKMODIFIER;
	private final int BLUNTMODIFIER;
	private final int CONJURATIONMODIFIER;
	private final int DESTRUCTIONMODIFIER;
	private final int HANDTOHANDMODIFIER;
	private final int HEAVYARMORMODIFIER;
	private final int ILLUSIONMODIFIER;
	private final int LIGHTARMORMODIFIER;
	private final int MARKSMANMODIFIER;
	private final int MERCANTILEMODIFIER;
	private final int MYSTICISMMODIFIER;
	private final int RESTORATIONMODIFIER;
	private final int SECURITYMODIFIER;
	private final int SNEAKMODIFIER;
	private final int SPEECHCRAFTMODIFIER;
		//resistances
	private final int FIRERESISTANCE;
	private final int FROSTRESISTANCE;
	private final int SHOCKRESISTANCE;
	private final int MAGICRESISTANCE;
	private final int POISONRESISTANCE;
	private final int DISEASERESISTANCE;
	Race(int MAGICKAMODIFIER,

		 int BASESTRENGTH, 			int BASEINTELLIGENCE, 		int BASEWILLPOWER, 			int BASEAGILITY,
		 int BASESPEED, 			int BASEENDURANCE, 			int BASEPERSONALITY, 		int BASELUCK,

		 int ACROBATICSMODIFIER, 	int ALCHEMYMODIFIER, 		int ALTERATIONMODIFIER, 	int ARMORERMODIFIER,
		 int ATHLETICSMODIFIER, 	int BLADEMODIFIER, 			int BLOCKMODIFIER, 			int BLUNTMODIFIER,
		 int CONJURATIONMODIFIER, 	int DESTRUCTIONMODIFIER, 	int HANDTOHANDMODIFIER, 	int HEAVYARMORMODIFIER,
		 int ILLUSIONMODIFIER, 		int LIGHTARMORMODIFIER, 	int MARKSMANMODIFIER, 		int MERCANTILEMODIFIER,
		 int MYSTICISMMODIFIER, 	int RESTORATIONMODIFIER, 	int SECURITYMODIFIER, 		int SNEAKMODIFIER,
		 int SPEECHCRAFTMODIFIER,

		 int FIRERESISTANCE, 		int FROSTRESISTANCE, 		int SHOCKRESISTANCE,
		 int MAGICRESISTANCE, 		int POISONRESISTANCE, 		int DISEASERESISTANCE) {
		this.MAGICKAMODIFIER = MAGICKAMODIFIER;
		this.BASESTRENGTH = BASESTRENGTH;
		this.BASEINTELLIGENCE = BASEINTELLIGENCE;
		this.BASEWILLPOWER = BASEWILLPOWER;
		this.BASEAGILITY = BASEAGILITY;
		this.BASESPEED = BASESPEED;
		this.BASEENDURANCE = BASEENDURANCE;
		this.BASEPERSONALITY = BASEPERSONALITY;
		this.BASELUCK = BASELUCK;
		this.ACROBATICSMODIFIER = ACROBATICSMODIFIER;
		this.ALCHEMYMODIFIER = ALCHEMYMODIFIER;
		this.ALTERATIONMODIFIER = ALTERATIONMODIFIER;
		this.ARMORERMODIFIER = ARMORERMODIFIER;
		this.ATHLETICSMODIFIER = ATHLETICSMODIFIER;
		this.BLADEMODIFIER = BLADEMODIFIER;
		this.BLOCKMODIFIER = BLOCKMODIFIER;
		this.BLUNTMODIFIER = BLUNTMODIFIER;
		this.CONJURATIONMODIFIER = CONJURATIONMODIFIER;
		this.DESTRUCTIONMODIFIER = DESTRUCTIONMODIFIER;
		this.HANDTOHANDMODIFIER = HANDTOHANDMODIFIER;
		this.HEAVYARMORMODIFIER = HEAVYARMORMODIFIER;
		this.ILLUSIONMODIFIER = ILLUSIONMODIFIER;
		this.LIGHTARMORMODIFIER = LIGHTARMORMODIFIER;
		this.MARKSMANMODIFIER = MARKSMANMODIFIER;
		this.MERCANTILEMODIFIER = MERCANTILEMODIFIER;
		this.MYSTICISMMODIFIER = MYSTICISMMODIFIER;
		this.RESTORATIONMODIFIER = RESTORATIONMODIFIER;
		this.SECURITYMODIFIER = SECURITYMODIFIER;
		this.SNEAKMODIFIER = SNEAKMODIFIER;
		this.SPEECHCRAFTMODIFIER = SPEECHCRAFTMODIFIER;
		this.FIRERESISTANCE = FIRERESISTANCE;
		this.FROSTRESISTANCE = FROSTRESISTANCE;
		this.SHOCKRESISTANCE = SHOCKRESISTANCE;
		this.MAGICRESISTANCE = MAGICRESISTANCE;
		this.POISONRESISTANCE = POISONRESISTANCE;
		this.DISEASERESISTANCE = DISEASERESISTANCE;
	}
	public int getMAGICKAMODIFIER() {
		return MAGICKAMODIFIER;
	}
	public int getBASESTRENGTH() {
		return BASESTRENGTH;
	}
	public int getBASEINTELLIGENCE() {
		return BASEINTELLIGENCE;
	}
	public int getBASEWILLPOWER() {
		return BASEWILLPOWER;
	}
	public int getBASEAGILITY() {
		return BASEAGILITY;
	}
	public int getBASESPEED() {
		return BASESPEED;
	}
	public int getBASEENDURANCE() {
		return BASEENDURANCE;
	}
	public int getBASEPERSONALITY() {
		return BASEPERSONALITY;
	}
	public int getBASELUCK() {
		return BASELUCK;
	}
	public int getACROBATICSMODIFIER() {
		return ACROBATICSMODIFIER;
	}
	public int getALCHEMYMODIFIER() {
		return ALCHEMYMODIFIER;
	}
	public int getALTERATIONMODIFIER() {
		return ALTERATIONMODIFIER;
	}
	public int getARMORERMODIFIER() {
		return ARMORERMODIFIER;
	}
	public int getATHLETICSMODIFIER() {
		return ATHLETICSMODIFIER;
	}
	public int getBLADEMODIFIER() {
		return BLADEMODIFIER;
	}
	public int getBLOCKMODIFIER() {
		return BLOCKMODIFIER;
	}
	public int getBLUNTMODIFIER() {
		return BLUNTMODIFIER;
	}
	public int getCONJURATIONMODIFIER() {
		return CONJURATIONMODIFIER;
	}
	public int getDESTRUCTIONMODIFIER() {
		return DESTRUCTIONMODIFIER;
	}
	public int getHANDTOHANDMODIFIER() {
		return HANDTOHANDMODIFIER;
	}
	public int getHEAVYARMORMODIFIER() {
		return HEAVYARMORMODIFIER;
	}
	public int getILLUSIONMODIFIER() {
		return ILLUSIONMODIFIER;
	}
	public int getLIGHTARMORMODIFIER() {
		return LIGHTARMORMODIFIER;
	}
	public int getMARKSMANMODIFIER() {
		return MARKSMANMODIFIER;
	}
	public int getMERCANTILEMODIFIER() {
		return MERCANTILEMODIFIER;
	}
	public int getMYSTICISMMODIFIER() {
		return MYSTICISMMODIFIER;
	}
	public int getRESTORATIONMODIFIER() {
		return RESTORATIONMODIFIER;
	}
	public int getSECURITYMODIFIER() {
		return SECURITYMODIFIER;
	}
	public int getSNEAKMODIFIER() {
		return SNEAKMODIFIER;
	}
	public int getSPEECHCRAFTMODIFIER() {
		return SPEECHCRAFTMODIFIER;
	}
	public int getFIRERESISTANCE() {
		return FIRERESISTANCE;
	}
	public int getFROSTRESISTANCE() {
		return FROSTRESISTANCE;
	}
	public int getSHOCKRESISTANCE() {
		return SHOCKRESISTANCE;
	}
	public int getMAGICRESISTANCE() {
		return MAGICRESISTANCE;
	}
	public int getPOISONRESISTANCE() {
		return POISONRESISTANCE;
	}
	public int getDISEASERESISTANCE() {
		return DISEASERESISTANCE;
	}
}

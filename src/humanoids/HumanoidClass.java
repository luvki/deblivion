package humanoids;//humanoids.HumanoidClass: enum used to create objects storing attribute and skill modifiers needed for creation of player and
	//non player humanoids
	//as not all classes are playable the boolean is set accordingly

public enum HumanoidClass {
	ACROBAT(		true,
					0, 		0, 	0, 	5,
					0, 		5, 	0, 	0,

					25, 	0, 		0, 	0,
					0, 		20, 		20, 		0,
					0, 	0, 	0, 	0,
					0, 		5, 	25, 	5,
					0, 		0, 	25, 		25,
					25),
	AGENT(			true,
					0, 		0, 	0, 	5,
					0, 		0, 	5, 	0,

					25, 	0, 		0, 	0,
					0, 		0, 		0, 		0,
					0, 	0, 	0, 	0,
					20, 		5, 	25, 	25,
					0, 		0, 	25, 		25,
					25),
	ARCHER(			true,
					5, 		0, 	0, 	5,
					0, 		0, 	0, 	0,

					0, 	0, 		0, 	25,
					5, 		25, 		5, 		25,
					0, 	0, 	25, 	5,
					0, 		20, 	20, 	0,
					0, 		0, 	0, 		20,
					0),
	ASSASSIN(		true,
					0, 		5, 	0, 	0,
					5, 		0, 	0, 	0,

					25, 	20, 		0, 	0,
					0, 		20, 		0, 		0,
					0, 	0, 	0, 	0,
					0, 		25, 	25, 	5,
					0, 		0, 	25, 		25,
					5),
	BARBARIAN(		true,
					5, 		0, 	0, 	0,
					5, 		0, 	0, 	0,

					0, 	0, 		0, 	25,
					25, 	25, 		25, 		25,
					0, 	0, 	25, 	5,
					0, 		20, 	0, 	0,
					0, 		0, 	0, 		0,
					0),
	BARD(			true,
					0, 		5, 	0, 	0,
					0, 		0, 	5, 	0,

					5, 	20, 	0, 	0,
					0, 		20, 		20, 		0,
					0, 	0, 	0, 	0,
					20, 		25, 	5, 	25,
					0, 		0, 	5, 		5,
					25),
	BATTLEMAGE(		true,
					5, 		5, 	0, 	0,
					0, 		0, 	0, 	0,

					0, 	25, 	25, 	0,
					0, 		20, 		0, 		20,
					25, 	25, 	0, 	0,
					5, 		0, 	0, 	0,
					25, 	5, 	0, 		0,
					0),
	CRUSADER(		true,
					5, 		0, 	5, 	0,
					0, 		0, 	0, 	0,

					0, 	0, 		0, 	5,
					25, 	25, 		5, 		25,
					0, 	20, 	25, 	25,
					0, 		0, 	0, 	0,
					0, 		20, 	0, 		0,
					0),
	HEALER(			true,
					0, 		0, 	5, 	0,
					0, 		0, 	5, 	0,

					0, 	25, 	25, 	0,
					0, 		0, 		0, 		0,
					5, 	25, 	0, 	0,
					25, 		0, 	0, 	20,
					5, 		25, 	0, 		0,
					20),
	KNIGHT(			true,
					5, 		0, 	0, 	0,
					0, 		0, 	5, 	0,

					0, 	0, 		0, 	5,
					5, 		25, 		25, 		25,
					0, 	0, 	25, 	25,
					20, 		0, 	0, 	0,
					0, 		0, 	0, 		0,
					20),
	MAGE(			true,
					0, 		5, 	5, 	0,
					0, 		0, 	0, 	0,

					0, 	25, 	25, 	0,
					0, 		0, 		0, 		0,
					25, 	25, 	0, 	0,
					25, 		0, 	0, 	0,
					25, 	25, 	0, 		0,
					0),
	MONK(			true,
					0, 		0, 	5, 	5,
					0, 		0, 	0, 	0,

					25, 	0, 		20, 	0,
					20, 	0, 		0, 		0,
					0, 	0, 	20, 	0,
					0, 		5, 	25, 	5,
					0, 		0, 	25, 		25,
					5),
	NIGHTBLADE(		true,
					0, 		0, 	5, 	0,
					5, 		0, 	0, 	0,

					20, 	5, 		25, 	0,
					20, 	20, 		0, 		0,
					5, 	25, 	0, 	0,
					5, 		20, 	0, 	0,
					5, 		25, 	0, 		0,
					0),
	PILGRIM(		true,
					0, 		0, 	0, 	0,
					0, 		5, 	5, 	0,

					5, 	0, 		0, 	20,
					0, 		0, 		20, 		20,
					0, 	0, 	0, 	0,
					0, 		25, 	5, 	25,
					0, 		0, 	25, 		5,
					25),
	ROGUE(			true,
					0, 		0, 	0, 	0,
					5, 		0, 	5, 	0,

					0, 	20, 	0, 	5,
					25, 	25, 		25, 		5,
					0, 	0, 	5, 	5,
					20, 		20, 	0, 	20,
					0, 		0, 	0, 		0,
					0),
	SCOUT(			true,
					0, 		0, 	0, 	0,
					5, 		5, 	0, 	0,

					20, 	20, 	0, 	25,
					25, 	25, 		25, 		5,
					0, 	0, 	5, 	5,
					0, 		20, 	0, 	0,
					0, 		0, 	0, 		0,
					0),
	SORCERER(		true,
					0, 		5, 	0, 	0,
					0, 		5, 	0, 	0,

					0, 	25, 	25, 	0,
					0, 		0, 		0, 		0,
					25, 	25, 	0, 	20,
					5, 		0, 	0, 	0,
					25, 	25, 	0, 		0,
					0),
	SPELLSWORD(		true,
					0, 		0, 	5, 	0,
					0, 		5, 	0, 	0,

					0, 	5, 		25, 	0,
					0, 		20, 		20, 		0,
					5, 	25, 	0, 	20,
					25, 		0, 	0, 	0,
					5, 		25, 	0, 		0,
					0),
	THIEF(			true,
					0, 		0, 	0, 	5,
					5, 		0, 	0, 	0,

					25, 	0, 		0, 	0,
					0, 		0, 		0, 		0,
					0, 	0, 	0, 	0,
					0, 		25, 	25, 	25,
					0, 		0, 	25, 		25,
					25),
	WARRIOR(		true,
					5, 		0, 	0, 	0,
					0, 		5, 	0, 	0,

					0, 	0, 		0, 	25,
					25, 	25, 		25, 		25,
					0, 	0, 	25, 	25,
					0, 		0, 	0, 	0,
					0, 		0, 	0, 		0,
					0),
	WITCHHUNTER(	true,
					0, 		5, 	0, 	5,
					0, 		0, 	0, 	0,

					0, 	25, 	5, 	0,
					20, 	0, 		0, 		0,
					25, 	25, 	0, 	0,
					5, 		0, 	20, 	0,
					25, 	5, 	20, 		0,
					0);
	private final boolean ISPLAYABLE;
		//attribute modifiers
	private final int STRENGTHMODIFIER;
	private final int INTELLIGENCEMODIFIER;
	private final int WILLPOWERMODIFIER;
	private final int AGILITYMODIFIER;
	private final int SPEEDMODIFIER;
	private final int ENDURANCEMODIFIER;
	private final int PERSONALITYMODIFIER;
	private final int LUCKMODIFIER;
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

	HumanoidClass(boolean ISPLAYABLE,
				  int STRENGTHMODIFIER, int INTELLIGENCEMODIFIER, int WILLPOWERMODIFIER, int AGILITYMODIFIER,
				  int SPEEDMODIFIER, int ENDURANCEMODIFIER, int PERSONALITYMODIFIER, int LUCKMODIFIER,

				  int ACROBATICSMODIFIER, int ALCHEMYMODIFIER, int ALTERATIONMODIFIER, int ARMORERMODIFIER,
				  int ATHLETICSMODIFIER, int BLADEMODIFIER, int BLOCKMODIFIER, int BLUNTMODIFIER,
				  int CONJURATIONMODIFIER, int DESTRUCTIONMODIFIER, int HANDTOHANDMODIFIER, int HEAVYARMORMODIFIER,
				  int ILLUSIONMODIFIER, int LIGHTARMORMODIFIER, int MARKSMANMODIFIER, int MERCANTILEMODIFIER,
				  int MYSTICISMMODIFIER, int RESTORATIONMODIFIER, int SECURITYMODIFIER, int SNEAKMODIFIER,
				  int SPEECHCRAFTMODIFIER) {
		this.ISPLAYABLE = ISPLAYABLE;
		this.STRENGTHMODIFIER = STRENGTHMODIFIER;
		this.INTELLIGENCEMODIFIER = INTELLIGENCEMODIFIER;
		this.WILLPOWERMODIFIER = WILLPOWERMODIFIER;
		this.AGILITYMODIFIER = AGILITYMODIFIER;
		this.SPEEDMODIFIER = SPEEDMODIFIER;
		this.ENDURANCEMODIFIER = ENDURANCEMODIFIER;
		this.PERSONALITYMODIFIER = PERSONALITYMODIFIER;
		this.LUCKMODIFIER = LUCKMODIFIER;
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
	}

		//getter
	public boolean getISPLAYABLE(){
		return ISPLAYABLE;
	}
	public int getSTRENGTHMODIFIER() {
		return STRENGTHMODIFIER;
	}
	public int getINTELLIGENCEMODIFIER() {
		return INTELLIGENCEMODIFIER;
	}
	public int getWILLPOWERMODIFIER() {
		return WILLPOWERMODIFIER;
	}
	public int getAGILITYMODIFIER() {
		return AGILITYMODIFIER;
	}
	public int getSPEEDMODIFIER() {
		return SPEEDMODIFIER;
	}
	public int getENDURANCEMODIFIER() {
		return ENDURANCEMODIFIER;
	}
	public int getPERSONALITYMODIFIER() {
		return PERSONALITYMODIFIER;
	}
	public int getLUCKMODIFIER() {
		return LUCKMODIFIER;
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
}

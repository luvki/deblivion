public enum PlayerClass {
	ACROBAT(		0, 		0, 	0, 	5,
					0, 		5, 	0, 	0,

					25, 	0, 		0, 	0,
					0, 		20, 		20, 		0,
					0, 	0, 	0, 	0,
					0, 		5, 	25, 	5,
					0, 		0, 	25, 		25,
					25),
	AGENT(			0, 		0, 	0, 	5,
					0, 		0, 	5, 	0,

					25, 	0, 		0, 	0,
					0, 		0, 		0, 		0,
					0, 	0, 	0, 	0,
					20, 		5, 	25, 	25,
					0, 		0, 	25, 		25,
					25),
	ARCHER(			5, 		0, 	0, 	5,
					0, 		0, 	0, 	0,

					0, 	0, 		0, 	25,
					5, 		25, 		5, 		25,
					0, 	0, 	25, 	5,
					0, 		20, 	20, 	0,
					0, 		0, 	0, 		20,
					0),
	ASSASSIN(		0, 		5, 	0, 	0,
					5, 		0, 	0, 	0,

					25, 	20, 		0, 	0,
					0, 		20, 		0, 		0,
					0, 	0, 	0, 	0,
					0, 		25, 	25, 	5,
					0, 		0, 	25, 		25,
					5),
	BARBARIAN(		5, 		0, 	0, 	0,
					5, 		0, 	0, 	0,

					0, 	0, 		0, 	25,
					25, 	25, 		25, 		25,
					0, 	0, 	25, 	5,
					0, 		20, 	0, 	0,
					0, 		0, 	0, 		0,
					0),
	BARD(			0, 		5, 	0, 	0,
					0, 		0, 	5, 	0,

					5, 	20, 	0, 	0,
					0, 		20, 		20, 		0,
					0, 	0, 	0, 	0,
					20, 		25, 	5, 	25,
					0, 		0, 	5, 		5,
					25),
	BATTLEMAGE(		5, 		5, 	0, 	0,
					0, 		0, 	0, 	0,

					0, 	25, 	25, 	0,
					0, 		20, 		0, 		20,
					25, 	25, 	0, 	0,
					5, 		0, 	0, 	0,
					25, 	5, 	0, 		0,
					0),
	CRUSADER(		5, 		0, 	5, 	0,
					0, 		0, 	0, 	0,

					0, 	0, 		0, 	5,
					25, 	25, 		5, 		25,
					0, 	20, 	25, 	25,
					0, 		0, 	0, 	0,
					0, 		20, 	0, 		0,
					0),
	HEALER(			0, 		0, 	5, 	0,
					0, 		0, 	5, 	0,

					0, 	25, 	25, 	0,
					0, 		0, 		0, 		0,
					5, 	25, 	0, 	0,
					25, 		0, 	0, 	20,
					5, 		25, 	0, 		0,
					20),
	KNIGHT(			5, 		0, 	0, 	0,
					0, 		0, 	5, 	0,

					0, 	0, 		0, 	5,
					5, 		25, 		25, 		25,
					0, 	0, 	25, 	25,
					20, 		0, 	0, 	0,
					0, 		0, 	0, 		0,
					20),
	MAGE(			0, 		5, 	5, 	0,
					0, 		0, 	0, 	0,

					0, 	25, 	25, 	0,
					0, 		0, 		0, 		0,
					25, 	25, 	0, 	0,
					25, 		0, 	0, 	0,
					25, 	25, 	0, 		0,
					0),
	MONK(			0, 		0, 	5, 	5,
					0, 		0, 	0, 	0,

					25, 	0, 		20, 	0,
					20, 	0, 		0, 		0,
					0, 	0, 	20, 	0,
					0, 		5, 	25, 	5,
					0, 		0, 	25, 		25,
					5),
	NIGHTBLADE(		0, 		0, 	5, 	0,
					5, 		0, 	0, 	0,

					20, 	5, 		25, 	0,
					20, 	20, 		0, 		0,
					5, 	25, 	0, 	0,
					5, 		20, 	0, 	0,
					5, 		25, 	0, 		0,
					0),
	PILGRIM(		0, 		0, 	0, 	0,
					0, 		5, 	5, 	0,

					5, 	0, 		0, 	20,
					0, 		0, 		20, 		20,
					0, 	0, 	0, 	0,
					0, 		25, 	5, 	25,
					0, 		0, 	25, 		5,
					25),
	ROGUE(			0, 		0, 	0, 	0,
					5, 		0, 	5, 	0,

					0, 	20, 	0, 	5,
					25, 	25, 		25, 		5,
					0, 	0, 	5, 	5,
					20, 		20, 	0, 	20,
					0, 		0, 	0, 		0,
					0),
	SCOUT(			0, 		0, 	0, 	0,
					5, 		5, 	0, 	0,

					20, 	20, 	0, 	25,
					25, 	25, 		25, 		5,
					0, 	0, 	5, 	5,
					0, 		20, 	0, 	0,
					0, 		0, 	0, 		0,
					0),
	SORCERER(		0, 		5, 	0, 	0,
					0, 		5, 	0, 	0,

					0, 	25, 	25, 	0,
					0, 		0, 		0, 		0,
					25, 	25, 	0, 	20,
					5, 		0, 	0, 	0,
					25, 	25, 	0, 		0,
					0),
	SPELLSWORD(		0, 		0, 	5, 	0,
					0, 		5, 	0, 	0,

					0, 	5, 		25, 	0,
					0, 		20, 		20, 		0,
					5, 	25, 	0, 	20,
					25, 		0, 	0, 	0,
					5, 		25, 	0, 		0,
					0),
	THIEF(			0, 		0, 	0, 	5,
					5, 		0, 	0, 	0,

					25, 	0, 		0, 	0,
					0, 		0, 		0, 		0,
					0, 	0, 	0, 	0,
					0, 		25, 	25, 	25,
					0, 		0, 	25, 		25,
					25),
	WARRIOR(		5, 		0, 	0, 	0,
					0, 		5, 	0, 	0,

					0, 	0, 		0, 	25,
					25, 	25, 		25, 		25,
					0, 	0, 	25, 	25,
					0, 		0, 	0, 	0,
					0, 		0, 	0, 		0,
					0),
	WITCHHUNTER(	0, 		5, 	0, 	5,
					0, 		0, 	0, 	0,

					0, 	25, 	5, 	0,
					20, 	0, 		0, 		0,
					25, 	25, 	0, 	0,
					5, 		0, 	20, 	0,
					25, 	5, 	20, 		0,
					0);
	//attributes
	private final int STRENGTHMODIFIER;
	private final int INTELLIGENCEMODIFIER;
	private final int WILLPOWERMODIFIER;
	private final int AGILITYMODIFIER;
	private final int SPEEDMODIFIER;
	private final int ENDURANCEMODIFIER;
	private final int PERSONALITYMODIFIER;
	private final int LUCKMODIFIER;
	//skills
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

	PlayerClass(int STRENGTHMODIFIER, int INTELLIGENCEMODIFIER, int WILLPOWERMODIFIER, int AGILITYMODIFIER,
				int SPEEDMODIFIER, int ENDURANCEMODIFIER, int PERSONALITYMODIFIER, int LUCKMODIFIER,

				int ACROBATICSMODIFIER, int ALCHEMYMODIFIER, int ALTERATIONMODIFIER, int ARMORERMODIFIER,
				int ATHLETICSMODIFIER, int BLADEMODIFIER, int BLOCKMODIFIER, int BLUNTMODIFIER,
				int CONJURATIONMODIFIER, int DESTRUCTIONMODIFIER, int HANDTOHANDMODIFIER, int HEAVYARMORMODIFIER,
				int ILLUSIONMODIFIER, int LIGHTARMORMODIFIER, int MARKSMANMODIFIER, int MERCANTILEMODIFIER,
				int MYSTICISMMODIFIER, int RESTORATIONMODIFIER, int SECURITYMODIFIER, int SNEAKMODIFIER,
				int SPEECHCRAFTMODIFIER) {
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

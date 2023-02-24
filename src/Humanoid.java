import java.util.LinkedHashMap;

public class Humanoid extends Entity {
	private final String RACENAME;
	private final int RACIALMAGICKAMODIFIER;
	private final String BIRTHSIGN;
	private LinkedHashMap<String, Integer> attributes;
	private LinkedHashMap<String, Integer> skills;
	private LinkedHashMap<String, Integer> resistances;
	private int maxMagicka;
	private int magicka;
	private int maxFatigue;
	private int fatigue;
	private Container inventory;
	public Humanoid(String name, Race race, PlayerClass classSpecialization, String birthsign, Item[] items){
		super(name, 2 * (race.getBASEENDURANCE()));

		this.RACENAME = race.name();
		this.RACIALMAGICKAMODIFIER = race.getMAGICKAMODIFIER();

		this.BIRTHSIGN = birthsign;

		attributes = new LinkedHashMap<String, Integer>();
		attributes.put("strength", 			race.getBASESTRENGTH()
														+ classSpecialization.getSTRENGTHMODIFIER());
		attributes.put("intelligence", 		race.getBASEINTELLIGENCE()
														+ classSpecialization.getINTELLIGENCEMODIFIER());
		attributes.put("willpower", 		race.getBASEWILLPOWER()
														+ classSpecialization.getWILLPOWERMODIFIER());
		attributes.put("agility", 			race.getBASEAGILITY()
														+ classSpecialization.getAGILITYMODIFIER());
		attributes.put("speed", 			race.getBASESPEED()
														+ classSpecialization.getSPEEDMODIFIER());
		attributes.put("endurance", 		race.getBASEENDURANCE()
														+ classSpecialization.getENDURANCEMODIFIER());
		attributes.put("personality", 		race.getBASEPERSONALITY()
														+ classSpecialization.getPERSONALITYMODIFIER());
		attributes.put("luck", 				race.getBASELUCK()
														+ classSpecialization.getLUCKMODIFIER());

		skills = new LinkedHashMap<String, Integer>();
		skills.put("acrobatics", 			race.getACROBATICSMODIFIER()
														+ classSpecialization.getACROBATICSMODIFIER());
		skills.put("alchemy", 				race.getALCHEMYMODIFIER()
														+ classSpecialization.getALCHEMYMODIFIER());
		skills.put("alteration", 			race.getALTERATIONMODIFIER()
														+ classSpecialization.getALTERATIONMODIFIER());
		skills.put("armorer", 				race.getARMORERMODIFIER()
														+ classSpecialization.getARMORERMODIFIER());
		skills.put("athletics", 			race.getATHLETICSMODIFIER()
														+ classSpecialization.getATHLETICSMODIFIER());
		skills.put("blade", 				race.getBLADEMODIFIER()
														+ classSpecialization.getBLADEMODIFIER());
		skills.put("block", 				race.getBLOCKMODIFIER()
														+ classSpecialization.getBLOCKMODIFIER());
		skills.put("blunt", 				race.getBLUNTMODIFIER()
														+ classSpecialization.getBLUNTMODIFIER());
		skills.put("conjuration", 			race.getCONJURATIONMODIFIER()
														+ classSpecialization.getCONJURATIONMODIFIER());
		skills.put("destruction", 			race.getDESTRUCTIONMODIFIER()
														+ classSpecialization.getDESTRUCTIONMODIFIER());
		skills.put("hand to hand", 			race.getHANDTOHANDMODIFIER()
														+ classSpecialization.getHANDTOHANDMODIFIER());
		skills.put("heavy armor", 			race.getHEAVYARMORMODIFIER()
														+ classSpecialization.getHEAVYARMORMODIFIER());
		skills.put("illusion", 				race.getILLUSIONMODIFIER()
														+ classSpecialization.getILLUSIONMODIFIER());
		skills.put("light armor", 			race.getLIGHTARMORMODIFIER()
														+ classSpecialization.getLIGHTARMORMODIFIER());
		skills.put("marksman", 				race.getMARKSMANMODIFIER()
														+ classSpecialization.getMARKSMANMODIFIER());
		skills.put("mercantile", 			race.getMERCANTILEMODIFIER()
														+ classSpecialization.getMERCANTILEMODIFIER());
		skills.put("mysticism", 			race.getMYSTICISMMODIFIER()
														+ classSpecialization.getMYSTICISMMODIFIER());
		skills.put("restoration", 			race.getRESTORATIONMODIFIER()
														+ classSpecialization.getRESTORATIONMODIFIER());
		skills.put("security", 				race.getSECURITYMODIFIER()
														+ classSpecialization.getSECURITYMODIFIER());
		skills.put("sneak", 				race.getSNEAKMODIFIER()
														+ classSpecialization.getSNEAKMODIFIER());
		skills.put("speechcraft", 			race.getSPEECHCRAFTMODIFIER()
														+ classSpecialization.getSPEECHCRAFTMODIFIER());

		resistances = new LinkedHashMap<String, Integer>();
		resistances.put("resist fire", 		race.getFIRERESISTANCE());
		resistances.put("resist frost", 	race.getFROSTRESISTANCE());
		resistances.put("resist shock", 	race.getSHOCKRESISTANCE());
		resistances.put("resist magic", 	race.getMAGICRESISTANCE());
		resistances.put("resist poison", 	race.getPOISONRESISTANCE());
		resistances.put("resist disease", 	race.getDISEASERESISTANCE());

		setMaxMagicka();
		this.magicka = this.maxMagicka;
		setMaxFatigue();
		this.fatigue = this.maxFatigue;

		inventory = new Container(name + "'s inventory", 5 * attributes.get("strength"));

		for(Item item : items){
			inventory.addItem(item);
		}
	}

	private void setMaxMagicka(){
		this.maxMagicka = 2 * attributes.get("intelligence") + RACIALMAGICKAMODIFIER;
		if(BIRTHSIGN.equals("mage")){
			this.maxMagicka += 50;
		}
		if(BIRTHSIGN.equals("apprentice")){
			this.maxMagicka += 100;
		}
		if(BIRTHSIGN.equals("atronach")){
			this.maxMagicka += 150;
		}
	}
	private void setMaxFatigue(){
		this.maxFatigue = attributes.get("strength") + attributes.get("agility") + attributes.get("willpower") + attributes.get("endurance");
	}

	public int getMaxMagicka(){
		return maxMagicka;
	}
	public int getMagicka(){
		return magicka;
	}
	public int getMaxFatigue(){
		return maxFatigue;
	}
	public int getFatigue(){
		return fatigue;
	}
	public void restoreMagickaXPoints(int amountToRestore){
		if(amountToRestore > 0){
			if(amountToRestore + magicka > maxMagicka){
				magicka = maxMagicka;
			}else{
				magicka += amountToRestore;
			}
		}
	}
	public void restoreMagickaXSeconds(int timeToRestoreInSeconds){
		restoreMagickaXPoints(Math.round(timeToRestoreInSeconds * (0.01f * (0.75f + 0.02f * attributes.get("willpower")) * maxMagicka)));
	}
	public void restoreMagickaFully(){
		magicka = maxMagicka;
	}
	public void restoreFatigueXPoints(int amountToRestore){
		if(amountToRestore > 0){
			if(amountToRestore + fatigue > maxFatigue){
				fatigue = maxFatigue;
			}else{
				fatigue += amountToRestore;
			}
		}
	}
	public void restoreFatigueXSeconds(int timeToRestoreInSeconds){
		restoreFatigueXPoints(timeToRestoreInSeconds * 10);
	}
	public void restoreFatigueFully(){
		fatigue = maxFatigue;
	}
}

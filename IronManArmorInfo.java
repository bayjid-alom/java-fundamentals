/**
 * The legendary Tony Stark has asked you to create a Java program to store information about his new armor.
 This information will be needed later to upgrade the armor software.
 
 * Armor Name: "Mark 2025"
 * Armor Version: "0.01"
 * Armor Weight: "100.89789378"
 * Armor Power Category: "A"
 * Armor Has Nano-Tech: true
 * Number of Missiles It Can Store: 200
 **/


public class IronManArmorInfo {
    public static void main(String[] args) {

        String armorName = "Mark 2025";
        int missileCount = 200;
        double armorWeight = 100.89789378d;
        float armorHeight = 1.85f;
        char powerCategory = 'A';
        boolean hasNanoTech = true;

        System.out.println(armorName);
        System.out.println(missileCount);
        System.out.println(armorWeight);
        System.out.println(armorHeight);
        System.out.println(powerCategory);
        System.out.println(hasNanoTech);
    }
}


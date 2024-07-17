public class Teeth extends Item {
    private static int collectedTeethCount = 0;

    public Teeth(String name, String description) {
        super(name, description);
    }

    public static void collectTooth() {
        collectedTeethCount++;
    }

    public static int getCollectedTeethCount() {
        return collectedTeethCount;
    }
}


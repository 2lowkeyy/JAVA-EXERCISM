class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }

    @Override
    public String toString() {
        String description = "Fighter is a " + getClass().getSimpleName();
        System.out.println("toString: " + description);
        return description;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        System.out.println("Warrior isVulnerable: false");
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage = fighter.isVulnerable() ? 10 : 6;
        System.out.println("Warrior getDamagePoints: " + damage + " (vulnerable opponent: " + fighter.isVulnerable() + ")");
        return damage;
    }

    @Override
    public String toString() {
        String description = "Fighter is a Warrior";
        System.out.println("Warrior toString: " + description);
        return description;
    }
}

class Wizard extends Fighter {

    private boolean spellPrepared = false;

    public void prepareSpell() {
        this.spellPrepared = true;
        System.out.println("Wizard prepareSpell: hechizo preparado");
    }

    @Override
    boolean isVulnerable() {
        boolean vulnerable = !spellPrepared;
        System.out.println("Wizard isVulnerable: " + vulnerable);
        return vulnerable;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage = spellPrepared ? 12 : 3;
        System.out.println("Wizard getDamagePoints: " + damage + " (spell prepared: " + spellPrepared + ")");
        return damage;
    }

    @Override
    public String toString() {
        String description = "Fighter is a Wizard";
        System.out.println("Wizard toString: " + description);
        return description;
    }
}
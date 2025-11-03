class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean preparedSpell = false;

    public void prepareSpell() {
        preparedSpell = true;
    }
    
    @Override
    boolean isVulnerable() {
        return !preparedSpell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return preparedSpell ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}

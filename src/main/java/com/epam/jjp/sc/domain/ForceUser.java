package com.epam.jjp.sc.domain;

public abstract class ForceUser extends Person {
    private ForceSide allegiance;
    private LightSabre lightSabre;

    public ForceUser(final String name, final Gender gender, final int health) {
        this(name, gender, ForceSide.UNDECIDED, health);
    }

    public ForceUser(final String name, final Gender gender, final ForceSide allegiance, final int health) {
        super(name, gender, health);
        this.allegiance = allegiance;
    }

    public LightSabre getLightSabre() {
        return lightSabre;
    }

    public void setLightSabre(LightSabre lightSabre) {
        this.lightSabre = lightSabre;
    }

    public String getName() {
        return super.getName();
    }

    public void setAllegiance(final ForceSide forceSide) {
        allegiance = forceSide;
    }

    public ForceSide getAllegiance() {
        return allegiance;
    }

    @Override
    public String fight(final Person target) {
        return lightSabre.hit(target);
    }

    @Override
    public String toString() {
        return "[" + getAllegiance() + "] " + super.getName();
    }
}

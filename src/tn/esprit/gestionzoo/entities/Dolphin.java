package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // C.p.d
    public Dolphin() {
        super();
        this.swimmingSpeed = 0f;
    }

    // C.param
    public Dolphin(String name, int age, String species, String habitat, float swimmingSpeed) {
        super(name, age, species, habitat);
        setSwimmingSpeed(swimmingSpeed);
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        if (swimmingSpeed < 0) {
            throw new IllegalArgumentException("La vitesse de nage ne peut pas être négative !");
        }
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + " | swimmingSpeed=" + swimmingSpeed + " km/h";
    }
}

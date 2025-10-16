package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    // C.p.d
    public Penguin() {
        super();
        this.swimmingDepth = 0f;
    }

    // C.param
    public Penguin(String name, int age, String species, String habitat, float swimmingDepth) {
        super(name, age, species, habitat);
        setSwimmingDepth(swimmingDepth);
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        if (swimmingDepth < 0) {
            throw new IllegalArgumentException("La profondeur de nage ne peut pas être négative !");
        }
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + " | swimmingDepth=" + swimmingDepth + " m";
    }
}

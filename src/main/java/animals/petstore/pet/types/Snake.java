package animals.petstore.pet.types;

import animals.petstore.pet.Pet;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.PetType;

import java.math.BigDecimal;

public class Snake extends Pet implements PetImpl{
    private final Breed breed;
    private double length;

    public Snake(PetType petType, BigDecimal cost, Gender gender, Breed breed, double lengthInFeet) {
        super(petType, cost, gender);
        this.breed = breed;
        this.length = lengthInFeet;
    }

    public double getLengthInFeet() { return length; };

    // Allow changing length as snake may grow
    public void setLengthInFeet(double lengthInFeet) { this.length = lengthInFeet; }

    public Breed getBreed() {
        return this.breed;
    }
}

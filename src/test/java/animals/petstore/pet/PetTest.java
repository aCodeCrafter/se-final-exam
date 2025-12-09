package animals.petstore.pet;

import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.PetType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    private Pet pet;

    @Test
    void getCost() {
        pet = new Pet(PetType.UNKNOWN, BigDecimal.valueOf(3), Gender.UNKNOWN);
        assertEquals(new BigDecimal(3),pet.getCost());
    }

    @Test
    void testToString() {
        PetType pt = PetType.UNKNOWN;
        pet = new Pet(pt, BigDecimal.valueOf(3), Gender.UNKNOWN);
        assertEquals("The type of pet is " + pt + "!\nThe "+ pt + " gender is " + pet.gender + "!\nThe "+ pt +
                        " cost is $" + pet.getCost() + "!\n",
                pet.toString());
    }
}
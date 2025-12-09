package animals.petstore.pet.types;

import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SnakeTest {

    @Test
    void getLengthInFeet() {
        Snake snake = new Snake(PetType.SNAKE, BigDecimal.valueOf(100), Gender.MALE, Breed.BALL_PYTHON, 10);
        assertEquals(10, snake.getLengthInFeet());
    }

    @Test
    void setLengthInFeet() {
        Snake snake = new Snake(PetType.SNAKE, BigDecimal.valueOf(100), Gender.MALE, Breed.BALL_PYTHON, 10);
        snake.setLengthInFeet(20);
        assertEquals(20, snake.getLengthInFeet());
    }

    @Test
    void getBreed() {
        Snake snake = new Snake(PetType.SNAKE, BigDecimal.valueOf(100), Gender.MALE, Breed.BURMESE, 10);
        assertEquals(Breed.BURMESE, snake.getBreed());
    }
}
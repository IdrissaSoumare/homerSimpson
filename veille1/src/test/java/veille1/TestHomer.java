package veille1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestHomer {
		
@Test
void testHomer() {
	HomerSimpson.drinkBeer().contains("Duff!");
}

@Test
void testHomer2() {
	 HomerSimpson.eat().contains("donuts");
}
}

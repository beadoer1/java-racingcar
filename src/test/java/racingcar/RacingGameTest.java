package racingcar;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.Test;

public class RacingGameTest {

    @Test
    public void test_play() {
        // Given
        final int numberOfCars = 3;
        RacingGame racingGame1 = new RacingGame(numberOfCars);

        // When
        List<RacingCar> racingCars1 = racingGame1.play();
        List<RacingCar> racingCars2 = racingGame1.play();

        // Then
        assertThat(racingCars1).isEqualTo(racingCars2);
    }
}
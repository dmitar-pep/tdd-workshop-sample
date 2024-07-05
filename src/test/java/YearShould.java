import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class YearShould {

    @Test
    void beLeapWhenDivisibleBy4() {
        // Given
        var year = new Year(4);

        // When
        var leap = year.isLeap();

        // Then
        assertThat(leap).isTrue();
    }

    @Test
    void notBeLeapWhen_Not_DivisibleBy4() {
        // Given
        var year = new Year(3);

        // When
        var leap = year.isLeap();

        // Then
        assertThat(leap).isFalse();
    }

    @Test
    void notBeLeapWhenDivisibleBy100() {
        // Given
        var year = new Year(100);

        // When
        var leap = year.isLeap();

        // Then
        assertThat(leap).isFalse();
    }

    @Test
    void beLeapWhenDivisibleBy400() {
        // Given
        var year = new Year(400);

        // When
        var leap = year.isLeap();

        // Then
        assertThat(leap).isTrue();
    }

}

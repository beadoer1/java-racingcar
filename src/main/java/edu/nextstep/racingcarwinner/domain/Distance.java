package edu.nextstep.racingcarwinner.domain;

import edu.nextstep.racingcarwinner.exception.LessThanZeroException;

import java.util.Objects;

public class Distance {
    private final int distance;

    public Distance(int distance) {
        checkLessThanZero(distance);
        this.distance = distance;
    }

    private void checkLessThanZero(int distance) {
        if(distance < 0){
            throw new LessThanZeroException("자동차 이동거리는 0 이상이어야 합니다.");
        }
    }

    public Distance move() {
        return new Distance(distance + 1);
    }

    public int value() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }
}

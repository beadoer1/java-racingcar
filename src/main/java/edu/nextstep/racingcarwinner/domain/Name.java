package edu.nextstep.racingcarwinner.domain;


import edu.nextstep.racingcarwinner.exception.NullNameException;

import java.util.Objects;

public class Name {
    private final String name;

    public Name(String name) {
        checkNullAndEmpty(name);
        this.name = name;
    }

    private void checkNullAndEmpty(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullNameException("자동차 이름은 필수 입니다.");
        }
    }

    public String value() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

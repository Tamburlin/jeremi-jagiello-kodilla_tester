package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String stampName;
    String stampDimensions;
    boolean isStamped;

    public Stamp(String stampName, String stampDimensions, boolean isStamped) {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampDimensions() {
        return stampDimensions;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped && Objects.equals(stampName, stamp.stampName) && Objects.equals(stampDimensions, stamp.stampDimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions='" + stampDimensions + '\'' +
                ", isStamped=" + isStamped +
                '}';
    }
}

package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampWidth;
    private double stampHeight;
    private boolean stampMarked;

    public Stamp(String stampName, double stampWidth, double stampHeight, boolean stampMarked) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHeight = stampHeight;
        this.stampMarked = stampMarked;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public void setStampMarked(boolean stampMarked) {
        this.stampMarked = stampMarked;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampHeight=" + stampHeight +
                ", stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampMarked='" + stampMarked + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stampWidth, stamp.stampWidth) == 0 && Double.compare(stampHeight, stamp.stampHeight) == 0 && Objects.equals(stampName, stamp.stampName) && Objects.equals(stampMarked, stamp.stampMarked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHeight, stampMarked);
    }
}
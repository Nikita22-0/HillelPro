package com.hillel.pashchenko.lesson2;

public class Variables {
    private byte someByte;
    private short someShort;
    private long someLong;
    private int someInt;
    private double someDouble;
    private float someFloat;
    private boolean someBoolean;
    private char someChar;
    private String someStr;

    public Variables(){
    }

    public Variables(byte someByte, short someShort, long someLong, int someInt, double someDouble,
                     float someFloat, boolean someBoolean, char someChar, String someStr) {
        this.someByte = someByte;
        this.someShort = someShort;
        this.someLong = someLong;
        this.someInt = someInt;
        this.someDouble = someDouble;
        this.someFloat = someFloat;
        this.someBoolean = someBoolean;
        this.someChar = someChar;
        this.someStr = someStr;
    }

    public byte getSomeByte() {
        return someByte;
    }

    public void setSomeByte(byte someByte) {
        this.someByte = someByte;
    }

    public short getSomeShort() {
        return someShort;
    }

    public void setSomeShort(short someShort) {
        this.someShort = someShort;
    }

    public long getSomeLong() {
        return someLong;
    }

    public void setSomeLong(long someLong) {
        this.someLong = someLong;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public double getSomeDouble() {
        return someDouble;
    }

    public void setSomeDouble(double someDouble) {
        this.someDouble = someDouble;
    }

    public float getSomeFloat() {
        return someFloat;
    }

    public void setSomeFloat(float someFloat) {
        this.someFloat = someFloat;
    }

    public boolean isSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    public char getSomeChar() {
        return someChar;
    }

    public void setSomeChar(char someChar) {
        this.someChar = someChar;
    }

    public String getSomeStr() {
        return someStr;
    }

    public void setSomeStr(String someStr) {
        this.someStr = someStr;
    }
}

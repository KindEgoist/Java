package org.example.lectures.l11oop.Pro2;

public class SumModel extends CalcModel{
    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
        super.x = value;

    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}

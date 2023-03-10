package org.example.seminars.s2.pro4.model;

public class Vector { // alt+insert | getter(получить) and setter(присвоить) | toString | Constructor | Constructor(пустой)
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector: {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    /**
     * @return Длина вектора
     */
    public double lenghtVector(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    /**
     *
     * @param vector2 для произведения
     * @return скалярное произведение
     */
    public double scalarMulti(Vector vector2){
        return this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
    }

    /**
     *
     * @param vector2 для произведения
     * @return произведение векторов
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(this.y * vector2.z - this.z * vector2.y,
                this.z * vector2.x - this.x * vector2.z,
                this.x * vector2.y - this.y * vector2.x);

    }

    /**
     *
     * @param vector2 второй вектор
     * @return косинус угла
     */
    public double cosVector(Vector vector2) {
        return scalarMulti(vector2) / (lenghtVector() * vector2.lenghtVector());
    }

    /**
     *
     * @param vector2 второй вектор
     * @return сумма векторов
     */
    public Vector summVector(Vector vector2) {
        return new Vector(this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
    }

    /**
     *
     * @param vector2 второй венктор
     * @return разность векторов
     */
    public Vector differenceVector(Vector vector2) {
        return new Vector(this.x - vector2.x, this.y - vector2.y, this.z - vector2.z);
    }
}

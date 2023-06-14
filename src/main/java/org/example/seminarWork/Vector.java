package org.example.seminarWork;

import static java.lang.Math.sqrt;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x= " + x +
                ", y= " + y +
                ", z= " + z +
                '}';
    }

    public double vectorLenght() {
        return sqrt(x * x + y * y + z * z);
    }

    public double scalar(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vectorMulti(Vector vector) {
        return new Vector(y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
        );
    }

    public double vectorCos(Vector vector) {
        return scalar(vector) / vectorLenght() * vector.vectorLenght();
    }

    /**
     * @apiNote сложение векторов
     * @param vector
     * @return
     */

    public Vector vectorAmount(Vector vector) {
        return new Vector(x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    /**
     * @apiNote вычитание векторов
     * @param vector
     * @return
     */
    public Vector vectorDifference(Vector vector) {
        return new Vector(x - vector.x,
                y - vector.y,
                z - vector.z);
    }
}

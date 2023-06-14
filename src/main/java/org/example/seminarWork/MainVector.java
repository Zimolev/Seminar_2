package org.example.seminarWork;

public class MainVector {
    public static void main(String[] args) {
        Vector vector = new Vector(2, 2, 4);
        Vector vector1 = new Vector(1,1,1);
        System.out.println("vector.vectorLenght() = " + vector.vectorLenght());
        System.out.println("vector.scalar(vector1) = " + vector.scalar(vector1));
        System.out.println("vector.vectorMulti(vector1) = " + vector.vectorMulti(vector1));
        System.out.println("vector = " + vector);
        System.out.println("vector1 = " + vector1);
    }
}

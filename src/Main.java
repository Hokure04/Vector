public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(14, 2,5);
        Vector vector2 = new Vector(12, 4, 8);
        System.out.println("Длина вектора равна: "+ vector1.calculateLong());
        System.out.println("Скалярное произведение векторов равно: " + vector1.scalarProduct(vector2));
        vector1.vectorProduct(vector2);
        vector1.findingTheAngle(vector2);
        vector1.sumOfVectors(vector2);
        vector1.differenceOfVectors(vector2);
        Vector[] vectors = Vector.generateVectors(5);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[2]);
        System.out.println(vectors[3]);
        vectors[2].sumOfVectors(vectors[3]);
    }
}
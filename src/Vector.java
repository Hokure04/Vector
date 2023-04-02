
import java.text.DecimalFormat;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public double calculateLong(){
        double vectorLong = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        return vectorLong;
    }

    public int scalarProduct(Vector anotherVector){
        int scalar = this.getX()*anotherVector.getX() + this.getY()*anotherVector.getY() + this.getZ()*anotherVector.getZ();
        return scalar;
    }

    public void vectorProduct(Vector anotherVector){
        int firstPart = this.y*anotherVector.getZ() - this.z*anotherVector.getY();
        int secondPart = this.z*anotherVector.getX() - this.x*anotherVector.getZ();
        int thirdPart = this.x*anotherVector.getY() - this.y*anotherVector.getX();
        System.out.print("Вектороное произведение равно:  ");
        System.out.println("("+firstPart+", "+secondPart+", "+thirdPart+")");
    }

    public void findingTheAngle(Vector vector){
        double corner = (this.scalarProduct(vector))/(Math.abs(this.calculateLong())*Math.abs(vector.calculateLong()));
        System.out.print("Угол между векторами равен: ");
        System.out.println(new DecimalFormat("#.##").format(corner));
    }

    public void sumOfVectors(Vector vector){
        int firstPart = this.x + vector.getX();
        int secondPart = this.y + vector.getY();
        int thirdPart = this.z + vector.getZ();
        System.out.print("Сумма векторов равна: ");
        System.out.println("("+firstPart+", "+secondPart+", "+thirdPart+")");
    }

    public void differenceOfVectors(Vector vector){
        int firstPart = this.x - vector.getX();
        int secondPart = this.y - vector.getY();
        int thirdPart = this.z - vector.getZ();
        System.out.print("Разность векторов равна: ");
        System.out.println("("+firstPart+", "+secondPart+", "+thirdPart+")");
    }

    public static Vector[] generateVectors(int n){
        Vector[] vectors = new Vector[n];
        for(int i = 0; i<n; i++){
            double max = 100;
            double min = 0;
            double randomX = (Math.random()*((max-min)+1))+min;
            double randomY = (Math.random()*((max-min)+1))+min;
            double randomZ = (Math.random()*((max-min)+1))+min;
            vectors[i] = new Vector((int) randomX, (int)randomY, (int)randomZ);
        }
        return vectors;
    }

    @Override
    public String toString(){
        return "Vector ="+ "("+x+", "+y+", "+z+")";
    }
}

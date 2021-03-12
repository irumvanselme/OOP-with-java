class Point<X, Y>{
    X x;
    Y y;
    Point(X x,Y y){
        this.x = x;
        this.y = y;
    }

    public void get_point(){
        System.out.println("("+x+", "+y+ ")");
    }

    public void vector (){
        System.out.println("["+x+", "+y+ "]");
    }

    public Double magnitude(){
        return Math.sqrt((Integer) this.x * (Integer) this.x + (Integer) this.y * (Integer) this.y);
    }
}

public class GenericTypes {
    public static void main(String[] args) {
        Point<Integer, Integer> point = new Point<>(3, 4);
        point.get_point();
        point.vector();
        double k = point.magnitude();
        System.out.println("magnitude = "+k);
    }
}
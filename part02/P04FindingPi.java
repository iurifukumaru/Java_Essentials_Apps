package part02;

public class P04FindingPi {
    public static void main(String[] args) {
        System.out.println(getPi(1));
        System.out.println(getPi(10));
        System.out.println(getPi(100));
        System.out.println(getPi(1000));
        System.out.println(getPi(10000));
        System.out.println(getPi(100000));
        System.out.println(getPi(1000000));
        System.out.println(getPi(20000000));
    }
    public static double getPi(int numPoints) {
        int inCircle = 0;
        for(int i = 0; i < numPoints; i++) {
            double randX = (Math.random() * 2) - 1; //range -1 to 1
            double randY = (Math.random() * 2) - 1;
            //distance from (0,0) = sqrt((x-0)^2 + (y-0)^2)
            double dist = Math.sqrt(randX * randX + randY * randY);
            if(dist < 1) {
                //circle with diameter of 2 has radious of 1
                //add one every time the point is inside the circle
                inCircle++;
            }
        }
        return 4.0 * inCircle / numPoints;
    }
}

// File name: distance.java

// Additional class to handle Distance operations
class DistanceOperation
{
    void addDistance(int m1, int cm1, int m2, int cm2)
    {
        int totalCm = cm1 + cm2;
        int extraM = totalCm / 100;   // 100 cm = 1 meter
        int remainingCm = totalCm % 100;

        int totalM = m1 + m2 + extraM;

        System.out.println("Total Distance = " + totalM + " meters and " + remainingCm + " centimeters");
    }
}

// Main class (same as file name)
public class distance
{
    public static void main(String args[])
    {
        DistanceOperation obj = new DistanceOperation();

        // Example: distance1 = 5 m 75 cm, distance2 = 3 m 50 cm
        obj.addDistance(5, 75, 3, 50);
    }
}

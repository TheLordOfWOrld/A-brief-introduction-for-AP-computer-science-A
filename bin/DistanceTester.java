public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance tester = new Distance(100);
        // Convert one to miles, one to leagues an
        System.out.println(tester.getkm()+"km = "+tester.toMiles()+" miles");
        System.out.println(tester.getkm()+"km = "+tester.toLeagues()+" Leagues");
        // double one mileage
        tester.doubleMileage();
        // Print out the converted values
        System.out.println(tester.doubleMileage());
        // Use the getter!
    }
}



public class Distance
{
    private double kilometers;
    public Distance(double kilometers){
            this.kilometers = kilometers;
    }

    public double toMiles(){
        return kilometers/0.621371;
    }

    public double toLeagues(){
        return kilometers/5.556;
    }


    public double doubleMileage(){
        return toMiles()* 2;
    }
    public double getkm(){
        return kilometers;
    }
}
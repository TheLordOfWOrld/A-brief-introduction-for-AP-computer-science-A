public class median {
    public static double findMedian(double[] numbers){// assume that arry is created appropriately cause i don't konw how to rank the arrey
        if(numbers.length % 2 == 0){
            return (numbers[numbers.length/2-1]+numbers[numbers.length/2+1])/2;
        }
        else{
            return (numbers[numbers.length/2+1]);
        }
    }

    public static  void main(String[] args) {
        
        double[] numbers = {4.5, 2.7, 8.3, 5.1};
        System.out.println("Median: " + median.findMedian(numbers));

    }
}

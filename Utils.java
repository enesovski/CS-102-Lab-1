public class Utils{

    //Enes
    public static int SumOddIndexElements(int[] array)
    {
        int sum = 0;

        for (int i = 1 ;i < array.length; i+=2) {
            
            sum += array[i];
        }

        return sum;
    } 

    public static int SumEvenIndexElements(int[] array)
    {
        int sum = 0;

        for (int i = 0 ;i < array.length; i+=2) {
            
            sum += array[i];
        }

        return sum;
    }
    
    //yavuz
    public static double[] AverageDifference(int[] array) {
        
        double sum = 0;
        double avg;
        double[] diffArray = new double[array.length];  
        

        for (double i : array) {
            sum += i;
        }

        avg = sum / array.length;

        for (int i = 0; i < diffArray.length; i++) {
            diffArray[i] = array[i] - avg;
        }
        

        return diffArray;
    }

}

import java.util.Random;
public class Utils{

    
    public static int[] random_array(int num){
        int[] random_array=new int[num];
        Random random=new Random();
        for (int i=0;i<num;i++){
            int number=random.nextInt(101);
            random_array[i]=number;
        }
        return random_array;
        
    }

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

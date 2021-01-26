package Sum3And5Challenge;
//An Application that sums the numbers that can be divided by 3 and 5 from range 1 - 1000

public class SumNumber {
    public static void main(String[] args) {
      int count = 0;
      int sum = 0;

      for (int i= 1; i <= 1000; i++){
          if ((i % 3 ==0) && (i % 5 ==0)){
              count++;
              sum +=i;
              System.out.println("Found number= " + sum);
          }
            if (count == 20){
                break;
            }
      }
        System.out.println("Sum= " + sum);
    }
    
}

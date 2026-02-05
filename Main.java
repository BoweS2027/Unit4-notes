public class Main {

   public static void main(String []args) {
     // 1D array is a block of memory that stores a collection of data item called elements under one variable name
     //how to declare an array and create
     String[] apCompSci = new String[13];
     double[] prices = new double[5]; // default values 0.0
     String[] names = new String[5]; // null
     int[] luckyNums = new int[10]; // 0
     boolean[] yn = new boolean[3]; // false
     double[] scores = {45.0, 20.0, 89.5, 97.8};
     //look at one item using an index
     System.out.println(scores[1]);
     for(int i = 0; i < 4; i++){
      System.out.println(scores[i]);
     }
     for(int i = 0; i < 4; i++){
      scores[i]= scores[i]+10;
      System.out.println("Score after cruve: " + scores[i]);
     }
     double sum = 0;
     for(double score : scores){
      sum+=score;
     }
     System.out.println(sum);
     double avg = sum / scores.length;
     System.out.println(avg);
   }
}

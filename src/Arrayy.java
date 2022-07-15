public class Arrayy {
    public static void main(String[] args) {

         int[] myArray = new int[25];

         for(int i=0; i<myArray.length; i++) {
             myArray[i] = i*10;

         }
         for (int i=0; i<myArray.length; i++) {
             System.out.println("Array list " + i + ", value " + i*10+ " aa");
         }

    }
}

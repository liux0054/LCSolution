package easy;

public class LC605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int i = 0;
         int[] newFlowerBed = new int[flowerbed.length+4];
         newFlowerBed[0] = 1;
         newFlowerBed[1] = 0;
         newFlowerBed[flowerbed.length+2] = 0;
         newFlowerBed[flowerbed.length+3] = 1;
         for(int j=0; j<flowerbed.length; j++){
             newFlowerBed[j+2] = flowerbed[j];
         }
         int countOfConsecutiveZeros = 0;
         boolean firstOneEncountered = false;
         while(i<newFlowerBed.length){
             if(newFlowerBed[i] == 1){
                 if(!firstOneEncountered){
                     firstOneEncountered = true;
                     i++;
                     while(newFlowerBed[i] == 0){
                         countOfConsecutiveZeros++;
                         i++;
                     }
                 }
                 else{
                     n -= (countOfConsecutiveZeros-1)/2;
                     countOfConsecutiveZeros=0;
                     if(i != newFlowerBed.length-1){
                         firstOneEncountered = false;
                     }else{
                         break;
                     }
                 }
             }
         }
         return n <= 0;
    }
}

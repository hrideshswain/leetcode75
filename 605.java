//605 . CAN PLACE FLOWERS :

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        
        for(int i = 0; i<flowerbed.length;i= i+2){
            if(flowerbed[i]==0){
                if(i == flowerbed.length-1|| flowerbed[i]==flowerbed[i+1]){
                    n--;

                }else{
                    i++;
                }
            }
        }
        return n<=0;
        
    }
}




    //class Solution {
     //   public boolean canPlaceFlowers(int[] flowerbed, int n) {
      //      // If we don't need to plant any flowers, the answer is always true.
       //     if (n == 0) {
      //          return true;
        //    }

         //   for (int i = 0; i < flowerbed.length; i++) {
                // Check if the current plot is empty.
          //      if (flowerbed[i] == 0) {
                    // Check if the left plot is empty (or if we are at the beginning).
          //          boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                    
                    // Check if the right plot is empty (or if we are at the end).
           //         boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                    // If both sides are empty, we can plant a flower here.
              //      if (emptyLeft && emptyRight) {
           //             flowerbed[i] = 1; // Place the flower.
             //           n--;              // Decrement the number of flowers needed.

                        // If we've planted all the required flowers, we can stop early.
          //              if (n == 0) {
          //                  return true;
          //              }
     //               }
      //          }
     //      }

            // If we finish the loop and n is still > 0, we couldn't plant enough.
   //         return false;
   //     }
 //   }


//
package Binary_Search;

public class GuessNumber {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start+(end-start)/2;
            int result = guess(mid);
            if(result == 0){
                return mid;
            }
            else if(result==-1){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int guess(int num){
         int pick = 42;

            if(num > pick){
                return -1;
            }

            if(num < pick){
                return 1;
            }

            return 0;
        }

}

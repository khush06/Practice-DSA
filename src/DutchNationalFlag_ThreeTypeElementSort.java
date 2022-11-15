public class DutchNationalFlag_ThreeTypeElementSort {
    // use Hoarse partition
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,0,0,1,0,2,2,1};
        sort(arr);
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
        //maintain 4 sections
        //1) 0 - (low-1) -- Will have first type of elements
        //2) low - (mid - 1) -- will have second type of elements
        //3) (mid) - (high-1) -- Will have elements in process
        //4) high - (n-1) -- Will have 3rd type of elements
        // Stop the loop when there are no elements left in section 3 (when mid and high crosses)
        public static void sort(int[] arr){
        int low = 0, mid = 0, high = arr.length - 1; // right now all the elements are in 3rd section - in process
            while(mid <= high){
                if(arr[mid] == 0){
                    //swap
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;

                    low++;
                    mid++;
                }
                else if(arr[mid] == 1){
                    mid++;
                }
                else {
                    //swap
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;

                    high--;
                }
            }

        }
    }


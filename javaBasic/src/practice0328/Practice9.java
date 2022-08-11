package practice0328;

public class Practice9 {
    public static void main(String[] args) {
        int[] arr = {13,90,10,79,101,25,123,38,5,16,64,55,17};
        int[] arr2 = {38,118,26,17,41,53,10,88,92,102,67,22,55};

        System.out.printf("공통 숫자 개수: " + common(arr,arr2));
    }

    public static int common(int[] arr, int[] arr2){
        int count = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr[i] == arr2[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

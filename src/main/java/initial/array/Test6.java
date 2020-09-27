package initial.array;

public class Test6 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int minlen = nums1.length < nums2.length? nums1.length: nums2.length;
        int[] res = new int[minlen];
        int count=0;
        for(int i = 0, ilen = nums1.length; i < ilen; i++){
            for(int j = 0, jlen = nums2.length - count; j < jlen; j++){
                if (nums1[i] == nums2[j]){
                    res[count] = nums1[i];
                    count ++;
                    for(int k = j; k < jlen - 1; k++){
                        nums2[k] = nums2[k+1];
                    }
                    break;
                }
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++){
            result[i] = res[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1};
        int[] arr2 = new int[]{1, 2};
        int[] intersect = intersect(arr1, arr2);
        for (int i : intersect){
            System.out.print(i + " ");
        }
    }
}

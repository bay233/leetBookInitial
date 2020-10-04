package initial.sortAndSearch;

public class Test1 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null && nums2 == null){
            return ;
        }

        int i = 0;
        int j = 0;
        int[] tmp = new int[m];
        for (int a = 0;a < m; a++){
            tmp[a] = nums1[a];
        }

        int pos = 0;
        while (i < m && j < n){
            if (tmp[i] <= nums2[j]){
                nums1[pos] = tmp[i];
                i ++;
            }else {
                nums1[pos] = nums2[j];
                j ++;
            }
            pos ++;
        }

        if (i < m){
            for ( ; i < m; i++, pos++){
                nums1[pos] = tmp[i];
            }
        }else if(j < n){
            for (; j < n; j++, pos++){
                nums1[pos] = nums2[j];
            }
        }

    }
}

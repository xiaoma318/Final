package array;

/**
 * Created by chengma on 7/27/15.
 */
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(n>m)
            return findMedianSortedArrays(nums2, nums1);
        int k = (m+n-1)/2;
        int l=0, r=Math.min(k, n);

        while (l<r){
            int mid1=(l+r)/2;
            int mid2=k-mid1;

            if(nums1[mid1] < nums2[mid2])
                l=mid1+1;
            else
                r=mid1;
        }

        int a = (Math.max(l>0?nums1[l-1]:Integer.MIN_VALUE, k-l>=0?nums2[k-l]:Integer.MIN_VALUE));
        if((n+m)%2==1 ) return (double)a;

        int b = (Math.min(l<n?nums1[l]:Integer.MAX_VALUE, k-l+1<m?nums2[k-l+1]:Integer.MAX_VALUE));
        return (a+b) * 0.5;
    }
}

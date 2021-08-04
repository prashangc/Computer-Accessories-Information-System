/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppliancesInfo;

/**
 *
 * @author ktm
 */
public class BS {
     public static void main(String[] args){
        int[] a= {2,3,4,6,8,43,78};
        int find= 43;
        int low= 0;
        int high= a.length-1;
        int index=binarySearch(a,low,high,find);
        
        if(index>=0){
            System.out.println("value found at "+index);
        }else{
            System.out.println("not found");
        }
    }
    public static int binarySearch(int[] a, int low, int high, int find){
        if(low<=high){
            int mid=(low+high)/2;
            if (a[mid]==find){
                return mid;}
            else if(a[mid]<find){
                return binarySearch(a, mid+1,high,find);}
            else {
                return binarySearch(a, mid,high-1,find);}
            }
        else{return -1;
                }
    }
}

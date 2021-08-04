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
public class BinarySearch {

    public static int binarySearch(int myarray[], int x) {

        int a = 0;
        int b = myarray.length - 1;

        while (a <= b) {

            int mid = (a + b) / 2;
            if (myarray[mid] == x) {
                return myarray[mid];
            } else if (x > myarray[mid]) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }

        return -1;

    }
}

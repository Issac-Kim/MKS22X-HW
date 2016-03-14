import java.util.*;

public class Driver{
    public static void main(String[] args){
int[] d = new int [4000000];
int[] c = new int [d.length];
int[] a = new int [d.length];

for(int i = 0; i < d.length; i++){
    d[i]= (int)(Math.random()*3);
c[i]= d[i];
a[i] = d[i];
}
long t = System.currentTimeMillis();
Quick.quickSort(d); //or even your old quicksort!!!
long t1 = System.currentTimeMillis();
long t2 = System.currentTimeMillis();
//Quick.quickSortOld(a);
long t3 = System.currentTimeMillis();
long t4 = System.currentTimeMillis();
Arrays.sort(c);
long t5 = System.currentTimeMillis();
System.out.println("new:" + (t1-t) + "old:" + (t3-t2) + "arrays:" + (t5-t4));
System.out.println(Arrays.equals(a,c));
System.out.println(Arrays.equals(d,c));
    }
}

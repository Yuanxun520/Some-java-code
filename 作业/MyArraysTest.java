public class MyArraysTest {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }

    private static void test5() {
        long[] a= new long[] {1,2,3,4,5,6,7,8,9};

        for (int target = -1; target < a.length; target++){
            int t = MyArrays.binarySearch(a,target);
            System.out.println(t);
        }
    }

//    private static void test4() {
//        long[] array ;
//        array= new long [] {1,2,3,4,5,6,7,8,9};
//        MyArrays.bubblrSort(array);
//        System.out.println(MyArrays.toString(array));
//
//        array= new long [] {6,2,6,8,5,1,7,8,9};
//        MyArrays.bubblrSort(array);
//        System.out.println(MyArrays.toString(array));
//
//        array= new long [] {1,3,4,6,5,9,7,8,2};
//        MyArrays.bubblrSort(array);
//        System.out.println(MyArrays.toString(array));
//    }

//    private static void test3() {
//        long[] original = {1,2,3,4};
//        long[] c1 = MyArrays.copyRangeOf(original,1,3);
//        System.out.println(c1);
//        long[] c2 = MyArrays.copyRangeOf(original,0,5);
//        System.out.println(c2);
//        long[] c3 = MyArrays.copyRangeOf(original,3,5);
//        System.out.println(c3);
//    }

//    private static void test2() {
//        long[] a2 = {1,2,3};
//
//        long[] c1 = MyArrays.copyOf(a2,1);
//        System.out.println(MyArrays.toString(c1));
//        long[] c2 = MyArrays.copyOf(a2,3);
//        System.out.println(MyArrays.toString(c2));
//        long[] c3 = MyArrays.copyOf(a2,4);
//        System.out.println(MyArrays.toString(c3));
//
//    }
//
//    private static void test1() {
//        long[] a1 = {};
//        System.out.println(MyArrays.toString(a1));
//        long[] a2=new long[5];
//        System.out.println(MyArrays.toString(a2));
//        long[] a3=new long[] {1,2,34,5};
//        System.out.println(MyArrays.toString(a3));
//
//    }
}
public class App {

    static void min(int arr[]){
        int min = arr[0];
        for(int i:arr){
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);
    }
    static void Max(int arr[]){
        int min = arr[0];
        for(int i:arr){
            if(i > min){
                min = i;
            }
        }
        System.out.println(min);
    }
    static int[] arr11(){
        return new int[]{1,2,3,4,5,6,7,8,9};
    }



    public static void main(String[] args) throws Exception {
        // 2 types of array
        // 1) 1d 
        // 2) multidimentional array

        // datatype a[];
        // datatype[] b;
        // datatype []c;
        // a = new datatype[size];
        // datatype d = new datatype[size];

        int arr[];
        arr = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr[i-1] = i;
        }
        System.out.println("Array:");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }


        int arr1[] = {0, 1, 2, 3, 4, 100, 6, 7, 8, 9};
        for(int i:arr1){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(arr1.length);
        int arr2[] = arr1.clone();
        for(int i:arr2){
            System.out.println(i);
        }
        int arr3[] = {10, 1, 2, 3, 4, 100, 6, 7, 8, 9};
        boolean a = arr3.equals(arr1);
        System.out.println(a);

        String s = arr1.toString();
        System.out.println(s);

        min(arr3);
        Max(arr3);
        Max(new int[]{10, 1, 2, 3, 4, 0});
        int arr5[] = arr11();
        for(int i:arr5){
            System.out.println(i);
        }
    }
}

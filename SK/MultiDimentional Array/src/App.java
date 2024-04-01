public class App {
    public static void main(String[] args) throws Exception {
        // datatype [][]Variable;
        // datatype[][] Variable;
        // datatype Variable[][];
        // datatype []Variable[];

        // int[][] v = new int[5][5];
        // for(int i = 0; i < v.length; i++){
        //     for(int j = 0; j < v[i].length; j++){
        //         v[i][j] = i*j;
        //     }
        // }
       /*  int [][]v2 = {{1,2,3},{1,2,3}};

        for(int i = 0;i<2;i++){
            for(int j = 0; j < 3; j++){
                System.out.print(v2[i][j] + "  ");
            }
            System.out.println();
        }
        char [][][]v3 = {{{'a','b','c'},{'a','b','c'}}};
        Class c = v3.getClass();
        String name = c.getName();
        System.out.println(name);
        for(char [][]i:v3){
            for(char []j : i){
                for(char k : j){
                    System.out.print(k + "  ");
                }
                System.out.println();
            }
        }
        char [][][]c1 = v3.clone();
        for(char [][]i:c1){
            for(char []j : i){
                for(char k : j){
                    System.out.print(k + "  ");
                }
                System.out.println();
            }
        }
        if(c1 == v3){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        int [][]arr1 = {{1,2,3},{4,5,6}};
        int [][]arr2 = {{7,8,9},{10,11,12}};
        int [][]arr3 = new int[2][3];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int []i:arr3){
            for(int j : i){
                System.out.print(j + "  ");
            }
            System.out.println();
        } */

        int [][] arr1 = {{1,1,1},{2,2,2},{3,3,3}};
        int [][] arr2 = {{1,1,1},{2,2,2},{3,3,3}};
        int [][] arr3 = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               arr3[i][j] = 0;
                for(int k = 0; k < 3; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

    }
}
/*
 * a =  |1 1 1|
 *      |2 2 2|
 *      |3 3 3|
 * 
 * 
 * b =  |1 1 1|
 *      |2 2 2|
 *      |3 3 3|
 * 
 * c =  |(1*1 + 1*2 + 1*3)  (1*1 + 1*2 + 1*3)   (1*1 + 1*2 + 1*3)|
 *      |(2*1 + 2*2 + 2*3)  (2*1 + 2*2 + 2*3)   (2*1 + 2*2 + 2*3)|
 *      |(3*1 + 3*2 + 3*3)  (3*1 + 3*2 + 3*3)   (3*1 + 3*2 + 3*3)|
 */
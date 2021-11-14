public class arraymergerV2 {
    public static void main(String[] args) {
        int[] array1 =  { 1 , 3 , 3 , 5 , 6 , 9 };
        int[] array2 =  { 2 , 3 , 5 , 7 , 8 , 9 , 10 };
        int[] result = new int[array1.length + array2.length];          // create new array
        int k = 0;

        if (array1.length < array2.length) {                            // test for shorter array 
            for (int i = 0; i < array1.length; i++) {                   // loop through array
                if (array1[i]<=array2[i]) {                             // compare numbers of array1 and array2
                    result[k] = array1[i];                              // add smaller number first
                    result[k+1] = array2[i];                            // add larger number
                    k = k+2;               
                }else {
                    result[k] = array2[i];                              // add smaller number first
                    result[k+1] = array1[i];                            // add larger number
                    k = k+2; 
                }   
            }
            for (int i = array1.length; i < array2.length; i++) {       // add remaining array2 to result
                k = array1.length*2;
                result[k] = array2[i];             
            } 
        }

        if (array2.length < array1.length) {                            // test for shorter array 
            for (int i = 0; i < array2.length; i++) {                   // loop through array
                if (array1[i]<=array2[i]) {                             // compare numbers of array1 and array2
                    result[k] = array1[i];                              // add smaller number first
                    result[k+1] = array2[i];                            // add larger number
                    k = k+2;               
                }else {
                    result[k] = array2[i];                               // add smaller number first
                    result[k+1] = array1[i];                             // add larger number
                    k = k+2; 
                }   
            }
            for (int i = array2.length; i < array1.length; i++) {       // add remaining array1 to result
                k = array2.length*2;
                result[i] = array1[i];            
            }  
        }
        for (int i = 0; i < result.length; i++) {                       // print result
            System.out.print(result[i]+" ");
        }
        System.out.println("");
    }             
}     
public class Linear_Search {
    public static int LinearSearch(int array[],int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==key) {
                return i;
                
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={5,7,3,2,7,89,3,6,5};
        int key=89;

        int index= LinearSearch(array,key);

        if (index==-1) {
            System.out.println("key not found");
            
        } else {
            System.out.println("key found at index " + index);
            
        }


    }
}

public class HW_Menu {
    public static int find(String menu[],String key){
        for (int i = 0; i < menu.length; i++) {

            if (menu[i].equals(key)) {
                return i;
                
            }
            
        }
        return -1;


    }
    public static void main(String[] args) {
        String menu[]={"Samosa","Coldrik","Bread","cholebhature"};

        String key="Bread";

        int index = find(menu,key);

        System.out.println("item at index nnumber "+ index);


    }
}

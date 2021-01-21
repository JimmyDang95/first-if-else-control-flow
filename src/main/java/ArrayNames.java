public class ArrayNames {
    public static void main(String[] args) {
        arrayTesting(4);
    }

    public static String[] arrayTesting(int arraylength){

    //String[] bestTeam = {"Jimmy", "Yan", "Daniel", "Magnus"};

        String[] names = new String[arraylength];
        for (int i = 0; i <names.length; i++) {

            names[i]="Students "+(i+1);
            System.out.println(names[i]);
        }
        return names;
    }



}

public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Hello World");
        /*int myInt=12;
        System.out.println(myInt);
        int my2Int=16;
        int sum=myInt+my2Int;
        System.out.println(sum);
        double d1=9.5;
        float f1=3.5f;
        char c1='a';
        String s1="a";
        boolean b1=true;
        System.out.println(b1);*/
        int[] ages=new int[10];
        System.out.println(ages[0]);
        //ages[1]=100;
        //System.out.println(ages[1]);
        for (int i=0; i < ages.length; i++)
        {
            ages[i]=(i+1)*10;
            //System.out.println(ages[i]);
        }
        int valMax=ages[0];
        for (int i=1; i < ages.length; i++)
        {
            if (ages[i] > valMax)
            {
                valMax=ages[i];
            }
        }
        System.out.println("valMax="+valMax);
        int valMax2=findMax(ages);
        System.out.println("valMax2="+valMax2);
        int[] temps=new int[]{16,77,101,88,45,35,22,0,-12,5,2};
        int valMinEven=findMinEven(temps);
        System.out.println("valMinEven="+valMinEven);
    }
    public static int findMax(int[] nums){
        
        if (nums.length == 0){
            return Integer.MIN_VALUE;
        }
        int valMax=nums[0];
        for (int i=1; i < nums.length; i++)
        {
            if (nums[i] > valMax)
            {
                valMax=nums[i];
            }
        }
        return valMax;
    }
    //minimo valore pari
    public static int findMinEven(int[] nums){
        
        //if (nums.length == 0){
        //   return Integer.MAX_VALUE;
        //}
        int valMinEven=Integer.MAX_VALUE;
        for (int i=0; i < nums.length; i++)
        {
            if ((nums[i] < valMinEven) && (nums[i]%2 == 0))
            {
                valMinEven=nums[i];
            }
        }
        return valMinEven;
    }
    public static void alfreFunction(){

    }
}


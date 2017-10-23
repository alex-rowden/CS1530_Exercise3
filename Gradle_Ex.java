public class Gradle_Ex{

    public static void main(String[] args){
        if(args.length != 1){
            System.err.println("Wrong number of args");
            System.exit(1);
        }
        int n = 0;
        try{
            n = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.err.println("Not an int, you fool");
            System.exit(1);
        }
        if (n < 0){
            System.err.println("Integer must be positive");
            System.exit(1);
        }
        tri(n);
        lazy(n);
    }

    public static int tri(int n){
        int accum = 0;
        for (int i = n; i > 0 ; i--){
            accum += i;
        }

        System.out.println("Tri(n) = "  + accum);

        return accum;
    }

    public static double lazy(int n){
        double l = (Math.pow(n, 2) + n + 2) / 2 ;
        System.out.println("Lazy(n) = " + l);
        return l;
    }
}

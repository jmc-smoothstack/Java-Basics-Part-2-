public class Assignment1{

     public static void main(String []args){
     	int sum = 0;
     	for(int x=0; x<args.length; x++){
     		sum += Integer.parseInt(args[x]);
       }
       System.out.println("Sum: "+sum);
    }
}

package DSA;

public class test {
    public static void main(String[] args){
            String data="1 2 N N 1000 N N 56 78 ";

            String[] splitData=data.split(" ");

            for(String val:splitData){
                if(val.equals("N")==false)
                    System.out.println("Hellp");
                System.out.print(val+" ");
            }

    }
}

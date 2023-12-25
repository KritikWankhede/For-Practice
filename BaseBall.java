import java.util.ArrayList;

public class BaseBall {
     public int calPoints(String[] operations) {
       int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                list.remove(list.get(count-1));
                count--;
            }
            else if(operations[i]=="D"){
                int num=list.get(count-1)*2;
                list.add(num);
                count++;
            }
            else if(operations[i]=="+"){
                int num= list.get(count-1)+list.get(count-2);
                list.add(num);
                count++;
            }
            else {
                int num=Integer.valueOf(operations[i]);
                list.add(num);
                count++;
            }
        }
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum=sum+list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        BaseBall ball = new BaseBall();
       
        String[] ops = {"5","2","C","D","+"};
         System.out.println(ball.calPoints(ops));
    }
    
}

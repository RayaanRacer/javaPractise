import java.util.Stack;
class QueueUsingStack{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
            }else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }
        }
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return(s1.pop());
            }
        }
        public int front(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return(s1.peek());
            }
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
    }
}
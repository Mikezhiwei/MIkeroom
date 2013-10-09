package Queue;

public class Queue {

	         public int table[];
	         public int n;
	         public int front ,rear;
	         
	         public Queue(int length)
	         {
	        	   this.n=length;
	        	   table=new int [n];
	        	   front=rear=-1;
	         }
	         
	         public boolean isEmpty()//ѭ�������жϿ�
	         {
	        	   return(this.front==this.rear);
	         }
	         
	         public boolean isFull()//ѭ�������ж���,����һ���洢�ռ�
	         {
	        	   return(((this.rear+1)%this.n)==this.front); 
	         }
	         
	         public void enqueue(int item)
	         {
	        	   if(!this.isFull())
	        	   {
	        		     this.rear=(this.rear+1)%this.n;//��ɢ����ģʽ
	        		     this.table[rear]=item;
	        	   }else{
	        		   System.out.println("queue is full");
	        	   }
	         }
	         public int dequeue()
	         {
	        	    int temp=0;
	        	    if(!this.isEmpty())
	        	    {
	        	       this.front=(this.front+1)%this.n;
	        	       temp=this.table[front];
	        	    }
	        	    else{
	        	    	System.out.println("queue is empty");
	        	    }
	        	    return(temp);
	         }
             
	         public int queuesize()
	         {
	        	    return((this.rear-this.front)%this.n);
	         }
	         public void output()
	         {
	        	    int i=this.front;
	        	    while(i!=(this.rear))
	        	    {
	        	    	 i=(i+1)%this.n;
	        	    	 System.out.println(this.table[i]);
	        	    }
	         }
}

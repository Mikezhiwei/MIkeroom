package Table;

import java.util.Scanner;

public class LoopLink {
             OneLineNode head;
             static int count;
             OneLineNode rear;
             
             public  LoopLink(int n)//Լɪ�������㷨
             {
            	    this.count=+n;
            	    OneLineNode p,rear;
            	    if(n>0)
            	    {  
            	    	int h=new Scanner(System.in).nextInt();
            	        this.head=new OneLineNode(h);
            	        p=this.head;
            	        for(int i=1;i<=n-1;i++){
            	        	int j=new Scanner(System.in).nextInt();
            	        	rear=new OneLineNode(j);
            	        	p.next=rear;
            	        	p=rear;
            	        }
            	        p.next=this.head;
            	    }
             }
             public void  headoutput(OneLineNode p)
             {
            	     p=this.head;
            	     int i=0;
            	     int loop=this.count;
            	     while(p!=null&&i<loop)
            	     {
            	    	   System.out.print(p.data+"->");
            	    	   p=p.next;
            	    	   i++;
            	     }
            	     System.out.println();
             }
             public  void  display(int s,int d)
             {
            	    int j=0;
            	    OneLineNode p=this.head;
            	    while(j<s-1)
            	    {
            	    	j++;
            	    	p=p.next;
            	    }
            	    while(p.next!=p)
            	    {
            	    	  j=1;
            	    	  while(j<d-1){
            	    		  p=p.next;
            	    		  j++;
            	    	  }
            	    	 this.delete(p);//ָ����ָ��ĺ�̵ĸı�
            	    	 p=p.next;//����ָ��ָ���¸���ʼ�����Ľڵ�
            	    	 this.count--;//ѭ��������ĿҪ���٣�ɾ��һ���ڵ㣩
                    }
             }
             
            public  void  delete(OneLineNode p)
            {
                    OneLineNode q=p.next;
                    if(q==this.head)//����ѭ�������ͷ����ɾ���������Ҫ���������head��Ϊhead��next�ڵ�
                    {
                    	this.head=q.next;
                    }
                    p.next=q.next;
            }
}
             
             


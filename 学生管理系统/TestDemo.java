package studennode;

import java.util.Scanner;

public class TestDemo {
	          public  Link stulink=new Link();
	          public  boolean  first=true;
	          static int  choose;
	          public  static void main(String [] agrs)
	          {    
	        	   new TestDemo();
	          }
	          public   void  lookstudentinfo()
	          {      
	        	     Node p=this.stulink.head;
	        	     this.stulink.observe(p);
	          }
	          public  void   firstinput(int n)
	          {
	        	       this.stulink.fisrtaddstudent(n);
	          }
	          public  void  inputstu(int n)
	          {
	        	    this.stulink.addstudent(n);
	          }
	          public void inputgrade()
	          {
	        	     this.stulink.inputgrade();
	          }
	          public void move(String str)
	          {
	        	      this.stulink.remove(str);
	          }
	          public void lookgrade()
	          {
	        	     this.stulink.lookgrade();
	          }
	          public   TestDemo()
	          {
	        	  while(true){
	        	    System.out.println("ѧ������ϵͳ");
	        	    System.out.println("ʹ��˵��");
	        	    System.out.println("���ϸ�����ʾ������");
	        	    System.out.println("1����鿴ѧ������Ϣ" );
	        	    System.out.println("2����鿴ѧ���ĳɼ�");
	        	    System.out.println("3��������ѧ����Ϣ");
	        	    System.out.println("4��������ѧ���ɼ�");
	        	    System.out.println("5����ɾ��ѧ����Ϣ");
	        	    System.out.println("6�����˳�");
	        	    choose=new Scanner(System.in).nextInt();
	        	    switch(choose)
	        	    {
	        	      case 1:
	        	    	   this.lookstudentinfo();
	        	    	   break;
	        	      case 2:
	        	    	  this.lookgrade();
	        	    	  break;
	        	      case 3:
	        	    	   System.out.println("��������Ҫ�����ѧ����Ŀ");
	        	    	   int count=new Scanner(System.in).nextInt();
	        	    	   if(this.first)
	        	    	   {      
	        	    		     this.first=false;
	        	    		     this.firstinput(count);
	        	    	   }
	        	    	   else{
	        	    		      this.inputstu(count);
	        	    	   }  
	        	    	   break;
	        	      case 4:
	        	    	   this.inputgrade();
	        	    	   break;
	        	      case 5:
	        	    	   System.out.println("������ɾ��ѧ��������");
	        	    	   String s=new Scanner(System.in).nextLine();
	        	    	   this.move(s);
	        	    	   break;
	        	      case 6:
	        	    	    System.out.println("ллʹ��");
	        	    	    return ;
	        	     }
	        	  }
	          }

}

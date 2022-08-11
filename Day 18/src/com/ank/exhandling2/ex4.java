package com.ank.exhandling2;
class ex4{  
	  void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   ex4 obj=new ex4();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  

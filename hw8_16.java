package JAVA08;

//hw8_16,  
 class CSphere  
 {  
 private int x; // ��ߪ� x �y�� 
 private int y; // ��ߪ� y �y�� 
 private int z; // ��ߪ� z �y�� 
private int radius; // ��y���b�| 
 
void setLocation(int a,int b,int c) // �]�w��ߪ���m
 {  
 x=a;  
 y=b;  
 z=c;  
 }  
 void setRadius(int r) // �]�w�b�| 
 { 
 radius=r;  
 }  
 double surfaceArea() // �Ǧ^���n 
 {  
 return 4*3.14*radius*radius*radius;  
 }  
 double volume()  
 { 
 
 return ((double)(3.0/4)*3.14*radius*radius*radius);  
  }  
 void showCenter()  
 {  
 System.out.println("x="+x+", y="+y+", z="+z); 
  }  
 }  
  


public class hw8_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

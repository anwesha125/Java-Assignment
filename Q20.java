import java.util.Scanner;
class Student
{
	String name;
	int regdno;
	int age;
	Student()
	{
		name="";
		regdno=0;
		age=0;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setRegdno(int regdno)
	{
		this.regdno=regdno;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	String getName()
	{
		return name;
	}
	int getRegdno()
	{
		return regdno;
	}
	int getAge()
	{
		return age;
	}
	
}
public class Q20 
{
	public static Student[] bubbleSort(Student[] arr) {  
        int n = arr.length;  
        Student temp ;  
         for(int i=0; i < n; i++)
         {  
        	 for(int j=1; j < (n-i); j++)
             {  
        		 if(arr[j-1].getRegdno() > arr[j].getRegdno())
                 {  
        			 temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
                 }  
                          
             }  
         }
         return arr;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student coll[]= new Student[3];
		System.out.println("Enter 3 students details");
		for(int i=0;i<3;i++)
		{
			coll[i]=new Student();
			System.out.println("Enter name");
			coll[i].setName(sc.next());
			System.out.println("Enter Registration no.");
			coll[i].setRegdno(sc.nextInt());
			System.out.println("Enter Age");
			coll[i].setAge(sc.nextInt());
			
		}
		coll=bubbleSort(coll);
		for(int i=0;i<3;i++)
		{
			System.out.println("Name:"+coll[i].getName());
			System.out.println("Regdno:"+coll[i].getRegdno());
			System.out.println("Age:"+coll[i].getAge());
			System.out.println();
		}
		
		

	}

}

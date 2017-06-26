package comapre;

public class Student1 implements Comparable<Student1>{
 int id;
 String name;
  double cgpa;
 
 public Student1(int id,String name, double cgpa)
 {
 this.id=id;
 this.name=name;
 this.cgpa=cgpa;
 }
 public int getid(int id)
 {
 return id;
 }
  
  String getname(String name)
  {
	  return name;
  }
  public double getcgpa(double cgpa)
  {return cgpa;
  }
@Override
public int compareTo(Student1 o) {
	// TODO Auto-generated method stub
	return 0;
}
  }
 


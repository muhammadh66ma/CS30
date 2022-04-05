package University;
public class Faculty extends UEmployee {
	 private String departmentName;			

public Faculty(String name, double salary, String departmentName) {
		super(name, salary); 			
					this.departmentName = departmentName;		}
		      
				public String getDepartment() 
				{ 
				    
					return departmentName;
				    
				}
				       public void setDepartment(String departmentName) { 		     
				    	   this.departmentName = departmentName; 
					       
				       }
				       

				       public String toString()
				        {
				            return(super.getName()+ departmentName+ super.getSalary());
				        }
				          
				           
			
			}

	


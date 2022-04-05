package University;
public class Faculty extends UEmployee {
	 private String divisionName;			

public Faculty(String name, double salary, String divisionName) {
		super(name, salary); 			
					this.divisionName = divisionName;		}
		      
				public String getdivision() 
				{ 
				    
					return divisionName;
				    
				}
				       public void setdivision(String divisionName) { 		     
				    	   this.divisionName = divisionName; 
					       
				       }
				       

				       public String toString()
				        {
				            return(super.getName()+ divisionName+ super.getSalary());
				        }
				          
				           
			
			}

	


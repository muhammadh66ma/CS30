package University;

 public class Staff extends UEmployee 
 { 	private String jobtitle; 
	

    public Staff(String name, double salary, String jobtitle) { 		
    	super(name, salary); 		
		this.jobtitle = jobtitle;	}
			public String getJobtitle() { 				
				return jobtitle; 				}
				
			public void setJobtitle(String jobtitle) { 					
					this.jobtitle=  jobtitle; 
					
				  }
		
			 public String toString()
		        {
		            return(super.getName()+ jobtitle + super.getSalary());
		        }
		          
					
				
			}



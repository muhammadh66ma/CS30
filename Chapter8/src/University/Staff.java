package University;

 public class Staff extends UEmployee 
 { 	private String professionName; 
	

   public Staff(String name, double salary, String professionName) { 		
   super(name, salary); 		
   this.professionName = professionName;	}
	public String professionName() { 
		
	return professionName; 				}
				
		public void setprofessionName(String professionName) { 					
		this.professionName=  professionName; 
					
				  }
		
	 public String toString()
	        {
     return(super.getName()+ professionName + super.getSalary());
		         }
		          
					
				
			}



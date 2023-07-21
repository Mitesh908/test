import java.time.LocalDate;
public class Traveller extends Flight
{
    private String Name;
    private String  email;
    private int mobile; 
    private String flightId;
    LocalDate date;
    
    Traveller() {};
     public Traveller t1 = new Traveller(String Name, String email,int mobile,String flightId) {
     this.Name = Name;
     this.email =email;
     this.mobile = mobile;
     this.flightId = flightId;
     }

     
		public void setName(String Name){
	        this.Name = Name;
	    }
	    
	    public String getName(){
	        return Name;
	    }
	    
	    public void setEmail(String email){
	        this.email=email;
	    }
	    
	    public String getEmail(){
	        return email;
	    }

        public void setMobile(int mobile){
	        this.mobile=mobile;
	    }
	    
	    public String getMobile(){
	        return email;
	    }


        public void setFlightId(int flightId)
        {
            this.flightId=flightId;
        }

        public int getFlightId(){
            return  flightId;
        }

        public LocalDate getDate() {

            return date;
        
        }
        
        public void setDate(LocalDate date) {
        
            this.date = date;
        
        }




}

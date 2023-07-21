public class Flight
{

    private String Id;
    private  String source;
    private String destination;
    private double fare;
    public int totalSeats;

    public String arrivalTime;
    public String departureTime;
    public String CompanyName;

    public Flight() {};

    public Flight(String Id, String source ,String destination,double fare,int totalSeats, String arrivalTime,String departureTime,String companyName)
    {
         this.Id = Id;
         this.source = source;
         this.destination = destination;
         this.fare= fare;
         this.totalSeats = totalSeats;
         this.arrivalTime=arrivalTime;
         this.departureTime=departureTime;
         this.CompanyName=companyName;

    }

    
		public void setId(String Id){
	        this.Id = Id;
	    }
	    
	    public String getId(){
	        return Id;
	    }
        
        
		public void setSource(String source){
	        this.source = source;
	    }
	    
	    public String getSource(){
	        return source;
	    }

        
		public void setDestination(String destination){
	        this.destination = destination;
	    }
	    
	    public String getDestination(){
	        return destination;
	    }

        
		public void setFare(double  fare){
	        this.fare = fare;
	    }
	    
	    public double getFare(){
	        return fare;
	    }

        
		public void setArrivalTime(String arrivalTime){
	        this.arrivalTime = arrivalTime;
	    }
	    
	    public String getArrivalTime(){
	        return arrivalTime;
	    }

        public void setDepartureTime(String departureTime){
	        this.departureTime = departureTime;
	    }
	    
	    public String getDepartureTime(){
	        return departureTime;
	    }

        public void setCompanyName(String companyName){
	        this.companyName = companyName;
	    }
	    
	    public String getCompany(){
	        return arrivalTime;
	    }


}

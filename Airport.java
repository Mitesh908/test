import java.util.ArrayList;

public class Airport extends Flight
{
     public static final ArrayList<Flight> ArrayList = null;
    Address address;
     ArrayList<Flight> flights = new ArrayList<>();
     ArrayList<Traveller> traveller =  new ArrayList<>();

     public Airport() {}

     public Airport(String Id, String source ,String destination,double fare,int totalSeats, String arrivalTime,String departureTime,String companyName,Address address)
     {
        super();
        this.address=adddress;
        this.flight=flight;
        this.traveller=traveller;
     }
    

     
		public void setAddress(String address){
	        this.address = address;
	    }
	    
	    public String getAddress(){
	        return address;
	    }

        public void setTravellers(ArrayList<Traveller>travellers)
        {
            this.travellers= travellers;
        } 

        public ArrayList<Traveller> getTravellers(){
            return traveller;
        }

        public ArrayList<Flight>geFlights()
        {
            return flights;
        }
        public void setFlights(ArrayList<flight>flights){
            this.flights=flights;
        }

      public boolean addFlight(Flight flight){
             flight.add(flight);
             System.out.println("flight added");
             return true;
      }

      public ArrayList<flight> searchFlightBySourceAndDestinantion(String source,String Destination)
      {
        ArrayList<Flight> arr = new ArrayList<Flight>();
        for(int i=0;i<flight.size;i++)
        {
          if(flight.get(i).getsource()).equals(source) && (flight.get(i).getDestination()).equals(destination) 
          {
            arr.add(flight.get(i));;
            System.outprintln("flight available");
            return arr;
          }
          System.out.println("no flight avaibale");
          return arr;
      
          }
      }

      public void bookTicket(String flighId,Traveller traveller) 
      { 
            traveller.add(travller);
            System.out.println("flight booked");


       }

       public void getAllFlights() {
        for(int i =0;i<flights.size();i++){
            System.out.println(flight.get(i));
        }
       }



 }

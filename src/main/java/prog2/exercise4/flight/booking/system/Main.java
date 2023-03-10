package prog2.exercise4.flight.booking.system;
import java.util.*;
import java.time.LocalDate;

public class Main 
{
    public static void main( String[] args )
    {
        FlightBooking fb = new FlightBooking("null",null,null,2,3);
        System.out.println("Choose your trip source:\n1. Nanjing\n2. Beijing\n3. Oulu\n4. Helsinki\n5.Paris\n6.Shanghai");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        fb.setTripSource(c);
        System.out.println("Choose your trip destination:\n1. Nanjing\n2. Beijing\n3. Oulu\n4. Helsinki\n5.Paris\n6.Shanghai");
        String e = sc.nextLine();
        fb.setTripDestination(e, c);
        System.out.println("Choose your trip type:\n1.One Way\n2.Return");
        String b = sc.nextLine();
        fb.setTripType(b);
        System.out.println("Choose class they would like to travel in\n1.First\n2.Business\n3.Economy");
        String a = sc.nextLine();
        fb.setBookingClass(a);
        fb.getTicketNumber();
        String sdepart = sc.nextLine();
        LocalDate departureDate = LocalDate.parse(sdepart);
        String sreturn = sc.nextLine();
        LocalDate returnDate = LocalDate.parse(sreturn);
        fb.setDepartureDate(departureDate);
        fb.setReturnDate(returnDate);
        System.out.println();
        System.out.println("Your name :");
        String name = sc.next();
        fb.setPassengerFullName(name);
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setDepartingTicketPrice(2,3);
        fb.setChildPassengers(2);
        fb.getChildPassengers();
        fb.setAdultPassengers(3);
        fb.getAdultPassengers();
        fb.setReturnTicketPrice();
        fb.getReturnTicketPrice();
        fb.setTotalTicketPrice();
        fb.getTotalTicketPrice();
        System.out.println(
        "Thank you for booking your flight with "+fb.getFlightCompany()+". Following are the details of your booking and the trip: \n"+
        "Ticket Number: " + fb.getTicketNumber()+"\n"+
        "Passenger Name: "+ fb.getPassengerFullName()+"\n"+
        "From "+fb.getTripSource()+" to "+fb.getTripSource()+"\n"+
        "Date of departure: "+fb.getDepartureDate()+"\n"+
        "Date of return: "+fb.getReturnDate()+"\n"+
        "Total passengers: "+fb.getTotalPassengers()+"\n"+
        "Total ticket price in Euros: "+fb.getTotalTicketPrice());
        sc.close();
    }
}


public class OjasJAVA {
	
	public static String Greeting = "Nice to meet u!!";
	public static String NormalMeetup = "Yo whassup";
	public static boolean MeetingfirstTime = true;
	
	public static void main(String[] args) {
		
		MeetingfirstTime = false;
				
		if(MeetingfirstTime == true) {
			
			System.out.println(Greeting);
		}
		if(MeetingfirstTime = false) {
			
			System.out.println(NormalMeetup); 
		}
		 
		MeetingfirstTime = true;
	}
}
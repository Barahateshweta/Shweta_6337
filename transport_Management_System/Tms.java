package transport_Management_System;

import java.util.Scanner;


public class Tms {
	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("---------------------------------------****Transport Management System****---------------------------------------");
    
	  getMenu();
}	
	public static void getMenu() {
		Transport[] transp = new Transport[100];
		int choice;
		System.out.println("Enter the Choices \n1.add tranport details 2.read transport details 3.update transport details 4. delete transport details 0 Exit");
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		System.out.println("1.add transport details");
		System.out.println("2.read transport details"); System.out.println("3.Enter the TransportLocation");
		System.out.println("3.update transport details");
		System.out.println("4.delete transport details");
		switch(choice){
		case 1:
		 addTransport(transp);
		 getMenu();
		 break;
		
		case 2:
		 readTransport(transp);
     	 getMenu();
	     break;
			}
		
}
	public static void addTransport(Transport[] transp) {
		String  TransportNum, TransportLocation;
		int TypeofTransport,seatNum,Transporttiming ;	
		 int i=0;
		int choice1,repeat;
		
		do {
			Scanner sc1= new Scanner(System.in);
		
			System.out.println("\n-----------------------------------------------------------\n");
			System.out.println("1.Enter the types of the transport: \n------------------1.bus \t2.train \t3.Flight--------------- ");
//			    choice1=sc1.nextInt();
			 String name="";
			      TypeofTransport=sc1.nextInt();
				if(TypeofTransport==1) {
				    name="Bus";
					System.out.println("bus");
				}
				else if(TypeofTransport==2) {
					name="Train";
					System.out.println("Train");
				}
				else if(TypeofTransport==3) {
					name="Flight";
					System.out.println("Flight");	
				}
				else {
					System.out.println("Please Enter the valid number");
				}
			 System.out.println("\n");
			 System.out.println("2.Enter the "+name+" Number:-");
			 TransportNum=sc1.next();
			 
			 System.out.println("\n");
			 System.out.println("3.Enter the TransportLocation"); 
			 System.out.println("1.bus    \t\t2.Train          \t\t3.Flight");
			 System.out.println("1.Mumbai to Pune\t1.Kashmir to Delhi\t\t1.India to Australia\n2.Auragabad to Pune\t2.Delhi to Manali\t\t2.India to Europe"
			 		+ "\n3.Nagpurto Amravati\t3.Goa to Rajasthan\t\t3.Africa to India \n4.Nagpur to Latur\t4.Hyderabad toBanglore\t\t4.4.Dubai to Delhi"
			 		+ "\n5.Nagpur to Hyderbad\t5.Karanataka to AndhraPradesh\t5.Lucknow to Delhi");
			 System.out.println((TransportLocation=sc1.next())+ "Enter the location   From-        To          ");

			 System.out.println("\n");
			 System.out.println("4.Enter the"+name+ " seatNumber");
			 seatNum=sc1.nextInt();
			 
			 System.out.println("5.Enter the "+name+" timing");
			 Transporttiming=sc1.nextInt();
			
			transp[i]=new Transport(TypeofTransport,TransportNum,TransportLocation, seatNum, Transporttiming); 
			++i;
			System.out.println("To add more records to print 1");
			repeat=sc1.nextInt();
		}while(repeat==1);
		
		
	}
	 public  static void readTransport(Transport[] transp) {
		 for(int x=0;x<transp.length;x++) {
			 System.out.println("1."+transp[x].getTypeofTransport());
			 System.out.println("2."+transp[x].getTransportNum());
			 System.out.println("5."+transp[x].getTransportLocation());
			 System.out.println("3."+transp[x].getseatNum());
			 System.out.println("4."+transp[x].getTransporttiming());
			 
		 }
	 }

}

 class Transport{
	private String TransportNum,TransportLocation;
	private int seatNum,Transporttiming,TypeofTransport;
	public Transport(int TypeofTransport,String TransportNum, String TransportLocation, int seatNum, int Transporttiming) {
		this.TypeofTransport=TypeofTransport;
		this.TransportNum=TransportNum;
		this.TransportLocation=TransportLocation;
		this.seatNum=seatNum;
		this.Transporttiming=Transporttiming;
	}
	
	public int getTypeofTransport() {
		 return TypeofTransport;
	}
	public void setTypeofTransport() {
		this.TypeofTransport=TypeofTransport;
	}
	
	public String getTransportNum() {
		return TransportNum;
	
	}
	public void setTranportNum() {
		this.TransportNum=TransportNum;
	}
	 public String  getTransportLocation() {
    	 return TransportLocation;
     }
     public void  setTransportLocation() {
    	 this.TransportLocation=TransportLocation;
     }
	public int getseatNum() {
		return seatNum;
	}
	public void setseatNum() {
		this.seatNum=seatNum;
	}
	public int getTransporttiming() {
		return Transporttiming;
	}
     public void  setTransporttiming() {
		this.Transporttiming=Transporttiming;
	}
     
    
 }
 




























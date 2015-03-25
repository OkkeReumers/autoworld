package be.vdab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import be.vdab.schoolgerief.Boekentas;
import be.vdab.util.Laadbaar;
import be.vdab.util.Maat;
import be.vdab.util.Volume;
import be.vdab.util.VolumeException;
import be.vdab.voertuigen.Personenwagen;
import be.vdab.voertuigen.Pickup;
import be.vdab.voertuigen.Voertuig;
import be.vdab.voertuigen.Vrachtwagen;

public class Programma {

	public static void main(String[] args) throws VolumeException {

		Personenwagen personenwagen1 = new Personenwagen ("CITROEN", 150, 4);
		Personenwagen personenwagen2 = new Personenwagen ("AUDI", 300, 6);
		Pickup pickup1 = new Pickup ("NISSAN", 500, 3, new Volume(10,10,10,Maat.DECIMETER));
		Pickup pickup2 = new Pickup ("MERCEDES", 600, 2, new Volume(200,200,200,Maat.CENTIMETER));
		Vrachtwagen vrachtwagen1 = new Vrachtwagen ("OPEL", 200, new Volume(4,4,4,Maat.METER), 1000, 3);
		Vrachtwagen vrachtwagen2 = new Vrachtwagen ("CITROEN", 1000, new Volume(50,50,50,Maat.DECIMETER), 500, 2);
	
		System.out.println("----------> OVERZICHT <----------- \n");
		System.out.println(personenwagen1);
		System.out.println(personenwagen2);
		System.out.println(pickup1);
		System.out.println(pickup2);
		System.out.println(vrachtwagen1);
		System.out.println(vrachtwagen2);
		
		System.out.println("\n----------> SORTEREN OP NUMMERPLAAT <----------- \n"); // automatisch
		SortedSet<Voertuig> lijst = new TreeSet<Voertuig>();
		lijst.add(personenwagen1);
		lijst.add(personenwagen2);
		lijst.add(pickup1);
		lijst.add(pickup2);
		lijst.add(vrachtwagen1);
		lijst.add(vrachtwagen2);
		
		for (Voertuig obj : lijst) {
			System.out.println(obj);
		}
		
		System.out.println("\n----------> SORTEREN OP PRIJS <----------- \n");
		SortedSet<Voertuig> lijst2 = new TreeSet<Voertuig>(Collections.reverseOrder(Voertuig.getAankoopprijsComparator()));
		lijst2.addAll(lijst); 
		
		for (Object obj : lijst2) {
			Voertuig eenVoertuig = (Voertuig) obj;
			System.out.println(eenVoertuig);
		}
		
		System.out.println("\n----------> SORTEREN OP MERK <----------- \n");
		SortedSet<Voertuig> lijst3 = new TreeSet<Voertuig>(Voertuig.getMerkComparator());
		lijst3.addAll(lijst);
		
		for (Object obj : lijst3) {
			Voertuig eenVoertuig = (Voertuig) obj;
			System.out.println(eenVoertuig);
		}
		
		try  {
			FileOutputStream fs = new FileOutputStream("wagenpark.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(lijst);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	// schrijf items van lijst (eerste) weg in wagenpark.ser

		SortedSet<?> lijst4 = new TreeSet<Voertuig>();
		try{
			FileInputStream fi = new FileInputStream("wagenpark.ser");
			ObjectInputStream os = new ObjectInputStream(fi);
			
			System.out.println("\n----------> INLEZEN VAN WAGENPARK.SER <-----------\n");
			
			lijst4 = (SortedSet<?>)os.readObject();
			
			for (Object obj : lijst4) {
				if (!( obj instanceof Voertuig)) {
					lijst4.remove(obj);
				}	
				else 
				System.out.println(obj);
			}

			os.close();
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// maak een nieuwe lijst (lijst4) hierin zetten we de objecten die we uit de lijst halen
		// de lijst is ook een object dus we kunnen deze gewoon als object inlezen met readObject
		
System.out.println("\n----------> GEGEVENS VAN OBJECTEN DIE LAADBAAR ZIJN <---------- \n");
		
		Boekentas kipling = new Boekentas( new Volume(20,30,20,Maat.CENTIMETER),"geel");  
		Boekentas eastpak = new Boekentas( new Volume(20,30,20,Maat.CENTIMETER),"rood");
		

		ArrayList<Laadbaar> al = new ArrayList<Laadbaar>();
		al.add(pickup1);
		al.add(pickup2);
		al.add(vrachtwagen1);
		al.add(vrachtwagen2);
		al.add(kipling);
		al.add(eastpak);
		
		for (Object obj : al) {
			Laadbaar eenDing = (Laadbaar) obj;
			System.out.println(eenDing);
		}
		
		
	}

}

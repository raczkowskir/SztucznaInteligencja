
public class Krzyzowka {

	// tablica na wylosowane chromosomy - experyment
	public int[] chrExperyment = new int[6];
	// wspo³czynniki krzyzowania dla kazdej pary
	public int wsp1, wsp2, wsp3 = 0;
	// tablica na wylosowane chromosomy - experyment - po sprawdzeniu do jakich przedzialow naleza
	public String[] chrExpWlasciwe = new String[6];
	//tablica na chromosomy po krzyzowce
	public String[] chrPoKrzyzowce = new String[6];

	// metoda ustawiajaca wspo³czynniki krzyzowania dla kazdeja par
	public void UstawWspolcz() {
		zadanie1 obiektZadanie = zadanie1.zwrocObiekt();
		wsp1 = obiektZadanie.losWspolcz();
		wsp2 = obiektZadanie.losWspolcz();
		wsp3 = obiektZadanie.losWspolcz();
		System.out.println("\nWspó³czynniki krzy¿owania: para I: " + wsp1 + " para II: " + wsp2 + " para III: " + wsp3);
	}
	//metoda sprawdzajaca do jakich chromosomow (przedzia³ow) nale¿a wylosowane wartoœci
	public void SprawdzChr(int[] chrExperyment, String[] chrExpWlasciwe,int[] chrWartosci, String[] chrBinarnie  ){
	
		zadanie1 obiektZadanie = zadanie1.zwrocObiekt();
		int i=0;
		for (int x : chrExperyment){
			
			if (x <= obiektZadanie.chrPrzedzialy[0]){
				chrExpWlasciwe[i] = obiektZadanie.chrBinarnie[0];
				i++;
			}
			else if
				(x <= obiektZadanie.chrPrzedzialy[1] && x > obiektZadanie.chrPrzedzialy[0]){
				chrExpWlasciwe[i] = obiektZadanie.chrBinarnie[1];
				i++;
			}
			else if
			(x <= obiektZadanie.chrPrzedzialy[2] && x > obiektZadanie.chrPrzedzialy[1]){
			chrExpWlasciwe[i] = obiektZadanie.chrBinarnie[2];
			i++;
		}
			else if
			(x <= obiektZadanie.chrPrzedzialy[3] && x > obiektZadanie.chrPrzedzialy[2]){
			chrExpWlasciwe[i] = obiektZadanie.chrBinarnie[3];
			i++;
		}
			else if
			(x <= obiektZadanie.chrPrzedzialy[4] && x > obiektZadanie.chrPrzedzialy[3]){
			chrExpWlasciwe[i] = obiektZadanie.chrBinarnie[4];
			i++;
		}
			else if
			(x <= obiektZadanie.chrPrzedzialy[5] && x > obiektZadanie.chrPrzedzialy[4]){
			chrExpWlasciwe[i] = obiektZadanie.chrBinarnie[5];
			i++;
		}
		}
		System.out.print("\nTrzy pary chromosomow do krzyzowania: ");
		for (int j = 0; j<6; j++){
			System.out.print(" "+ chrExpWlasciwe[j]);
		}
	}
		//metoda krzyzujaca pare chrmosomow		
		public void krzyzuj(String[] chrExpWlasciwe, String[] chrPoKrzyzowce, int wsp1, int wsp2, int wsp3){
			String chr1A =chrExpWlasciwe[0].substring(0, wsp1);
			String chr1B =chrExpWlasciwe[0].substring( wsp1, 5);
//			System.out.println(chr1A + " "+chr1B);
			
			String chr2A =chrExpWlasciwe[1].substring(0, wsp1);
			String chr2B =chrExpWlasciwe[1].substring( wsp1, 5);
			
			String chr3A =chrExpWlasciwe[2].substring(0, wsp2);
			String chr3B =chrExpWlasciwe[2].substring( wsp2, 5);
			
			String chr4A =chrExpWlasciwe[3].substring(0, wsp2);
			String chr4B =chrExpWlasciwe[3].substring( wsp2, 5);
			
			String chr5A =chrExpWlasciwe[4].substring(0, wsp3);
			String chr5B =chrExpWlasciwe[4].substring( wsp3, 5);
			
			String chr6A =chrExpWlasciwe[5].substring(0, wsp3);
			String chr6B =chrExpWlasciwe[5].substring( wsp3, 5);
			
			chrPoKrzyzowce[0] = chr1A +chr2B;
			chrPoKrzyzowce[1] = chr2A +chr1B;
			chrPoKrzyzowce[2] = chr3A +chr4B;
			chrPoKrzyzowce[3] = chr4A +chr3B;
			chrPoKrzyzowce[4] = chr5A +chr6B;
			chrPoKrzyzowce[5] = chr6A +chr5B;
			
			System.out.print("\nChromosomy po krzyzowce: ");
			for(int k=0; k<6; k++){
				System.out.print(chrPoKrzyzowce[k]+" ");
			}
		}
	
	public static void main(String[] args) {
		
		Ustawiacz ustawiacz1 = new Ustawiacz();
		ustawiacz1.ustaw();
		
		Krzyzowka k1 = new Krzyzowka();
		
		zadanie1 obiektZadanie = zadanie1.zwrocObiekt();
		
		int maxPrzedzial = obiektZadanie.chrPrzedzialy[5] +1;
		obiektZadanie.losuj(maxPrzedzial, k1.chrExperyment);

		System.out.print("\nOto 6 wylosowanych  wartosci do ustalenia chromosomow dla P1: ");
		for (int x : k1.chrExperyment)
			System.out.print(" " + x);

		
		k1.SprawdzChr(k1.chrExperyment, k1.chrExpWlasciwe, obiektZadanie.chrWartosci, obiektZadanie.chrBinarnie);
		k1.UstawWspolcz();
		k1.krzyzuj(k1.chrExpWlasciwe, k1.chrPoKrzyzowce, k1.wsp1, k1.wsp2, k1.wsp3);
	}
	
}

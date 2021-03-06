//klasa ustawiajaca zmienne potrzebne do krzyzowania
public class Ustawiacz {
	public zadanie1 obiektZadanie;

	public void ustaw(int [] PoprzedniePokolenie) {
		// stworzenie nowego obiektu do wywolywania potrzebnych metod
		zadanie1 obiektZadanie = zadanie1.zwrocObiekt();
		//wyswietlenie prawdopodobienstwa krzyzowania i mutacji
		obiektZadanie.wyswietlPrawdopod();
		
		// pierwsze losowanie chromosomow
		obiektZadanie.losuj(32, obiektZadanie.chromosomy);
		// petla pokazujaca wylosowane chromosomy
		System.out.print("Oto 6 wylosowanych chromosomow dla rodzicow: ");
		for (int x : obiektZadanie.chromosomy)
			System.out.print(" " + x);
		// zamienienie wartosci dziesietnej na binarna dla wszystkich 6
		// wylosowanych chromosomow
		int j = 0;
		for (int x : obiektZadanie.chromosomy) {

			obiektZadanie.chrBinarnie[j] = obiektZadanie.zamienNaBinarny(x);
			j++;
		}

		System.out.print("\nWartosci biarne chromosomow:  ");
		for (int i = 0; i < 6; i++)
			System.out.print(" " + obiektZadanie.chrBinarnie[i]);
		// obliczenie wartosci chromosomow z funkcji
		System.out.print("\nWartosci chromosomow z obliczone z funkcji f(x)=3x+2: ");
		int k = 0;
//		for (int x : obiektZadanie.chromosomy) {
		for (int x : PoprzedniePokolenie) {

			obiektZadanie.chrWartosci[k] = obiektZadanie.obliczWartosc(x);
			k++;
		}
		for (int i = 0; i < 6; i++)
			System.out.print(" " + obiektZadanie.chrWartosci[i]);
		// obliczenie przedzialow (do identyfikacji chromosomow)

		int przedzial = 0;
		int l = 0;
		System.out.print("\nPrzedzialy do identyfikacji chromosomow: ");
		for (int x : obiektZadanie.chrWartosci) {
			przedzial = przedzial + x;
			obiektZadanie.chrPrzedzialy[l] = przedzial;
			l++;
		}
		for (int i = 0; i < 6; i++)
			System.out.print(" " + obiektZadanie.chrPrzedzialy[i]);
	}

	public static void main(String[] args) {

	}

}


public class tes {

	public void mutuje() {
		// UstawPrawdMutacji();
		int locus = 0;
		String czesc1 = "0";
		String czesc2 = "0";
		String czesc3 = "0";
		// zadanie1 obiektZadanie = zadanie1.zwrocObiekt();
		int a = 1;
		int b = 2;
		if (a < b) {
			locus = 4;
			/*
			 * czesc1 = "01234".substring(0, locus); if (locus==0){czesc1="";}
			 * czesc2 = "01234".substring(locus,locus+1); czesc3 =
			 * "01234".substring(locus+1); if (locus==4){czesc3="";} else if
			 * (locus==0){czesc1="";czesc3=czesc3.substring(1);}
			 * System.out.println("stara czesc2 "+czesc2); if
			 * (Integer.valueOf(czesc2)==0) { czesc2 = "1"; } else
			 * if(Integer.valueOf(czesc2)==1){ czesc2 = "0"; }
			 * 
			 * String wynik = czesc1 + czesc2 + czesc3; System.out.println(
			 * "cz1  "+czesc1+"\ncz2  "+czesc2+"\ncz3  "+czesc3+ "\nWynik :" +
			 * wynik);
			 */
			switch (locus) {
			case 0:
				czesc1 = "01010".substring(0, locus);
				czesc2 = "01010".substring(locus, locus + 1);
				czesc3 = "01010".substring(locus + 1);
				break;
			case 1:
				czesc1 = "01010".substring(0, locus);
				czesc2 = "01010".substring(locus, locus + 1);
				czesc3 = "01010".substring(locus + 1);
				break;

			case 2:
				czesc1 = "01010".substring(0, locus);
				czesc2 = "01010".substring(locus, locus + 1);
				czesc3 = "01010".substring(locus + 1);
				break;

			case 3:
				czesc1 = "01010".substring(0, locus);
				czesc2 = "01010".substring(locus, locus + 1);
				czesc3 = "01010".substring(locus + 1);
				break;

			case 4:
				czesc1 = "01010".substring(0, locus);
				czesc2 = "01010".substring(locus, locus + 1);
				czesc3 = "01010".substring(locus + 1);
				break;
			default:
			}
			
			if (Integer.valueOf(czesc2) == 0) {
				czesc2 = "1";
			} else if (Integer.valueOf(czesc2) == 1) {
				czesc2 = "0";
			}

			String wynik = czesc1 + czesc2 + czesc3;
			System.out.println("cz1  " + czesc1 + "\ncz2  " + czesc2 + "\ncz3  " + czesc3 + "\nWynik :" + wynik);

		}

	}

	public static void main(String Args[]) {
		tes test = new tes();
		test.mutuje();
	}
}
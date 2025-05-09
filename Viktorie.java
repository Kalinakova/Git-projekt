class Viktorie {
    public static void main (String arg []) {
	float a;
	int b = 70, c = 100;
	a = vypocetHodnoceni (b,c);
	System.out.println ("Hodnoceni testu je: "+a);
    }
    static float vypocetHodnoceni (int spravneOdpovedi, int pocetOtazekTestu)
    {
	return (spravneOdpovedi / pocetOtazekTestu) * 100;
    }
}

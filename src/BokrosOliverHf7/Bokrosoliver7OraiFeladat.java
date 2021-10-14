package BokrosOliverHf7;

public class Bokrosoliver7OraiFeladat
{

    public static void main(String[] args)
    {
        String[][]tipp={{"a1","d"},{"a2","v"},{"a3","d"}};
        lekerdez(tipp,300);
    }

    public static void lekerdez(String[][] bemenet, int tet)
    {
        String[][] eredmenyek = {{"a1","FCB-Real","d"},{"a2","Bayern-Atletico","v"},{"a3","Liverpool-Manchaster","d"},
                {"a4", "Real-Atletico","v"},{"a5","Manchaster-Liverpool","h"},{"a6","FCB-Bayern","h"},{"a7","FCB-Manchaster","h"},
                {"a8","Real-Bayern","d"},{"a9","Real-Dortmund","d"},{"a10","Dortmund","h"}};
        boolean nyert=true;
        double[]odds = {1.5,3.2,2.2,2.1,1.8,1.6,2.1,3.5,1.9,2.9};
        double osszOdds=1;
        for(int i=0; i<bemenet.length && nyert;i++)
        {
            boolean van=false;
            int sorszam=0;

            for(int j=0; j<eredmenyek.length && !van;j++)
            {
                if(eredmenyek[j][0].equals(bemenet[i][0]))
                {
                    van=true;
                    sorszam=j;
                }


            }

            if(!van)
            {
                System.out.println(i+". tipp: Nincs ilyen meccs");
                nyert=false;
            }
            else
            {
                if(!bemenet[i][1].equals(eredmenyek[sorszam][2]))
                {
                    nyert=false;
                }
                else
                {
                    osszOdds*=odds[sorszam];
                }
            }
        }

        if(nyert)
        {
            System.out.println("A szelvény nyert! A nyeremény: "+tet*osszOdds);
        }
        else
        {
            System.out.println("a szelvény nem nyert");
        }

        //Komment hozzáadva
		//Újabbb komment a diff parancs demonstrálására

    }
}

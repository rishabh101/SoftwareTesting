package conversion;

// given a source number , source base, destination base, this code can give you the destination
// number.
// sn ,sb,db ---> ()dn  .   this is what we have to do    .



public class anytoany {

    public int anyToAny(int sn, int sb, int db) {

        int m = 1, dec = 0, dn = 0;
        while (sn != 0) {
            dec = dec + (sn % 10) * m;
            m *= sb;
            sn /= 10;
        }
        m = 1;
        while (dec != 0) {
            dn = dn + (dec % db) * m;
            m *= 10;
            dec /= db;
        }
        System.out.println("Result: "+dn);
        return dn;
    }
}
package conversion;

class OctaltoDecimal
{
public String DecimalToOctal(int num ) {
        String str = "01234567";
        StringBuilder sbuilder = new StringBuilder(num);
        while(num>=8)
        {
            int reminder = num%8;
            sbuilder.append(str.charAt(reminder));
            num=num/8;
        }
        sbuilder.append(str.charAt(num));
        sbuilder.reverse();
        return sbuilder.toString();
    }
}
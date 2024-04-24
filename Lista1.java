import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class  lista{

    public static class Country {
        String name;
        int wineServings;

        public Country(String name, int wineServings) {
            this.name = name;
            this.wineServings = wineServings;
        }

        @Override
        public String toString() {
            return name + ": " + wineServings;
        }
    }

    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Afghanistan", 0));
        countries.add(new Country("Albania", 54));
        countries.add(new Country("Algeria", 14));
        countries.add(new Country("Andorra", 312));
        countries.add(new Country("Angola", 45));
        countries.add(new Country("Antigua & Barbuda", 45));
        countries.add(new Country("Argentina", 221));
        countries.add(new Country("Armenia", 11));
        countries.add(new Country("Australia", 212));
        countries.add(new Country("Austria", 191));
        countries.add(new Country("Azerbaijan", 5));
        countries.add(new Country("Bahamas", 51));
        countries.add(new Country("Bahrain", 7));
        countries.add(new Country("Bangladesh", 0));
        countries.add(new Country("Barbados", 36));
        countries.add(new Country("Belarus", 42));
        countries.add(new Country("Belgium", 212));
        countries.add(new Country("Belize", 8));
        countries.add(new Country("Benin", 13));
        countries.add(new Country("Bhutan", 0));
        countries.add(new Country("Bolivia", 8));
        countries.add(new Country("Bosnia-Herzegovina", 8));
        countries.add(new Country("Botswana", 35));
        countries.add(new Country("Brazil", 35));
        countries.add(new Country("Brunei", 1));
        countries.add(new Country("Bulgaria", 94));
        countries.add(new Country("Burkina Faso", 7));
        countries.add(new Country("Burundi", 0));
        countries.add(new Country("Cote d'Ivoire", 9));
        countries.add(new Country("Cabo Verde", 16));
        countries.add(new Country("Cambodia", 4));
        countries.add(new Country("Cameroon", 4));
        countries.add(new Country("Canada", 100));
        countries.add(new Country("Central African Republic", 1));
        countries.add(new Country("Chad", 1));
        countries.add(new Country("Chile", 172));
        countries.add(new Country("China", 8));
        countries.add(new Country("Colombia", 3));
        countries.add(new Country("Comoros", 1));
        countries.add(new Country("Congo", 9));
        countries.add(new Country("Cook Islands", 254));
        countries.add(new Country("Costa Rica", 11));
        countries.add(new Country("Croatia", 113));
        countries.add(new Country("Cuba", 5));
        countries.add(new Country("Cyprus", 113));
        countries.add(new Country("Czech Republic", 134));
        countries.add(new Country("North Korea", 0));
        countries.add(new Country("DR Congo", 1));
        countries.add(new Country("Denmark", 278));
        countries.add(new Country("Djibouti", 4));
        countries.add(new Country("Dominica", 26));
        countries.add(new Country("Dominican Republic", 9));
        countries.add(new Country("Ecuador", 3));
        countries.add(new Country("Egypt", 1));
        countries.add(new Country("El Salvador", 2));
        countries.add(new Country("Equatorial Guinea", 233));
        countries.add(new Country("Eritrea", 0));
        countries.add(new Country("Estonia", 59));
        countries.add(new Country("Ethiopia", 00));
        countries.add(new Country("Fiji", 1));
        countries.add(new Country("Finland", 97));
        countries.add(new Country("France", 370));
        countries.add(new Country("Gabon", 59));
        countries.add(new Country("Gambia", 1));
        countries.add(new Country("Georgia", 21));
        countries.add(new Country("Germany", 175));
        countries.add(new Country("Ghana", 10));
        countries.add(new Country("Greece", 218));
        countries.add(new Country("Grenada", 28));
        countries.add(new Country("Guatemala", 2));
        countries.add(new Country("Guinea", 2));
        countries.add(new Country("Guinea-Bissau", 21));
        countries.add(new Country("Guyana", 1));
        countries.add(new Country("Haiti", 1));
        countries.add(new Country("Honduras", 2));
        countries.add(new Country("Hungary", 185));
        countries.add(new Country("Iceland", 78));
        countries.add(new Country("India", 0));
        countries.add(new Country("Indonesia", 0));
        countries.add(new Country("Iran", 0));
        countries.add(new Country("Iraq", 0));
        countries.add(new Country("Ireland", 165));
        countries.add(new Country("Israel", 9));
        countries.add(new Country("Italy", 237));
        countries.add(new Country("Jamaica", 9));
        countries.add(new Country("Japan", 16));
        countries.add(new Country("Jordan", 1));
        countries.add(new Country("Kazakhstan", 12));
        countries.add(new Country("Kenya", 2));
        countries.add(new Country("Kiribati", 1));
        countries.add(new Country("Kuwait", 0));
        countries.add(new Country("Kyrgyzstan", 6));
        countries.add(new Country("Laos", 123));
        countries.add(new Country("Latvia", 62));
        countries.add(new Country("Lebanon", 31));
        countries.add(new Country("Lesotho", 0));
        countries.add(new Country("Liberia", 2));
        countries.add(new Country("Libya", 0));
        countries.add(new Country("Lithuania", 56));
        countries.add(new Country("Luxembourg", 271));
        countries.add(new Country("Madagascar", 4));
        countries.add(new Country("Malawi", 1));
        countries.add(new Country("Malaysia", 0));
        countries.add(new Country("Maldives", 0));
        countries.add(new Country("Mali", 1));
        countries.add(new Country("Malta", 120));
        countries.add(new Country("Marshall Islands", 0));
        countries.add(new Country("Mauritania", 0));
        countries.add(new Country("Mauritius", 18));
        countries.add(new Country("Mexico", 5));
        countries.add(new Country("Micronesia", 18));
        countries.add(new Country("Monaco", 0));
        countries.add(new Country

("Mongolia", 8));
        countries.add(new Country("Montenegro", 128));
        countries.add(new Country("Morocco", 10));
        countries.add(new Country("Mozambique", 5));
        countries.add(new Country("Myanmar", 0));
        countries.add(new Country("Namibia", 1));
        countries.add(new Country("Nauru", 8));
        countries.add(new Country("Nepal", 0));
        countries.add(new Country("Netherlands", 190));
        countries.add(new Country("New Zealand", 175));
        countries.add(new Country("Nicaragua", 1));
        countries.add(new Country("Niger", 1));
        countries.add(new Country("Nigeria", 2));
        countries.add(new Country("Niue", 7));
        countries.add(new Country("Norway", 129));
        countries.add(new Country("Oman", 1));
        countries.add(new Country("Pakistan", 0));
        countries.add(new Country("Palau", 23));
        countries.add(new Country("Panama", 18));
        countries.add(new Country("Papua New Guinea", 1));
        countries.add(new Country("Paraguay", 74));
        countries.add(new Country("Peru", 21));
        countries.add(new Country("Philippines", 1));
        countries.add(new Country("Poland", 56));
        countries.add(new Country("Portugal", 339));
        countries.add(new Country("Qatar", 7));
        countries.add(new Country("South Korea", 9));
        countries.add(new Country("Moldova", 18));
        countries.add(new Country("Romania", 167));
        countries.add(new Country("Russian Federation", 73));
        countries.add(new Country("Rwanda", 0));
        countries.add(new Country("St. Kitts & Nevis", 32));
        countries.add(new Country("St. Lucia", 71));
        countries.add(new Country("St. Vincent & the Grenadines", 11));
        countries.add(new Country("Samoa", 24));
        countries.add(new Country("San Marino", 0));
        countries.add(new Country("Sao Tome & Principe", 140));
        countries.add(new Country("Saudi Arabia", 0));
        countries.add(new Country("Senegal", 7));
        countries.add(new Country("Serbia", 127));
        countries.add(new Country("Seychelles", 51));
        countries.add(new Country("Sierra Leone", 2));
        countries.add(new Country("Singapore", 11));
        countries.add(new Country("Slovakia", 116));
        countries.add(new Country("Slovenia", 276));
        countries.add(new Country("Solomon Islands", 1));
        countries.add(new Country("Somalia", 0));
        countries.add(new Country("South Africa", 81));
        countries.add(new Country("Spain", 112));
        countries.add(new Country("Sri Lanka", 0));
        countries.add(new Country("Sudan", 0));
        countries.add(new Country("Suriname", 7));
        countries.add(new Country("Swaziland", 2));
        countries.add(new Country("Sweden", 186));
        countries.add(new Country("Switzerland", 280));
        countries.add(new Country("Syria", 16));
        countries.add(new Country("Tajikistan", 0));
        countries.add(new Country("Thailand", 1));
        countries.add(new Country("Macedonia", 86));
        countries.add(new Country("Timor-Leste", 4));
        countries.add(new Country("Togo", 19));
        countries.add(new Country("Tonga", 5));
        countries.add(new Country("Trinidad & Tobago", 7));
        countries.add(new Country("Tunisia", 20));
        countries.add(new Country("Turkey", 7));
        countries.add(new Country("Turkmenistan", 32));
        countries.add(new Country("Tuvalu", 9));
        countries.add(new Country("Uganda", 0));
        countries.add(new Country("Ukraine", 45));
        countries.add(new Country("United Arab Emirates", 5));
        countries.add(new Country("United Kingdom", 195));
        countries.add(new Country("Tanzania", 1));
        countries.add(new Country("USA", 84));
        countries.add(new Country("Uruguay", 220));
        countries.add(new Country("Uzbekistan", 8));
        countries.add(new Country("Vanuatu", 11));
        countries.add(new Country("Venezuela", 3));
        countries.add(new Country("Vietnam", 1));
        countries.add(new Country("Yemen", 0));
        countries.add(new Country("Zambia", 4));
        countries.add(new Country("Zimbabwe", 4));

        // Ordenar os países pelo consumo de vinho (do menor para o maior)
        countries.sort(Comparator.comparingInt(c -> c.wineServings));

        // Imprimir os países ordenados pelo consumo de vinho
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}


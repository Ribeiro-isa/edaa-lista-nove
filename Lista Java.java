import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Country {
    String name;
    int beerServings;
    int spiritServings;
    int wineServings;
    double totalLitresOfPureAlcohol;

    public Country(String name, int beerServings, int spiritServings, int wineServings, double totalLitresOfPureAlcohol) {
        this.name = name;
        this.beerServings = beerServings;
        this.spiritServings = spiritServings;
        this.wineServings = wineServings;
        this.totalLitresOfPureAlcohol = totalLitresOfPureAlcohol;
    }

    public int getWineServings() {
        return wineServings;
    }

    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();

        // Ler o arquivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader("drinks.csv"))) {
            String line;
            br.readLine(); // Pular o cabeçalho
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                int beerServings = Integer.parseInt(data[1].trim());
                int spiritServings = Integer.parseInt(data[2].trim());
                int wineServings = Integer.parseInt(data[3].trim());
                double totalLitresOfPureAlcohol = Double.parseDouble(data[4].trim());

                countries.add(new Country(name, beerServings, spiritServings, wineServings, totalLitresOfPureAlcohol));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Ordenar os países pelo consumo de vinho
        Collections.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                return Integer.compare(c2.getWineServings(), c1.getWineServings()); // Ordem decrescente
            }
        });

        // Imprimir os países ordenados
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}

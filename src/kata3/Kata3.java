package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histo = new Histogram();
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ull.com");
        
        new HistogramDisplay(histo).execute();
    }
    
}

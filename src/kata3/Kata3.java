package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histo = new Histogram();
        
        histo.increment("gmail.com", 5);
        histo.increment("hotmail.com", 10);
        histo.increment("ulpgc.es", 7);
        histo.increment("ull.es", 8);
        
        new HistogramDisplay(histo).execute();
    }
    
}


package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Juan Ramírez
 */
public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("Histograma de emails");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute() {
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
            "Histograma JFreeChart",
            "Dominios emails",
            "num emails",
            dataSet,
            PlotOrientation.VERTICAL,
            false,
            rootPaneCheckingEnabled,
            rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", "ulpgc.es");
        dataSet.addValue(11, "", "hotmail.es");
        dataSet.addValue(12, "", "ull.es");
        dataSet.addValue(14, "", "gmail.es");
        return dataSet;
    }
    
}

/**
  * Clase que nos grafica una regresión lineal a partir de un archivo de tipo .csv
  * @author Gómez de la Torre Heidi Lizbeth
  * @version 10/Nov/2019
  */
  
package practica14;

import java.io.IOException;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.colors.XChartSeriesColors;
import org.knowm.xchart.SwingWrapper;

public class Graficacion {

    public static void main(String[] args) {

	    XYChart chart = new XYChartBuilder()
                            .title("Regresión lineal")
                            .width(800)
                            .height(600)
                            .xAxisTitle("X")
                            .yAxisTitle("Y")
                            .theme(ChartTheme.Matlab)
                            .build();
        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.GREY));
        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
        chart.getStyler().setPlotGridLinesVisible(false);
        chart.getStyler().setMarkerSize(6);


		try{
            int i = LectorCSV.leer("src/main/resources/317266245.csv").size();
            int j = 0;
            double[] xData = new double[i];
            double[] yData = new double[i];

            for (String[] coor : LectorCSV.leer("src/main/resources/317266245.csv")) {
                xData[j] = Double.parseDouble(coor[0]);
                yData[j] = Double.parseDouble(coor[1]);
                j++;
            }

            double m = pendiente(xData,yData);
	        double b = interseccion(xData,yData);

	        XYSeries sampleSeries = chart.addSeries("Observaciones", xData, yData);
	        sampleSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
	        sampleSeries.setMarkerColor(XChartSeriesColors.RED);
	        XYSeries lineSeries = chart.addSeries(
	            "Línea", new double[]{xData[0],xData[xData.length - 1]}, 
                                      new double[]{m*xData[0] + b, m*xData[xData.length - 1] + b});
	        lineSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Line);
	        lineSeries.setLineColor(XChartSeriesColors.BLUE);
	        lineSeries.setLineWidth(3);

	        new SwingWrapper<XYChart>(chart).displayChart();

		}
		catch (IOException e) {
			System.out.println("No se encontró el archivo de tipo .csv");
		}
    
    }

    /**
	* Calcula la pendiente de la recta de la forma y = mx + b
	* @param x arreglo que contiene todas las x del modelo
	* @param y arreglo que contiene todas las y del modelo
	* @return regresa la pendiente
	*/
    public static double pendiente (double [] x, double [] y ) {
		double multiXY = 0;
        double sumaY = 0;
        double sumaX = 0;
        double sumaCuadX = 0;

		for (int i = 0 ; i < x.length; i++) {
			multiXY += x[i]*y[i];
			sumaY += y[i];
			sumaX += x[i];
			sumaCuadX += x[i]*x[i];
		}

		return (x.length * multiXY - sumaX * sumaY) / (x.length * sumaCuadX - sumaX * sumaX);
	}

    /**
	* Calcula la intersección con el eje y de la recta de la forma y = mx + b
	* @param x arreglo que contiene todas las x del modelo
	* @param y arreglo que contiene todas las y del modelo
	* @return regresa la intersección
	*/
    public static double interseccion (double [] x, double [] y ) {
		double sumaY = 0;
        double sumaX = 0;

		for (int i = 0 ; i < x.length; i++) {
			sumaY += y[i];
			sumaX += x[i];
		}

		return (sumaY - pendiente(x,y)*sumaX) / x.length ;
	}
}
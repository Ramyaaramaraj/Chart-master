package com.example.prabhakarananbazhag.chart.model;
import java.util.ArrayList;
public class AxisChartData {

    public ArrayList<Plot>plot;

    public ArrayList<Plot> getPlot() {
        return plot;
    }

    public ArrayList<Lable> getLabel() {
        return label;
    }

    public ArrayList<Lable>label;

    public class Plot {
        public String x;

        public String getX() {
            return x;
        }

        public String getY() {
            return y;
        }

        public String y;
        public String color;

        public String getColor() {
            return color;
        }
    }

    public class Lable {
        public String title;
        public String getTitle() {
            return title;
        }
    }

}


package org.example;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun  {
    public static void main(String[] args) {
        Viewer viewer1 = new Viewer("first", 20, 1);
        Viewer viewer2 = new Viewer("second", 30, 8);
        Viewer viewer3 = new Viewer("third", 14, 5);
        Viewer viewer4 = new Viewer("fourth", 10, 2);
        Viewer viewer5 = new Viewer("fifth", 15, 3);

        List<Viewer> viewers = new ArrayList<>(5);
        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);

        var averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println(averageAge);
    }
}
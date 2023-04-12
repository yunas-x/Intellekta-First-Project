package org.example;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun  {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema();
        Cinema cinema2 = new Cinema();
        Cinema cinema3 = new Cinema();
        Cinema cinema4 = new Cinema();
        List<Cinema> cinemas = new ArrayList<>(4);
        cinemas.add(cinema1);
        cinemas.add(cinema2);
        cinemas.add(cinema3);
        cinemas.add(cinema4);

        Viewer viewer1 = new Viewer("first", 20, cinemas.subList(1, 4));
        Viewer viewer2 = new Viewer("second", 30, cinemas.subList(0, 4));
        Viewer viewer3 = new Viewer("third", 14, cinemas.subList(1, 2));
        Viewer viewer4 = new Viewer("fourth", 10, cinemas.subList(1, 3));
        Viewer viewer5 = new Viewer("fifth", 15, cinemas.subList(2, 4));

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
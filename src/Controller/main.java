package Controller;

import Model.Bar;
import Model.European;
import Model.Stock;
import Model.Sushi;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.*;
import java.util.Random;

import static java.lang.Math.min;

public class main {
    public static void main(String[] args) {
        Probability probability = new Probability(0.4,0.3);
        Simulation simulation = new Simulation(probability);
        simulation.simulate();

    }

}




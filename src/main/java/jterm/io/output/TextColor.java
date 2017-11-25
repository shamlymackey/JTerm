package jterm.io.output;

import java.awt.*;
import java.util.Random;

public enum TextColor {
    INPUT, PATH, PROMPT, INFO, ERROR;

    String ansi;
    Color color;

    public static void initHeadless() {
        //TODO: Switch these back when ANSI is fixed in terminal
        INPUT.ansi = (char) 27 + "[0m";
        PATH.ansi = (char) 27 + "[38;5;178m";
        PROMPT.ansi = (char) 27 + "[38;5;172m";
        INFO.ansi = (char) 27 + "[38;5;110m";
        ERROR.ansi = (char) 27 + "[38;5;80m";
    }

    public static String getANSIColor() {
        return (char) 27 + "[38;5;" + (new Random().nextInt(255)) + "m";
    }

    public static void initGui() {
        INPUT.color = new Color(255, 255, 255);
        PATH.color = new Color(142, 114, 77);
        PROMPT.color = new Color(193, 122, 27);
        INFO.color = new Color(150, 150, 150);
        ERROR.color = new Color(140, 40, 40);
    }

    public Color getColor() {
        return color;
    }
}

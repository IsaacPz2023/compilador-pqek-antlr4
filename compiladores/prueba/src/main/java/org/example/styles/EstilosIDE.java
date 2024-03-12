package org.example.styles;

import java.awt.*;

public class EstilosIDE {
    //variables de diseño
    private final Color caret_font_color = new Color(0, 173, 181);
    private final Color font_color = new Color(238, 238, 238);
    private final Color background_base_color = new Color(34, 40, 49);
    private final Color background_color = new Color(57, 62, 70);
    private final Font font_mono = new Font("Monospaced", Font.PLAIN, 14);
    private final Font font_monoBold = new Font("Monospaced", Font.BOLD, 14);
    private final Font font_arial =  new Font("Arial", Font.PLAIN, 14);
    private final Font font_century =  new Font("Century Gothic", Font.PLAIN, 10);

    public Color getCaret_font_color() {
        return caret_font_color;
    }

    public Color getFont_color() {
        return font_color;
    }

    public Color getBackground_base_color() {
        return background_base_color;
    }

    public Color getBackground_color() {
        return background_color;
    }

    public Font getFont_mono() {
        return font_mono;
    }

    public Font getFont_monoBold() {
        return font_monoBold;
    }

    public Font getFont_arial() {
        return font_arial;
    }

    public Font getFont_century() {
        return font_century;
    }
}

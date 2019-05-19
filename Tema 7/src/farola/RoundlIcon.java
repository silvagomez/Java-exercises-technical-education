package farola;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

class RoundlIcon implements Icon {
	Color color;
	public RoundlIcon(Color c) {
		color = c;
	}
	public void paintIcon (Component c, Graphics g, int x, int y) {
		g.setColor(color);
		g.fillOval (x, y, getIconWidth(), getIconHeight());
	}
	public int getIconWidth() {
		return 10;
	}
	public int getIconHeight() {
		return 10;
	}
}
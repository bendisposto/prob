package de.bmotionstudio.gef.editor.figure;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class AbstractTableFigure extends AbstractBMotionFigure {

	private Color foregroundColor;

	@Override
	public Color getForegroundColor() {
		return foregroundColor;
	}

	public void setForegroundColor(RGB rgb) {
		if (foregroundColor != null)
			foregroundColor.dispose();
		this.foregroundColor = new Color(Display.getDefault(), rgb);
		repaint();
	}

	@Override
	public void deactivateFigure() {
		if (foregroundColor != null)
			foregroundColor.dispose();
	}

}

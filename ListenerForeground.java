package zad4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ListenerForeground implements ActionListener {

	protected JTextArea handler;

	/**
	 * @param handler
	 */
	public ListenerForeground(JTextArea handler) {
		this.handler = handler;
	}

	/**
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		MyIcon icon = (MyIcon) item.getIcon();
		handler.setForeground(icon.getColor());
	}
}
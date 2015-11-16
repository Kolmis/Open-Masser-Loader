/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package open.masser.loader;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author kolmis
 */
public class CloseWindow extends javax.swing.JFrame {
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
}

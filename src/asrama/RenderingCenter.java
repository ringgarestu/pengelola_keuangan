/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 *
 */
public class RenderingCenter extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        setHorizontalAlignment(SwingConstants.CENTER);
        return  this;//To change body of generated methods, choose Tools | Templates.
    }
    
}

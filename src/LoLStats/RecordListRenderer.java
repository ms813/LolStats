/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoLStats;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Matthew
 */
public class RecordListRenderer extends JPanel implements ListCellRenderer {
    
    private JLabel[] labels = new JLabel[10];    
    
    public RecordListRenderer(){
        setOpaque(true);
        setLayout(new GridLayout(1, 10));
        
        for(int i = 0; i <10; i++){
            labels[i] = new JLabel();
            add(labels[i]);
        }       
        //set font size + colour here
    }
    
    public Component getListCellRendererComponent(JList list,
            Object r,
            int index,
            boolean isSelected,
            boolean hasFocus){
        
        MatchRecord record = (MatchRecord) r;
        
        labels[0].setText(record.getDate());
        labels[1].setText(record.getChampion());
        
        if(record.isWin()){
            labels[2].setText("Victory");
        } else{
            labels[2].setText("Defeat");
        }
        
        labels[3].setText("Kills: " + record.getKills());
        labels[4].setText("Deaths: " + record.getDeaths());
        labels[5].setText("Assists: " + record.getAssists());
        labels[6].setText("Gold Earned: " + record.getGold());
        labels[7].setText("Minion Kills: " + record.getCs());
        labels[8].setText(record.getPosition());
        
        if(record.isRanked()){
            labels[9].setText("Ranked");
        } else {
            labels[9].setText("Normal");
        }
        
        return this;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Cooledge
 */
public class View implements ModelListener {
    
    private Model model;
    
    public View(Model model){
        this.model = model;
        model.addListener(this);
        
    }

    @Override
    public void update() {
      
        String p1,p2;
        p1 = model.getPlayer1Name();
        p2 = model.getPlayer2Name();
        System.out.println(p1 + " " + p2);
        
    }
    
    
}

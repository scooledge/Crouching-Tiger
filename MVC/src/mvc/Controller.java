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
public class Controller {
    
    public Controller(){
        Model model = new Model();
        
        View view = new View(model);
        
        View2 view2 = new View2(model);
        
        model.setPlayerNames("saly", "bob");
        
        model.setPlayerNames("sam", "ferd");
        
    }
    
    
    
}

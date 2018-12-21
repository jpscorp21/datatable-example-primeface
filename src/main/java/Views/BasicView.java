/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class BasicView {
    
   private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
   
   public void handleKeyEvent() {
       this.text = this.text.toUpperCase();
   }
    
}

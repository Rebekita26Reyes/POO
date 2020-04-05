/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Cesia 
 */ 
public class CD {
    int x ,y;

public CD(int x,int y){
    this.setX(x);
    this.setY(y);
}

  public CD(){this(0,0);}

   public final void setX(int x){this.x =x;}
   public final void setY(int y){this.y =y;}

 
    public int suma() {
      return this.x+this.y;
    }
    
}

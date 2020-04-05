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
//Esta clase hereda de la clase CA.
public class CB extends CA{
    //Creamos la variable z
    //No declaramos x,y por que estas variables las hereda
    private int z;

    //Constructor de esta clase:
   public CB(int x,int y,int z){
    super(x,y);//Con super indicamos que vamos a pasar los valores x,y al contructor de la clase CB
    this.setZ(z);//aqui usamos this porque es un metodo de ESTA clase.
}
   //Tambien es un constructor que se auto asigna valores si no le pones valores
   //al momento de crear una instancia.
   public CB(){this(0,0,0);}
   
   //dice: la variable z va a ser igual a la variable z que se le pase por parametros.
    public final void setZ(int z){this.z=z;}
    public int getZ(){return this.z;}//Me retornara lo que vale z 
     
    //el metodo suma estaba en la clase CA
    //pero como fue heredado lo podemos llamar con this.
   public int suma(){return this.getX()+this.getY()+this.getZ();
    }
    
}

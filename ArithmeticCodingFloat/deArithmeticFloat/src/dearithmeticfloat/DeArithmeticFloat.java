/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dearithmeticfloat;

import java.util.ArrayList;

/**
 *
 * @author Manaz
 */
public class DeArithmeticFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //kany 5dt mn file hhhhh
        float code=(float) 0.773;
        int count=4;
      ArrayList<Float>low=new ArrayList<>();
      ArrayList<Float>high=new ArrayList<>();
      ArrayList<Character>c=new ArrayList<>();
          
            ArrayList<Character>x=new ArrayList<>();
    c.add('A');
    c.add('B');
     c.add('C');
     float w=0;
     low.add(w);
     w= (float) 0.8;
     low.add(w);
     high.add(w);
     w= (float) 0.82;
     low.add(w);
     high.add(w);
      w= (float) 1;
      high.add(w);
      float lower = 0,upper = 0,recode = 0;
      for(int i=0;i<c.size();i++){
      if(code>low.get(i)&&code<high.get(i)){
      x.add(c.get(i));
      lower=low.get(i);
      upper=high.get(i);
      break;
      }
      
      
      }
      //  System.out.println(x.get(0)+" "+lower+" "+upper);
      count--;
      float ll = 0,uu = 0;
        while (count>0) {
           recode=(code-lower)/(upper-lower); 
              for(int i=0;i<c.size();i++){
      if(recode>low.get(i)&&recode<high.get(i)){
      x.add(c.get(i));
      ll=low.get(i);
      uu=high.get(i);
      break;
      }
    } 
    float l = lower, u = upper;
   lower = l+ (u-l) * ll;
   upper= l+(u-l)* uu;
    
         
            
            
            
            
            count--;
        }
    
      
      
      
      for(int i=0;i<x.size();i++){
      
          System.out.print(x.get(i));
         
      }
       System.out.println("");
      
    
        
        
        
        
        
        
        
        
        
        
      
    }
    
}

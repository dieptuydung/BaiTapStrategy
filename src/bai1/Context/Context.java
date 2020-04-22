/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.Context;

import bai1.Tinhtoan.Itinh;

/**
 *
 * @author boss dung
 */
public  abstract class Context {
    Itinh tinhToan;
    public void setTinhToan(Itinh tinhToan)
    {
        this.tinhToan=tinhToan;
    }
    public float tinh(float a,float b)
    {
        return tinhToan.tinh(a,b); 
   }
    public abstract String display();

   

  
    
    
}

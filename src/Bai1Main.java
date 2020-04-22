
import bai1.Context.Context;
import bai1.Tinhtoan.cong;
import bai1.Tinhtoan.tru;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boss dung
 */
public class Bai1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Context ct=new Context() {
        @Override
        public String display() {
            return null;
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        }
    };
       ct.setTinhToan(new cong());
        float kq = ct.tinh(75, 12);
        System.out.println("75 + 12 = "+ kq);
        
        ct.setTinhToan(new tru());
        kq = ct.tinh(54, 78);
        System.out.println("54 - 78 = "+ kq);
    }
    
}

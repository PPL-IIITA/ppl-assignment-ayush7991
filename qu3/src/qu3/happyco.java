/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qu3;

/**
 *
 * @author silentwraith
 */
public class happyco extends hapcomp{
    int boyhap,girlhap,happsum;
    String boyname,girlname;
    public happyco(int boyhap,int girlhap,String boyname,String girlname,int happsum) {
        super(boyname,girlname,boyhap,girlhap);
        //this.boyname=boyname;
        //this.girlname=girlname;
        //this.boyhap=boyhap;
        //this.girlhap=girlhap;
        this.happsum=boyhap+girlhap;
    }
    
}

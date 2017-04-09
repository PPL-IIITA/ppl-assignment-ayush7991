/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qu4;

/**
 *
 * @author silentwraith
 */
public class couple extends hapcomp{
    String boyname,girlname;
    int boybudget,girlmaintaincost,boytype,girltype,boyhap,girlhap,girlintell,boyatt,girlatt,boyintell,boyindex,girlindex;

    public couple(String boyname,String girlname,int boybudget,int girlmaintaincost,int boytype,int girltype,int boyhap,int girlhap,int girlintell,int boyatt,int girlatt,int boyintell,int boyindex,int girlindex) {
        super(boyname,girlname,boyhap,girlhap);
        //this.boyname=boyname;
        //this.girlname=girlname;
        this.boyindex=boyindex;
        this.girlindex=girlindex;
        this.boybudget=boybudget;
        this.girlmaintaincost=girlmaintaincost;
        this.boytype=boytype;
        this.girltype=girltype;
        //this.boyhap=boyhap;
        //this.girlhap=girlhap;
        this.girlintell=girlintell;
        this.boyatt=boyatt;
        this.girlatt=girlatt;
        this.boyintell=boyintell;
    }
}

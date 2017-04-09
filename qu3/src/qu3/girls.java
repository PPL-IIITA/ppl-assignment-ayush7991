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
public class girls extends person{
     String name,status,boyfriend;
    int attractiveness,maintainence_cost,intelligence_level,min_attractionrequirement,type;
    public girls(String name,int attractiveness,int maintainance_cost,int intelligence_level,int type){
        super(name,attractiveness,type,intelligence_level);
        //this.name = name;
        //.this.attractiveness=attractiveness;
        this.maintainence_cost=maintainance_cost;
        //this.intelligence_level=intelligence_level;
        this.status="Single";
        this.boyfriend="";
        //this.type=type;
    }
}
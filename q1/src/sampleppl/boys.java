/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleppl;

/**
 *
 * @author silentwraith
 */
public class boys {
    String name,status,girlfriend;
    int attractiveness,budget,intelligence_level,min_attractionrequirement;
    boys(String name,int attractiveness,int budget,int intelligence_level,int min_attraction){
        this.name = name;
        this.attractiveness=attractiveness;
        this.budget=budget;
        this.intelligence_level=intelligence_level;
        this.min_attractionrequirement=min_attraction;
        this.status="Single";
        this.girlfriend="";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NewUser
 */
public class Mobile3G {
    
    void insertSIM(SIM2G s){
    s.call();
    s.sms();
    if(s instanceof SIM3G){
    SIM3G s3=(SIM3G)s;
    s3.videoCall();
    }
    }
}

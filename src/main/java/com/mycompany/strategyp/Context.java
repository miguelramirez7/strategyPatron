/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategyp;

/**
 *
 * @author User
 */
public class Context {
    private IPoderstrategy poderStrategy;

    public Context(IPoderstrategy poder) {
        this.poderStrategy = poder;
    }
    
    public void ejecutarStrategy(){
        this.poderStrategy.usarPoder();
    }
    
    
}

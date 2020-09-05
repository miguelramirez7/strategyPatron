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
public class probandoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creando las strategias concretas q son las funcionalidades separadas
        IPoderstrategy poderFuego = new StrategyConcretFuego();
        IPoderstrategy poderHielo = new StrategyConcretHielo();
        
        //estas strategias sucederas en un contexto diferente
        Context contexto = new Context(poderFuego);
        contexto.ejecutarStrategy();
        
        contexto = new Context(poderHielo);
        contexto.ejecutarStrategy();
        
    }
    
}

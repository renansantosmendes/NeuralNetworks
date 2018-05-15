/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.neuralnetworks;

/**
 *
 * @author renansantos
 */
public class InputLayer extends Layer {
    public void initLayer(InputLayer inputLayer){
        super.setNumberOfNeuronsInLayer(2);
        for(Neuron neuron: super.getListOfNeurons()){
            neuron.initNeuron(1, 0);
        }
    }
    
    public void printLayer(InputLayer inputLayer){
        
    }
}

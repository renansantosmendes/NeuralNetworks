/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.neuralnetworks;

import java.util.List;

/**
 *
 * @author renansantos
 */
public class Layer {
    private List<Neuron> listOfNeurons;
    private int numberOfNeuronsInLayer;

    public List<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    public void setListOfNeurons(List<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }
}

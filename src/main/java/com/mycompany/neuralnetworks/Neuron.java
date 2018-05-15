/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.neuralnetworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author renansantos
 */
public class Neuron {

    private List<Double> listOfWeightIn;
    private List<Double> listOfWeightOut;

    public double initNeuron() {
        this.listOfWeightIn = new ArrayList<>();
        this.listOfWeightOut = new ArrayList<>();
        Random rnd = new Random();
        return rnd.nextDouble();
    }

    public void initNeuron(int inputNumber, int outputNumber) {
        this.listOfWeightIn = new ArrayList<>();
        this.listOfWeightOut = new ArrayList<>();
        this.listOfWeightIn.addAll(initializeWeights(inputNumber));
        this.listOfWeightOut.addAll(initializeWeights(outputNumber));
    }

    public List<Double> initializeWeights(int numberOfWeights){
        List<Double> weights = new ArrayList<>();
        Random rnd = new Random();
        for(int i=0; i< numberOfWeights;i++){
            weights.add(rnd.nextDouble());
        }
        return weights;
    }
    
    public List<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    public void setListOfWeightIn(List<Double> listOfWeightIn) {
        this.listOfWeightIn = listOfWeightIn;
    }

    public List<Double> getListOfWeightOut() {
        return listOfWeightOut;
    }

    public void setListOfWeightOut(List<Double> listOfWeightOut) {
        this.listOfWeightOut = listOfWeightOut;
    }

}

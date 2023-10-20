/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.StringRepository;

/**
 *
 * @author Xuan Vinh
 */
public class AnalysisString {
    StringRepository program;

    public AnalysisString() {
        program = new StringRepository();
    }

    public void run() {
        System.out.println("\nAnalysis String Program:");
        program.analysisString();
    }
}

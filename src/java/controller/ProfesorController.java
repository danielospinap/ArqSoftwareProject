/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.Profesor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author usuario
 */
@Named(value = "profesorController")
@SessionScoped
public class ProfesorController implements Serializable {

    private Profesor profesor;
    private ProfesorController profesorController;
    private int recordCount = 1000;
    private int pageSize = 10;
    private Profesor current;
    private int selectedItemIndex;
    
    
    /**
     * Creates a new instance of ProfesorController
     */
    public ProfesorController() {
    }
    
    /** Creates a new instance of FilmController */
    
    
}

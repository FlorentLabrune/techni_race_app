package model.pages;

import java.util.Date;

import model.enums.EtatPiste;
import model.enums.PageType;

public class General extends Page {
    private int numMoto = -1;
    private Date date;
    private String circuit = "N/A";
    private int distance = -1;
    private int tempPiste = -1000;
    private EtatPiste etatPiste;


    public General() {
        this.type = PageType.GENERAL;
        
    }
}

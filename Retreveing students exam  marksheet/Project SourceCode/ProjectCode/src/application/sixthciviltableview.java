package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class sixthciviltableview implements Serializable{
	public SimpleStringProperty rno =  new SimpleStringProperty();
	public SimpleStringProperty name = new SimpleStringProperty();
	public SimpleStringProperty  humanities= new SimpleStringProperty();
	public SimpleStringProperty computerapp = new SimpleStringProperty();
	public SimpleStringProperty environmental2 = new SimpleStringProperty();
	public SimpleStringProperty  integrateddesign= new SimpleStringProperty();
	
	
	
	public sixthciviltableview(String rno, String name,String humanities,String computerapp,String environmental2,String integrateddesign) {
        this.rno = new SimpleStringProperty (rno);
        this.name = new SimpleStringProperty(name);
        this.humanities = new SimpleStringProperty(humanities);
        this.computerapp = new SimpleStringProperty(computerapp);
        this.environmental2 = new SimpleStringProperty(environmental2);
        this.integrateddesign = new SimpleStringProperty(integrateddesign);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty rnoProperty() {
        return rno;
    }
	public String getName() {
	    return name.get();
	}

	public String getRno() {
	    return rno.get();
	}
	public StringProperty  humanitiesProperty(){
		return humanities;	
	}
	public StringProperty computerappProperty(){
		return computerapp;
	}
	public StringProperty environmental2Property() {
		return environmental2;
	}
	public StringProperty integrateddesignProperty(){
		return integrateddesign;
	}
	
	
	public String getHumanities() {
		return humanities.get();
	}
	public String getComputerapp() {
		return computerapp.get();
	}
	public String getEnvironmental2() {
		return environmental2.get();
	}
	public String getIntegrateddesign() {
		return integrateddesign.get();
	}
	
	

}

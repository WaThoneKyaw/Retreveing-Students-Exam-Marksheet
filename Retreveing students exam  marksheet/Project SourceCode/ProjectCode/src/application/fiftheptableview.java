package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fiftheptableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty mcs = new SimpleStringProperty();
	public SimpleStringProperty emc = new SimpleStringProperty();
	public SimpleStringProperty psp = new SimpleStringProperty();
	public SimpleStringProperty eops = new SimpleStringProperty();
	public SimpleStringProperty eec = new SimpleStringProperty();
	
	
	public fiftheptableview(String name, String rno,String mcs,String emc,String psp,String eops,String eec) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);       
        this.mcs = new SimpleStringProperty(mcs);
        this.emc = new SimpleStringProperty(emc);
        this.psp = new SimpleStringProperty(psp);
        this.eops = new SimpleStringProperty(eops);
        this.eec = new SimpleStringProperty(eec);
       

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

	public StringProperty  aeProperty(){
		return mcs;
	}
	public StringProperty plcProperty() {
		return emc;
	}
	public StringProperty dcsProperty() {
		return psp;
	}
	public StringProperty  dspProperty(){
		return eops;	
	}
	public StringProperty  meProperty(){
		return eec;
	}
	
	public String getAe() {
		return mcs.get();
	}
	public String getPlc() {
		return emc.get();
	}
	public String getDcs() {
		return psp.get();
	}
	public String getDsp() {
		return eops.get();
	}
	public String getMe() {
		return eec.get();
	}
	

}

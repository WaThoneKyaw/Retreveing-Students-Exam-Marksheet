package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class thirdectableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty eca = new SimpleStringProperty();
	public SimpleStringProperty dc = new SimpleStringProperty();
	public SimpleStringProperty ee = new SimpleStringProperty();
	public SimpleStringProperty ie = new SimpleStringProperty();
	public SimpleStringProperty mc = new SimpleStringProperty();
	
	public thirdectableview(String name, String rno,String eng,String math,String eca,String dc,String ee,String ie,String mc) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);       
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.eca = new SimpleStringProperty(eca);
        this.dc = new SimpleStringProperty(dc);
        this.ee = new SimpleStringProperty(ee);
        this.ie = new SimpleStringProperty(ie);
        this.mc = new SimpleStringProperty(mc);
       
        

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

	public StringProperty  engProperty(){
		return eng;
	}
	public StringProperty mathProperty() {
		return math;
	}
	public StringProperty ecaProperty() {
		return eca;
	}
	public StringProperty dcProperty(){
		return dc;	
	}
	public StringProperty  eeProperty(){
		return ee;
	}
	public StringProperty ieProperty(){
		return ie;
	}
	public StringProperty  mcProperty(){
		return mc;
	}
	public String getEca() {
		return eca.get();
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getDc() {
		return dc.get();
	}
	public String getEe() {
		return ee.get();
	}
	public String getIe() {
		return ie.get();
	}
	public String getMc() {
		return mc.get();
	}
	

}

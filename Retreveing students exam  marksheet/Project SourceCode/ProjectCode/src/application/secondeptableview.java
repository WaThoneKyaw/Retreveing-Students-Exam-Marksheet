package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class secondeptableview implements Serializable{
	public SimpleStringProperty rno =  new SimpleStringProperty();
	public SimpleStringProperty  name= new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty circuit = new SimpleStringProperty();
	public SimpleStringProperty basicelectronics = new SimpleStringProperty();
	public SimpleStringProperty electromechnics = new SimpleStringProperty();
	public SimpleStringProperty gtm = new SimpleStringProperty();
	public SimpleStringProperty mechanics = new SimpleStringProperty();
	
	public secondeptableview(String rno, String name,String eng,String math,String circuit,String basicelectronics,String electromechnics,String gtm,String mechanics) {
        this.rno = new SimpleStringProperty (rno);
        this.name = new SimpleStringProperty(name);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.circuit = new SimpleStringProperty(circuit);
        this.basicelectronics = new SimpleStringProperty(basicelectronics);
        this.electromechnics = new SimpleStringProperty(electromechnics);
        this.gtm = new SimpleStringProperty(gtm);
       this.mechanics = new SimpleStringProperty(mechanics);
        

    }
	public StringProperty rnoProperty() {
        return rno;
    }

    public StringProperty nameProperty() {
        return name;
    }
	
	public String getRno() {
	    return rno.get();
	}
	public String getName() {
	    return name.get();
	}
	
	public StringProperty  engProperty(){
		return eng;
	}
	public StringProperty mathProperty() {
		return math;
	}
	public StringProperty circuitProperty(){
		return circuit;	
	}
	public StringProperty  basicelectronicsProperty(){
		return basicelectronics;
	}
	public StringProperty  electromechnicsProperty(){
		return electromechnics;
	}
	public StringProperty gtmProperty() {
		return gtm;
	}
	public StringProperty mechanicsProperty() {
		return mechanics;
	}
	
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getcircuit() {
		return circuit.get();
	}
	public String getbasicelectronics() {
		return basicelectronics.get();
	}
	
	public String getelectromechnics() {
		return electromechnics.get();
	}
	public String getgtm() {
		return gtm.get();
	}
	public String getmechanics() {
		return mechanics.get();
	}
	

}

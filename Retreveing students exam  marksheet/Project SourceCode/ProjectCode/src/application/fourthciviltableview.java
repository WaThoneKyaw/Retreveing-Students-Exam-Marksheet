package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fourthciviltableview implements Serializable{
	public SimpleStringProperty rno =  new SimpleStringProperty();
	public SimpleStringProperty name = new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty  math= new SimpleStringProperty();
	public SimpleStringProperty  theoryofstru= new SimpleStringProperty();
	public SimpleStringProperty design = new SimpleStringProperty();
	public SimpleStringProperty  foundation= new SimpleStringProperty();
	public SimpleStringProperty hydraulic = new SimpleStringProperty();
	public SimpleStringProperty transportation = new SimpleStringProperty();
	
	
	public fourthciviltableview(String rno, String name,String eng,String math,String theoryofstru,
			String design,String foundation,
			String hydraulic,String transportation) {
        this.rno = new SimpleStringProperty (rno);
        this.name = new SimpleStringProperty(name);
        this.eng = new SimpleStringProperty(eng);
        this.math= new SimpleStringProperty(math);
        this.theoryofstru = new SimpleStringProperty(theoryofstru);
        this.design = new SimpleStringProperty(design);
        this.foundation = new SimpleStringProperty(foundation);
        this.hydraulic = new SimpleStringProperty(hydraulic);
        this.transportation = new SimpleStringProperty(transportation);
        
       
        

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
	public StringProperty  theoryofstruProperty(){
		return theoryofstru;	
	}
	public StringProperty designProperty(){
		return design;
	}
	public StringProperty foundationProperty(){
		return foundation;
	}
	
	public StringProperty  hydraulicProperty(){
		return hydraulic;
	}
	public StringProperty  transportationProperty(){
		return transportation;
	}
	
	
	
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getTheoryofstru() {
		return theoryofstru.get();
	}
	public String getDesign() {
		return design.get();
	}
	public String getFluid() {
		return foundation.get();
	}
	public String gethyDraulic() {
		return hydraulic.get();
	}
	public String getTransportation() {
		return transportation.get();
	}
	
	
	

}

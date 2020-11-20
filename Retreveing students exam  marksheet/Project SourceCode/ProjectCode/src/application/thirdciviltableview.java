package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class thirdciviltableview implements Serializable{
	public SimpleStringProperty rno =  new SimpleStringProperty();
	public SimpleStringProperty name = new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty  math= new SimpleStringProperty();
	public SimpleStringProperty  surveying= new SimpleStringProperty();
	public SimpleStringProperty mechanics = new SimpleStringProperty();
	public SimpleStringProperty  fluid= new SimpleStringProperty();
	public SimpleStringProperty transportation = new SimpleStringProperty();
	public SimpleStringProperty geotechnical = new SimpleStringProperty();
	public SimpleStringProperty geology = new SimpleStringProperty();
	
	public thirdciviltableview(String rno, String name,String eng,String math,String surveying,String mechanics,String fluid,
			String transportation,String geotechnical,String geology) {
        this.rno = new SimpleStringProperty (rno);
        this.name = new SimpleStringProperty(name);
        this.eng = new SimpleStringProperty(eng);
        this.math= new SimpleStringProperty(math);
        this.surveying = new SimpleStringProperty(surveying);
        this.mechanics = new SimpleStringProperty(mechanics);
        this.fluid = new SimpleStringProperty(fluid);
        this.transportation = new SimpleStringProperty(transportation);
        this.geotechnical = new SimpleStringProperty(geotechnical);
        this.geology = new SimpleStringProperty(geology);
       
        

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
	public StringProperty  surveyingProperty(){
		return surveying;	
	}
	public StringProperty mechanicsProperty(){
		return mechanics;
	}
	public StringProperty fluidProperty(){
		return fluid;
	}
	public StringProperty  transportationProperty(){
		return transportation;
	}
	public StringProperty  geotechnicalProperty(){
		return geotechnical;
	}
	public StringProperty geologyProperty() {
		return geology;
	}
	
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getSurveying() {
		return surveying.get();
	}
	public String getMechanics() {
		return mechanics.get();
	}
	public String getFluid() {
		return fluid.get();
	}
	public String getTransportation() {
		return transportation.get();
	}
	public String getGeotechnical() {
		return geotechnical.get();
	}
	public String getGeology() {
		return geology.get();
	}
	

}

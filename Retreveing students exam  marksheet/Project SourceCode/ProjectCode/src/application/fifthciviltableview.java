package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fifthciviltableview implements Serializable{
	public SimpleStringProperty rno =  new SimpleStringProperty();
	public SimpleStringProperty name = new SimpleStringProperty();
	public SimpleStringProperty  theoryofstru2= new SimpleStringProperty();
	public SimpleStringProperty design2 = new SimpleStringProperty();
	public SimpleStringProperty construction2 = new SimpleStringProperty();
	public SimpleStringProperty  hydraulic2= new SimpleStringProperty();
	public SimpleStringProperty  designofsteel= new SimpleStringProperty();
	public SimpleStringProperty environmental = new SimpleStringProperty();
	public SimpleStringProperty estimating = new SimpleStringProperty();

	
	
	public fifthciviltableview(String rno, String name,String theoryofstru2,String design2,String construction2,String hydraulic2,
			String designofsteel,String environmental,String estimating) {
        this.rno = new SimpleStringProperty (rno);
        this.name = new SimpleStringProperty(name);
        this.theoryofstru2 = new SimpleStringProperty(theoryofstru2);
        this.design2 = new SimpleStringProperty(design2);
        this.construction2 = new SimpleStringProperty(construction2);
        this.hydraulic2 = new SimpleStringProperty(hydraulic2);
        this.designofsteel = new SimpleStringProperty(designofsteel);
        this.environmental = new SimpleStringProperty(environmental);
        this.estimating =new SimpleStringProperty(estimating);
        
       
        

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
	public StringProperty  theoryofstru2Property(){
		return theoryofstru2;	
	}
	public StringProperty design2Property(){
		return design2;
	}
	public StringProperty construction2Property() {
		return construction2;
	}
	public StringProperty hydraulic2Property(){
		return hydraulic2;
	}
	
	public StringProperty  designofsteelProperty(){
		return designofsteel;
	}
	public StringProperty  environmentalProperty(){
		return environmental;
	}
	public StringProperty estimatingProperty() {
		return estimating;
	}
	
	
	
	
	public String getTheoryofstru2() {
		return theoryofstru2.get();
	}
	public String getDesign2() {
		return design2.get();
	}
	public String getConstruction2() {
		return construction2.get();
	}
	public String getHydraulic2() {
		return hydraulic2.get();
	}
	public String getDesignofsteel() {
		return designofsteel.get();
	}
	public String getEnvironmental() {
		return environmental.get();
	}
	public String getEstimating() {
		return estimating.get();
	}
	
	

}

package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class secondmechtableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty mate = new SimpleStringProperty();
	public SimpleStringProperty aee = new SimpleStringProperty();
	public SimpleStringProperty mechanics = new SimpleStringProperty();
	public SimpleStringProperty wt = new SimpleStringProperty();
	public SimpleStringProperty drawing = new SimpleStringProperty();
	
	public secondmechtableview(String rno,String name,String eng,String math,String mate,String aee,String mechanics,String wt,String drawing) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.mate=new SimpleStringProperty(mate);
        this.aee = new SimpleStringProperty(aee);
        this.mechanics = new SimpleStringProperty(mechanics);
        this.wt = new SimpleStringProperty(wt);
        this.drawing = new SimpleStringProperty(drawing);  

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
	public StringProperty EngPeoperty() {
		return eng;
	}
	public StringProperty  MathProperty(){
		return math;
	}
	public StringProperty mateProperty() {
		return mate;
	}
	public StringProperty  AeeProperty(){
		return aee;	
	}
	public StringProperty  MechanicsProperty(){
		return mechanics;
	}
	public StringProperty  WtProperty(){
		return wt;
	}
	public StringProperty  DrawingProperty(){
		return drawing;
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getMate() {
		return mate.get();
	}
	public String getAee() {
		return aee.get();
	}
	public String getMechanics() {
		return mechanics.get();
	}
	public String getWt() {
		return wt.get();
	}
	public String getDrawing() {
		return drawing.get();
	}
	

}

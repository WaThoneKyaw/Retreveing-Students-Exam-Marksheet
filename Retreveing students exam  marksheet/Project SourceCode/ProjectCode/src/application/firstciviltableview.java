package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class firstciviltableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty myan = new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty chem = new SimpleStringProperty();
	public SimpleStringProperty phy = new SimpleStringProperty();
	public SimpleStringProperty material = new SimpleStringProperty();
	public SimpleStringProperty drawing = new SimpleStringProperty();
	
	public firstciviltableview(String rno,String name,String myan,String eng,String math,String chem,String phy,String material,String drawing) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.myan = new SimpleStringProperty(myan);
        this.eng = new SimpleStringProperty(eng);
        this.math=new SimpleStringProperty(math);
        this.chem = new SimpleStringProperty(chem);
        this.phy = new SimpleStringProperty(phy);
        this.material = new SimpleStringProperty(material);
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
	public StringProperty MyanProperty() {
		return myan;
	}
	public StringProperty  engProperty(){
		return eng;
	}
	public StringProperty mathProperty() {
		return math;
	}
	public StringProperty  chemProperty(){
		return chem;	
	}
	public StringProperty  phyProperty(){
		return phy;
	}
	public StringProperty  materialProperty(){
		return material;
	}
	public StringProperty  drawingProperty(){
		return drawing;
	}
	public String getMyan() {
		return myan.get();
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getChem() {
		return chem.get();
	}
	public String getPhy() {
		return phy.get();
	}
	public String getMaterial() {
		return material.get();
	}
	public String getDrawing() {
		return drawing.get();
	}
	

}

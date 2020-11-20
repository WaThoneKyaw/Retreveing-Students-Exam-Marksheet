package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class thirdeptableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty mef = new SimpleStringProperty();
	public SimpleStringProperty eeca = new SimpleStringProperty();
	public SimpleStringProperty pe = new SimpleStringProperty();
	public SimpleStringProperty emo = new SimpleStringProperty();
	public SimpleStringProperty ef = new SimpleStringProperty();
	public SimpleStringProperty emi = new SimpleStringProperty();
	
	public thirdeptableview(String name, String rno,String eng,String math,String mef,String eeca,String pe,String emo,String ef,String emi) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);       
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.mef = new SimpleStringProperty(mef);
        this.eeca = new SimpleStringProperty(eeca);
        this.pe = new SimpleStringProperty(pe);
        this.emo = new SimpleStringProperty(emo);
        this.ef = new SimpleStringProperty(ef);
        this.emi = new SimpleStringProperty(emi);
        
        

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
		return mef;
	}
	public StringProperty eecaProperty() {
		return eeca;
	}
	public StringProperty dcProperty(){
		return pe;	
	}
	public StringProperty  eeProperty(){
		return emo;
	}
	public StringProperty ieProperty(){
		return ef;
	}
	public StringProperty  mcProperty(){
		return emi;
	}
	public String getEca() {
		return mef.get();
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getDc() {
		return pe.get();
	}
	public String getEeca() {
		return eeca.get();
	}
	public String getIe() {
		return emo.get();
	}
	public String getMc() {
		return ef.get();
	}
	public String getEmi() {
		return emi.get();
	}
	

}








package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class secondectableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty cp = new SimpleStringProperty();
	public SimpleStringProperty eec = new SimpleStringProperty();
	public SimpleStringProperty de = new SimpleStringProperty();
	public SimpleStringProperty micro = new SimpleStringProperty();
	public SimpleStringProperty tp = new SimpleStringProperty();
	
	public secondectableview(String name, String rno,String eng,String math,String cp,String eec,String de,String micro,String tp) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);       
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.cp = new SimpleStringProperty(cp);
        this.eec = new SimpleStringProperty(eec);
        this.de = new SimpleStringProperty(de);
        this.micro = new SimpleStringProperty(micro);
        this.tp = new SimpleStringProperty(tp);
       
        

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
	public StringProperty cpProperty() {
		return cp;
	}
	public StringProperty  eecProperty(){
		return eec;	
	}
	public StringProperty  deProperty(){
		return de;
	}
	public StringProperty microProperty(){
		return micro;
	}
	public StringProperty  tpProperty(){
		return tp;
	}
	public String getCp() {
		return cp.get();
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getEec() {
		return eec.get();
	}
	public String getDe() {
		return de.get();
	}
	public String getMicro() {
		return micro.get();
	}
	public String getTp() {
		return tp.get();
	}
	

}

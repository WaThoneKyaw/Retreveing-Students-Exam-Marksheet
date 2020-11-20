package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fourthittableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty acn = new SimpleStringProperty();
	public SimpleStringProperty cao = new SimpleStringProperty();
	public SimpleStringProperty os = new SimpleStringProperty();
	public SimpleStringProperty adbms = new SimpleStringProperty();
	public SimpleStringProperty mcs = new SimpleStringProperty();
	
	public fourthittableview(String rno,String name,String eng,String math,String acn,String cao,String os,String adbms,String mcs) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.acn=new SimpleStringProperty(acn);
        this.cao = new SimpleStringProperty(cao);
        this.os = new SimpleStringProperty(os);
        this.adbms = new SimpleStringProperty(adbms);
        this.mcs = new SimpleStringProperty(mcs);  

    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty rnoProperty() {
        return rno;
    }
	
	public StringProperty EngPeoperty() {
		return eng;
	}
	public StringProperty  MathProperty(){
		return math;
	}
	public StringProperty AcnProperty() {
		return acn;
	}
	public StringProperty  CaoProperty(){
		return cao;	
	}
	public StringProperty  OsProperty(){
		return os;
	}
	public StringProperty  AdbmsProperty(){
		return adbms;
	}
	public StringProperty  McsProperty(){
		return mcs;
	}
	public String getName() {
	    return name.get();
	}

	public String getRno() {
	    return rno.get();
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getAcn() {
		return acn.get();
	}
	public String getCao() {
		return cao.get();
	}
	public String getOs() {
		return os.get();
	}
	public String getAdbms() {
		return adbms.get();
	}
	public String getMcs() {
		return mcs.get();
	}
	

}

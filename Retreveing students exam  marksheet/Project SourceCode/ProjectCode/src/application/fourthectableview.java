package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fourthectableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty cc = new SimpleStringProperty();
	public SimpleStringProperty hdl = new SimpleStringProperty();
	public SimpleStringProperty mcs = new SimpleStringProperty();
	public SimpleStringProperty em = new SimpleStringProperty();
	public SimpleStringProperty iec = new SimpleStringProperty();
	
	public fourthectableview(String name, String rno,String eng,String math,String cc,String hdl,String mcs,String em,String iec) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);       
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.cc = new SimpleStringProperty(cc);
        this.hdl = new SimpleStringProperty(hdl);
        this.mcs = new SimpleStringProperty(mcs);
        this.em = new SimpleStringProperty(em);
        this.iec = new SimpleStringProperty(iec);
       
        

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
	public StringProperty ccProperty() {
		return cc;
	}
	public StringProperty  hdlProperty(){
		return hdl;	
	}
	public StringProperty  mcsProperty(){
		return mcs;
	}
	public StringProperty emProperty(){
		return em;
	}
	public StringProperty  iecProperty(){
		return iec;
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getCc() {
		return cc.get();
	}
	public String getHdl() {
		return hdl.get();
	}
	public String getMcs() {
		return mcs.get();
	}
	public String getEm() {
		return em.get();
	}
	public String getIec() {
		return iec.get();
	}
	

}

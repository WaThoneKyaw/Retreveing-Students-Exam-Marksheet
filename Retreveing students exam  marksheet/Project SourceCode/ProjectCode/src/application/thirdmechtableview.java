package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class thirdmechtableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty tm = new SimpleStringProperty();
	public SimpleStringProperty sm = new SimpleStringProperty();
	public SimpleStringProperty em = new SimpleStringProperty();
	public SimpleStringProperty ade = new SimpleStringProperty();
	public SimpleStringProperty pt = new SimpleStringProperty();
	public SimpleStringProperty et = new SimpleStringProperty();
	
	public thirdmechtableview(String rno,String name,String eng,String math,String tm,String sm,String em,String ade,String pt,String et) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.tm=new SimpleStringProperty(tm);
        this.sm = new SimpleStringProperty(sm);
        this.em = new SimpleStringProperty(em);
        this.ade = new SimpleStringProperty(ade);
        this.pt = new SimpleStringProperty(pt);  
        this.et = new SimpleStringProperty(et);  

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
	public StringProperty TmProperty() {
		return tm;
	}
	public StringProperty  SmProperty(){
		return sm;	
	}
	public StringProperty  EmProperty(){
		return em;
	}
	public StringProperty  AdeProperty(){
		return ade;
	}
	public StringProperty  PtProperty(){
		return pt;
	}
	public StringProperty  EtProperty(){
		return et;
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getTm() {
		return tm.get();
	}
	public String getSm() {
		return sm.get();
	}
	public String getEm() {
		return em.get();
	}
	public String getAde() {
		return ade.get();
	}
	public String getPt() {
		return pt.get();
	}
	public String getEt() {
		return et.get();
	}
	

}

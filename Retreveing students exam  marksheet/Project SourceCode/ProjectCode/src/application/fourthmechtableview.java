package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fourthmechtableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty dme = new SimpleStringProperty();
	public SimpleStringProperty msa = new SimpleStringProperty();
	public SimpleStringProperty ht = new SimpleStringProperty();
	public SimpleStringProperty sm = new SimpleStringProperty();
	public SimpleStringProperty fm = new SimpleStringProperty();
	public SimpleStringProperty tm = new SimpleStringProperty();
	
	public fourthmechtableview(String rno,String name,String eng,String math,String dme,String msa,String ht,String sm,String fm,String tm) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.dme=new SimpleStringProperty(dme);
        this.msa = new SimpleStringProperty(msa);
        this.ht = new SimpleStringProperty(ht);
        this.sm = new SimpleStringProperty(sm);
        this.fm = new SimpleStringProperty(fm);  
        this.tm = new SimpleStringProperty(tm);  

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
	public StringProperty DmeProperty() {
		return dme;
	}
	public StringProperty  MsaProperty(){
		return msa;	
	}
	public StringProperty  HtProperty(){
		return ht;
	}
	public StringProperty  SmProperty(){
		return sm;
	}
	public StringProperty  FmProperty(){
		return fm;
	}
	public StringProperty  TmProperty(){
		return tm;
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getDme() {
		return dme.get();
	}
	public String getMsa() {
		return msa.get();
	}
	public String getHt() {
		return ht.get();
	}
	public String getSm() {
		return sm.get();
	}
	public String getFm() {
		return fm.get();
	}
	public String getTm() {
		return tm.get();
	}
	

}

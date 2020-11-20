package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fourtheptableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty cs = new SimpleStringProperty();
	public SimpleStringProperty plc = new SimpleStringProperty();
	public SimpleStringProperty emd = new SimpleStringProperty();
	public SimpleStringProperty dlps = new SimpleStringProperty();
	public SimpleStringProperty psa = new SimpleStringProperty();
	public SimpleStringProperty lcs = new SimpleStringProperty();
	
	
	public fourtheptableview(String name, String rno,String eng,String math,String cs,String plc,String emd,String dlps,String psa,String lcs) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);       
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.cs = new SimpleStringProperty(cs);
        this.plc = new SimpleStringProperty(plc);
        this.emd = new SimpleStringProperty(emd);
        this.dlps = new SimpleStringProperty(dlps);
        this.psa = new SimpleStringProperty(psa);
        this.lcs = new SimpleStringProperty(lcs);
       
        

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
		return cs;
	}
	public StringProperty  hdlProperty(){
		return plc;	
	}
	public StringProperty  mcsProperty(){
		return emd;
	}
	public StringProperty emProperty(){
		return dlps;
	}
	public StringProperty  iecProperty(){
		return psa;
	}
	public StringProperty  lcsProperty(){
		return lcs;
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getCc() {
		return cs.get();
	}
	public String getHdl() {
		return plc.get();
	}
	public String getMcs() {
		return emd.get();
	}
	public String getEm() {
		return dlps.get();
	}
	public String getIec() {
		return psa.get();
	}
	public String getLcs() {
		return lcs.get();
	}
	

}

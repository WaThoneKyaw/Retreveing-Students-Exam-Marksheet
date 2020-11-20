package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fifthectableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty ae = new SimpleStringProperty();
	public SimpleStringProperty plc = new SimpleStringProperty();
	public SimpleStringProperty dcs = new SimpleStringProperty();
	public SimpleStringProperty dsp = new SimpleStringProperty();
	public SimpleStringProperty me = new SimpleStringProperty();
	public SimpleStringProperty mecs = new SimpleStringProperty();
	public SimpleStringProperty im = new SimpleStringProperty();
	
	
	public fifthectableview(String name, String rno,String ae,String plc,String dcs,String dsp,String me,String mecs,String im) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);       
        this.ae = new SimpleStringProperty(ae);
        this.plc = new SimpleStringProperty(plc);
        this.dcs = new SimpleStringProperty(dcs);
        this.dsp = new SimpleStringProperty(dsp);
        this.me = new SimpleStringProperty(me);
        this.mecs = new SimpleStringProperty(mecs);
        this.im = new SimpleStringProperty(im);  
        

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

	public StringProperty  aeProperty(){
		return ae;
	}
	public StringProperty plcProperty() {
		return plc;
	}
	public StringProperty dcsProperty() {
		return dcs;
	}
	public StringProperty  dspProperty(){
		return dsp;	
	}
	public StringProperty  meProperty(){
		return me;
	}
	public StringProperty mecsProperty(){
		return mecs;
	}
	public StringProperty  imProperty(){
		return im;
	}

	public String getAe() {
		return ae.get();
	}
	public String getPlc() {
		return plc.get();
	}
	public String getDcs() {
		return dcs.get();
	}
	public String getDsp() {
		return dsp.get();
	}
	public String getMe() {
		return me.get();
	}
	public String getMecs() {
		return mecs.get();
	}
	public String getIm() {
		return im.get();
	}


}

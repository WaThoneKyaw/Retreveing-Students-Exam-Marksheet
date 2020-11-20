package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fifthmechtableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty em = new SimpleStringProperty();
	public SimpleStringProperty ice = new SimpleStringProperty();
	public SimpleStringProperty rac = new SimpleStringProperty();
	public SimpleStringProperty vc = new SimpleStringProperty();
	public SimpleStringProperty fm = new SimpleStringProperty();
	public SimpleStringProperty gtt = new SimpleStringProperty();

	
	public fifthmechtableview(String rno,String name,String em,String ice,String rac,String vc,String fm,String gtt) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.em = new SimpleStringProperty(em);
        this.ice = new SimpleStringProperty(ice);
        this.rac=new SimpleStringProperty(rac);
        this.vc = new SimpleStringProperty(vc);
        this.fm = new SimpleStringProperty(fm);
        this.gtt = new SimpleStringProperty(gtt);


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
	public StringProperty EmPeoperty() {
		return em;
	}
	public StringProperty  IceProperty(){
		return ice;
	}
	public StringProperty RacProperty() {
		return rac;
	}
	public StringProperty  VcProperty(){
		return vc;	
	}
	public StringProperty  FmProperty(){
		return fm;
	}
	public StringProperty  GtttProperty(){
		return gtt;
	}
	
	public String getEm() {
		return em.get();
	}
	public String getIce() {
		return ice.get();
	}
	public String getRac() {
		return rac.get();
	}
	public String getVc() {
		return vc.get();
	}
	public String getFm() {
		return fm.get();
	}
	public String getGtt() {
		return gtt.get();
	}
	
	

}

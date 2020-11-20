package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class fifthittableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty es = new SimpleStringProperty();
	public SimpleStringProperty cns = new SimpleStringProperty();
	public SimpleStringProperty ai = new SimpleStringProperty();
	public SimpleStringProperty dip = new SimpleStringProperty();
	public SimpleStringProperty se = new SimpleStringProperty();
	
	public fifthittableview(String rno,String name,String es,String cns,String ai,String dip,String se) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.es = new SimpleStringProperty(es);
        this.cns = new SimpleStringProperty(cns);
        this.ai=new SimpleStringProperty(ai);
        this.dip = new SimpleStringProperty(dip);
        this.se = new SimpleStringProperty(se);
       
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty rnoProperty() {
        return rno;
    }
	
	public StringProperty EsPeoperty() {
		return es;
	}
	public StringProperty  cnsProperty(){
		return cns;
	}
	public StringProperty AiProperty() {
		return ai;
	}
	public StringProperty  DipProperty(){
		return dip;	
	}
	public StringProperty  SeProperty(){
		return se;
	}
	public String getName() {
	    return name.get();
	}

	public String getRno() {
	    return rno.get();
	}
	public String getEs() {
		return es.get();
	}
	public String getCns() {
		return cns.get();
	}
	public String getAi() {
		return ai.get();
	}
	public String getDip() {
		return dip.get();
	}
	public String getse() {
		return se.get();
	}
	
}

package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class sixthmechtableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty msa = new SimpleStringProperty();
	public SimpleStringProperty re = new SimpleStringProperty();
	public SimpleStringProperty hss = new SimpleStringProperty();
	
	public sixthmechtableview(String rno,String name,String msa,String re,String hss) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.msa = new SimpleStringProperty(msa);
        this.re=new SimpleStringProperty(re);
        this.hss=new SimpleStringProperty(hss);
        

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
	public StringProperty  MsaProperty(){
		return msa;
	}
	public StringProperty ReProperty() {
		return re;
	}
	public StringProperty HssProperty() {
		return hss;
	}
	
	public String getMsa() {
		return msa.get();
	}
	public String getRe() {
		return re.get();
	}
	public String getHss() {
		return hss.get();
	}
}

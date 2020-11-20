package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class sixthectableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty acs = new SimpleStringProperty();
	public SimpleStringProperty cs = new SimpleStringProperty();
	public SimpleStringProperty cn = new SimpleStringProperty();
	public SimpleStringProperty hss = new SimpleStringProperty();
	
	public sixthectableview(String rno,String name,String acs,String cs,String cn,String hss) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.acs = new SimpleStringProperty(acs);
        this.cs = new SimpleStringProperty(cs);
        this.cn=new SimpleStringProperty(cn);
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
	public StringProperty acsProperty() {
		return acs;
	}
	public StringProperty  csProperty(){
		return cs;
	}
	public StringProperty cnProperty() {
		return cn;
	}
	public StringProperty HssProperty() {
		return hss;
	}
	
	public String getACs() {
		return acs.get();
	}
	public String getCs() {
		return cs.get();
	}
	public String getCn() {
		return cn.get();
	}
	public String getHss() {
		return hss.get();
	}
}

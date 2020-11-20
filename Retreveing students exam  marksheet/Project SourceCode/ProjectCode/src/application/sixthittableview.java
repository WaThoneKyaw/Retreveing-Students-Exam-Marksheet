package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class sixthittableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty wmc = new SimpleStringProperty();
	public SimpleStringProperty npm = new SimpleStringProperty();
	public SimpleStringProperty pm = new SimpleStringProperty();
	public SimpleStringProperty hss = new SimpleStringProperty();
	
	public sixthittableview(String rno,String name,String wmc,String npm,String pm,String hss) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.wmc = new SimpleStringProperty(wmc);
        this.npm = new SimpleStringProperty(npm);
        this.pm=new SimpleStringProperty(pm);
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
	public StringProperty WmcProperty() {
		return wmc;
	}
	public StringProperty  NpmProperty(){
		return npm;
	}
	public StringProperty PmProperty() {
		return pm;
	}
	public StringProperty HssProperty() {
		return hss;
	}
	
	public String getWmc() {
		return wmc.get();
	}
	public String getNpm() {
		return npm.get();
	}
	public String getPm() {
		return pm.get();
	}
	public String getHss() {
		return hss.get();
	}
}

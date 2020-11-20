package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class thirdittableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty cn = new SimpleStringProperty();
	public SimpleStringProperty web1 = new SimpleStringProperty();
	public SimpleStringProperty java = new SimpleStringProperty();
	public SimpleStringProperty ds = new SimpleStringProperty();
	public SimpleStringProperty dbms = new SimpleStringProperty();
	
	public thirdittableview(String rno,String name,String eng,String math,String cn,String web1,String java,String ds,String dbms) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.cn=new SimpleStringProperty(cn);
        this.web1 = new SimpleStringProperty(web1);
        this.java = new SimpleStringProperty(java);
        this.ds = new SimpleStringProperty(ds);
        this.dbms = new SimpleStringProperty(dbms);  

    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty rnoProperty() {
        return rno;
    }
	
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getCn() {
		return cn.get();
	}
	public String getWeb1() {
		return web1.get();
	}
	public String getJava() {
		return java.get();
	}
	public String getDs() {
		return ds.get();
	}
	public String getDbms() {
		return dbms.get();
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
	public StringProperty CnProperty() {
		return cn;
	}
	public StringProperty  Web1Property(){
		return web1;	
	}
	public StringProperty  JavaProperty(){
		return java;
	}
	public StringProperty  DsProperty(){
		return ds;
	}
	public StringProperty  DbmsProperty(){
		return dbms;
	}

}

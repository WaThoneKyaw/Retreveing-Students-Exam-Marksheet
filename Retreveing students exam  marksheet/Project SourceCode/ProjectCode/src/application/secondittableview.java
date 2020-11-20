package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class secondittableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty bee = new SimpleStringProperty();
	public SimpleStringProperty dld = new SimpleStringProperty();
	public SimpleStringProperty bcom = new SimpleStringProperty();
	public SimpleStringProperty program = new SimpleStringProperty();
	public SimpleStringProperty web = new SimpleStringProperty();
	
	public secondittableview(String rno,String name,String eng,String math,String bee,String dld,String bcom,String program,String web) {
      
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.bee=new SimpleStringProperty(bee);
        this.dld = new SimpleStringProperty(dld);
        this.bcom = new SimpleStringProperty(bcom);
        this.program = new SimpleStringProperty(program);
        this.web = new SimpleStringProperty(web);  

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
	public StringProperty BeeProperty() {
		return bee;
	}
	public StringProperty  DldProperty(){
		return dld;	
	}
	public StringProperty  BcomProperty(){
		return bcom;
	}
	public StringProperty  ProgramProperty(){
		return program;
	}
	public StringProperty  WebProperty(){
		return web;
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getBee() {
		return bee.get();
	}
	public String getDld() {
		return dld.get();
	}
	public String getBcom() {
		return bcom.get();
	}
	public String getProgram() {
		return program.get();
	}
	public String getWeb() {
		return web.get();
	}
	

}

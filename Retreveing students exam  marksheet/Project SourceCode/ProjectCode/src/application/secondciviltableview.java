package application;


import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class secondciviltableview implements Serializable{
	
	public SimpleStringProperty rno = new SimpleStringProperty();
	public SimpleStringProperty name =  new SimpleStringProperty();
	public SimpleStringProperty eng = new SimpleStringProperty();
	public SimpleStringProperty math = new SimpleStringProperty();
	public SimpleStringProperty survey = new SimpleStringProperty();
	public SimpleStringProperty aee = new SimpleStringProperty();
	public SimpleStringProperty em = new SimpleStringProperty();
	public SimpleStringProperty wtp = new SimpleStringProperty();
	public SimpleStringProperty ced = new SimpleStringProperty();
	
	public secondciviltableview(String name, String rno,String eng,String math,String survey,String aee,String em,String wtp,String ced) {
       
        this.rno = new SimpleStringProperty(rno);
        this.name = new SimpleStringProperty (name);
        this.survey = new SimpleStringProperty(survey);
        this.eng = new SimpleStringProperty(eng);
        this.math = new SimpleStringProperty(math);
        this.aee = new SimpleStringProperty(aee);
        this.em = new SimpleStringProperty(em);
        this.wtp = new SimpleStringProperty(wtp);
        this.ced = new SimpleStringProperty(ced);
       
        

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
	public StringProperty surveyProperty() {
		return survey;
	}
	public StringProperty  engProperty(){
		return eng;
	}
	public StringProperty mathProperty() {
		return math;
	}
	public StringProperty  aeeProperty(){
		return aee;	
	}
	public StringProperty  emProperty(){
		return em;
	}
	public StringProperty wtpProperty(){
		return wtp;
	}
	public StringProperty  cedProperty(){
		return ced;
	}
	public String getSurvey() {
		return survey.get();
	}
	public String getEng() {
		return eng.get();
	}
	public String getMath() {
		return math.get();
	}
	public String getAee() {
		return aee.get();
	}
	public String getEm() {
		return em.get();
	}
	public String getWtp() {
		return wtp.get();
	}
	public String getCed() {
		return ced.get();
	}
	

}

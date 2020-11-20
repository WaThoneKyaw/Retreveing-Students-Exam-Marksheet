package application;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;

import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Callback;

public class Controller implements Initializable {
	
	@FXML
	private Button loginbyn,cbutton,epbutton,ecbutton,mbutton,ibutton,
	back,firstCivilbtn,secondCivilbtn,firstitbtn,seconditbtn,thirditbtn,
	fourthitbtn,fifthitbtn,sixthitbtn,firstmechbtn,secondmechbtn,thirdmechbtn,
	fourthmechbtn, fifthmechbtn,sixthmechbtn,firstecbtn,secondecbtn,thirdecbtn,
	fourthecbtn, fifthecbtn,sixthecbtn,firstepbtn,secondepbtn,thirdepbtn,
	fourthepbtn, fifthepbtn,sixthepbtn,thirdcivilbtn,fourthcivilbtn,fifthcivilbtn,sixthcivilbtn;
	private Stage stage;
	private Label label;
	private ObservableList data;


	private ConnectionUtil objDbClass;

	private firstciviltableview civiltableview;
	private secondciviltableview secondciviltable;
	private thirdciviltableview thirdcivitableview;
	private fourthciviltableview fourthciviltableview;
	private fifthciviltableview fifthciviltableview;
	private sixthciviltableview sixthciviltableview;
	private firstittableview firstittableview;
	private secondittableview secondittableview;
	private thirdittableview thirdittableview;
	private fourthittableview fourthittableview;
	private fifthittableview fifthittableview;
	private sixthittableview sixthittableview;
	private firstmechtableview firstmechtableview;
	private secondmechtableview secondmechtableview;
	private thirdmechtableview thirdmechtableview;
	private fourthmechtableview fourthmechtableview;
	private fifthmechtableview fifthmechtableview;
	private sixthmechtableview sixthmechtableview;
	private firstectableview firstectableview;
	private secondectableview secondectableview;
	private thirdectableview thirdectableview;
	private fourthectableview fourthectableview;
	private fifthectableview fifthectableview;
	private sixthectableview sixthectableview;
	private firsteptableview firsteptableview;
	private secondeptableview secondeptaleview;
	private thirdeptableview thirdeptableview;
	private fourtheptableview fourtheptableview;
	private fiftheptableview fiftheptableview;
	private sixtheptableview sixtheptableview;
	
	private static TableView<firstciviltableview> artistTable=new TableView();
	private static TableView<secondciviltableview> secciviltable = new TableView();
	private static TableView<firstittableview> firstittable =new TableView();
	private static TableView<secondittableview> secondittable=new TableView();
	private static TableView<thirdittableview> thirdittable=new TableView();
	private static TableView<fourthittableview> fourthittable=new TableView();
	private static TableView<fifthittableview> fifthittable=new TableView();
	private static TableView<sixthittableview> sixthittable=new TableView();
	private static TableView<firstmechtableview> firstmechtable= new TableView();
	private static TableView<secondmechtableview> secondmechtable=new TableView();
	private static TableView<thirdmechtableview> thirdmechtable=new TableView();
	private static TableView<fourthmechtableview> fourthmechtable=new TableView();
	private static TableView<fifthmechtableview> fifthmechtable=new TableView();
	private static TableView<sixthmechtableview> sixthmechtable=new TableView();
	private static TableView<firstectableview> firstectable= new TableView();
	private static TableView<secondectableview> secondectable=new TableView();
	private static TableView<thirdectableview> thirdectable=new TableView();
	private static TableView<fourthectableview> fourthectable=new TableView();
	private static TableView<fifthectableview> fifthectable=new TableView();
	private static TableView<sixthectableview> sixthectable=new TableView();
	private static TableView<firsteptableview> firsteptable= new TableView();
	private static TableView<secondeptableview> secondeptable=new TableView();
	private static TableView<thirdeptableview> thirdeptable=new TableView();
	private static TableView<fourtheptableview> fourtheptable=new TableView();
	private static TableView<fiftheptableview> fiftheptable=new TableView();
	private static TableView<sixtheptableview> sixtheptable=new TableView();
	private static TableView<thirdciviltableview> thirdciviltable=new TableView();
	private static TableView<fourthciviltableview> fourthciviltable=new TableView();
	private static TableView<fifthciviltableview> fifthciviltable=new TableView();
	private static TableView<sixthciviltableview> sixthciviltable=new TableView();
	
	
	private TableColumn<firstciviltableview,String> Name=new TableColumn();
	private TableColumn<firstciviltableview,String> rno=new TableColumn(); 
	private TableColumn<firstciviltableview,String> myan=new TableColumn(); 
	private TableColumn<firstciviltableview,String> eng=new TableColumn(); 
	private TableColumn<firstciviltableview,String> math=new TableColumn();  
	private TableColumn<firstciviltableview,String> chem=new TableColumn(); 
	private TableColumn<firstciviltableview,String> phy=new TableColumn(); 
	private TableColumn<firstciviltableview,String> material=new TableColumn(); 
	private TableColumn<firstciviltableview,String> drawing=new TableColumn(); 
	
	private TableColumn<secondciviltableview,String> Name1=new TableColumn();
	private TableColumn<secondciviltableview,String> rno1=new TableColumn(); 
	private TableColumn<secondciviltableview,String> myan1=new TableColumn(); 
	private TableColumn<secondciviltableview,String> eng1=new TableColumn(); 
	private TableColumn<secondciviltableview,String> math1=new TableColumn();  
	private TableColumn<secondciviltableview,String> material1=new TableColumn(); 
	private TableColumn<secondciviltableview,String> build=new TableColumn(); 
	private TableColumn<secondciviltableview, String> cons=new TableColumn(); 
	private TableColumn<secondciviltableview,String> stru=new TableColumn(); 
	
	private TableColumn<firstectableview,String> itro1=new TableColumn();
	private TableColumn<firstectableview,String> itname1=new TableColumn(); 
	private TableColumn<firstectableview,String> itmyan1=new TableColumn(); 
	private TableColumn<firstectableview,String> iteng1=new TableColumn(); 
	private TableColumn<firstectableview,String> itmath1=new TableColumn();  
	private TableColumn<firstectableview,String> itchem1=new TableColumn(); 
	private TableColumn<firstectableview,String> itphy1=new TableColumn(); 
	private TableColumn<firstectableview,String> itdrawing1=new TableColumn(); 
	private TableColumn<firstectableview,String> ics=new TableColumn(); 
	
	private TableColumn<secondittableview,String> itro2=new TableColumn();
	private TableColumn<secondittableview,String> itname2=new TableColumn(); 
	private TableColumn<secondittableview,String> iteng2=new TableColumn(); 
	private TableColumn<secondittableview,String> itmath2=new TableColumn(); 
	private TableColumn<secondittableview,String> itbee=new TableColumn();  
	private TableColumn<secondittableview,String> itdld=new TableColumn(); 
	private TableColumn<secondittableview,String> itbcom=new TableColumn(); 
	private TableColumn<secondittableview,String> itprogram=new TableColumn(); 
	private TableColumn<secondittableview,String> itweb=new TableColumn(); 
	
	private TableColumn<thirdittableview,String> itro3=new TableColumn();
	private TableColumn<thirdittableview,String> itname3=new TableColumn(); 
	private TableColumn<thirdittableview,String> iteng3=new TableColumn(); 
	private TableColumn<thirdittableview,String> itmath3=new TableColumn(); 
	private TableColumn<thirdittableview,String> itcn=new TableColumn();  
	private TableColumn<thirdittableview,String> itweb1=new TableColumn(); 
	private TableColumn<thirdittableview,String> itjava=new TableColumn(); 
	private TableColumn<thirdittableview,String> itds=new TableColumn(); 
	private TableColumn<thirdittableview,String> itdbms=new TableColumn();
	
	private TableColumn<fourthittableview,String> itro4=new TableColumn();
	private TableColumn<fourthittableview,String> itname4=new TableColumn(); 
	private TableColumn<fourthittableview,String> iteng4=new TableColumn(); 
	private TableColumn<fourthittableview,String> itmath4=new TableColumn(); 
	private TableColumn<fourthittableview,String> itacn=new TableColumn();  
	private TableColumn<fourthittableview,String> itcao=new TableColumn(); 
	private TableColumn<fourthittableview,String> itos=new TableColumn(); 
	private TableColumn<fourthittableview,String> itadbms=new TableColumn(); 
	private TableColumn<fourthittableview,String> itmcs=new TableColumn();
	
	private TableColumn<fifthittableview,String> itro5=new TableColumn();
	private TableColumn<fifthittableview,String> itname5=new TableColumn(); 
	private TableColumn<fifthittableview,String> ites=new TableColumn(); 
	private TableColumn<fifthittableview,String> itcns=new TableColumn(); 
	private TableColumn<fifthittableview,String> itai=new TableColumn();  
	private TableColumn<fifthittableview,String> itdip=new TableColumn(); 
	private TableColumn<fifthittableview,String> itse=new TableColumn(); 
	
	private TableColumn<sixthittableview,String> itro6=new TableColumn();
	private TableColumn<sixthittableview,String> itname6=new TableColumn(); 
	private TableColumn<sixthittableview,String> itwmc=new TableColumn(); 
	private TableColumn<sixthittableview,String> itnpm=new TableColumn(); 
	private TableColumn<sixthittableview,String> itpm=new TableColumn();  
	private TableColumn<sixthittableview,String> ithss=new TableColumn(); 
	
	private TableColumn<firstmechtableview,String> mechro1=new TableColumn();
	private TableColumn<firstmechtableview,String> mechname1=new TableColumn(); 
	private TableColumn<firstmechtableview,String> mechmyan1=new TableColumn(); 
	private TableColumn<firstmechtableview,String> mecheng1=new TableColumn(); 
	private TableColumn<firstmechtableview,String> mechmath1=new TableColumn();  
	private TableColumn<firstmechtableview,String> mechchem=new TableColumn(); 
	private TableColumn<firstmechtableview,String> mechphy=new TableColumn(); 
	private TableColumn<firstmechtableview,String> mechdrawing1=new TableColumn(); 
	
	private TableColumn<secondmechtableview,String> mechro2=new TableColumn();
	private TableColumn<secondmechtableview,String> mechname2=new TableColumn(); 
	private TableColumn<secondmechtableview,String> mecheng2=new TableColumn(); 
	private TableColumn<secondmechtableview,String> mechmath2=new TableColumn(); 
	private TableColumn<secondmechtableview,String> mechmate=new TableColumn();  
	private TableColumn<secondmechtableview,String> mechaee=new TableColumn(); 
	private TableColumn<secondmechtableview,String> mechmechanics=new TableColumn(); 
	private TableColumn<secondmechtableview,String> mechwt=new TableColumn(); 
	private TableColumn<secondmechtableview,String> mechdrawing=new TableColumn(); 
	
	private TableColumn<thirdmechtableview,String> mechro3=new TableColumn();
	private TableColumn<thirdmechtableview,String> mechname3=new TableColumn(); 
	private TableColumn<thirdmechtableview,String> mecheng3=new TableColumn(); 
	private TableColumn<thirdmechtableview,String> mechmath3=new TableColumn(); 
	private TableColumn<thirdmechtableview,String> mechtm=new TableColumn();  
	private TableColumn<thirdmechtableview,String> mechsm=new TableColumn(); 
	private TableColumn<thirdmechtableview,String> mechem=new TableColumn(); 
	private TableColumn<thirdmechtableview,String> mechade=new TableColumn(); 
	private TableColumn<thirdmechtableview,String> mechpt=new TableColumn(); 
	private TableColumn<thirdmechtableview,String> mechet=new TableColumn(); 
	
	private TableColumn<fourthmechtableview,String> mechro4=new TableColumn();
	private TableColumn<fourthmechtableview,String> mechname4=new TableColumn(); 
	private TableColumn<fourthmechtableview,String> mecheng4=new TableColumn(); 
	private TableColumn<fourthmechtableview,String> mechmath4=new TableColumn(); 
	private TableColumn<fourthmechtableview,String> mechdme=new TableColumn();  
	private TableColumn<fourthmechtableview,String> mechmsa=new TableColumn(); 
	private TableColumn<fourthmechtableview,String> mechht=new TableColumn(); 
	private TableColumn<fourthmechtableview,String> mechsm1=new TableColumn(); 
	private TableColumn<fourthmechtableview,String> mechfm=new TableColumn();
	private TableColumn<fourthmechtableview,String> mechtm1=new TableColumn(); 
	
	private TableColumn<fifthmechtableview,String> mechro5=new TableColumn();
	private TableColumn<fifthmechtableview,String> mechname5=new TableColumn(); 
	private TableColumn<fifthmechtableview,String> mechem1=new TableColumn(); 
	private TableColumn<fifthmechtableview,String> mechice=new TableColumn();  
	private TableColumn<fifthmechtableview,String> mechrac=new TableColumn(); 
	private TableColumn<fifthmechtableview,String> mechvc=new TableColumn(); 
	private TableColumn<fifthmechtableview,String> mechfm1=new TableColumn(); 
	private TableColumn<fifthmechtableview,String> mechgtt=new TableColumn(); 
	
	private TableColumn<sixthmechtableview,String> mechro6=new TableColumn();
	private TableColumn<sixthmechtableview,String> mechname6=new TableColumn(); 
	private TableColumn<sixthmechtableview,String> mechmsa1=new TableColumn(); 
	private TableColumn<sixthmechtableview,String> mechre=new TableColumn(); 
	private TableColumn<sixthmechtableview,String> mechhss=new TableColumn();
	
	private TableColumn<firstittableview,String> ecro1=new TableColumn();
	private TableColumn<firstittableview,String> ecname1=new TableColumn(); 
	private TableColumn<firstittableview,String> ecmyan=new TableColumn(); 
	private TableColumn<firstittableview,String> eceng1=new TableColumn(); 
	private TableColumn<firstittableview,String> ecmath1=new TableColumn();  
	private TableColumn<firstittableview,String> ecchem=new TableColumn(); 
	private TableColumn<firstittableview,String> ecphy=new TableColumn(); 
	private TableColumn<firstittableview,String> ecdrawing=new TableColumn(); 
	private TableColumn<firstittableview,String> fec=new TableColumn(); 
	
	private TableColumn<secondectableview,String> ecro2=new TableColumn();
	private TableColumn<secondectableview,String> ecname2=new TableColumn(); 
	private TableColumn<secondectableview,String> eceng2=new TableColumn(); 
	private TableColumn<secondectableview,String> ecmath2=new TableColumn(); 
	private TableColumn<secondectableview,String> eccp=new TableColumn();  
	private TableColumn<secondectableview,String> eceec=new TableColumn(); 
	private TableColumn<secondectableview,String> ecde=new TableColumn(); 
	private TableColumn<secondectableview,String> ecmicro=new TableColumn(); 
	private TableColumn<secondectableview,String> ectp=new TableColumn(); 
	
	private TableColumn<thirdectableview,String> ecro3=new TableColumn();
	private TableColumn<thirdectableview,String> ecname3=new TableColumn(); 
	private TableColumn<thirdectableview,String> eceng3=new TableColumn(); 
	private TableColumn<thirdectableview,String> ecmath3=new TableColumn(); 
	private TableColumn<thirdectableview,String> ececa=new TableColumn();  
	private TableColumn<thirdectableview,String> ecdc=new TableColumn(); 
	private TableColumn<thirdectableview,String> ecee=new TableColumn(); 
	private TableColumn<thirdectableview,String> ecie=new TableColumn(); 
	private TableColumn<thirdectableview,String> ecmc=new TableColumn();
	
	private TableColumn<fourthectableview,String> ecro4=new TableColumn();
	private TableColumn<fourthectableview,String> ecname4=new TableColumn(); 
	private TableColumn<fourthectableview,String> eceng4=new TableColumn(); 
	private TableColumn<fourthectableview,String> ecmath4=new TableColumn(); 
	private TableColumn<fourthectableview,String> eccc=new TableColumn();  
	private TableColumn<fourthectableview,String> echdl=new TableColumn(); 
	private TableColumn<fourthectableview,String> ecmcs=new TableColumn(); 
	private TableColumn<fourthectableview,String> ecem=new TableColumn(); 
	private TableColumn<fourthectableview,String> eciec=new TableColumn();
	
	private TableColumn<fifthectableview,String> ecro5=new TableColumn();
	private TableColumn<fifthectableview,String> ecname5=new TableColumn(); 
	private TableColumn<fifthectableview,String> ecae=new TableColumn(); 
	private TableColumn<fifthectableview,String> ecplc=new TableColumn(); 
	private TableColumn<fifthectableview,String> ecdcs=new TableColumn();  
	private TableColumn<fifthectableview,String> ecdsp=new TableColumn(); 
	private TableColumn<fifthectableview,String> ecme=new TableColumn(); 
	private TableColumn<fifthectableview,String> ecmecs=new TableColumn(); 
	private TableColumn<fifthectableview,String> ecim=new TableColumn(); 
	
	private TableColumn<sixthectableview,String> ecro6=new TableColumn();
	private TableColumn<sixthectableview,String> ecname6=new TableColumn(); 
	private TableColumn<sixthectableview,String> ecacs=new TableColumn(); 
	private TableColumn<sixthectableview,String> eccs=new TableColumn(); 
	private TableColumn<sixthectableview,String> eccn=new TableColumn();  
	private TableColumn<sixthectableview,String> echss=new TableColumn(); 
	
	private TableColumn<thirdeptableview,String> epro3=new TableColumn();
	private TableColumn<thirdeptableview,String> epname3=new TableColumn(); 
	private TableColumn<thirdeptableview,String> epeng3=new TableColumn(); 
	private TableColumn<thirdeptableview,String> epmath3=new TableColumn(); 
	private TableColumn<thirdeptableview,String> epmes=new TableColumn();  
	private TableColumn<thirdeptableview,String> epeeca=new TableColumn(); 
	private TableColumn<thirdeptableview,String> eppe=new TableColumn(); 
	private TableColumn<thirdeptableview,String> epemo=new TableColumn(); 
	private TableColumn<thirdeptableview,String> epef=new TableColumn();
	private TableColumn<thirdeptableview,String> epemi=new TableColumn();
	
	private TableColumn<fourtheptableview,String> epro4=new TableColumn();
	private TableColumn<fourtheptableview,String> epname4=new TableColumn(); 
	private TableColumn<fourtheptableview,String> epeng4=new TableColumn(); 
	private TableColumn<fourtheptableview,String> epmath4=new TableColumn(); 
	private TableColumn<fourtheptableview,String> epcs=new TableColumn();  
	private TableColumn<fourtheptableview,String> epplc=new TableColumn(); 
	private TableColumn<fourtheptableview,String> epemd=new TableColumn(); 
	private TableColumn<fourtheptableview,String> epdlps=new TableColumn(); 
	private TableColumn<fourtheptableview,String> eppsa=new TableColumn();
	private TableColumn<fourtheptableview,String> eplcs=new TableColumn();
	
	private TableColumn<fiftheptableview,String> epro5=new TableColumn();
	private TableColumn<fiftheptableview,String> epname5=new TableColumn(); 
	private TableColumn<fiftheptableview,String> epmcs=new TableColumn(); 
	private TableColumn<fiftheptableview,String> epemc=new TableColumn(); 
	private TableColumn<fiftheptableview,String> eppsp=new TableColumn();  
	private TableColumn<fiftheptableview,String> epeops=new TableColumn(); 
	private TableColumn<fiftheptableview,String> epeec=new TableColumn(); 
	
	private TableColumn<sixtheptableview,String> epro6=new TableColumn();
	private TableColumn<sixtheptableview,String> epname6=new TableColumn();   
	private TableColumn<sixtheptableview,String> ephss=new TableColumn(); 
	
	
	
	private TableColumn<thirdciviltableview, String> rno2 = new TableColumn();
	private TableColumn<thirdciviltableview, String> Name2 = new TableColumn();
	private TableColumn<thirdciviltableview, String> eng2 = new TableColumn();
	private TableColumn<thirdciviltableview, String> math2 = new TableColumn();
	private TableColumn<thirdciviltableview, String> surveying2 = new TableColumn();
	private TableColumn<thirdciviltableview, String> materials2 = new TableColumn();
	private TableColumn<thirdciviltableview, String> fluid = new TableColumn();
	private TableColumn<thirdciviltableview, String> transportation = new TableColumn();
	private TableColumn<thirdciviltableview, String> geotechnical = new TableColumn();
	private TableColumn<thirdciviltableview, String> geology = new TableColumn();
	
	private TableColumn<fourthciviltableview, String> rno3 = new TableColumn();
	private TableColumn<fourthciviltableview, String> Name3 = new TableColumn();
	private TableColumn<fourthciviltableview, String> eng3 = new TableColumn();
	private TableColumn<fourthciviltableview, String> math3 = new TableColumn();
	private TableColumn<fourthciviltableview, String> theoryofstru = new TableColumn();
	private TableColumn<fourthciviltableview, String> design = new TableColumn();
	private TableColumn<fourthciviltableview, String> foundation = new TableColumn();
	private TableColumn<fourthciviltableview, String> hydraulic = new TableColumn();
	private TableColumn<fourthciviltableview, String> transportation2 = new TableColumn();
	
	private TableColumn<fifthciviltableview, String> rno4 = new TableColumn();
	private TableColumn<fifthciviltableview, String> Name4 = new TableColumn();
	private TableColumn<fifthciviltableview, String> theoryofstru2 = new TableColumn();
	private TableColumn<fifthciviltableview, String> design2 = new TableColumn();
	private TableColumn<fifthciviltableview, String> construction2 = new TableColumn();
	private TableColumn<fifthciviltableview, String> hydraulic2 = new TableColumn();
	private TableColumn<fifthciviltableview, String> designofsteel = new TableColumn();
	private TableColumn<fifthciviltableview, String> environmental = new TableColumn();
	private TableColumn<fifthciviltableview, String> estamating = new TableColumn();
	
	private TableColumn<sixthciviltableview, String> rno5 = new TableColumn();
	private TableColumn<sixthciviltableview, String> Name5 = new TableColumn();
	private TableColumn<sixthciviltableview, String> humanities = new TableColumn();
	private TableColumn<sixthciviltableview, String> computerapp = new TableColumn();
	private TableColumn<sixthciviltableview, String> environmental2 = new TableColumn();
	private TableColumn<sixthciviltableview, String> integrateddesign = new TableColumn();
	
	
	private TableColumn<firsteptableview,String> rno6=new TableColumn();
	private TableColumn<firsteptableview,String> Name6=new TableColumn(); 
	private TableColumn<firsteptableview,String> myan2=new TableColumn(); 
	private TableColumn<firsteptableview,String> eng4=new TableColumn(); 
	private TableColumn<firsteptableview,String> math4=new TableColumn();  
	private TableColumn<firsteptableview,String> chem2=new TableColumn(); 
	private TableColumn<firsteptableview,String> phy2=new TableColumn(); 
	private TableColumn<firsteptableview,String> drawing2=new TableColumn(); 
		private TableColumn<firsteptableview,String> principle = new TableColumn();
		
		private TableColumn<secondeptableview,String> rno7=new TableColumn();
		private TableColumn<secondeptableview,String> Name7=new TableColumn(); 
		private TableColumn<secondeptableview,String> eng7=new TableColumn(); 
		private TableColumn<secondeptableview,String> math7=new TableColumn();  
		private TableColumn<secondeptableview,String> ec7=new TableColumn(); 
		private TableColumn<secondeptableview,String> be7=new TableColumn(); 
		private TableColumn<secondeptableview,String> electro=new TableColumn();
		private TableColumn<secondeptableview,String> g7=new TableColumn(); 
		private TableColumn<secondeptableview,String> em7 = new TableColumn();
	



	 @FXML
	    private TextField tfUsername;
	    
	    @FXML
	    private PasswordField pfPassword;
	    
	   
	     Scene scene;
	     ConnectionUtil con;
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    Statement st=null;
	    ResultSet resultSet = null; 
	    
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public void firstCivil(ActionEvent e) throws Exception {
		
		artistTable = new TableView();
		
		connection=con.connectdb();
		data = FXCollections.observableArrayList();
		resultSet = connection.createStatement().executeQuery("SELECT * FROM 1civil");
		for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
			final int j = i;
			TableColumn Name = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
			Name.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                    return new SimpleStringProperty(param.getValue().get(j).toString());                        
                }                    
			});
			artistTable.getColumns().addAll(Name); 
          /*   System.out.println("Column ["+i+"] ");*/
		}
		TableColumn<firstciviltableview, Void> colBtn = new TableColumn("Button Column");
		Callback<TableColumn<firstciviltableview, Void>, TableCell<firstciviltableview, Void>> cellFactory = new Callback<TableColumn<firstciviltableview, Void>, TableCell<firstciviltableview,Void>>() {
			@Override
			public TableCell<firstciviltableview, Void> call(final TableColumn<firstciviltableview, Void> param) {
				final TableCell<firstciviltableview, Void> cell = new TableCell<firstciviltableview, Void>() {
					
					private final Button btn = new Button("Confirm");
					{
						btn.setOnAction((ActionEvent e)->{
							data = (ObservableList) getTableView().getItems().get(getIndex());
							System.out.println("selectedData" + data);
							markforcivil1 mk=new markforcivil1(data);
						});
					}
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn);
						}
					}
				};
				return cell;
			}
		};
		colBtn.setCellFactory(cellFactory);
		artistTable.getColumns().add(colBtn);
		
		TableColumn<firstciviltableview, Void> colBtn1 = new TableColumn("Button Column");
		Callback<TableColumn<firstciviltableview, Void>, TableCell<firstciviltableview, Void>> cellFactory1 = new Callback<TableColumn<firstciviltableview, Void>, TableCell<firstciviltableview,Void>>() {
			@Override
			public TableCell<firstciviltableview, Void> call(final TableColumn<firstciviltableview, Void> param) {
				final TableCell<firstciviltableview, Void> cell = new TableCell<firstciviltableview, Void>() {
					
					private final Button btn1 = new Button("Back");
					{
						btn1.setOnAction((ActionEvent e)->{
							AnchorPane ec=null;
							try{
								ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Civil.fxml"));
								
							}catch(IOException e1){
								e1.printStackTrace();
							}
							Scene scene1=new Scene(ec);
							stage.setScene(scene1);
							
							stage.show();
						});
					}
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn1);
						}
					}
				};
				return cell;
			}
		};
		colBtn1.setCellFactory(cellFactory1);
		artistTable.getColumns().add(colBtn1);
		while(resultSet.next()){
            //Iterate Row
            ObservableList<String> row = FXCollections.observableArrayList();
            for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
                //Iterate Column
                row.add(resultSet.getString(i));
            }
            System.out.println("Row [1] added "+row );
            data.add(row);

        }

        //FINALLY ADDED TO TableView
		artistTable.setItems(data);
		System.out.println("Tableview testing...."+ artistTable.getItems());
		
		stage = (Stage)  firstCivilbtn.getScene().getWindow();
		Scene scene = new Scene(artistTable);
		stage.setScene(scene);
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				// TODO Auto-generated method stub
				Platform.exit();
				System.exit(0);
			}
			
		});
		
     }
	
	//secondyearcivil
	
public void secondCivil(ActionEvent e) throws Exception {
		
	secciviltable = new TableView();
		
		connection=con.connectdb();
		data = FXCollections.observableArrayList();
		resultSet = connection.createStatement().executeQuery("SELECT * FROM 2civil");
		for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
			final int j = i;
			TableColumn Name1 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
			Name1.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                    return new SimpleStringProperty(param.getValue().get(j).toString());                        
                }                    
			});
			secciviltable.getColumns().addAll(Name1); 
             System.out.println("Column ["+i+"] ");
		}
		TableColumn<secondciviltableview, Void> colBtn = new TableColumn("Button Column");
		Callback<TableColumn<secondciviltableview, Void>, TableCell<secondciviltableview, Void>> cellFactory = new Callback<TableColumn<secondciviltableview, Void>, TableCell<secondciviltableview,Void>>() {
			@Override
			public TableCell<secondciviltableview, Void> call(final TableColumn<secondciviltableview, Void> param) {
				final TableCell<secondciviltableview, Void> cell = new TableCell<secondciviltableview, Void>() {
					
					private final Button btn = new Button("Confirm");
					{
						btn.setOnAction((ActionEvent e)->{
							data = (ObservableList) getTableView().getItems().get(getIndex());
							System.out.println("selectedData" + data);
							markforcivil2 mk=new markforcivil2(data);
						});
					}
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn);
						}
					}
				};
				return cell;
			}
		};
		colBtn.setCellFactory(cellFactory);
		secciviltable.getColumns().add(colBtn);
		
		TableColumn<secondciviltableview, Void> colBtn1 = new TableColumn("Button Column");
		Callback<TableColumn<secondciviltableview, Void>, TableCell<secondciviltableview, Void>> cellFactory1 = new Callback<TableColumn<secondciviltableview, Void>, TableCell<secondciviltableview,Void>>() {
			@Override
			public TableCell<secondciviltableview, Void> call(final TableColumn<secondciviltableview, Void> param) {
				final TableCell<secondciviltableview, Void> cell = new TableCell<secondciviltableview, Void>() {
					
					private final Button btn1 = new Button("Back");
					{
						btn1.setOnAction((ActionEvent e)->{
							AnchorPane ec=null;
							try{
								ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Civil.fxml"));
								
							}catch(IOException e1){
								e1.printStackTrace();
							}
							Scene scene1=new Scene(ec);
							stage.setScene(scene1);
							
							stage.show();
						});
					}
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn1);
						}
					}
				};
				return cell;
			}
		};
		colBtn1.setCellFactory(cellFactory1);
		secciviltable.getColumns().add(colBtn1);
		
		while(resultSet.next()){
            //Iterate Row
            ObservableList<String> row = FXCollections.observableArrayList();
            for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
                //Iterate Column
                row.add(resultSet.getString(i));
            }
            System.out.println("Row [1] added "+row );
            data.add(row);

        }

        //FINALLY ADDED TO TableView
		secciviltable.setItems(data);
		System.out.println("Tableview testing...."+ secciviltable.getItems());
		
		stage = (Stage)  secondCivilbtn.getScene().getWindow();
		Scene scene = new Scene(secciviltable);
		stage.setScene(scene);
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				// TODO Auto-generated method stub
				Platform.exit();
				System.exit(0);
			}
			
		});
		
     }

		

	   
	

@FXML
public void openLogin(ActionEvent e) throws IOException, SQLException{
	//stage= (Stage) loginbyn.getScene().getWindow();
	String username = tfUsername.getText().toString();
    String password = pfPassword.getText().toString();
    tfUsername.setText(null);
    pfPassword.setText(null);
    connection=con.connectdb();
    String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
    
    try{
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        resultSet = preparedStatement.executeQuery();
        if(!resultSet.next()){
            infoBox("Please enter correct Email and Password", null, "Failed");
        }else{
            infoBox("Login Successfull",null,"Success" );
           // Alert alert = new Alert(AlertType.CONFIRMATION);
            Node node = (Node)e.getSource();
            stage = (Stage) node.getScene().getWindow();
            stage.close();
            AnchorPane root= FXMLLoader.load(getClass().getClassLoader().getResource("application/major.fxml"));
            Scene scene=new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            stage.setScene(scene);
            stage.show(); 
          
           
        }
     
    }
    catch(Exception e1){
        e1.printStackTrace();
    }
    
    preparedStatement.close();
    connection.close();
}
@FXML
public void back(ActionEvent eb)throws IOException{
	
	eb.consume();
    System.out.println("Hello, World!");
    stage = (Stage) ibutton.getScene().getWindow();
	   stage = (Stage) cbutton.getScene().getWindow();
	    stage = (Stage) epbutton.getScene().getWindow();
	    stage = (Stage) ecbutton.getScene().getWindow();
	    stage = (Stage) mbutton.getScene().getWindow();
    
    AnchorPane bk = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/major.fxml"));
    Scene scene1 = new Scene(bk);
    stage.setScene(scene1);
   
    
    stage.show();
	

}
@FXML
public void openCivil(ActionEvent e2)throws IOException{
	
	e2.consume();
    System.out.println("Hello, World!");
    stage = (Stage) ibutton.getScene().getWindow();
	   stage = (Stage) cbutton.getScene().getWindow();
	    stage = (Stage) epbutton.getScene().getWindow();
	    stage = (Stage) ecbutton.getScene().getWindow();
	    stage = (Stage) mbutton.getScene().getWindow();
    
    AnchorPane ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Civil.fxml"));
    Scene scene1 = new Scene(ec);
    stage.setScene(scene1);
   
    
    stage.show();
	

}

@FXML
public void openEP(ActionEvent e4)throws IOException{
	e4.consume();
    System.out.println("mmt");
    stage = (Stage) ibutton.getScene().getWindow();
	   stage = (Stage) cbutton.getScene().getWindow();
	    stage = (Stage) epbutton.getScene().getWindow();
	    stage = (Stage) ecbutton.getScene().getWindow();
	    stage = (Stage) mbutton.getScene().getWindow();
    AnchorPane ep = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Ep.fxml"));
    Scene scene1 = new Scene(ep);
    stage.setScene(scene1);
   
    
    stage.show();
	
}
@FXML
public void openEC(ActionEvent e5)throws IOException{
	e5.consume();
	stage = (Stage) ibutton.getScene().getWindow();
	   stage = (Stage) cbutton.getScene().getWindow();
	    stage = (Stage) epbutton.getScene().getWindow();
	    stage = (Stage) ecbutton.getScene().getWindow();
	    stage = (Stage) mbutton.getScene().getWindow();
    
    
    
    
    AnchorPane ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/EC.fxml"));
    Scene scene1 = new Scene(ec);
    stage.setScene(scene1);
   
    
    stage.show();
}
@FXML
public void openMech(ActionEvent e6)throws IOException{
	e6.consume();
	stage = (Stage) ibutton.getScene().getWindow();
	   stage = (Stage) cbutton.getScene().getWindow();
	    stage = (Stage) epbutton.getScene().getWindow();
	    stage = (Stage) ecbutton.getScene().getWindow();
	    stage = (Stage) mbutton.getScene().getWindow();
	    AnchorPane mech = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Mech.fxml"));
	    Scene scene1 = new Scene(mech);
	    stage.setScene(scene1);
	   
	    
	    stage.show();
}
@FXML
public void openIT(ActionEvent e7)throws IOException{
	e7.consume();
	
	   stage = (Stage) ibutton.getScene().getWindow();
	   stage = (Stage) cbutton.getScene().getWindow();
	    stage = (Stage) epbutton.getScene().getWindow();
	    stage = (Stage) ecbutton.getScene().getWindow();
	    stage = (Stage) mbutton.getScene().getWindow();
	    AnchorPane it = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/IT.fxml"));
	    Scene scene1 = new Scene(it);
	    stage.setScene(scene1);
	   
	    
	    stage.show();
}


public void infoBox(String infoMessage, String headerText, String title) throws IOException{
   // ButtonType cancleButton = new ButtonType("Cancle",ButtonData.CANCEL_CLOSE);
	
	Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setContentText(infoMessage);
    alert.setTitle(title);
    alert.setHeaderText(headerText);
    Optional<ButtonType> result = alert.showAndWait();
    if(result.get()==ButtonType.OK) {
        
         
             }
         else {
         	AnchorPane root=FXMLLoader.load(getClass().getClassLoader().getResource("application/MainFrame.fxml"));
             Scene scene=new Scene(root);
             scene.getStylesheets().add(getClass().getResource("application/style.css").toExternalForm());
             stage.setScene(scene);
             stage.show();
         }
   
}

//firstyeatit


public void firstit(ActionEvent e) throws Exception {
	
	firstittable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 1it");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn itname1 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		itname1.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		firstittable.getColumns().addAll(itname1); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<firstittableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<firstittableview, Void>, TableCell<firstittableview, Void>> cellFactory = new Callback<TableColumn<firstittableview, Void>, TableCell<firstittableview,Void>>() {
		@Override
		public TableCell<firstittableview, Void> call(final TableColumn<firstittableview, Void> param) {
			final TableCell<firstittableview, Void> cell = new TableCell<firstittableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforit1 mk=new markforit1(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	firstittable.getColumns().add(colBtn);
	
	TableColumn<firstittableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<firstittableview, Void>, TableCell<firstittableview, Void>> cellFactory1 = new Callback<TableColumn<firstittableview, Void>, TableCell<firstittableview,Void>>() {
		@Override
		public TableCell<firstittableview, Void> call(final TableColumn<firstittableview, Void> param) {
			final TableCell<firstittableview, Void> cell = new TableCell<firstittableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/IT.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	firstittable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	firstittable.setItems(data);
	System.out.println("Tableview testing...."+ firstittable.getItems());
	
	stage = (Stage)  firstitbtn.getScene().getWindow();
	Scene scene = new Scene(firstittable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }
	 
public void secondit(ActionEvent e) throws Exception {
	
	secondittable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 2it");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn itname2 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		itname2.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		secondittable.getColumns().addAll(itname2); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<secondittableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<secondittableview, Void>, TableCell<secondittableview, Void>> cellFactory = new Callback<TableColumn<secondittableview, Void>, TableCell<secondittableview,Void>>() {
		@Override
		public TableCell<secondittableview, Void> call(final TableColumn<secondittableview, Void> param) {
			final TableCell<secondittableview, Void> cell = new TableCell<secondittableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforit2 mk=new markforit2(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	secondittable.getColumns().add(colBtn);
	
	TableColumn<secondittableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<secondittableview, Void>, TableCell<secondittableview, Void>> cellFactory1 = new Callback<TableColumn<secondittableview, Void>, TableCell<secondittableview,Void>>() {
		@Override
		public TableCell<secondittableview, Void> call(final TableColumn<secondittableview, Void> param) {
			final TableCell<secondittableview, Void> cell = new TableCell<secondittableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/IT.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	secondittable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	secondittable.setItems(data);
	System.out.println("Tableview testing...."+ secondittable.getItems());
	
	stage = (Stage)  seconditbtn.getScene().getWindow();
	Scene scene = new Scene(secondittable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }
//thirdittable

public void thirdit(ActionEvent e) throws Exception {
	
	thirdittable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 3it");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn itname3 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		itname3.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		thirdittable.getColumns().addAll(itname3); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<thirdittableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<thirdittableview, Void>, TableCell<thirdittableview, Void>> cellFactory = new Callback<TableColumn<thirdittableview, Void>, TableCell<thirdittableview,Void>>() {
		@Override
		public TableCell<thirdittableview, Void> call(final TableColumn<thirdittableview, Void> param) {
			final TableCell<thirdittableview, Void> cell = new TableCell<thirdittableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforit3 mk=new markforit3(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	thirdittable.getColumns().add(colBtn);
	
	TableColumn<thirdittableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<thirdittableview, Void>, TableCell<thirdittableview, Void>> cellFactory1 = new Callback<TableColumn<thirdittableview, Void>, TableCell<thirdittableview,Void>>() {
		@Override
		public TableCell<thirdittableview, Void> call(final TableColumn<thirdittableview, Void> param) {
			final TableCell<thirdittableview, Void> cell = new TableCell<thirdittableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/IT.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	thirdittable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	thirdittable.setItems(data);
	System.out.println("Tableview testing...."+ thirdittable.getItems());
	
	stage = (Stage)  thirditbtn.getScene().getWindow();
	Scene scene = new Scene(thirdittable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }
//fourthittable

public void fourthit(ActionEvent e) throws Exception {
	
	fourthittable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 4it");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn itname4 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		itname4.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fourthittable.getColumns().addAll(itname4); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fourthittableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fourthittableview, Void>, TableCell<fourthittableview, Void>> cellFactory = new Callback<TableColumn<fourthittableview, Void>, TableCell<fourthittableview,Void>>() {
		@Override
		public TableCell<fourthittableview, Void> call(final TableColumn<fourthittableview, Void> param) {
			final TableCell<fourthittableview, Void> cell = new TableCell<fourthittableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforit4 mk=new markforit4(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fourthittable.getColumns().add(colBtn);
	
	TableColumn<fourthittableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fourthittableview, Void>, TableCell<fourthittableview, Void>> cellFactory1 = new Callback<TableColumn<fourthittableview, Void>, TableCell<fourthittableview,Void>>() {
		@Override
		public TableCell<fourthittableview, Void> call(final TableColumn<fourthittableview, Void> param) {
			final TableCell<fourthittableview, Void> cell = new TableCell<fourthittableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/IT.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fourthittable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	fourthittable.setItems(data);
	System.out.println("Tableview testing...."+ fourthittable.getItems());
	
	stage = (Stage)  fourthitbtn.getScene().getWindow();
	Scene scene = new Scene(fourthittable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//fifthittable
public void fifthit(ActionEvent e) throws Exception {
	
	fifthittable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 5it");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn itname5 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		itname5.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fifthittable.getColumns().addAll(itname5); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fifthittableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fifthittableview, Void>, TableCell<fifthittableview, Void>> cellFactory = new Callback<TableColumn<fifthittableview, Void>, TableCell<fifthittableview,Void>>() {
		@Override
		public TableCell<fifthittableview, Void> call(final TableColumn<fifthittableview, Void> param) {
			final TableCell<fifthittableview, Void> cell = new TableCell<fifthittableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforit5 mk=new markforit5(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fifthittable.getColumns().add(colBtn);
	
	TableColumn<fifthittableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fifthittableview, Void>, TableCell<fifthittableview, Void>> cellFactory1 = new Callback<TableColumn<fifthittableview, Void>, TableCell<fifthittableview,Void>>() {
		@Override
		public TableCell<fifthittableview, Void> call(final TableColumn<fifthittableview, Void> param) {
			final TableCell<fifthittableview, Void> cell = new TableCell<fifthittableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/IT.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fifthittable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	fifthittable.setItems(data);
	System.out.println("Tableview testing...."+ fifthittable.getItems());
	
	stage = (Stage)  fifthitbtn.getScene().getWindow();
	Scene scene = new Scene(fifthittable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//sixthittable

public void sixthit(ActionEvent e) throws Exception {
	
	sixthittable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 6it");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn itname6 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		itname6.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		sixthittable.getColumns().addAll(itname6); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<sixthittableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<sixthittableview, Void>, TableCell<sixthittableview, Void>> cellFactory = new Callback<TableColumn<sixthittableview, Void>, TableCell<sixthittableview,Void>>() {
		@Override
		public TableCell<sixthittableview, Void> call(final TableColumn<sixthittableview, Void> param) {
			final TableCell<sixthittableview, Void> cell = new TableCell<sixthittableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforit6 mk=new markforit6(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	sixthittable.getColumns().add(colBtn);
	
	TableColumn<sixthittableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<sixthittableview, Void>, TableCell<sixthittableview, Void>> cellFactory1 = new Callback<TableColumn<sixthittableview, Void>, TableCell<sixthittableview,Void>>() {
		@Override
		public TableCell<sixthittableview, Void> call(final TableColumn<sixthittableview, Void> param) {
			final TableCell<sixthittableview, Void> cell = new TableCell<sixthittableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/IT.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	sixthittable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	sixthittable.setItems(data);
	System.out.println("Tableview testing...."+ sixthittable.getItems());
	
	stage = (Stage)  sixthitbtn.getScene().getWindow();
	Scene scene = new Scene(sixthittable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//firstmechtable

public void firstmech(ActionEvent e) throws Exception {
	
	firstmechtable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 1mech");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn mechname1 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		mechname1.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		firstmechtable.getColumns().addAll(mechname1); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<firstmechtableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<firstmechtableview, Void>, TableCell<firstmechtableview, Void>> cellFactory = new Callback<TableColumn<firstmechtableview, Void>, TableCell<firstmechtableview,Void>>() {
		@Override
		public TableCell<firstmechtableview, Void> call(final TableColumn<firstmechtableview, Void> param) {
			final TableCell<firstmechtableview, Void> cell = new TableCell<firstmechtableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markformech1 mk=new markformech1(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	firstmechtable.getColumns().add(colBtn);
	
	TableColumn<firstmechtableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<firstmechtableview, Void>, TableCell<firstmechtableview, Void>> cellFactory1 = new Callback<TableColumn<firstmechtableview, Void>, TableCell<firstmechtableview,Void>>() {
		@Override
		public TableCell<firstmechtableview, Void> call(final TableColumn<firstmechtableview, Void> param) {
			final TableCell<firstmechtableview, Void> cell = new TableCell<firstmechtableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Mech.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	firstmechtable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	firstmechtable.setItems(data);
	System.out.println("Tableview testing...."+ firstmechtable.getItems());
	
	stage = (Stage)  firstmechbtn.getScene().getWindow();
	Scene scene = new Scene(firstmechtable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//secondmechtable
public void secondmech(ActionEvent e) throws Exception {
	
	secondmechtable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 2mech");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn mechname2 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		mechname2.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		secondmechtable.getColumns().addAll(mechname2); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<secondmechtableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<secondmechtableview, Void>, TableCell<secondmechtableview, Void>> cellFactory = new Callback<TableColumn<secondmechtableview, Void>, TableCell<secondmechtableview,Void>>() {
		@Override
		public TableCell<secondmechtableview, Void> call(final TableColumn<secondmechtableview, Void> param) {
			final TableCell<secondmechtableview, Void> cell = new TableCell<secondmechtableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markformech2 mk=new markformech2(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	secondmechtable.getColumns().add(colBtn);
	
	TableColumn<secondmechtableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<secondmechtableview, Void>, TableCell<secondmechtableview, Void>> cellFactory1 = new Callback<TableColumn<secondmechtableview, Void>, TableCell<secondmechtableview,Void>>() {
		@Override
		public TableCell<secondmechtableview, Void> call(final TableColumn<secondmechtableview, Void> param) {
			final TableCell<secondmechtableview, Void> cell = new TableCell<secondmechtableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Mech.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	secondmechtable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	secondmechtable.setItems(data);
	System.out.println("Tableview testing...."+ secondmechtable.getItems());
	
	stage = (Stage)  secondmechbtn.getScene().getWindow();
	Scene scene = new Scene(secondmechtable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//thirdmechtable
public void thirdmech(ActionEvent e) throws Exception {
	
	thirdmechtable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 3mech");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn mechname3 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		mechname3.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		thirdmechtable.getColumns().addAll(mechname3); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<thirdmechtableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<thirdmechtableview, Void>, TableCell<thirdmechtableview, Void>> cellFactory = new Callback<TableColumn<thirdmechtableview, Void>, TableCell<thirdmechtableview,Void>>() {
		@Override
		public TableCell<thirdmechtableview, Void> call(final TableColumn<thirdmechtableview, Void> param) {
			final TableCell<thirdmechtableview, Void> cell = new TableCell<thirdmechtableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markformech3 mk=new markformech3(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	thirdmechtable.getColumns().add(colBtn);
	
	TableColumn<thirdmechtableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<thirdmechtableview, Void>, TableCell<thirdmechtableview, Void>> cellFactory1 = new Callback<TableColumn<thirdmechtableview, Void>, TableCell<thirdmechtableview,Void>>() {
		@Override
		public TableCell<thirdmechtableview, Void> call(final TableColumn<thirdmechtableview, Void> param) {
			final TableCell<thirdmechtableview, Void> cell = new TableCell<thirdmechtableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Mech.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	thirdmechtable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	thirdmechtable.setItems(data);
	System.out.println("Tableview testing...."+ thirdmechtable.getItems());
	
	stage = (Stage)  thirdmechbtn.getScene().getWindow();
	Scene scene = new Scene(thirdmechtable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }


//fourthmechtable
public void fourthmech(ActionEvent e) throws Exception {
	
	fourthmechtable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 4mech");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn mechname3 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		mechname3.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fourthmechtable.getColumns().addAll(mechname3); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fourthmechtableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fourthmechtableview, Void>, TableCell<fourthmechtableview, Void>> cellFactory = new Callback<TableColumn<fourthmechtableview, Void>, TableCell<fourthmechtableview,Void>>() {
		@Override
		public TableCell<fourthmechtableview, Void> call(final TableColumn<fourthmechtableview, Void> param) {
			final TableCell<fourthmechtableview, Void> cell = new TableCell<fourthmechtableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markformech4 mk=new markformech4(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fourthmechtable.getColumns().add(colBtn);
	
	TableColumn<fourthmechtableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fourthmechtableview, Void>, TableCell<fourthmechtableview, Void>> cellFactory1 = new Callback<TableColumn<fourthmechtableview, Void>, TableCell<fourthmechtableview,Void>>() {
		@Override
		public TableCell<fourthmechtableview, Void> call(final TableColumn<fourthmechtableview, Void> param) {
			final TableCell<fourthmechtableview, Void> cell = new TableCell<fourthmechtableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Mech.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fourthmechtable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	fourthmechtable.setItems(data);
	System.out.println("Tableview testing...."+ fourthmechtable.getItems());
	
	stage = (Stage)  fourthmechbtn.getScene().getWindow();
	Scene scene = new Scene(fourthmechtable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }


//fifthmechtable
public void fifthmech(ActionEvent e) throws Exception {
	
	fifthmechtable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 5mech");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn mechname5 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		mechname5.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fifthmechtable.getColumns().addAll(mechname5); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fifthmechtableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fifthmechtableview, Void>, TableCell<fifthmechtableview, Void>> cellFactory = new Callback<TableColumn<fifthmechtableview, Void>, TableCell<fifthmechtableview,Void>>() {
		@Override
		public TableCell<fifthmechtableview, Void> call(final TableColumn<fifthmechtableview, Void> param) {
			final TableCell<fifthmechtableview, Void> cell = new TableCell<fifthmechtableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markformech5 mk=new markformech5(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fifthmechtable.getColumns().add(colBtn);
	
	TableColumn<fifthmechtableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fifthmechtableview, Void>, TableCell<fifthmechtableview, Void>> cellFactory1 = new Callback<TableColumn<fifthmechtableview, Void>, TableCell<fifthmechtableview,Void>>() {
		@Override
		public TableCell<fifthmechtableview, Void> call(final TableColumn<fifthmechtableview, Void> param) {
			final TableCell<fifthmechtableview, Void> cell = new TableCell<fifthmechtableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Mech.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fifthmechtable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	fifthmechtable.setItems(data);
	System.out.println("Tableview testing...."+ fifthmechtable.getItems());
	
	stage = (Stage)  fifthmechbtn.getScene().getWindow();
	Scene scene = new Scene(fifthmechtable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }


//sixthmechtable
public void sixthmech(ActionEvent e) throws Exception {
	
	sixthmechtable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 6mech");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn mechname6 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		mechname6.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		sixthmechtable.getColumns().addAll(mechname6); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<sixthmechtableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<sixthmechtableview, Void>, TableCell<sixthmechtableview, Void>> cellFactory = new Callback<TableColumn<sixthmechtableview, Void>, TableCell<sixthmechtableview,Void>>() {
		@Override
		public TableCell<sixthmechtableview, Void> call(final TableColumn<sixthmechtableview, Void> param) {
			final TableCell<sixthmechtableview, Void> cell = new TableCell<sixthmechtableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markformech6 mk=new markformech6(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	sixthmechtable.getColumns().add(colBtn);
	
	TableColumn<sixthmechtableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<sixthmechtableview, Void>, TableCell<sixthmechtableview, Void>> cellFactory1 = new Callback<TableColumn<sixthmechtableview, Void>, TableCell<sixthmechtableview,Void>>() {
		@Override
		public TableCell<sixthmechtableview, Void> call(final TableColumn<sixthmechtableview, Void> param) {
			final TableCell<sixthmechtableview, Void> cell = new TableCell<sixthmechtableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Mech.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	sixthmechtable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	sixthmechtable.setItems(data);
	System.out.println("Tableview testing...."+ sixthmechtable.getItems());
	
	stage = (Stage)  sixthmechbtn.getScene().getWindow();
	Scene scene = new Scene(sixthmechtable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//firstectable

public void firstec(ActionEvent e) throws Exception {
	
	firstectable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 1ec");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn ecname1 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		ecname1.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		firstectable.getColumns().addAll(ecname1); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<firstectableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<firstectableview, Void>, TableCell<firstectableview, Void>> cellFactory = new Callback<TableColumn<firstectableview, Void>, TableCell<firstectableview,Void>>() {
		@Override
		public TableCell<firstectableview, Void> call(final TableColumn<firstectableview, Void> param) {
			final TableCell<firstectableview, Void> cell = new TableCell<firstectableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforec1 mk=new markforec1(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	firstectable.getColumns().add(colBtn);
	
	TableColumn<firstectableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<firstectableview, Void>, TableCell<firstectableview, Void>> cellFactory1 = new Callback<TableColumn<firstectableview, Void>, TableCell<firstectableview,Void>>() {
		@Override
		public TableCell<firstectableview, Void> call(final TableColumn<firstectableview, Void> param) {
			final TableCell<firstectableview, Void> cell = new TableCell<firstectableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/EC.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	firstectable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	firstectable.setItems(data);
	System.out.println("Tableview testing...."+ firstectable.getItems());
	
	stage = (Stage)  firstecbtn.getScene().getWindow();
	Scene scene = new Scene(firstectable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//secondectable

public void secondec(ActionEvent e) throws Exception {
	
	secondectable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 2ec");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn ecname2 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		ecname2.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		secondectable.getColumns().addAll(ecname2); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<secondectableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<secondectableview, Void>, TableCell<secondectableview, Void>> cellFactory = new Callback<TableColumn<secondectableview, Void>, TableCell<secondectableview,Void>>() {
		@Override
		public TableCell<secondectableview, Void> call(final TableColumn<secondectableview, Void> param) {
			final TableCell<secondectableview, Void> cell = new TableCell<secondectableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforec2 mk=new markforec2(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	secondectable.getColumns().add(colBtn);
	
	TableColumn<secondectableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<secondectableview, Void>, TableCell<secondectableview, Void>> cellFactory1 = new Callback<TableColumn<secondectableview, Void>, TableCell<secondectableview,Void>>() {
		@Override
		public TableCell<secondectableview, Void> call(final TableColumn<secondectableview, Void> param) {
			final TableCell<secondectableview, Void> cell = new TableCell<secondectableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/EC.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	secondectable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	secondectable.setItems(data);
	System.out.println("Tableview testing...."+ secondectable.getItems());
	
	stage = (Stage)  secondecbtn.getScene().getWindow();
	Scene scene = new Scene(secondectable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }


//thirdectable

public void thirdec(ActionEvent e) throws Exception {
	
	thirdectable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 3ec");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn ecname3 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		ecname3.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		thirdectable.getColumns().addAll(ecname3); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<thirdectableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<thirdectableview, Void>, TableCell<thirdectableview, Void>> cellFactory = new Callback<TableColumn<thirdectableview, Void>, TableCell<thirdectableview,Void>>() {
		@Override
		public TableCell<thirdectableview, Void> call(final TableColumn<thirdectableview, Void> param) {
			final TableCell<thirdectableview, Void> cell = new TableCell<thirdectableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforec3 mk=new markforec3(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	thirdectable.getColumns().add(colBtn);
	
	TableColumn<thirdectableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<thirdectableview, Void>, TableCell<thirdectableview, Void>> cellFactory1 = new Callback<TableColumn<thirdectableview, Void>, TableCell<thirdectableview,Void>>() {
		@Override
		public TableCell<thirdectableview, Void> call(final TableColumn<thirdectableview, Void> param) {
			final TableCell<thirdectableview, Void> cell = new TableCell<thirdectableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/EC.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	thirdectable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	thirdectable.setItems(data);
	System.out.println("Tableview testing...."+ thirdectable.getItems());
	
	stage = (Stage)  thirdecbtn.getScene().getWindow();
	Scene scene = new Scene(thirdectable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }


//fourthectable

public void fourthec(ActionEvent e) throws Exception {
	
	fourthectable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 4ec");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn ecname4 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		ecname4.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fourthectable.getColumns().addAll(ecname4); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fourthectableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fourthectableview, Void>, TableCell<fourthectableview, Void>> cellFactory = new Callback<TableColumn<fourthectableview, Void>, TableCell<fourthectableview,Void>>() {
		@Override
		public TableCell<fourthectableview, Void> call(final TableColumn<fourthectableview, Void> param) {
			final TableCell<fourthectableview, Void> cell = new TableCell<fourthectableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforec4 mk=new markforec4(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fourthectable.getColumns().add(colBtn);
	
	TableColumn<fourthectableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fourthectableview, Void>, TableCell<fourthectableview, Void>> cellFactory1 = new Callback<TableColumn<fourthectableview, Void>, TableCell<fourthectableview,Void>>() {
		@Override
		public TableCell<fourthectableview, Void> call(final TableColumn<fourthectableview, Void> param) {
			final TableCell<fourthectableview, Void> cell = new TableCell<fourthectableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/EC.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fourthectable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	fourthectable.setItems(data);
	System.out.println("Tableview testing...."+ fourthectable.getItems());
	
	stage = (Stage)  fourthecbtn.getScene().getWindow();
	Scene scene = new Scene(fourthectable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//fifthectable

public void fifthec(ActionEvent e) throws Exception {
	
	fifthectable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 5ec");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn ecname5 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		ecname5.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fifthectable.getColumns().addAll(ecname5); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fifthectableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fifthectableview, Void>, TableCell<fifthectableview, Void>> cellFactory = new Callback<TableColumn<fifthectableview, Void>, TableCell<fifthectableview,Void>>() {
		@Override
		public TableCell<fifthectableview, Void> call(final TableColumn<fifthectableview, Void> param) {
			final TableCell<fifthectableview, Void> cell = new TableCell<fifthectableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforec5 mk=new markforec5(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fifthectable.getColumns().add(colBtn);
	
	TableColumn<fifthectableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fifthectableview, Void>, TableCell<fifthectableview, Void>> cellFactory1 = new Callback<TableColumn<fifthectableview, Void>, TableCell<fifthectableview,Void>>() {
		@Override
		public TableCell<fifthectableview, Void> call(final TableColumn<fifthectableview, Void> param) {
			final TableCell<fifthectableview, Void> cell = new TableCell<fifthectableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/EC.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fifthectable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	fifthectable.setItems(data);
	System.out.println("Tableview testing...."+ fifthectable.getItems());
	
	stage = (Stage)  fifthecbtn.getScene().getWindow();
	Scene scene = new Scene(fifthectable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }


//sixthectable

public void sixthec(ActionEvent e) throws Exception {
	
	sixthectable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 6ec");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn ecname6 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		ecname6.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		sixthectable.getColumns().addAll(ecname6); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<sixthectableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<sixthectableview, Void>, TableCell<sixthectableview, Void>> cellFactory = new Callback<TableColumn<sixthectableview, Void>, TableCell<sixthectableview,Void>>() {
		@Override
		public TableCell<sixthectableview, Void> call(final TableColumn<sixthectableview, Void> param) {
			final TableCell<sixthectableview, Void> cell = new TableCell<sixthectableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforec6 mk=new markforec6(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	sixthectable.getColumns().add(colBtn);
	
	TableColumn<sixthectableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<sixthectableview, Void>, TableCell<sixthectableview, Void>> cellFactory1 = new Callback<TableColumn<sixthectableview, Void>, TableCell<sixthectableview,Void>>() {
		@Override
		public TableCell<sixthectableview, Void> call(final TableColumn<sixthectableview, Void> param) {
			final TableCell<sixthectableview, Void> cell = new TableCell<sixthectableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/EC.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	sixthectable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	sixthectable.setItems(data);
	System.out.println("Tableview testing...."+ sixthectable.getItems());
	
	stage = (Stage)  sixthecbtn.getScene().getWindow();
	Scene scene = new Scene(sixthectable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

//thirdeptable

public void thirdep(ActionEvent e) throws Exception {
	
	thirdeptable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 3ep");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn epname3 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		epname3.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
          public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
              return new SimpleStringProperty(param.getValue().get(j).toString());                        
          }                    
		});
		thirdeptable.getColumns().addAll(epname3); 
    /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<thirdeptableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<thirdeptableview, Void>, TableCell<thirdeptableview, Void>> cellFactory = new Callback<TableColumn<thirdeptableview, Void>, TableCell<thirdeptableview,Void>>() {
		@Override
		public TableCell<thirdeptableview, Void> call(final TableColumn<thirdeptableview, Void> param) {
			final TableCell<thirdeptableview, Void> cell = new TableCell<thirdeptableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforep3 mk=new markforep3(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	thirdeptable.getColumns().add(colBtn);
	
	TableColumn<thirdeptableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<thirdeptableview, Void>, TableCell<thirdeptableview, Void>> cellFactory1 = new Callback<TableColumn<thirdeptableview, Void>, TableCell<thirdeptableview,Void>>() {
		@Override
		public TableCell<thirdeptableview, Void> call(final TableColumn<thirdeptableview, Void> param) {
			final TableCell<thirdeptableview, Void> cell = new TableCell<thirdeptableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Ep.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	thirdeptable.getColumns().add(colBtn1);
	while(resultSet.next()){
      //Iterate Row
      ObservableList<String> row = FXCollections.observableArrayList();
      for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
          //Iterate Column
          row.add(resultSet.getString(i));
      }
      System.out.println("Row [1] added "+row );
      data.add(row);

  }

  //FINALLY ADDED TO TableView
	thirdeptable.setItems(data);
	System.out.println("Tableview testing...."+ thirdeptable.getItems());
	
	stage = (Stage)  thirdepbtn.getScene().getWindow();
	Scene scene = new Scene(thirdeptable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
}


//fourtheptable

public void fourthep(ActionEvent e) throws Exception {
	
	fourtheptable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 4ep");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn epname4 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		epname4.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
          public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
              return new SimpleStringProperty(param.getValue().get(j).toString());                        
          }                    
		});
		fourtheptable.getColumns().addAll(epname4); 
    /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fourtheptableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fourtheptableview, Void>, TableCell<fourtheptableview, Void>> cellFactory = new Callback<TableColumn<fourtheptableview, Void>, TableCell<fourtheptableview,Void>>() {
		@Override
		public TableCell<fourtheptableview, Void> call(final TableColumn<fourtheptableview, Void> param) {
			final TableCell<fourtheptableview, Void> cell = new TableCell<fourtheptableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforep4 mk=new markforep4(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fourtheptable.getColumns().add(colBtn);
	
	TableColumn<fourtheptableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fourtheptableview, Void>, TableCell<fourtheptableview, Void>> cellFactory1 = new Callback<TableColumn<fourtheptableview, Void>, TableCell<fourtheptableview,Void>>() {
		@Override
		public TableCell<fourtheptableview, Void> call(final TableColumn<fourtheptableview, Void> param) {
			final TableCell<fourtheptableview, Void> cell = new TableCell<fourtheptableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Ep.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fourtheptable.getColumns().add(colBtn1);
	while(resultSet.next()){
      //Iterate Row
      ObservableList<String> row = FXCollections.observableArrayList();
      for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
          //Iterate Column
          row.add(resultSet.getString(i));
      }
      System.out.println("Row [1] added "+row );
      data.add(row);

  }

  //FINALLY ADDED TO TableView
	fourtheptable.setItems(data);
	System.out.println("Tableview testing...."+ fourtheptable.getItems());
	
	stage = (Stage)  fourthepbtn.getScene().getWindow();
	Scene scene = new Scene(fourtheptable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
}

//fiftheptable

public void fifthep(ActionEvent e) throws Exception {
	
	fiftheptable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 5ec");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn epname5 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		epname5.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fiftheptable.getColumns().addAll(epname5); 
      /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<fiftheptableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fiftheptableview, Void>, TableCell<fiftheptableview, Void>> cellFactory = new Callback<TableColumn<fiftheptableview, Void>, TableCell<fiftheptableview,Void>>() {
		@Override
		public TableCell<fiftheptableview, Void> call(final TableColumn<fiftheptableview, Void> param) {
			final TableCell<fiftheptableview, Void> cell = new TableCell<fiftheptableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforep5 mk=new markforep5(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fiftheptable.getColumns().add(colBtn);
	
	TableColumn<fiftheptableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fiftheptableview, Void>, TableCell<fiftheptableview, Void>> cellFactory1 = new Callback<TableColumn<fiftheptableview, Void>, TableCell<fiftheptableview,Void>>() {
		@Override
		public TableCell<fiftheptableview, Void> call(final TableColumn<fiftheptableview, Void> param) {
			final TableCell<fiftheptableview, Void> cell = new TableCell<fiftheptableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Ep.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fiftheptable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
        System.out.println("Row [1] added "+row );
        data.add(row);

    }

    //FINALLY ADDED TO TableView
	fiftheptable.setItems(data);
	System.out.println("Tableview testing...."+ fiftheptable.getItems());
	
	stage = (Stage)  fifthepbtn.getScene().getWindow();
	Scene scene = new Scene(fiftheptable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }



//sixtheptable

public void sixthep(ActionEvent e) throws Exception {
	
	sixtheptable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 6ep");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn epname6 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		epname6.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
          public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
              return new SimpleStringProperty(param.getValue().get(j).toString());                        
          }                    
		});
		sixtheptable.getColumns().addAll(epname6); 
    /*   System.out.println("Column ["+i+"] ");*/
	}
	TableColumn<sixtheptableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<sixtheptableview, Void>, TableCell<sixtheptableview, Void>> cellFactory = new Callback<TableColumn<sixtheptableview, Void>, TableCell<sixtheptableview,Void>>() {
		@Override
		public TableCell<sixtheptableview, Void> call(final TableColumn<sixtheptableview, Void> param) {
			final TableCell<sixtheptableview, Void> cell = new TableCell<sixtheptableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforep6 mk=new markforep6(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	sixtheptable.getColumns().add(colBtn);
	
	TableColumn<sixtheptableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<sixtheptableview, Void>, TableCell<sixtheptableview, Void>> cellFactory1 = new Callback<TableColumn<sixtheptableview, Void>, TableCell<sixtheptableview,Void>>() {
		@Override
		public TableCell<sixtheptableview, Void> call(final TableColumn<sixtheptableview, Void> param) {
			final TableCell<sixtheptableview, Void> cell = new TableCell<sixtheptableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec=null;
						try{
							ec=(AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Ep.fxml"));
							
						}catch(IOException e1){
							e1.printStackTrace();
						}
						Scene scene1=new Scene(ec);
						stage.setScene(scene1);
						
						stage.show();
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	sixtheptable.getColumns().add(colBtn1);
	while(resultSet.next()){
      //Iterate Row
      ObservableList<String> row = FXCollections.observableArrayList();
      for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
          //Iterate Column
          row.add(resultSet.getString(i));
      }
      System.out.println("Row [1] added "+row );
      data.add(row);

  }

  //FINALLY ADDED TO TableView
	sixtheptable.setItems(data);
	System.out.println("Tableview testing...."+ sixtheptable.getItems());
	
	stage = (Stage)  sixthepbtn.getScene().getWindow();
	Scene scene = new Scene(sixtheptable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
}

//firsteptable
public void firstep(ActionEvent e) throws Exception {
	
	firsteptable = new TableView();
		
		connection=con.connectdb();
		data = FXCollections.observableArrayList();
		resultSet = connection.createStatement().executeQuery("SELECT * FROM 1ep");
		for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
			final int j = i;
			TableColumn Name6 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
			Name6.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                    return new SimpleStringProperty(param.getValue().get(j).toString());                        
                }                    
			});
			firsteptable.getColumns().addAll(Name6); 
             System.out.println("Column ["+i+"] ");
		}
		TableColumn<firsteptableview, Void> colBtn = new TableColumn("Button Column");
		Callback<TableColumn<firsteptableview, Void>, TableCell<firsteptableview, Void>> cellFactory = new Callback<TableColumn<firsteptableview, Void>, TableCell<firsteptableview,Void>>() {
			public TableCell<firsteptableview, Void> call(final TableColumn<firsteptableview, Void> param) {
				final TableCell<firsteptableview, Void> cell = new TableCell<firsteptableview, Void>() {
					
					private final Button btn = new Button("Confirm");
					{
						btn.setOnAction((ActionEvent e)->{
							data = (ObservableList) getTableView().getItems().get(getIndex());
							System.out.println("selectedData" + data);
							markforep1 mk=new markforep1(data);
						});
					}
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn);
						}
					}
				};
				return cell;
			}
		};
		colBtn.setCellFactory(cellFactory);
		firsteptable.getColumns().add(colBtn);
		
		TableColumn<firsteptableview, Void> colBtn1 = new TableColumn("Button Column");
		Callback<TableColumn<firsteptableview, Void>, TableCell<firsteptableview, Void>> cellFactory1 = new Callback<TableColumn<firsteptableview, Void>, TableCell<firsteptableview,Void>>() {
			@Override
			public TableCell<firsteptableview, Void> call(final TableColumn<firsteptableview, Void> param) {
				final TableCell<firsteptableview, Void> cell = new TableCell<firsteptableview, Void>() {
					
					private final Button btn1 = new Button("Back");
					{
						btn1.setOnAction((ActionEvent e)->{
							AnchorPane ec = null;
							try {
								ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Ep.fxml"));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						    Scene scene1 = new Scene(ec);
						    stage.setScene(scene1);
						   
						    
						    stage.show();
						});
					}
					
					
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn1);
						}
					}
				};
				return cell;
			}
		};
		colBtn1.setCellFactory(cellFactory1);
		firsteptable.getColumns().add(colBtn1);
		while(resultSet.next()){
            //Iterate Row
           ObservableList<String> row = FXCollections.observableArrayList();
            for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
                //Iterate Column
                row.add(resultSet.getString(i));
            }
          System.out.println("Row [1] added "+row );
           data.add(row);

        }
		
		firsteptable.setItems(data);
				// TODO Auto-generated method stub
				
		System.out.println("Tableview testing...."+ firsteptable.getItems());
		
		stage = (Stage)  firstepbtn.getScene().getWindow();
		
		Scene scene = new Scene(firsteptable);
		stage.setScene(scene);
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				// TODO Auto-generated method stub
				Platform.exit();
				System.exit(0);
			}
			
		});
		
     }

//secondeptable
public void secondep(ActionEvent e) throws Exception {
	
	secondeptable = new TableView();
		
		connection=con.connectdb();
		data = FXCollections.observableArrayList();
		resultSet = connection.createStatement().executeQuery("SELECT * FROM 2ep");
		for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
			final int j = i;
			TableColumn Name7 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
			Name7.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                    return new SimpleStringProperty(param.getValue().get(j).toString());                        
                }                    
			});
			secondeptable.getColumns().addAll(Name7); 
             System.out.println("Column ["+i+"] ");
		}
		TableColumn<secondeptableview, Void> colBtn = new TableColumn("Button Column");
		Callback<TableColumn<secondeptableview, Void>, TableCell<secondeptableview, Void>> cellFactory = new Callback<TableColumn<secondeptableview, Void>, TableCell<secondeptableview,Void>>() {
			public TableCell<secondeptableview, Void> call(final TableColumn<secondeptableview, Void> param) {
				final TableCell<secondeptableview, Void> cell = new TableCell<secondeptableview, Void>() {
					
					private final Button btn = new Button("Confirm");
					{
						btn.setOnAction((ActionEvent e)->{
							data = (ObservableList) getTableView().getItems().get(getIndex());
							System.out.println("selectedData" + data);
							markforep2 mk = new markforep2(data);
						});
					}
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn);
						}
					}
				};
				return cell;
			}
		};
		colBtn.setCellFactory(cellFactory);
		secondeptable.getColumns().add(colBtn);
		
		TableColumn<secondeptableview, Void> colBtn1 = new TableColumn("Button Column");
		Callback<TableColumn<secondeptableview, Void>, TableCell<secondeptableview, Void>> cellFactory1 = new Callback<TableColumn<secondeptableview, Void>, TableCell<secondeptableview,Void>>() {
			@Override
			public TableCell<secondeptableview, Void> call(final TableColumn<secondeptableview, Void> param) {
				final TableCell<secondeptableview, Void> cell = new TableCell<secondeptableview, Void>() {
					
					private final Button btn1 = new Button("Back");
					{
						btn1.setOnAction((ActionEvent e)->{
							AnchorPane ec = null;
							try {
								ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Ep.fxml"));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						    Scene scene1 = new Scene(ec);
						    stage.setScene(scene1);
						   
						    
						    stage.show();
						});
					}
					
					
					public void updateItem(Void item, boolean empty) {
						super.updateItem(item, empty);
						if(empty) {
							setGraphic(null);
						}
						else {
							setGraphic(btn1);
						}
					}
				};
				return cell;
			}
		};
		colBtn1.setCellFactory(cellFactory1);
		secondeptable.getColumns().add(colBtn1);
		while(resultSet.next()){
            //Iterate Row
           ObservableList<String> row = FXCollections.observableArrayList();
            for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
                //Iterate Column
                row.add(resultSet.getString(i));
            }
          System.out.println("Row [1] added "+row );
           data.add(row);

        }
		
		secondeptable.setItems(data);
				// TODO Auto-generated method stub
				
		System.out.println("Tableview testing...."+ secondeptable.getItems());
		
		stage = (Stage)  secondepbtn.getScene().getWindow();
		
		Scene scene = new Scene(secondeptable);
		stage.setScene(scene);
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				// TODO Auto-generated method stub
				Platform.exit();
				System.exit(0);
			}
			
		});
		
     }

public void thirdcivil(ActionEvent e) throws Exception {
	
	thirdciviltable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 3civil");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn Name2 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		Name2.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		thirdciviltable.getColumns().addAll(Name2); 
         System.out.println("Column ["+i+"] ");
	}
	TableColumn<thirdciviltableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<thirdciviltableview, Void>, TableCell<thirdciviltableview, Void>> cellFactory = new Callback<TableColumn<thirdciviltableview, Void>, TableCell<thirdciviltableview,Void>>() {
		public TableCell<thirdciviltableview, Void> call(final TableColumn<thirdciviltableview, Void> param) {
			final TableCell<thirdciviltableview, Void> cell = new TableCell<thirdciviltableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforcivil3 mk = new markforcivil3(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	thirdciviltable.getColumns().add(colBtn);
	
	TableColumn<thirdciviltableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<thirdciviltableview, Void>, TableCell<thirdciviltableview, Void>> cellFactory1 = new Callback<TableColumn<thirdciviltableview, Void>, TableCell<thirdciviltableview,Void>>() {
		@Override
		public TableCell<thirdciviltableview, Void> call(final TableColumn<thirdciviltableview, Void> param) {
			final TableCell<thirdciviltableview, Void> cell = new TableCell<thirdciviltableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec = null;
						try {
							ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Civil.fxml"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					    Scene scene1 = new Scene(ec);
					    stage.setScene(scene1);
					   
					    
					    stage.show();
					});
				}
				
				
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	thirdciviltable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
       ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
      System.out.println("Row [1] added "+row );
       data.add(row);

    }
	
	thirdciviltable.setItems(data);
	
	System.out.println("Tableview testing...."+ thirdciviltable.getItems());
	
	stage = (Stage)  thirdcivilbtn.getScene().getWindow();
	
	Scene scene = new Scene(thirdciviltable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

public void fourthcivil(ActionEvent e) throws Exception {
	
	fourthciviltable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 4civil");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn Name3 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		Name3.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fourthciviltable.getColumns().addAll(Name3); 
         System.out.println("Column ["+i+"] ");
	}
	TableColumn<fourthciviltableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fourthciviltableview, Void>, TableCell<fourthciviltableview, Void>> cellFactory = new Callback<TableColumn<fourthciviltableview, Void>, TableCell<fourthciviltableview,Void>>() {
		public TableCell<fourthciviltableview, Void> call(final TableColumn<fourthciviltableview, Void> param) {
			final TableCell<fourthciviltableview, Void> cell = new TableCell<fourthciviltableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforcivil4 mk = new markforcivil4(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fourthciviltable.getColumns().add(colBtn);
	
	TableColumn<fourthciviltableview, Void> colBtn1 = new TableColumn("Button");
	Callback<TableColumn<fourthciviltableview, Void>, TableCell<fourthciviltableview, Void>> cellFactory1 = new Callback<TableColumn<fourthciviltableview, Void>, TableCell<fourthciviltableview,Void>>() {
		@Override
		public TableCell<fourthciviltableview, Void> call(final TableColumn<fourthciviltableview, Void> param) {
			final TableCell<fourthciviltableview, Void> cell = new TableCell<fourthciviltableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec = null;
						try {
							ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Civil.fxml"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					    Scene scene1 = new Scene(ec);
					    stage.setScene(scene1);
					   
					    
					    stage.show();
					});
				}
				
				
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fourthciviltable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
       ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
      System.out.println("Row [1] added "+row );
       data.add(row);

    }
	
	fourthciviltable.setItems(data);
	
	System.out.println("Tableview testing...."+ fourthciviltable.getItems());
	
	stage = (Stage)  fourthcivilbtn.getScene().getWindow();
	
	Scene scene = new Scene(fourthciviltable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

public void fifthcivil(ActionEvent e) throws Exception {
	
	fifthciviltable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 5civil");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn Name4 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		Name4.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		fifthciviltable.getColumns().addAll(Name4); 
         System.out.println("Column ["+i+"] ");
	}
	TableColumn<fifthciviltableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<fifthciviltableview, Void>, TableCell<fifthciviltableview, Void>> cellFactory = new Callback<TableColumn<fifthciviltableview, Void>, TableCell<fifthciviltableview,Void>>() {
		public TableCell<fifthciviltableview, Void> call(final TableColumn<fifthciviltableview, Void> param) {
			final TableCell<fifthciviltableview, Void> cell = new TableCell<fifthciviltableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforcivil5 mk = new markforcivil5(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	fifthciviltable.getColumns().add(colBtn);
	
	TableColumn<fifthciviltableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<fifthciviltableview, Void>, TableCell<fifthciviltableview, Void>> cellFactory1 = new Callback<TableColumn<fifthciviltableview, Void>, TableCell<fifthciviltableview,Void>>() {
		@Override
		public TableCell<fifthciviltableview, Void> call(final TableColumn<fifthciviltableview, Void> param) {
			final TableCell<fifthciviltableview, Void> cell = new TableCell<fifthciviltableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec = null;
						try {
							ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Civil.fxml"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					    Scene scene1 = new Scene(ec);
					    stage.setScene(scene1);
					   
					    
					    stage.show();
					});
				}
				
				
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	fifthciviltable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
       ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
      System.out.println("Row [1] added "+row );
       data.add(row);

    }
	
	fifthciviltable.setItems(data);
	
	System.out.println("Tableview testing...."+ fifthciviltable.getItems());
	
	stage = (Stage)  fifthcivilbtn.getScene().getWindow();
	
	Scene scene = new Scene(fifthciviltable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }

public void sixthcivil(ActionEvent e) throws Exception {
	
	sixthciviltable = new TableView();
	
	connection=con.connectdb();
	data = FXCollections.observableArrayList();
	resultSet = connection.createStatement().executeQuery("SELECT * FROM 6civil");
	for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
		final int j = i;
		TableColumn Name5 = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
		Name5.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
            public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                return new SimpleStringProperty(param.getValue().get(j).toString());                        
            }                    
		});
		sixthciviltable.getColumns().addAll(Name5); 
         System.out.println("Column ["+i+"] ");
	}
	TableColumn<sixthciviltableview, Void> colBtn = new TableColumn("Button Column");
	Callback<TableColumn<sixthciviltableview, Void>, TableCell<sixthciviltableview, Void>> cellFactory = new Callback<TableColumn<sixthciviltableview, Void>, TableCell<sixthciviltableview,Void>>() {
		public TableCell<sixthciviltableview, Void> call(final TableColumn<sixthciviltableview, Void> param) {
			final TableCell<sixthciviltableview, Void> cell = new TableCell<sixthciviltableview, Void>() {
				
				private final Button btn = new Button("Confirm");
				{
					btn.setOnAction((ActionEvent e)->{
						data = (ObservableList) getTableView().getItems().get(getIndex());
						System.out.println("selectedData" + data);
						markforcivil6 mk = new markforcivil6(data);
					});
				}
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn);
					}
				}
			};
			return cell;
		}
	};
	colBtn.setCellFactory(cellFactory);
	sixthciviltable.getColumns().add(colBtn);
	
	TableColumn<sixthciviltableview, Void> colBtn1 = new TableColumn("Button Column");
	Callback<TableColumn<sixthciviltableview, Void>, TableCell<sixthciviltableview, Void>> cellFactory1 = new Callback<TableColumn<sixthciviltableview, Void>, TableCell<sixthciviltableview,Void>>() {
		@Override
		public TableCell<sixthciviltableview, Void> call(final TableColumn<sixthciviltableview, Void> param) {
			final TableCell<sixthciviltableview, Void> cell = new TableCell<sixthciviltableview, Void>() {
				
				private final Button btn1 = new Button("Back");
				{
					btn1.setOnAction((ActionEvent e)->{
						AnchorPane ec = null;
						try {
							ec = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/Civil.fxml"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					    Scene scene1 = new Scene(ec);
					    stage.setScene(scene1);
					   
					    
					    stage.show();
					});
				}
				
				
				public void updateItem(Void item, boolean empty) {
					super.updateItem(item, empty);
					if(empty) {
						setGraphic(null);
					}
					else {
						setGraphic(btn1);
					}
				}
			};
			return cell;
		}
	};
	colBtn1.setCellFactory(cellFactory1);
	sixthciviltable.getColumns().add(colBtn1);
	while(resultSet.next()){
        //Iterate Row
       ObservableList<String> row = FXCollections.observableArrayList();
        for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++){
            //Iterate Column
            row.add(resultSet.getString(i));
        }
      System.out.println("Row [1] added "+row );
       data.add(row);

    }
	
	sixthciviltable.setItems(data);
	
	
	stage = (Stage)  sixthcivilbtn.getScene().getWindow();
	
	Scene scene = new Scene(sixthciviltable);
	stage.setScene(scene);
	stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			// TODO Auto-generated method stub
			Platform.exit();
			System.exit(0);
		}
		
	});
	
 }
	






}

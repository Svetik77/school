package admins;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminController {
	 
	// AdminStyleSheet.css
	
	// AdminFXML.fxml
    @FXML
    private TextField ID;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField email;

    @FXML
    private DatePicker dob;


    @FXML
    private TableView<StudentData> studentData ;


    @FXML
    private TableColumn<StudentData, String>   idColumn;

    @FXML
    private TableColumn<StudentData, String>   firstnamecolumn ;
    //
    @FXML
    private TableColumn<StudentData, String>   lastnamecolumn ;
    //
    @FXML
    private TableColumn<StudentData, String>   emailcolumn ;
    //
    @FXML
    private TableColumn<StudentData, String>    dobcolumn;


}

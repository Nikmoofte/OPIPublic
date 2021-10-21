module com.dbl.db_learning {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.dbl.db_learning to javafx.fxml;
    exports com.dbl.db_learning;
}
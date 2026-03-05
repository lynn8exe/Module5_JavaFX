module edu.farmingdale.module5_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.module5_javafx to javafx.fxml;
    exports edu.farmingdale.module5_javafx;
}
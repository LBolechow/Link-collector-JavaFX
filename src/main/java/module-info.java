module pl.lukaszbolechow.robot {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;


    opens pl.lukaszbolechow.robot to javafx.fxml;
    exports pl.lukaszbolechow.robot;
}
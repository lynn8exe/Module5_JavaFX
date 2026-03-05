package edu.farmingdale.module5_javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        // MENU BAR
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu themeMenu = new Menu("Theme");
        Menu helpMenu = new Menu("Help");

        menuBar.getMenus().addAll(fileMenu, editMenu, themeMenu, helpMenu);

        root.setTop(menuBar);


        // LEFT PANEL
        VBox leftPanel = new VBox();
        leftPanel.setPrefWidth(150);
        leftPanel.getStyleClass().add("left-panel");

        Label profile = new Label("Profile");
        profile.setStyle("-fx-background-color:white; -fx-padding:50;");

        leftPanel.getChildren().add(profile);

        root.setLeft(leftPanel);


        // TABLE
        TableView table = new TableView();

        TableColumn id = new TableColumn("ID");
        TableColumn first = new TableColumn("First Name");
        TableColumn last = new TableColumn("Last Name");
        TableColumn dept = new TableColumn("Department");
        TableColumn major = new TableColumn("Major");
        TableColumn email = new TableColumn("Email");

        table.getColumns().addAll(id, first, last, dept, major, email);

        root.setCenter(table);


        // RIGHT PANEL
        VBox rightPanel = new VBox(10);
        rightPanel.setPadding(new Insets(15));
        rightPanel.setPrefWidth(250);
        rightPanel.getStyleClass().add("right-panel");

        TextField firstName = new TextField();
        firstName.setPromptText("First Name");

        TextField lastName = new TextField();
        lastName.setPromptText("Last Name");

        TextField department = new TextField();
        department.setPromptText("Department");

        TextField majorField = new TextField();
        majorField.setPromptText("Major");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        TextField imageURL = new TextField();
        imageURL.setPromptText("imageURL");

        Button clearBtn = new Button("Clear");
        Button addBtn = new Button("Add");
        Button deleteBtn = new Button("Delete");
        Button editBtn = new Button("Edit");

        clearBtn.getStyleClass().add("action-button");
        addBtn.getStyleClass().add("action-button");
        deleteBtn.getStyleClass().add("action-button");
        editBtn.getStyleClass().add("action-button");

        rightPanel.getChildren().addAll(
                firstName,
                lastName,
                department,
                majorField,
                emailField,
                imageURL,
                clearBtn,
                addBtn,
                deleteBtn,
                editBtn
        );

        root.setRight(rightPanel);


        // FOOTER
        HBox footer = new HBox();
        footer.setPrefHeight(40);
        footer.getStyleClass().add("footer");

        root.setBottom(footer);


        // SCENE
        Scene scene = new Scene(root,1000,600);

        // MY CSS FILE
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        stage.setTitle("FSC CSC325 - Full Stack Project");
        stage.setScene(scene);
        stage.show();
    }
}
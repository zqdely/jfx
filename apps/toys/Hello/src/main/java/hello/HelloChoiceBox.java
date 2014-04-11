/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Demo for {@code RadioButton}.
 */
public class HelloChoiceBox extends Application {

    public static void main(String[] args) {
//        com.sun.javafx.Logging.getFocusLogger().setLevel(PlatformLogger.FINE);
        Application.launch(args);
    }

    @Override public void start(Stage stage) {
        final ChoiceBox<String> choiceBox = new ChoiceBox<String>();
        choiceBox.getItems().addAll("Leia Organa", "Luke Skywalker", "Han Solo");

        // control buttons
        VBox vbox = new VBox(5);
        
        Button slt = new Button("Select item 2");
        slt.setOnAction(t -> choiceBox.getSelectionModel().select(2));
        vbox.getChildren().add(slt);
        
        Button clearItems = new Button("Clear items sequence");
        clearItems.setOnAction(t -> choiceBox.getItems().clear());
        vbox.getChildren().add(clearItems);
        
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(choiceBox, vbox);
        stage.setScene(new Scene(hbox));
        stage.show();
    }
}
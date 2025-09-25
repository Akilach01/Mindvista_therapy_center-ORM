package com.example.orm.controller;

import com.example.orm.dto.PaymentDto;
import com.example.orm.service.ServiceFactory;
import com.example.orm.service.custom.PaymentService;
import com.example.orm.tm.PaymentTM;
import com.example.orm.utils.WindowUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PaymentController {

    @FXML
    private TableColumn<PaymentTM, Double> amountCol;

    @FXML
    private TableColumn<PaymentTM, Integer> patIdCol;

    @FXML
    private TableColumn<PaymentTM, Integer> payIdCol;

    @FXML
    private TableView<PaymentTM> paymentTbl;

    @FXML
    private AnchorPane pane;

    @FXML
     void gotoBack(ActionEvent event)throws Exception{
        new WindowUtils().navigateTo("RicieptionChoiceView",pane);
    }
    PaymentService paymentService = (PaymentService) ServiceFactory.getServiceFactory().getService(ServiceFactory.serviceType.PAYMENT);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            payIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
            amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
            patIdCol.setCellValueFactory(new PropertyValueFactory<>("patId"));

            getAllPayments();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getAllPayments(){
        ArrayList<PaymentDto>dtos = paymentService.getAllPayments();
        ObservableList<PaymentTM> paymentTMS = FXCollections.observableArrayList();
        for(PaymentDto dto:dtos){
            paymentTMS.add(new PaymentTM(
                    dto.getId(),
                    dto.getAmout(),
                    dto.getPatcientId()
            ));
        }
        paymentTbl.setItems(paymentTMS);
    }
}

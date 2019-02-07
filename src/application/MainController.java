package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private Label lblburger1;
	@FXML
	private Label lblburger2;
	@FXML
	private Label lblburger3;
	@FXML
	private Label lblburger4;
	@FXML
	private Label lblsandwich1;
	@FXML
	private Label lblsandwich2;
	@FXML
	private Label lblsandwich3;
	@FXML
	private Label lblsandwich4;
	@FXML
	private Label lbldrink1;
	@FXML
	private Label lbldrink2;
	@FXML
	private Label lbldrink3;
	@FXML
	private Label lbldrink4;
	@FXML
	private Label lblsmoothie1;
	@FXML
	private Label lblsmoothie2;
	@FXML
	private Label lblsmoothie3;
	@FXML
	private Label lblsmoothie4;

	@FXML
	private TextField txtburger1;
	@FXML
	private TextField txtburger2;
	@FXML
	private TextField txtburger3;
	@FXML
	private TextField txtburger4;
	@FXML
	private TextField txtsandwich1;
	@FXML
	private TextField txtsandwich2;
	@FXML
	private TextField txtsandwich3;
	@FXML
	private TextField txtsandwich4;
	@FXML
	private TextField txtdrink1;
	@FXML
	private TextField txtdrink2;
	@FXML
	private TextField txtdrink3;
	@FXML
	private TextField txtdrink4;
	@FXML
	private TextField txtsmoothie1;
	@FXML
	private TextField txtsmoothie2;
	@FXML
	private TextField txtsmoothie3;
	@FXML
	private TextField txtsmoothie4;
	
	@FXML
	private Label lblburgertotal;
	@FXML
	private Label lblsandwichtotal;
	@FXML
	private Label lbldrinktotal;
	@FXML
	private Label lblsmoothietotal;
	@FXML
	private Label lbltotalamount;
	
	@FXML
	private Label lblburgeramount;
	@FXML
	private Label lblsandwichamount;
	@FXML
	private Label lbldrinkamount;
	@FXML
	private Label lblsmoothieamount;
	
	private float totalamount = 0;
	private byte zero = 0;
	private int b1,b2,b3,b4,b1qty,b2qty,b3qty,b4qty;
	private int s1,s2,s3,s4,s1qty,s2qty,s3qty,s4qty;
	private int d1,d2,d3,d4,d1qty,d2qty,d3qty,d4qty;
	private int sm1,sm2,sm3,sm4,sm1qty,sm2qty,sm3qty,sm4qty;
	
	
	 float burgersubtotal,sandwichsubtotal,drinkssubtotal,smoothiesubtotal;
	
	 
	 public void reset(ActionEvent event) throws Exception {
		   
			txtburger1.setText(String.valueOf(zero));
			txtburger2.setText(String.valueOf(zero));
			txtburger3.setText(String.valueOf(zero));
			txtburger4.setText(String.valueOf(zero));
			txtsandwich1.setText(String.valueOf(zero));
			txtsandwich2.setText(String.valueOf(zero));
			txtsandwich3.setText(String.valueOf(zero));
			txtsandwich4.setText(String.valueOf(zero));
			txtdrink1.setText(String.valueOf(zero));
			txtdrink2.setText(String.valueOf(zero));
			txtdrink3.setText(String.valueOf(zero));
			txtdrink4.setText(String.valueOf(zero));
			txtsmoothie1.setText(String.valueOf(zero));
			txtsmoothie2.setText(String.valueOf(zero));
			txtsmoothie3.setText(String.valueOf(zero));
			txtsmoothie4.setText(String.valueOf(zero));
			lblburgertotal.setText(String.valueOf(zero));
			lblsandwichtotal.setText(String.valueOf(zero));
			lbldrinktotal.setText(String.valueOf(zero));
			lblsmoothietotal.setText(String.valueOf(zero));
			lblburgeramount.setText(String.valueOf(zero));
			lblsandwichamount.setText(String.valueOf(zero));
			lbldrinkamount.setText(String.valueOf(zero));
			lblsmoothieamount.setText(String.valueOf(zero));
			lbltotalamount.setText(String.valueOf(zero));
	 }
	
	 public void burgersubtotal(ActionEvent event) throws Exception {
			
	    	int b1qty = Integer.parseInt(txtburger1.getText());
		    int	b2qty = Integer.parseInt(txtburger2.getText());
		    int	b3qty = Integer.parseInt(txtburger3.getText());
		    int	b4qty = Integer.parseInt(txtburger4.getText());
		    
		    int b1 = Integer.parseInt(lblburger1.getText());
		    int b2 = Integer.parseInt(lblburger2.getText());
			int b3 = Integer.parseInt(lblburger3.getText());
			int b4 = Integer.parseInt(lblburger4.getText());
			
			
		   burgersubtotal = (b1*b1qty) + (b2*b2qty) + (b3*b3qty) + (b4*b4qty);
			
			lblburgertotal.setText(String.valueOf(burgersubtotal));
			
	    }
	    
	    public void sandwichsubtotal(ActionEvent event) throws Exception{
			int s1qty = Integer.parseInt(txtsandwich1.getText());
			int s2qty = Integer.parseInt(txtsandwich2.getText());
			int s3qty = Integer.parseInt(txtsandwich3.getText());
			int s4qty = Integer.parseInt(txtsandwich4.getText());

			int s1 = Integer.parseInt(lblsandwich1.getText());
			int s2 = Integer.parseInt(lblsandwich2.getText());
			int s3 = Integer.parseInt(lblsandwich3.getText());
			int s4 = Integer.parseInt(lblsandwich4.getText());

			
			sandwichsubtotal = (s1*s1qty) + (s2*s2qty) + (s3*s3qty) + (s4*s4qty);

			lblsandwichtotal.setText(String.valueOf(sandwichsubtotal));
			
	    }
	    
	    public void drinkssubtotal(ActionEvent event) throws Exception{
			
	    	int	d1qty = Integer.parseInt(txtdrink1.getText());
			int	d2qty = Integer.parseInt(txtdrink2.getText());
			int	d3qty = Integer.parseInt(txtdrink3.getText());
			int	d4qty = Integer.parseInt(txtdrink4.getText());
			
	    	int	d1 = Integer.parseInt(lbldrink1.getText());
	    	int	d2 = Integer.parseInt(lbldrink2.getText());
	    	int	d3 = Integer.parseInt(lbldrink3.getText());
	    	int	d4 = Integer.parseInt(lbldrink4.getText());
	    	
			
			drinkssubtotal = (d1*d1qty) + (d2*d2qty) + (d3*d3qty) + (d4*d4qty);
			
			lbldrinktotal.setText(String.valueOf(drinkssubtotal));
	    }
	    
	    public void smoothiesubtotal(ActionEvent event) throws Exception {

	    	int	sm1qty = Integer.parseInt(txtsmoothie1.getText());
	    	int	sm2qty = Integer.parseInt(txtsmoothie2.getText());
	    	int	sm3qty = Integer.parseInt(txtsmoothie3.getText());
	    	int	sm4qty = Integer.parseInt(txtsmoothie4.getText());
			
	    	int sm1 = Integer.parseInt(lblsmoothie1.getText());
	    	int	sm2 = Integer.parseInt(lblsmoothie2.getText());
	    	int	sm3 = Integer.parseInt(lblsmoothie3.getText());
	    	int	sm4 = Integer.parseInt(lblsmoothie4.getText());
	    	
	    	smoothiesubtotal = (sm1*sm1qty) + (sm2*sm2qty) + (sm3*sm3qty) + (sm4*sm4qty);

			lblsmoothietotal.setText(String.valueOf(smoothiesubtotal));
			
	    }
	    
	  
		
	public void getreceipt(ActionEvent event) throws Exception {
		
		b1qty = Integer.parseInt(txtburger1.getText());
	   	b2qty = Integer.parseInt(txtburger2.getText());
	   	b3qty = Integer.parseInt(txtburger3.getText());
	   	b4qty = Integer.parseInt(txtburger4.getText());
	    
	    b1 = Integer.parseInt(lblburger1.getText());
	    b2 = Integer.parseInt(lblburger2.getText());
	    b3 = Integer.parseInt(lblburger3.getText());
	    b4 = Integer.parseInt(lblburger4.getText());
		 burgersubtotal = (b1*b1qty) + (b2*b2qty) + (b3*b3qty) + (b4*b4qty);
		lblburgertotal.setText(String.valueOf(burgersubtotal));
		
		
		 s1qty = Integer.parseInt(txtsandwich1.getText());
		 s2qty = Integer.parseInt(txtsandwich2.getText());
		 s3qty = Integer.parseInt(txtsandwich3.getText());
		 s4qty = Integer.parseInt(txtsandwich4.getText());

		 s1 = Integer.parseInt(lblsandwich1.getText());
		 s2 = Integer.parseInt(lblsandwich2.getText());
		 s3 = Integer.parseInt(lblsandwich3.getText());
		 s4 = Integer.parseInt(lblsandwich4.getText());
		 sandwichsubtotal = (s1*s1qty) + (s2*s2qty) + (s3*s3qty) + (s4*s4qty);
		 lblsandwichtotal.setText(String.valueOf(sandwichsubtotal));
		
			d1qty = Integer.parseInt(txtdrink1.getText());
			d2qty = Integer.parseInt(txtdrink2.getText());
			d3qty = Integer.parseInt(txtdrink3.getText());
			d4qty = Integer.parseInt(txtdrink4.getText());
			
	    	d1 = Integer.parseInt(lbldrink1.getText());
	    	d2 = Integer.parseInt(lbldrink2.getText());
	    	d3 = Integer.parseInt(lbldrink3.getText());
	    	d4 = Integer.parseInt(lbldrink4.getText());
	    	drinkssubtotal = (d1*d1qty) + (d2*d2qty) + (d3*d3qty) + (d4*d4qty);
			lbldrinktotal.setText(String.valueOf(drinkssubtotal));
		
			sm1qty = Integer.parseInt(txtsmoothie1.getText());
	    	sm2qty = Integer.parseInt(txtsmoothie2.getText());
	    	sm3qty = Integer.parseInt(txtsmoothie3.getText());
	    	sm4qty = Integer.parseInt(txtsmoothie4.getText());
			
	    	sm1 = Integer.parseInt(lblsmoothie1.getText());
	    	sm2 = Integer.parseInt(lblsmoothie2.getText());
	    	sm3 = Integer.parseInt(lblsmoothie3.getText());
	    	sm4 = Integer.parseInt(lblsmoothie4.getText());
	    	smoothiesubtotal = (sm1*sm1qty) + (sm2*sm2qty) + (sm3*sm3qty) + (sm4*sm4qty);
	    	lblsmoothietotal.setText(String.valueOf(smoothiesubtotal));
			
			
		totalamount = burgersubtotal + sandwichsubtotal + drinkssubtotal + smoothiesubtotal;
		
		lblburgeramount.setText(String.valueOf(burgersubtotal));
		lblsandwichamount.setText(String.valueOf(sandwichsubtotal));
		lbldrinkamount.setText(String.valueOf(drinkssubtotal));
		lblsmoothieamount.setText(String.valueOf(smoothiesubtotal));
		
		lbltotalamount.setText(String.valueOf(totalamount));
		
	
	}
	
	
	
}

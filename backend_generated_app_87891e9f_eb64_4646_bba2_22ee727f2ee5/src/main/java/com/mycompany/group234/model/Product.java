package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.ProductType;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.OrderItem;
import com.mycompany.group234.model.Order;
import com.mycompany.group234.model.Customer;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Product")
@Table(name = "\"Product\"", schema =  "\"generated_app\"")
@Data
                        
public class Product {
	public Product () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = true )
  private Integer id;
	  
  @Column(name = "\"productName\"", nullable = true )
  private String productName;
  
	  
  @Column(name = "\"productDescription\"", nullable = true )
  private String productDescription;
  
	  
  @Column(name = "\"returnMerchandiseAuthNotReqd\"", nullable = true )
  private Boolean returnMerchandiseAuthNotReqd;
  
	  
  @Column(name = "\"productPrice\"", nullable = true )
  private Double productPrice;
  
	  
  @Column(name = "\"productColor\"", nullable = true )
  private String productColor;
  
	  
  @Column(name = "\"productSize\"", nullable = true )
  private String productSize;
  
  
  
  
		@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"ProductProductTypeCode\"", referencedColumnName = "\"typeCode\"", insertable = true, updatable = true)
	private ProductType productTypeCode;
	
	//@Column(name = "\"ProductProductTypeCode\"")
	//private Integer productProductTypeCode;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Product [" 
  + "id= " + id  + ", " 
  + "productName= " + productName  + ", " 
  + "productDescription= " + productDescription  + ", " 
  + "returnMerchandiseAuthNotReqd= " + returnMerchandiseAuthNotReqd  + ", " 
  + "productPrice= " + productPrice  + ", " 
  + "productColor= " + productColor  + ", " 
  + "productSize= " + productSize 
 + "]";
	}
	
}
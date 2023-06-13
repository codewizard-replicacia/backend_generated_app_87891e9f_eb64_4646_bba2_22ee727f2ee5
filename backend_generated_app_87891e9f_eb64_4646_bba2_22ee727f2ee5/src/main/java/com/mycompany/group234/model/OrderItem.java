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

@Entity(name = "OrderItem")
@Table(name = "\"OrderItem\"", schema =  "\"generated_app\"")
@Data
                        
public class OrderItem {
	public OrderItem () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"itemId\"", nullable = true )
  private Integer itemId;
	  
  @Column(name = "\"orderItemPrice\"", nullable = true )
  private Double orderItemPrice;
  
	  
  @Column(name = "\"orderItemStatus\"", nullable = true )
  private String orderItemStatus;
  
	  
  @Column(name = "\"RMANumber\"", nullable = true )
  private Integer rMANumber;
  
	  
  @Column(name = "\"RMAIssuedBy\"", nullable = true )
  private Integer rMAIssuedBy;
  
	  
  @Column(name = "\"RMAIssuedDate\"", nullable = true )
  private Integer rMAIssuedDate;
  
  
  
  
		@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"OrderItemProduct\"", referencedColumnName = "\"id\"", insertable = true, updatable = true)
	private Product product;
	
	//@Column(name = "\"OrderItemProduct\"")
	//private Integer orderItemProduct;
   
  
  
  
  
  
  
	@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "\"OrderItemitemId\"", insertable = false, updatable = false)
private OrderItem  orderItems ;

@Column(name =  "\"OrderItemitemId\"")
private Integer orderItemitemId;
  
  
  
  @Override
  public String toString() {
	return "OrderItem [" 
  + "itemId= " + itemId  + ", " 
  + "orderItemPrice= " + orderItemPrice  + ", " 
  + "orderItemStatus= " + orderItemStatus  + ", " 
  + "RMANumber= " + rMANumber  + ", " 
  + "RMAIssuedBy= " + rMAIssuedBy  + ", " 
  + "RMAIssuedDate= " + rMAIssuedDate 
 + "]";
	}
	
}
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

@Entity(name = "Customer")
@Table(name = "\"Customer\"", schema =  "\"generated_app\"")
@Data
                        
public class Customer {
	public Customer () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"customerId\"", nullable = true )
  private Integer customerId;
	  
  @Column(name = "\"organisationOrPerson\"", nullable = true )
  private String organisationOrPerson;
  
	  
  @Column(name = "\"organisationName\"", nullable = true )
  private String organisationName;
  
	  
  @Column(name = "\"gender\"", nullable = true )
  private String gender;
  
	  
  @Column(name = "\"firstName\"", nullable = true )
  private String firstName;
  
	  
  @Column(name = "\"middleName\"", nullable = true )
  private String middleName;
  
	  
  @Column(name = "\"lastName\"", nullable = true )
  private String lastName;
  
	  
  @Column(name = "\"emailAddress\"", nullable = true )
  private String emailAddress;
  
	  
  @Column(name = "\"phoneNumber\"", nullable = true )
  private String phoneNumber;
  
	  
  @Column(name = "\"address\"", nullable = true )
  private String address;
  
	  
  @Column(name = "\"city\"", nullable = true )
  private String city;
  
	  
  @Column(name = "\"country\"", nullable = true )
  private String country;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Customer [" 
  + "customerId= " + customerId  + ", " 
  + "organisationOrPerson= " + organisationOrPerson  + ", " 
  + "organisationName= " + organisationName  + ", " 
  + "gender= " + gender  + ", " 
  + "firstName= " + firstName  + ", " 
  + "middleName= " + middleName  + ", " 
  + "lastName= " + lastName  + ", " 
  + "emailAddress= " + emailAddress  + ", " 
  + "phoneNumber= " + phoneNumber  + ", " 
  + "address= " + address  + ", " 
  + "city= " + city  + ", " 
  + "country= " + country 
 + "]";
	}
	
}
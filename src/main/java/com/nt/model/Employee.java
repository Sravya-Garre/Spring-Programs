
package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="emp")
@Data

public class Employee  {
	@Id
	@SequenceGenerator(name="gen1",sequenceName="emp_id_seq",initialValue=1,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer EMPNO;
	@Column(length=20)
	private String ENAME;
	@Column(length=20)
	private String JOB;
	private Float SAL;
	private Integer DEPTNO;
	
}

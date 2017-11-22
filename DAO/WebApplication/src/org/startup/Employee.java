package org.startup;

	import java.math.BigDecimal;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.SequenceGenerator;
	import javax.persistence.Table;

	@Entity
	@Table(name="EMP_TBL",schema="BMS")
	public class Employee {
		@Id
		@Column(name="ENO")
		@SequenceGenerator(name="EMP_SEQ",sequenceName="EMP_SEQ",initialValue=1,allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EMP_SEQ")
		private Integer eno;
		@Column(name="NAME")
		private String name;
		@Column(name="SALARY")
		private BigDecimal salary;
		
		public Integer getEno() {
			return eno;
		}
		public void setEno(Integer eno) {
			this.eno = eno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public BigDecimal getSalary() {
			return salary;
		}
		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}
}

package com.hcl.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
public class UserDTO {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long user_id;
		@Column
		private String u_name;
		@Column
		private String u_password;
		public long getUser_id() {
			return user_id;
		}
		public void setUser_id(long user_id) {
			this.user_id = user_id;
		}
		public String getU_name() {
			return u_name;
		}
		public void setU_name(String u_name) {
			this.u_name = u_name;
		}
		public String getU_password() {
			return u_password;
		}
		public void setU_password(String u_password) {
			this.u_password = u_password;
		}
		
		
		
		
		
		


}

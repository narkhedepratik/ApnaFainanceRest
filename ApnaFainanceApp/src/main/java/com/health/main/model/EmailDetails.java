package com.health.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {

	private String toEmail;
	private String fromEmail;
	private String subject;
	private String textMsg;
}

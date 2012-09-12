package com.enr.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class OutputForm extends ActionForm{
	private static final long serialVersionUID = 1L;
	
	private String to;
	private String from;
	private String req;

	public String getTo() {
		if(to==null)
			return "";
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		if(from==null)
			return "";
		
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors=new ActionErrors();
		try{if(getTo()==null || getFrom()==null || getTo().equals("") || getFrom().equals(""))
			errors.add("Validation Failed",new ActionMessage("error.mandate"));
		}catch(Exception e){
			System.out.println("##"+e.getMessage());
		}
		return errors;
//		System.out.println(to+" :: "+from);
//		return super.validate(mapping, request);
	}

}

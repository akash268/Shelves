package com.enr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.enr.form.OutputForm;

public class OutputAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("here");
		OutputForm outputForm=(OutputForm) form;
		ActionForward forward = mapping.findForward("fail");
		try {
			if(outputForm.getTo().equals("to")){
				forward=mapping.findForward("sucksess");
			}	
		} catch (Exception e) {
			System.out.println(":: "+e.getMessage());
		}
		return forward;
	}

}

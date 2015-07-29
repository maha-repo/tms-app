/**
 * 
 */
package com.vzw.hackathon;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

import org.apache.struts.action.ActionMapping;

/**
 * @author Administrator
 *
 */
public class ActionClass extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	    ActionFormClass hwForm = (ActionFormClass) form;
	    hwForm.setMessage("Hello World...");
	    return mapping.findForward("success");
	    }


}

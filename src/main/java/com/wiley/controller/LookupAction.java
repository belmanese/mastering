package com.wiley.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wiley.form.LookupForm;

public class LookupAction extends Action {

  public ActionForward execute(ActionMapping mapping,
    ActionForm form,
    HttpServletRequest request,
    HttpServletResponse response)
    throws IOException, ServletException {

    Double price = null;

    // Default target to success
    String target = new String("success");

    if ( form != null ) {

      // Use the LookupForm to get the request parameters
      LookupForm lookupForm = (LookupForm)form;

      String symbol = lookupForm.getSymbol();

      price = getQuote(symbol);
    }

    // Set the target to failure
    if ( price == null ) {

      target = new String("failure");
    }
    else {

      request.setAttribute("PRICE", price);
    }
    // Forward to the appropriate View
    return (mapping.findForward(target));
  }

  protected Double getQuote(String symbol) {

    if ( symbol.equalsIgnoreCase("SUNW") ) {

      return new Double(25.00);
    }
    return null;
  }
  
}

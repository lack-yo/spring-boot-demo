package com.lou.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author loufeng
 * @date 2018/9/14 上午9:49
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultExceptionHandle(HttpServletRequest req, Exception e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }


    @ExceptionHandler(value = WebException.class)
    @ResponseBody
    public String webExceptionHandle(HttpServletRequest req, WebException e) throws Exception {
        return "fail, " + e.getMessage();
    }
}

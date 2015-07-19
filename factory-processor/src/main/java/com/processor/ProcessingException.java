package com.processor;

import javax.lang.model.element.Element;

/**
 * Created by nate on 7/19/15.
 */
public class ProcessingException extends Exception {

    Element element;

    public ProcessingException(Element element, String msg, Object... args) {
        super(String.format(msg, args));
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

}
package tz.co.prama.main;

import java.io.IOException;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

public class Main {

	public static void main(String[] args) throws IOException, ResourceException, ScriptException, InterruptedException {
		int firstNumber = 20;
		int secondNumber = 30;
	
		GroovyScriptEngine gse = new GroovyScriptEngine("src/tz/co/prama/main");
		Binding binding = new Binding();
		binding.setVariable("firstNumber", firstNumber);
		binding.setVariable("secondNumber", secondNumber);
		while(true) {
		    gse.run("Business.groovy", binding);
		    Thread.sleep(5000);
		    
		}

	}

	
}

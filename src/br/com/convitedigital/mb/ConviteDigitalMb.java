package br.com.convitedigital.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConviteDigitalMb {

	private List<String> presentes;
	
	@PostConstruct
	public void init() {
		presentes = new ArrayList<>();
		
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
		presentes.add("Panela");
		presentes.add("Galfo");
		presentes.add("Cúie");
		presentes.add("Faka");
		presentes.add("Penera");
	}
	
	public List<String> getPresentes() {
		return presentes;
	}
}
